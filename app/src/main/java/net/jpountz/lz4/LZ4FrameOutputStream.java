package net.jpountz.lz4;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import net.jpountz.xxhash.StreamingXXHash32;
import net.jpountz.xxhash.XXHash32;
import net.jpountz.xxhash.XXHashFactory;

/* loaded from: classes2.dex */
public class LZ4FrameOutputStream extends FilterOutputStream {
    static final String CLOSED_STREAM = "The stream is already closed";
    static final FLG.Bits[] DEFAULT_FEATURES = {FLG.Bits.BLOCK_INDEPENDENCE};
    static final int INTEGER_BYTES = 4;
    static final int LONG_BYTES = 8;
    static final int LZ4_FRAME_INCOMPRESSIBLE_MASK = Integer.MIN_VALUE;
    static final int LZ4_MAX_HEADER_LENGTH = 15;
    static final int MAGIC = 407708164;
    private final ByteBuffer buffer;
    private final XXHash32 checksum;
    private final byte[] compressedBuffer;
    private final LZ4Compressor compressor;
    private FrameInfo frameInfo;
    private final ByteBuffer intLEBuffer;
    private final long knownSize;
    private final int maxBlockSize;

    public static class BD {
        private static final int RESERVED_MASK = 143;
        private final BLOCKSIZE blockSizeValue;

        public static BD fromByte(byte b8) {
            int i8 = (b8 >>> 4) & 7;
            if ((b8 & 143) <= 0) {
                return new BD(BLOCKSIZE.valueOf(i8));
            }
            throw new RuntimeException("Reserved fields must be 0");
        }

        public int getBlockMaximumSize() {
            return 1 << ((this.blockSizeValue.getIndicator() * 2) + 8);
        }

        public byte toByte() {
            return (byte) ((this.blockSizeValue.getIndicator() & 7) << 4);
        }

        private BD(BLOCKSIZE blocksize) {
            this.blockSizeValue = blocksize;
        }
    }

    public enum BLOCKSIZE {
        SIZE_64KB(4),
        SIZE_256KB(5),
        SIZE_1MB(6),
        SIZE_4MB(7);

        private final int indicator;

        BLOCKSIZE(int i8) {
            this.indicator = i8;
        }

        public int getIndicator() {
            return this.indicator;
        }

        public static BLOCKSIZE valueOf(int i8) {
            if (i8 == 4) {
                return SIZE_64KB;
            }
            if (i8 == 5) {
                return SIZE_256KB;
            }
            if (i8 == 6) {
                return SIZE_1MB;
            }
            if (i8 == 7) {
                return SIZE_4MB;
            }
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Block size must be 4-7. Cannot use value of [%d]", Integer.valueOf(i8)));
        }
    }

    static class FrameInfo {
        private final BD bd;
        private boolean finished = false;
        private final FLG flg;
        private final StreamingXXHash32 streamHash;

        public FrameInfo(FLG flg, BD bd) {
            this.flg = flg;
            this.bd = bd;
            this.streamHash = flg.isEnabled(FLG.Bits.CONTENT_CHECKSUM) ? XXHashFactory.fastestInstance().newStreamingHash32(0) : null;
        }

        public int currentStreamHash() {
            return this.streamHash.getValue();
        }

        public void finish() {
            this.finished = true;
        }

        public BD getBD() {
            return this.bd;
        }

        public FLG getFLG() {
            return this.flg;
        }

        public boolean isEnabled(FLG.Bits bits) {
            return this.flg.isEnabled(bits);
        }

        public boolean isFinished() {
            return this.finished;
        }

        public void updateStreamHash(byte[] bArr, int i8, int i9) {
            this.streamHash.update(bArr, i8, i9);
        }
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, FLG.Bits... bitsArr) {
        this(outputStream, blocksize, -1L, bitsArr);
    }

    private void ensureNotFinished() {
        if (this.frameInfo.isFinished()) {
            throw new IllegalStateException(CLOSED_STREAM);
        }
    }

