package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class D1 extends C1 {

    /* renamed from: b, reason: collision with root package name */
    private final UQ f14348b;

    /* renamed from: c, reason: collision with root package name */
    private final UQ f14349c;

    /* renamed from: d, reason: collision with root package name */
    private int f14350d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14351e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14352f;

    /* renamed from: g, reason: collision with root package name */
    private int f14353g;

    public D1(Y0 y02) {
        super(y02);
        this.f14348b = new UQ(AbstractC1366Ha0.f15750a);
        this.f14349c = new UQ(4);
    }

    @Override // com.google.android.gms.internal.ads.C1
    protected final boolean a(UQ uq) {
        int C7 = uq.C();
        int i8 = C7 >> 4;
        int i9 = C7 & 15;
        if (i9 == 7) {
            this.f14353g = i8;
            return i8 != 5;
        }
        throw new zzaew("Video format not supported: " + i9);
    }

    @Override // com.google.android.gms.internal.ads.C1
    protected final boolean b(UQ uq, long j8) {
        int i8;
        int C7 = uq.C();
        long x7 = uq.x();
        if (C7 == 0) {
            if (!this.f14351e) {
                UQ uq2 = new UQ(new byte[uq.r()]);
                uq.h(uq2.n(), 0, uq.r());
                V a8 = V.a(uq2);
                this.f14350d = a8.f19498b;
                C2723gJ0 c2723gJ0 = new C2723gJ0();
                c2723gJ0.B("video/avc");
                c2723gJ0.a(a8.f19508l);
                c2723gJ0.G(a8.f19499c);
                c2723gJ0.k(a8.f19500d);
                c2723gJ0.w(a8.f19507k);
                c2723gJ0.n(a8.f19497a);
                this.f14063a.c(c2723gJ0.H());
                this.f14351e = true;
                return false;
            }
        } else if (C7 == 1 && this.f14351e) {
            int i9 = this.f14353g == 1 ? 1 : 0;
            if (this.f14352f) {
                i8 = i9;
            } else if (i9 != 0) {
                i8 = 1;
            }
            byte[] n8 = this.f14349c.n();
            n8[0] = 0;
            n8[1] = 0;
            n8[2] = 0;
            int i10 = 4 - this.f14350d;
            int i11 = 0;
            while (uq.r() > 0) {
                uq.h(this.f14349c.n(), i10, this.f14350d);
                this.f14349c.l(0);
                UQ uq3 = this.f14349c;
                UQ uq4 = this.f14348b;
                int F7 = uq3.F();
                uq4.l(0);
                this.f14063a.a(this.f14348b, 4);
                this.f14063a.a(uq, F7);
                i11 = i11 + 4 + F7;
            }
            this.f14063a.b(j8 + (x7 * 1000), i8, i11, 0, null);
            this.f14352f = true;
            return true;
        }
        return false;
    }
}
