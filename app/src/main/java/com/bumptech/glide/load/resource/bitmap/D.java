package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class D extends FilterInputStream {

    /* renamed from: o, reason: collision with root package name */
    private volatile byte[] f12876o;

    /* renamed from: s, reason: collision with root package name */
    private int f12877s;

    /* renamed from: t, reason: collision with root package name */
    private int f12878t;

    /* renamed from: u, reason: collision with root package name */
    private int f12879u;

    /* renamed from: v, reason: collision with root package name */
    private int f12880v;

    /* renamed from: w, reason: collision with root package name */
    private final M1.b f12881w;

    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public D(InputStream inputStream, M1.b bVar) {
        this(inputStream, bVar, 65536);
    }

    private int d(InputStream inputStream, byte[] bArr) {
        int i8 = this.f12879u;
        if (i8 != -1) {
            int i9 = this.f12880v - i8;
            int i10 = this.f12878t;
            if (i9 < i10) {
                if (i8 == 0 && i10 > bArr.length && this.f12877s == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i10) {
                        i10 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f12881w.e(i10, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f12876o = bArr2;
                    this.f12881w.d(bArr);
                    bArr = bArr2;
                } else if (i8 > 0) {
                    System.arraycopy(bArr, i8, bArr, 0, bArr.length - i8);
                }
                int i11 = this.f12880v - this.f12879u;
                this.f12880v = i11;
                this.f12879u = 0;
                this.f12877s = 0;
                int read = inputStream.read(bArr, i11, bArr.length - i11);
                int i12 = this.f12880v;
                if (read > 0) {
                    i12 += read;
                }
                this.f12877s = i12;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f12879u = -1;
            this.f12880v = 0;
            this.f12877s = read2;
        }
        return read2;
    }

    private static IOException g() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f12876o == null || inputStream == null) {
            throw g();
        }
        return (this.f12877s - this.f12880v) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f12876o != null) {
            this.f12881w.d(this.f12876o);
            this.f12876o = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void e() {
        this.f12878t = this.f12876o.length;
    }

    public synchronized void f() {
        if (this.f12876o != null) {
            this.f12881w.d(this.f12876o);
            this.f12876o = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i8) {
        this.f12878t = Math.max(this.f12878t, i8);
        this.f12879u = this.f12880v;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f12876o;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw g();
        }
        if (this.f12880v >= this.f12877s && d(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f12876o && (bArr = this.f12876o) == null) {
            throw g();
        }
        int i8 = this.f12877s;
        int i9 = this.f12880v;
        if (i8 - i9 <= 0) {
            return -1;
        }
        this.f12880v = i9 + 1;
        return bArr[i9] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f12876o == null) {
            throw new IOException("Stream is closed");
        }
        int i8 = this.f12879u;
        if (-1 == i8) {
            throw new a("Mark has been invalidated, pos: " + this.f12880v + " markLimit: " + this.f12878t);
        }
        this.f12880v = i8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j8) {
        if (j8 < 1) {
            return 0L;
        }
        byte[] bArr = this.f12876o;
        if (bArr == null) {
            throw g();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw g();
        }
        int i8 = this.f12877s;
        int i9 = this.f12880v;
        if (i8 - i9 >= j8) {
            this.f12880v = (int) (i9 + j8);
            return j8;
        }
        long j9 = i8 - i9;
        this.f12880v = i8;
        if (this.f12879u == -1 || j8 > this.f12878t) {
            long skip = inputStream.skip(j8 - j9);
            if (skip > 0) {
                this.f12879u = -1;
            }
            return j9 + skip;
        }
        if (d(inputStream, bArr) == -1) {
            return j9;
        }
        int i10 = this.f12877s;
        int i11 = this.f12880v;
        if (i10 - i11 >= j8 - j9) {
            this.f12880v = (int) ((i11 + j8) - j9);
            return j8;
        }
        long j10 = (j9 + i10) - i11;
        this.f12880v = i10;
        return j10;
    }

    D(InputStream inputStream, M1.b bVar, int i8) {
        super(inputStream);
        this.f12879u = -1;
        this.f12881w = bVar;
        this.f12876o = (byte[]) bVar.e(i8, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i8, int i9) {
        int i10;
        int i11;
        byte[] bArr2 = this.f12876o;
        if (bArr2 == null) {
            throw g();
        }
        if (i9 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i12 = this.f12880v;
            int i13 = this.f12877s;
            if (i12 < i13) {
                int i14 = i13 - i12 >= i9 ? i9 : i13 - i12;
                System.arraycopy(bArr2, i12, bArr, i8, i14);
                this.f12880v += i14;
                if (i14 == i9 || inputStream.available() == 0) {
                    return i14;
                }
                i8 += i14;
                i10 = i9 - i14;
            } else {
                i10 = i9;
            }
            while (true) {
                if (this.f12879u == -1 && i10 >= bArr2.length) {
                    i11 = inputStream.read(bArr, i8, i10);
                    if (i11 == -1) {
                        return i10 != i9 ? i9 - i10 : -1;
                    }
                } else {
                    if (d(inputStream, bArr2) == -1) {
                        return i10 != i9 ? i9 - i10 : -1;
                    }
                    if (bArr2 != this.f12876o && (bArr2 = this.f12876o) == null) {
                        throw g();
                    }
                    int i15 = this.f12877s;
                    int i16 = this.f12880v;
                    i11 = i15 - i16 >= i10 ? i10 : i15 - i16;
                    System.arraycopy(bArr2, i16, bArr, i8, i11);
                    this.f12880v += i11;
                }
                i10 -= i11;
                if (i10 == 0) {
                    return i9;
                }
                if (inputStream.available() == 0) {
                    return i9 - i10;
                }
                i8 += i11;
            }
        } else {
            throw g();
        }
    }
}
