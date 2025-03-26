package net.jpountz.lz4;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.XXHashFactory;

/* loaded from: classes2.dex */
public class LZ4BlockInputStream extends FilterInputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private byte[] buffer;
    private final Checksum checksum;
    private byte[] compressedBuffer;
    private final LZ4FastDecompressor decompressor;
    private boolean finished;

    /* renamed from: o, reason: collision with root package name */
    private int f39798o;
    private int originalLen;
    private final boolean stopOnEmptyBlock;

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum, boolean z7) {
        super(inputStream);
        this.decompressor = lZ4FastDecompressor;
        this.checksum = checksum;
        this.stopOnEmptyBlock = z7;
        this.buffer = new byte[0];
        this.compressedBuffer = new byte[LZ4BlockOutputStream.HEADER_LENGTH];
        this.originalLen = 0;
        this.f39798o = 0;
        this.finished = false;
    }

    private void readFully(byte[] bArr, int i8) {
        if (!tryReadFully(bArr, i8)) {
            throw new EOFException("Stream ended prematurely");
        }
    }

    private void refill() {
        if (!tryReadFully(this.compressedBuffer, LZ4BlockOutputStream.HEADER_LENGTH)) {
            if (this.stopOnEmptyBlock) {
                throw new EOFException("Stream ended prematurely");
            }
            this.finished = true;
            return;
        }
        int i8 = 0;
        while (true) {
            int i9 = LZ4BlockOutputStream.MAGIC_LENGTH;
            if (i8 >= i9) {
                byte[] bArr = this.compressedBuffer;
                byte b8 = bArr[i9];
                int i10 = b8 & 240;
                int i11 = (b8 & 15) + 10;
                if (i10 != 16 && i10 != 32) {
                    throw new IOException("Stream is corrupted");
                }
                int readIntLE = SafeUtils.readIntLE(bArr, i9 + 1);
                this.originalLen = SafeUtils.readIntLE(this.compressedBuffer, i9 + 5);
                int readIntLE2 = SafeUtils.readIntLE(this.compressedBuffer, i9 + 9);
                int i12 = this.originalLen;
                if (i12 > (1 << i11) || i12 < 0 || readIntLE < 0 || ((i12 == 0 && readIntLE != 0) || ((i12 != 0 && readIntLE == 0) || (i10 == 16 && i12 != readIntLE)))) {
                    throw new IOException("Stream is corrupted");
                }
                if (i12 == 0 && readIntLE == 0) {
                    if (readIntLE2 != 0) {
                        throw new IOException("Stream is corrupted");
                    }
                    if (this.stopOnEmptyBlock) {
                        this.finished = true;
                        return;
                    } else {
                        refill();
                        return;
                    }
                }
                byte[] bArr2 = this.buffer;
                if (bArr2.length < i12) {
                    this.buffer = new byte[Math.max(i12, (bArr2.length * 3) / 2)];
                }
                if (i10 == 16) {
                    readFully(this.buffer, this.originalLen);
                } else {
                    if (i10 != 32) {
                        throw new AssertionError();
                    }
                    byte[] bArr3 = this.compressedBuffer;
                    if (bArr3.length < readIntLE) {
                        this.compressedBuffer = new byte[Math.max(readIntLE, (bArr3.length * 3) / 2)];
                    }
                    readFully(this.compressedBuffer, readIntLE);
                    try {
                        if (readIntLE != this.decompressor.decompress(this.compressedBuffer, 0, this.buffer, 0, this.originalLen)) {
                            throw new IOException("Stream is corrupted");
                        }
                    } catch (LZ4Exception e8) {
                        throw new IOException("Stream is corrupted", e8);
                    }
                }
                this.checksum.reset();
                this.checksum.update(this.buffer, 0, this.originalLen);
                if (((int) this.checksum.getValue()) != readIntLE2) {
                    throw new IOException("Stream is corrupted");
                }
                this.f39798o = 0;
                return;
            }
            if (this.compressedBuffer[i8] != LZ4BlockOutputStream.MAGIC[i8]) {
                throw new IOException("Stream is corrupted");
            }
            i8++;
        }
    }

    private boolean tryReadFully(byte[] bArr, int i8) {
        int i9 = 0;
        while (i9 < i8) {
            int read = ((FilterInputStream) this).in.read(bArr, i9, i8 - i9);
            if (read < 0) {
                return false;
            }
            i9 += read;
        }
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.originalLen - this.f39798o;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i8) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.finished) {
            return -1;
        }
        if (this.f39798o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i8 = this.f39798o;
        this.f39798o = i8 + 1;
        return bArr[i8] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j8) {
        if (j8 <= 0 || this.finished) {
            return 0L;
        }
        if (this.f39798o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return 0L;
        }
        int min = (int) Math.min(j8, this.originalLen - this.f39798o);
        this.f39798o += min;
        return min;
    }

    public String toString() {
        return getClass().getSimpleName() + "(in=" + ((FilterInputStream) this).in + ", decompressor=" + this.decompressor + ", checksum=" + this.checksum + ")";
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        SafeUtils.checkRange(bArr, i8, i9);
        if (this.finished) {
            return -1;
        }
        if (this.f39798o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        int min = Math.min(i9, this.originalLen - this.f39798o);
        System.arraycopy(this.buffer, this.f39798o, bArr, i8, min);
        this.f39798o += min;
        return min;
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum) {
        this(inputStream, lZ4FastDecompressor, checksum, true);
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor) {
        this(inputStream, lZ4FastDecompressor, XXHashFactory.fastestInstance().newStreamingHash32(-1756908916).asChecksum(), true);
    }

    public LZ4BlockInputStream(InputStream inputStream, boolean z7) {
        this(inputStream, LZ4Factory.fastestInstance().fastDecompressor(), XXHashFactory.fastestInstance().newStreamingHash32(-1756908916).asChecksum(), z7);
    }

    public LZ4BlockInputStream(InputStream inputStream) {
        this(inputStream, LZ4Factory.fastestInstance().fastDecompressor());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
