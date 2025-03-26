package net.jpountz.lz4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import net.jpountz.lz4.LZ4FrameOutputStream;
import net.jpountz.xxhash.XXHash32;
import net.jpountz.xxhash.XXHashFactory;

/* loaded from: classes2.dex */
public class LZ4FrameInputStream extends FilterInputStream {
    static final String BLOCK_HASH_MISMATCH = "Block checksum mismatch";
    static final String DESCRIPTOR_HASH_MISMATCH = "Stream frame descriptor corrupted";
    static final int MAGIC_SKIPPABLE_BASE = 407710288;
    static final String NOT_SUPPORTED = "Stream unsupported";
    static final String PREMATURE_EOS = "Stream ended prematurely";
    private ByteBuffer buffer;
    private final XXHash32 checksum;
    private byte[] compressedBuffer;
    private final LZ4SafeDecompressor decompressor;
    private long expectedContentSize;
    private boolean firstFrameHeaderRead;
    private LZ4FrameOutputStream.FrameInfo frameInfo;
    private final byte[] headerArray;
    private final ByteBuffer headerBuffer;
    private int maxBlockSize;
    private byte[] rawBuffer;
    private final ByteBuffer readNumberBuff;
    private final boolean readSingleFrame;
    private long totalContentSize;

    public LZ4FrameInputStream(InputStream inputStream) {
        this(inputStream, LZ4Factory.fastestInstance().safeDecompressor(), XXHashFactory.fastestInstance().hash32());
    }

    private boolean nextFrameInfo() {
        while (true) {
            int i8 = 0;
            do {
                int read = ((FilterInputStream) this).in.read(this.readNumberBuff.array(), i8, 4 - i8);
                if (read < 0) {
                    if (!this.firstFrameHeaderRead) {
                        throw new IOException(PREMATURE_EOS);
                    }
                    if (i8 <= 0) {
                        return false;
                    }
                    throw new IOException(PREMATURE_EOS);
                }
                i8 += read;
            } while (i8 < 4);
            int i9 = this.readNumberBuff.getInt(0);
            if (i9 == 407708164) {
                readHeader();
                return true;
            }
            if ((i9 >>> 4) != 25481893) {
                throw new IOException(NOT_SUPPORTED);
            }
            skippableFrame();
        }
    }

