package com.bumptech.glide.load.data;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: o, reason: collision with root package name */
    private final OutputStream f12619o;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f12620s;

    /* renamed from: t, reason: collision with root package name */
    private M1.b f12621t;

    /* renamed from: u, reason: collision with root package name */
    private int f12622u;

    public c(OutputStream outputStream, M1.b bVar) {
        this(outputStream, bVar, 65536);
    }

    private void d() {
        int i8 = this.f12622u;
        if (i8 > 0) {
            this.f12619o.write(this.f12620s, 0, i8);
            this.f12622u = 0;
        }
    }

    private void e() {
        if (this.f12622u == this.f12620s.length) {
            d();
        }
    }

    private void f() {
        byte[] bArr = this.f12620s;
        if (bArr != null) {
            this.f12621t.d(bArr);
            this.f12620s = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            this.f12619o.close();
            f();
        } catch (Throwable th) {
            this.f12619o.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        d();
        this.f12619o.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i8) {
        byte[] bArr = this.f12620s;
        int i9 = this.f12622u;
        this.f12622u = i9 + 1;
        bArr[i9] = (byte) i8;
        e();
    }

    c(OutputStream outputStream, M1.b bVar, int i8) {
        this.f12619o = outputStream;
        this.f12621t = bVar;
        this.f12620s = (byte[]) bVar.e(i8, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i8, int i9) {
        int i10 = 0;
        do {
            int i11 = i9 - i10;
            int i12 = i8 + i10;
            int i13 = this.f12622u;
            if (i13 == 0 && i11 >= this.f12620s.length) {
                this.f12619o.write(bArr, i12, i11);
                return;
            }
            int min = Math.min(i11, this.f12620s.length - i13);
            System.arraycopy(bArr, i12, this.f12620s, this.f12622u, min);
            this.f12622u += min;
            i10 += min;
            e();
        } while (i10 < i9);
    }
}