    private void writeBlock() {
        byte[] bArr;
        int i8;
        if (this.buffer.position() == 0) {
            return;
        }
        Arrays.fill(this.compressedBuffer, (byte) 0);
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.frameInfo.updateStreamHash(this.buffer.array(), 0, this.buffer.position());
        }
        int compress = this.compressor.compress(this.buffer.array(), 0, this.buffer.position(), this.compressedBuffer, 0);
        if (compress >= this.buffer.position()) {
            compress = this.buffer.position();
            bArr = Arrays.copyOf(this.buffer.array(), compress);
            i8 = LZ4_FRAME_INCOMPRESSIBLE_MASK;
        } else {
            bArr = this.compressedBuffer;
            i8 = 0;
        }
        this.intLEBuffer.putInt(0, i8 | compress);
        ((FilterOutputStream) this).out.write(this.intLEBuffer.array());
        ((FilterOutputStream) this).out.write(bArr, 0, compress);
        if (this.frameInfo.isEnabled(FLG.Bits.BLOCK_CHECKSUM)) {
            this.intLEBuffer.putInt(0, this.checksum.hash(bArr, 0, compress, 0));
            ((FilterOutputStream) this).out.write(this.intLEBuffer.array());
        }
        this.buffer.rewind();
    }

    private void writeEndMark() {
        this.intLEBuffer.putInt(0, 0);
        ((FilterOutputStream) this).out.write(this.intLEBuffer.array());
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.intLEBuffer.putInt(0, this.frameInfo.currentStreamHash());
            ((FilterOutputStream) this).out.write(this.intLEBuffer.array());
        }
        this.frameInfo.finish();
    }

    private void writeHeader() {
        ByteBuffer order = ByteBuffer.allocate(15).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(MAGIC);
        order.put(this.frameInfo.getFLG().toByte());
        order.put(this.frameInfo.getBD().toByte());
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_SIZE)) {
            order.putLong(this.knownSize);
        }
        order.put((byte) ((this.checksum.hash(order.array(), 4, order.position() - 4, 0) >> 8) & 255));
        ((FilterOutputStream) this).out.write(order.array(), 0, order.position());
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.frameInfo.isFinished()) {
            flush();
            writeEndMark();
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        if (!this.frameInfo.isFinished()) {
            writeBlock();
        }
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i8) {
        ensureNotFinished();
        if (this.buffer.position() == this.maxBlockSize) {
            writeBlock();
        }
        this.buffer.put((byte) i8);
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, long j8, FLG.Bits... bitsArr) {
        this(outputStream, blocksize, j8, LZ4Factory.fastestInstance().fastCompressor(), XXHashFactory.fastestInstance().hash32(), bitsArr);
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, long j8, LZ4Compressor lZ4Compressor, XXHash32 xXHash32, FLG.Bits... bitsArr) {
        super(outputStream);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.intLEBuffer = allocate.order(byteOrder);
        this.frameInfo = null;
        this.compressor = lZ4Compressor;
        this.checksum = xXHash32;
        FrameInfo frameInfo = new FrameInfo(new FLG(1, bitsArr), new BD(blocksize));
        this.frameInfo = frameInfo;
        int blockMaximumSize = frameInfo.getBD().getBlockMaximumSize();
        this.maxBlockSize = blockMaximumSize;
        this.buffer = ByteBuffer.allocate(blockMaximumSize).order(byteOrder);
        this.compressedBuffer = new byte[lZ4Compressor.maxCompressedLength(blockMaximumSize)];
        if (this.frameInfo.getFLG().isEnabled(FLG.Bits.CONTENT_SIZE) && j8 < 0) {
            throw new IllegalArgumentException("Known size must be greater than zero in order to use the known size feature");
        }
        this.knownSize = j8;
        writeHeader();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i8, int i9) {
        if (i8 >= 0 && i9 >= 0 && i8 + i9 <= bArr.length) {
            ensureNotFinished();
            while (i9 > this.buffer.remaining()) {
                int remaining = this.buffer.remaining();
                this.buffer.put(bArr, i8, remaining);
                writeBlock();
                i8 += remaining;
                i9 -= remaining;
            }
            this.buffer.put(bArr, i8, i9);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static class FLG {
        private static final int DEFAULT_VERSION = 1;
        private final BitSet bitSet;
        private final int version;

        public enum Bits {
            RESERVED_0(0),
            RESERVED_1(1),
            CONTENT_CHECKSUM(2),
            CONTENT_SIZE(3),
            BLOCK_CHECKSUM(4),
            BLOCK_INDEPENDENCE(5);

            private final int position;

            Bits(int i8) {
                this.position = i8;
            }
        }

        public FLG(int i8, Bits... bitsArr) {
            this.bitSet = new BitSet(8);
            this.version = i8;
            if (bitsArr != null) {
                for (Bits bits : bitsArr) {
                    this.bitSet.set(bits.position);
                }
            }
            validate();
        }

        public static FLG fromByte(byte b8) {
            byte b9 = (byte) (b8 & 192);
            return new FLG(b9 >>> 6, (byte) (b8 ^ b9));
        }

        private void validate() {
            if (this.bitSet.get(Bits.RESERVED_0.position)) {
                throw new RuntimeException("Reserved0 field must be 0");
            }
            if (this.bitSet.get(Bits.RESERVED_1.position)) {
                throw new RuntimeException("Reserved1 field must be 0");
            }
            if (!this.bitSet.get(Bits.BLOCK_INDEPENDENCE.position)) {
                throw new RuntimeException("Dependent block stream is unsupported (BLOCK_INDEPENDENCE must be set)");
            }
            if (this.version != 1) {
                throw new RuntimeException(String.format(Locale.ROOT, "Version %d is unsupported", Integer.valueOf(this.version)));
            }
        }

        public int getVersion() {
            return this.version;
        }

        public boolean isEnabled(Bits bits) {
            return this.bitSet.get(bits.position);
        }

        public byte toByte() {
            return (byte) (this.bitSet.toByteArray()[0] | ((this.version & 3) << 6));
        }

        private FLG(int i8, byte b8) {
            this.bitSet = BitSet.valueOf(new byte[]{b8});
            this.version = i8;
            validate();
        }
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize) {
        this(outputStream, blocksize, DEFAULT_FEATURES);
    }

    public LZ4FrameOutputStream(OutputStream outputStream) {
        this(outputStream, BLOCKSIZE.SIZE_4MB);
    }
}