    private void readBlock() {
        int readInt = readInt(((FilterInputStream) this).in);
        boolean z7 = (Integer.MIN_VALUE & readInt) == 0;
        int i8 = readInt & Integer.MAX_VALUE;
        if (i8 == 0) {
            if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM) && readInt(((FilterInputStream) this).in) != this.frameInfo.currentStreamHash()) {
                throw new IOException("Content checksum mismatch");
            }
            if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE) && this.expectedContentSize != this.totalContentSize) {
                throw new IOException("Size check mismatch");
            }
            this.frameInfo.finish();
            return;
        }
        byte[] bArr = z7 ? this.compressedBuffer : this.rawBuffer;
        if (i8 > this.maxBlockSize) {
            throw new IOException(String.format(Locale.ROOT, "Block size %s exceeded max: %s", Integer.valueOf(i8), Integer.valueOf(this.maxBlockSize)));
        }
        int i9 = 0;
        while (i9 < i8) {
            int read = ((FilterInputStream) this).in.read(bArr, i9, i8 - i9);
            if (read < 0) {
                throw new IOException(PREMATURE_EOS);
            }
            i9 += read;
        }
        if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.BLOCK_CHECKSUM) && readInt(((FilterInputStream) this).in) != this.checksum.hash(bArr, 0, i8, 0)) {
            throw new IOException(BLOCK_HASH_MISMATCH);
        }
        if (z7) {
            try {
                LZ4SafeDecompressor lZ4SafeDecompressor = this.decompressor;
                byte[] bArr2 = this.rawBuffer;
                i8 = lZ4SafeDecompressor.decompress(bArr, 0, i8, bArr2, 0, bArr2.length);
            } catch (LZ4Exception e8) {
                throw new IOException(e8);
            }
        }
        if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM)) {
            this.frameInfo.updateStreamHash(this.rawBuffer, 0, i8);
        }
        this.totalContentSize += i8;
        this.buffer.limit(i8);
        this.buffer.rewind();
    }

    private void readHeader() {
        this.headerBuffer.rewind();
        int read = ((FilterInputStream) this).in.read();
        if (read < 0) {
            throw new IOException(PREMATURE_EOS);
        }
        int read2 = ((FilterInputStream) this).in.read();
        if (read2 < 0) {
            throw new IOException(PREMATURE_EOS);
        }
        byte b8 = (byte) (read & 255);
        LZ4FrameOutputStream.FLG fromByte = LZ4FrameOutputStream.FLG.fromByte(b8);
        this.headerBuffer.put(b8);
        byte b9 = (byte) (read2 & 255);
        LZ4FrameOutputStream.BD fromByte2 = LZ4FrameOutputStream.BD.fromByte(b9);
        this.headerBuffer.put(b9);
        this.frameInfo = new LZ4FrameOutputStream.FrameInfo(fromByte, fromByte2);
        if (fromByte.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE)) {
            long readLong = readLong(((FilterInputStream) this).in);
            this.expectedContentSize = readLong;
            this.headerBuffer.putLong(readLong);
        }
        this.totalContentSize = 0L;
        byte hash = (byte) ((this.checksum.hash(this.headerArray, 0, this.headerBuffer.position(), 0) >> 8) & 255);
        int read3 = ((FilterInputStream) this).in.read();
        if (read3 < 0) {
            throw new IOException(PREMATURE_EOS);
        }
        if (hash != ((byte) (read3 & 255))) {
            throw new IOException(DESCRIPTOR_HASH_MISMATCH);
        }
        int blockMaximumSize = this.frameInfo.getBD().getBlockMaximumSize();
        this.maxBlockSize = blockMaximumSize;
        this.compressedBuffer = new byte[blockMaximumSize];
        byte[] bArr = new byte[blockMaximumSize];
        this.rawBuffer = bArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.buffer = wrap;
        wrap.limit(0);
        this.firstFrameHeaderRead = true;
    }

    private int readInt(InputStream inputStream) {
        int i8 = 0;
        do {
            int read = inputStream.read(this.readNumberBuff.array(), i8, 4 - i8);
            if (read < 0) {
                throw new IOException(PREMATURE_EOS);
            }
            i8 += read;
        } while (i8 < 4);
        return this.readNumberBuff.getInt(0);
    }

    private long readLong(InputStream inputStream) {
        int i8 = 0;
        do {
            int read = inputStream.read(this.readNumberBuff.array(), i8, 8 - i8);
            if (read < 0) {
                throw new IOException(PREMATURE_EOS);
            }
            i8 += read;
        } while (i8 < 8);
        return this.readNumberBuff.getLong(0);
    }

    private void skippableFrame() {
        int readInt = readInt(((FilterInputStream) this).in);
        byte[] bArr = new byte[1024];
        while (readInt > 0) {
            int read = ((FilterInputStream) this).in.read(bArr, 0, Math.min(readInt, 1024));
            if (read < 0) {
                throw new IOException(PREMATURE_EOS);
            }
            readInt -= read;
        }
        this.firstFrameHeaderRead = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.buffer.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    public long getExpectedContentSize() {
        if (!this.readSingleFrame) {
            throw new UnsupportedOperationException("Operation not permitted when multiple frames can be read");
        }
        if (this.firstFrameHeaderRead || nextFrameInfo()) {
            return this.expectedContentSize;
        }
        return -1L;
    }

    public boolean isExpectedContentSizeDefined() {
        if (this.readSingleFrame) {
            return (this.firstFrameHeaderRead || nextFrameInfo()) && this.expectedContentSize >= 0;
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i8) {
        throw new UnsupportedOperationException("mark not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        while (true) {
            if (this.firstFrameHeaderRead && this.buffer.remaining() != 0) {
                return this.buffer.get() & 255;
            }
            if ((!this.firstFrameHeaderRead || this.frameInfo.isFinished()) && ((this.firstFrameHeaderRead && this.readSingleFrame) || !nextFrameInfo())) {
                return -1;
            }
            readBlock();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        throw new UnsupportedOperationException("reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j8) {
        if (j8 <= 0) {
            return 0L;
        }
        while (true) {
            if (this.firstFrameHeaderRead && this.buffer.remaining() != 0) {
                long min = Math.min(j8, this.buffer.remaining());
                ByteBuffer byteBuffer = this.buffer;
                byteBuffer.position(byteBuffer.position() + ((int) min));
                return min;
            }
            if ((!this.firstFrameHeaderRead || this.frameInfo.isFinished()) && ((this.firstFrameHeaderRead && this.readSingleFrame) || !nextFrameInfo())) {
                return 0L;
            }
            readBlock();
        }
    }

    public LZ4FrameInputStream(InputStream inputStream, boolean z7) {
        this(inputStream, LZ4Factory.fastestInstance().safeDecompressor(), XXHashFactory.fastestInstance().hash32(), z7);
    }

    public LZ4FrameInputStream(InputStream inputStream, LZ4SafeDecompressor lZ4SafeDecompressor, XXHash32 xXHash32) {
        this(inputStream, lZ4SafeDecompressor, xXHash32, false);
    }

    public LZ4FrameInputStream(InputStream inputStream, LZ4SafeDecompressor lZ4SafeDecompressor, XXHash32 xXHash32, boolean z7) {
        super(inputStream);
        byte[] bArr = new byte[15];
        this.headerArray = bArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.headerBuffer = wrap.order(byteOrder);
        this.buffer = null;
        this.rawBuffer = null;
        this.maxBlockSize = -1;
        this.expectedContentSize = -1L;
        this.totalContentSize = 0L;
        this.firstFrameHeaderRead = false;
        this.frameInfo = null;
        this.readNumberBuff = ByteBuffer.allocate(8).order(byteOrder);
        this.decompressor = lZ4SafeDecompressor;
        this.checksum = xXHash32;
        this.readSingleFrame = z7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        if (i8 < 0 || i9 < 0 || i8 + i9 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (true) {
            if (this.firstFrameHeaderRead && this.buffer.remaining() != 0) {
                int min = Math.min(i9, this.buffer.remaining());
                this.buffer.get(bArr, i8, min);
                return min;
            }
            if ((!this.firstFrameHeaderRead || this.frameInfo.isFinished()) && ((this.firstFrameHeaderRead && this.readSingleFrame) || !nextFrameInfo())) {
                return -1;
            }
            readBlock();
        }
    }
}
