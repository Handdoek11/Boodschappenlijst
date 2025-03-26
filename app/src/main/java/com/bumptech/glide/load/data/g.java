package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* renamed from: t, reason: collision with root package name */
    private static final byte[] f12626t;

    /* renamed from: u, reason: collision with root package name */
    private static final int f12627u;

    /* renamed from: v, reason: collision with root package name */
    private static final int f12628v;

    /* renamed from: o, reason: collision with root package name */
    private final byte f12629o;

    /* renamed from: s, reason: collision with root package name */
    private int f12630s;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f12626t = bArr;
        int length = bArr.length;
        f12627u = length;
        f12628v = length + 2;
    }

    public g(InputStream inputStream, int i8) {
        super(inputStream);
        if (i8 >= -1 && i8 <= 8) {
            this.f12629o = (byte) i8;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i8);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i8;
        int i9 = this.f12630s;
        int read = (i9 < 2 || i9 > (i8 = f12628v)) ? super.read() : i9 == i8 ? this.f12629o : f12626t[i9 - 2] & 255;
        if (read != -1) {
            this.f12630s++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j8) {
        long skip = super.skip(j8);
        if (skip > 0) {
            this.f12630s = (int) (this.f12630s + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        int i10;
        int i11 = this.f12630s;
        int i12 = f12628v;
        if (i11 > i12) {
            i10 = super.read(bArr, i8, i9);
        } else if (i11 == i12) {
            bArr[i8] = this.f12629o;
            i10 = 1;
        } else if (i11 < 2) {
            i10 = super.read(bArr, i8, 2 - i11);
        } else {
            int min = Math.min(i12 - i11, i9);
            System.arraycopy(f12626t, this.f12630s - 2, bArr, i8, min);
            i10 = min;
        }
        if (i10 > 0) {
            this.f12630s += i10;
        }
        return i10;
    }
}
