package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.u7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4221u7 extends ByteArrayOutputStream {

    /* renamed from: o, reason: collision with root package name */
    private final C2807h7 f27000o;

    public C4221u7(C2807h7 c2807h7, int i8) {
        this.f27000o = c2807h7;
        ((ByteArrayOutputStream) this).buf = c2807h7.b(Math.max(i8, 256));
    }

    private final void d(int i8) {
        int i9 = ((ByteArrayOutputStream) this).count;
        if (i9 + i8 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i10 = i9 + i8;
        byte[] b8 = this.f27000o.b(i10 + i10);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, b8, 0, ((ByteArrayOutputStream) this).count);
        this.f27000o.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = b8;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f27000o.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f27000o.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i8) {
        d(1);
        super.write(i8);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i8, int i9) {
        d(i9);
        super.write(bArr, i8, i9);
    }
}
