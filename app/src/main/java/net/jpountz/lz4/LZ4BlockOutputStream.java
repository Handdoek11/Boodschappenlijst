package net.jpountz.lz4;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.zip.Checksum;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.XXHashFactory;

/* loaded from: classes2.dex */
public class LZ4BlockOutputStream extends FilterOutputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int COMPRESSION_LEVEL_BASE = 10;
    static final int COMPRESSION_METHOD_LZ4 = 32;
    static final int COMPRESSION_METHOD_RAW = 16;
    static final int DEFAULT_SEED = -1756908916;
    static final int HEADER_LENGTH;
    static final byte[] MAGIC;
    static final int MAGIC_LENGTH;
    static final int MAX_BLOCK_SIZE = 33554432;
    static final int MIN_BLOCK_SIZE = 64;
    private final int blockSize;
    private final byte[] buffer;
    private final Checksum checksum;
    private final byte[] compressedBuffer;
    private final int compressionLevel;
    private final LZ4Compressor compressor;
    private boolean finished;

    /* renamed from: o, reason: collision with root package name */
    private int f39799o;
    private final boolean syncFlush;

    static {
        byte[] bArr = {76, 90, 52, 66, 108, 111, 99, 107};
        MAGIC = bArr;
        int length = bArr.length;
        MAGIC_LENGTH = length;
        HEADER_LENGTH = length + 13;
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i8, LZ4Compressor lZ4Compressor, Checksum checksum, boolean z7) {
        super(outputStream);
        this.blockSize = i8;
        this.compressor = lZ4Compressor;
        this.checksum = checksum;
        this.compressionLevel = compressionLevel(i8);
        this.buffer = new byte[i8];
        byte[] bArr = new byte[HEADER_LENGTH + lZ4Compressor.maxCompressedLength(i8)];
        this.compressedBuffer = bArr;
        this.syncFlush = z7;
        this.f39799o = 0;
        this.finished = $assertionsDisabled;
        System.arraycopy(MAGIC, 0, bArr, 0, MAGIC_LENGTH);
    }

    private static int compressionLevel(int i8) {
        if (i8 < MIN_BLOCK_SIZE) {
            throw new IllegalArgumentException("blockSize must be >= 64, got " + i8);
        }
        if (i8 <= MAX_BLOCK_SIZE) {
            return Math.max(0, 22 - Integer.numberOfLeadingZeros(i8 - 1));
        }
        throw new IllegalArgumentException("blockSize must be <= 33554432, got " + i8);
    }

    private void ensureNotFinished() {
        if (this.finished) {
            throw new IllegalStateException("This stream is already closed");
        }
    }

    private void flushBufferedData() {
        int i8;
        if (this.f39799o == 0) {
            return;
        }
        this.checksum.reset();
        this.checksum.update(this.buffer, 0, this.f39799o);
        int value = (int) this.checksum.getValue();
        LZ4Compressor lZ4Compressor = this.compressor;
        byte[] bArr = this.buffer;
        int i9 = this.f39799o;
        byte[] bArr2 = this.compressedBuffer;
        int i10 = HEADER_LENGTH;
        int compress = lZ4Compressor.compress(bArr, 0, i9, bArr2, i10);
        int i11 = this.f39799o;
        if (compress >= i11) {
            System.arraycopy(this.buffer, 0, this.compressedBuffer, i10, i11);
            i8 = 16;
        } else {
            i11 = compress;
            i8 = COMPRESSION_METHOD_LZ4;
        }
        byte[] bArr3 = this.compressedBuffer;
        int i12 = MAGIC_LENGTH;
        bArr3[i12] = (byte) (i8 | this.compressionLevel);
        writeIntLE(i11, bArr3, i12 + 1);
        writeIntLE(this.f39799o, this.compressedBuffer, i12 + 5);
        writeIntLE(value, this.compressedBuffer, i12 + 9);
        ((FilterOutputStream) this).out.write(this.compressedBuffer, 0, i10 + i11);
        this.f39799o = 0;
    }

    private static void writeIntLE(int i8, byte[] bArr, int i9) {
        bArr[i9] = (byte) i8;
        bArr[i9 + 1] = (byte) (i8 >>> 8);
        bArr[i9 + 2] = (byte) (i8 >>> 16);
        bArr[i9 + 3] = (byte) (i8 >>> 24);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.finished) {
            finish();
        }
        OutputStream outputStream = ((FilterOutputStream) this).out;
        if (outputStream != null) {
            outputStream.close();
            ((FilterOutputStream) this).out = null;
        }
    }

    public void finish() {
        ensureNotFinished();
        flushBufferedData();
        byte[] bArr = this.compressedBuffer;
        int i8 = MAGIC_LENGTH;
        bArr[i8] = (byte) (this.compressionLevel | 16);
        writeIntLE(0, bArr, i8 + 1);
        writeIntLE(0, this.compressedBuffer, i8 + 5);
        writeIntLE(0, this.compressedBuffer, i8 + 9);
        ((FilterOutputStream) this).out.write(this.compressedBuffer, 0, HEADER_LENGTH);
        this.finished = true;
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        if (((FilterOutputStream) this).out != null) {
            if (this.syncFlush) {
                flushBufferedData();
            }
            ((FilterOutputStream) this).out.flush();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "(out=" + ((FilterOutputStream) this).out + ", blockSize=" + this.blockSize + ", compressor=" + this.compressor + ", checksum=" + this.checksum + ")";
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i8) {
        ensureNotFinished();
        if (this.f39799o == this.blockSize) {
            flushBufferedData();
        }
        byte[] bArr = this.buffer;
        int i9 = this.f39799o;
        this.f39799o = i9 + 1;
        bArr[i9] = (byte) i8;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i8, int i9) {
        SafeUtils.checkRange(bArr, i8, i9);
        ensureNotFinished();
        while (true) {
            int i10 = this.f39799o;
            int i11 = i10 + i9;
            int i12 = this.blockSize;
            if (i11 > i12) {
                int i13 = i12 - i10;
                System.arraycopy(bArr, i8, this.buffer, i10, i12 - i10);
                this.f39799o = this.blockSize;
                flushBufferedData();
                i8 += i13;
                i9 -= i13;
            } else {
                System.arraycopy(bArr, i8, this.buffer, i10, i9);
                this.f39799o += i9;
                return;
            }
        }
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i8, LZ4Compressor lZ4Compressor) {
        this(outputStream, i8, lZ4Compressor, XXHashFactory.fastestInstance().newStreamingHash32(DEFAULT_SEED).asChecksum(), $assertionsDisabled);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        ensureNotFinished();
        write(bArr, 0, bArr.length);
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i8) {
        this(outputStream, i8, LZ4Factory.fastestInstance().fastCompressor());
    }

    public LZ4BlockOutputStream(OutputStream outputStream) {
        this(outputStream, 65536);
    }
}
