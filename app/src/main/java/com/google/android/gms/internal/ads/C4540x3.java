package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4540x3 {

    /* renamed from: a, reason: collision with root package name */
    public final Y0 f27714a;

    /* renamed from: d, reason: collision with root package name */
    public N3 f27717d;

    /* renamed from: e, reason: collision with root package name */
    public C4104t3 f27718e;

    /* renamed from: f, reason: collision with root package name */
    public int f27719f;

    /* renamed from: g, reason: collision with root package name */
    public int f27720g;

    /* renamed from: h, reason: collision with root package name */
    public int f27721h;

    /* renamed from: i, reason: collision with root package name */
    public int f27722i;

    /* renamed from: l, reason: collision with root package name */
    private boolean f27725l;

    /* renamed from: b, reason: collision with root package name */
    public final M3 f27715b = new M3();

    /* renamed from: c, reason: collision with root package name */
    public final UQ f27716c = new UQ();

    /* renamed from: j, reason: collision with root package name */
    private final UQ f27723j = new UQ(1);

    /* renamed from: k, reason: collision with root package name */
    private final UQ f27724k = new UQ();

    public C4540x3(Y0 y02, N3 n32, C4104t3 c4104t3) {
        this.f27714a = y02;
        this.f27717d = n32;
        this.f27718e = c4104t3;
        h(n32, c4104t3);
    }

    public final int a() {
        int i8 = !this.f27725l ? this.f27717d.f17464g[this.f27719f] : this.f27715b.f17205j[this.f27719f] ? 1 : 0;
        return f() != null ? i8 | 1073741824 : i8;
    }

    public final int b() {
        return !this.f27725l ? this.f27717d.f17461d[this.f27719f] : this.f27715b.f17203h[this.f27719f];
    }

    public final int c(int i8, int i9) {
        UQ uq;
        L3 f8 = f();
        if (f8 == null) {
            return 0;
        }
        int i10 = f8.f16749d;
        if (i10 != 0) {
            uq = this.f27715b.f17209n;
        } else {
            byte[] bArr = f8.f16750e;
            int i11 = AbstractC2301cW.f21206a;
            UQ uq2 = this.f27724k;
            int length = bArr.length;
            uq2.j(bArr, length);
            uq = this.f27724k;
            i10 = length;
        }
        boolean b8 = this.f27715b.b(this.f27719f);
        boolean z7 = b8 || i9 != 0;
        UQ uq3 = this.f27723j;
        uq3.n()[0] = (byte) ((true != z7 ? 0 : 128) | i10);
        uq3.l(0);
        this.f27714a.g(this.f27723j, 1, 1);
        this.f27714a.g(uq, i10, 1);
        if (!z7) {
            return i10 + 1;
        }
        if (!b8) {
            this.f27716c.i(8);
            UQ uq4 = this.f27716c;
            byte[] n8 = uq4.n();
            n8[0] = 0;
            n8[1] = 1;
            n8[2] = 0;
            n8[3] = (byte) i9;
            n8[4] = (byte) ((i8 >> 24) & 255);
            n8[5] = (byte) ((i8 >> 16) & 255);
            n8[6] = (byte) ((i8 >> 8) & 255);
            n8[7] = (byte) (i8 & 255);
            this.f27714a.g(uq4, 8, 1);
            return i10 + 9;
        }
        int i12 = i10 + 1;
        UQ uq5 = this.f27715b.f17209n;
        int G7 = uq5.G();
        uq5.m(-2);
        int i13 = (G7 * 6) + 2;
        if (i9 != 0) {
            this.f27716c.i(i13);
            byte[] n9 = this.f27716c.n();
            uq5.h(n9, 0, i13);
            int i14 = (((n9[2] & 255) << 8) | (n9[3] & 255)) + i9;
            n9[2] = (byte) ((i14 >> 8) & 255);
            n9[3] = (byte) (i14 & 255);
            uq5 = this.f27716c;
        }
        this.f27714a.g(uq5, i13, 1);
        return i12 + i13;
    }

    public final long d() {
        return !this.f27725l ? this.f27717d.f17460c[this.f27719f] : this.f27715b.f17201f[this.f27721h];
    }

    public final long e() {
        if (!this.f27725l) {
            return this.f27717d.f17463f[this.f27719f];
        }
        M3 m32 = this.f27715b;
        return m32.f17204i[this.f27719f];
    }

    public final L3 f() {
        if (!this.f27725l) {
            return null;
        }
        M3 m32 = this.f27715b;
        C4104t3 c4104t3 = m32.f17196a;
        int i8 = AbstractC2301cW.f21206a;
        int i9 = c4104t3.f26810a;
        L3 l32 = m32.f17208m;
        if (l32 == null) {
            l32 = this.f27717d.f17458a.b(i9);
        }
        if (l32 == null || !l32.f16746a) {
            return null;
        }
        return l32;
    }

    public final void h(N3 n32, C4104t3 c4104t3) {
        this.f27717d = n32;
        this.f27718e = c4104t3;
        this.f27714a.c(n32.f17458a.f16513g);
        i();
    }

    public final void i() {
        M3 m32 = this.f27715b;
        m32.f17199d = 0;
        m32.f17211p = 0L;
        m32.f17212q = false;
        m32.f17206k = false;
        m32.f17210o = false;
        m32.f17208m = null;
        this.f27719f = 0;
        this.f27721h = 0;
        this.f27720g = 0;
        this.f27722i = 0;
        this.f27725l = false;
    }

    public final boolean k() {
        this.f27719f++;
        if (!this.f27725l) {
            return false;
        }
        int i8 = this.f27720g + 1;
        this.f27720g = i8;
        int[] iArr = this.f27715b.f17202g;
        int i9 = this.f27721h;
        if (i8 != iArr[i9]) {
            return true;
        }
        this.f27721h = i9 + 1;
        this.f27720g = 0;
        return false;
    }
}
