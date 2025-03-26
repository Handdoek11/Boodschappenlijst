package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.k7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3132k7 extends FilterInputStream {

    /* renamed from: o, reason: collision with root package name */
    private final long f23510o;

    /* renamed from: s, reason: collision with root package name */
    private long f23511s;

    C3132k7(InputStream inputStream, long j8) {
        super(inputStream);
        this.f23510o = j8;
    }

    final long d() {
        return this.f23510o - this.f23511s;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f23511s++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i8, int i9) {
        int read = super.read(bArr, i8, i9);
        if (read != -1) {
            this.f23511s += read;
        }
        return read;
    }
}
