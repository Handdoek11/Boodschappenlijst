package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.lu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3324lu0 extends OutputStream {

    /* renamed from: w, reason: collision with root package name */
    private static final byte[] f24392w = new byte[0];

    /* renamed from: t, reason: collision with root package name */
    private int f24395t;

    /* renamed from: v, reason: collision with root package name */
    private int f24397v;

    /* renamed from: o, reason: collision with root package name */
    private final int f24393o = 128;

    /* renamed from: s, reason: collision with root package name */
    private final ArrayList f24394s = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    private byte[] f24396u = new byte[128];

    C3324lu0(int i8) {
    }

    private final void f(int i8) {
        this.f24394s.add(new C3215ku0(this.f24396u));
        int length = this.f24395t + this.f24396u.length;
        this.f24395t = length;
        this.f24396u = new byte[Math.max(this.f24393o, Math.max(i8, length >>> 1))];
        this.f24397v = 0;
    }

    public final synchronized int d() {
        return this.f24395t + this.f24397v;
    }

    public final synchronized AbstractC3542nu0 e() {
        try {
            int i8 = this.f24397v;
            byte[] bArr = this.f24396u;
            if (i8 >= bArr.length) {
                this.f24394s.add(new C3215ku0(this.f24396u));
                this.f24396u = f24392w;
            } else if (i8 > 0) {
                this.f24394s.add(new C3215ku0(Arrays.copyOf(bArr, i8)));
            }
            this.f24395t += this.f24397v;
            this.f24397v = 0;
        } catch (Throwable th) {
            throw th;
        }
        return AbstractC3542nu0.F(this.f24394s);
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i8) {
        try {
            if (this.f24397v == this.f24396u.length) {
                f(1);
            }
            byte[] bArr = this.f24396u;
            int i9 = this.f24397v;
            this.f24397v = i9 + 1;
            bArr[i9] = (byte) i8;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = this.f24396u;
        int length = bArr2.length;
        int i10 = this.f24397v;
        int i11 = length - i10;
        if (i9 <= i11) {
            System.arraycopy(bArr, i8, bArr2, i10, i9);
            this.f24397v += i9;
            return;
        }
        System.arraycopy(bArr, i8, bArr2, i10, i11);
        int i12 = i9 - i11;
        f(i12);
        System.arraycopy(bArr, i8 + i11, this.f24396u, 0, i12);
        this.f24397v = i12;
    }
}
