package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class H5 implements InterfaceC4217u5 {

    /* renamed from: e, reason: collision with root package name */
    private String f15626e;

    /* renamed from: f, reason: collision with root package name */
    private Y0 f15627f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15630i;

    /* renamed from: k, reason: collision with root package name */
    private int f15632k;

    /* renamed from: l, reason: collision with root package name */
    private int f15633l;

    /* renamed from: n, reason: collision with root package name */
    private int f15635n;

    /* renamed from: o, reason: collision with root package name */
    private int f15636o;

    /* renamed from: s, reason: collision with root package name */
    private int f15640s;

    /* renamed from: u, reason: collision with root package name */
    private boolean f15642u;

    /* renamed from: d, reason: collision with root package name */
    private int f15625d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final UQ f15622a = new UQ(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    private final C4144tQ f15623b = new C4144tQ();

    /* renamed from: c, reason: collision with root package name */
    private final UQ f15624c = new UQ();

    /* renamed from: p, reason: collision with root package name */
    private final I5 f15637p = new I5();

    /* renamed from: q, reason: collision with root package name */
    private int f15638q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    private int f15639r = -1;

    /* renamed from: t, reason: collision with root package name */
    private long f15641t = -1;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15631j = true;

    /* renamed from: m, reason: collision with root package name */
    private boolean f15634m = true;

    /* renamed from: g, reason: collision with root package name */
    private double f15628g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    private double f15629h = -9.223372036854776E18d;

    private static final void f(UQ uq, UQ uq2, boolean z7) {
        int t7 = uq.t();
        int min = Math.min(uq.r(), uq2.r());
        uq.h(uq2.n(), uq2.t(), min);
        uq2.m(min);
        if (z7) {
            uq.l(t7);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void a(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void b() {
        this.f15625d = 0;
        this.f15633l = 0;
        this.f15622a.i(2);
        this.f15635n = 0;
        this.f15636o = 0;
        this.f15638q = -2147483647;
        this.f15639r = -1;
        this.f15640s = 0;
        this.f15641t = -1L;
        this.f15642u = false;
        this.f15630i = false;
        this.f15634m = true;
        this.f15631j = true;
        this.f15628g = -9.223372036854776E18d;
        this.f15629h = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void c(UQ uq) {
        int i8;
        int i9;
        AbstractC3796qC.b(this.f15627f);
        while (uq.r() > 0) {
            int i10 = this.f15625d;
            if (i10 == 0) {
                int i11 = this.f15632k;
                if ((i11 & 2) != 0) {
                    if ((i11 & 4) == 0) {
                        while (uq.r() > 0) {
                            int i12 = this.f15633l << 8;
                            this.f15633l = i12;
                            int C7 = i12 | uq.C();
                            this.f15633l = C7;
                            if ((C7 & 16777215) == 12583333) {
                                uq.l(uq.t() - 3);
                                this.f15633l = 0;
                            }
                        }
                    }
                    this.f15625d = 1;
                    break;
                }
                uq.l(uq.u());
            } else if (i10 != 1) {
                int i13 = this.f15637p.f15864a;
                if (i13 == 1 || i13 == 17) {
                    f(uq, this.f15624c, true);
                }
                int min = Math.min(uq.r(), this.f15637p.f15866c - this.f15635n);
                this.f15627f.a(uq, min);
                int i14 = this.f15635n + min;
                this.f15635n = i14;
                I5 i52 = this.f15637p;
                if (i14 == i52.f15866c) {
                    int i15 = i52.f15864a;
                    if (i15 == 1) {
                        byte[] n8 = this.f15624c.n();
                        J5 a8 = M5.a(new C4144tQ(n8, n8.length));
                        this.f15638q = a8.f16106b;
                        this.f15639r = a8.f16107c;
                        long j8 = this.f15641t;
                        long j9 = this.f15637p.f15865b;
                        if (j8 != j9) {
                            this.f15641t = j9;
                            int i16 = a8.f16105a;
                            String concat = i16 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i16))) : "mhm1";
                            byte[] bArr = a8.f16108d;
                            AbstractC4169th0 abstractC4169th0 = null;
                            if (bArr != null && bArr.length > 0) {
                                abstractC4169th0 = AbstractC4169th0.y(AbstractC2301cW.f21211f, bArr);
                            }
                            C2723gJ0 c2723gJ0 = new C2723gJ0();
                            c2723gJ0.m(this.f15626e);
                            c2723gJ0.B("audio/mhm1");
                            c2723gJ0.C(this.f15638q);
                            c2723gJ0.a(concat);
                            c2723gJ0.n(abstractC4169th0);
                            this.f15627f.c(c2723gJ0.H());
                        }
                        this.f15642u = true;
                    } else if (i15 == 17) {
                        byte[] n9 = this.f15624c.n();
                        C4144tQ c4144tQ = new C4144tQ(n9, n9.length);
                        if (c4144tQ.p()) {
                            c4144tQ.n(2);
                            i9 = c4144tQ.d(13);
                        } else {
                            i9 = 0;
                        }
                        this.f15640s = i9;
                    } else if (i15 == 2) {
                        if (this.f15642u) {
                            this.f15631j = false;
                            i8 = 1;
                        } else {
                            i8 = 0;
                        }
                        int i17 = this.f15639r - this.f15640s;
                        double d8 = this.f15638q;
                        long round = Math.round(this.f15628g);
                        if (this.f15630i) {
                            this.f15630i = false;
                            this.f15628g = this.f15629h;
                        } else {
                            this.f15628g += (i17 * 1000000.0d) / d8;
                        }
                        this.f15627f.b(round, i8, this.f15636o, 0, null);
                        this.f15642u = false;
                        this.f15640s = 0;
                        this.f15636o = 0;
                    }
                    this.f15625d = 1;
                }
            } else {
                f(uq, this.f15622a, false);
                UQ uq2 = this.f15622a;
                if (uq2.r() == 0) {
                    C4144tQ c4144tQ2 = this.f15623b;
                    int u7 = uq2.u();
                    c4144tQ2.k(uq2.n(), u7);
                    if (M5.b(this.f15623b, this.f15637p)) {
                        this.f15635n = 0;
                        this.f15636o += this.f15637p.f15866c + u7;
                        this.f15622a.l(0);
                        Y0 y02 = this.f15627f;
                        UQ uq3 = this.f15622a;
                        y02.a(uq3, uq3.u());
                        this.f15622a.i(2);
                        this.f15624c.i(this.f15637p.f15866c);
                        this.f15634m = true;
                        this.f15625d = 2;
                    } else {
                        UQ uq4 = this.f15622a;
                        if (uq4.u() < 15) {
                            uq4.k(uq4.u() + 1);
                        }
                    }
                }
                this.f15634m = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void d(InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        c3021j6.c();
        this.f15626e = c3021j6.b();
        this.f15627f = interfaceC4207u0.R(c3021j6.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void e(long j8, int i8) {
        this.f15632k = i8;
        if (!this.f15631j && (this.f15636o != 0 || !this.f15634m)) {
            this.f15630i = true;
        }
        if (j8 != -9223372036854775807L) {
            double d8 = j8;
            if (this.f15630i) {
                this.f15629h = d8;
            } else {
                this.f15628g = d8;
            }
        }
    }
}
