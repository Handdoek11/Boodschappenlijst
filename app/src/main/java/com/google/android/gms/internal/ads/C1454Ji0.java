package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.Ji0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1454Ji0 extends FilterInputStream {

    /* renamed from: o, reason: collision with root package name */
    private long f16291o;

    /* renamed from: s, reason: collision with root package name */
    private long f16292s;

    C1454Ji0(InputStream inputStream, long j8) {
        super(inputStream);
        this.f16292s = -1L;
        inputStream.getClass();
        AbstractC1762Sf0.f(j8 >= 0, "limit must be non-negative");
        this.f16291o = j8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f16291o);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i8) {
        ((FilterInputStream) this).in.mark(i8);
        this.f16292s = this.f16291o;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f16291o == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f16291o--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f16292s == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f16291o = this.f16292s;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j8) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j8, this.f16291o));
        this.f16291o -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i8, int i9) {
        long j8 = this.f16291o;
        if (j8 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i8, (int) Math.min(i9, j8));
        if (read != -1) {
            this.f16291o -= read;
        }
        return read;
    }
}
