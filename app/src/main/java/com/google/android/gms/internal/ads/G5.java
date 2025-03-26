package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class G5 implements InterfaceC4217u5 {

    /* renamed from: a, reason: collision with root package name */
    private final UQ f15254a;

    /* renamed from: b, reason: collision with root package name */
    private final K0 f15255b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15256c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15257d;

    /* renamed from: e, reason: collision with root package name */
    private Y0 f15258e;

    /* renamed from: f, reason: collision with root package name */
    private String f15259f;

    /* renamed from: g, reason: collision with root package name */
    private int f15260g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f15261h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15262i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15263j;

    /* renamed from: k, reason: collision with root package name */
    private long f15264k;

    /* renamed from: l, reason: collision with root package name */
    private int f15265l;

    /* renamed from: m, reason: collision with root package name */
    private long f15266m;

    public G5(String str, int i8) {
        UQ uq = new UQ(4);
        this.f15254a = uq;
        uq.n()[0] = -1;
        this.f15255b = new K0();
        this.f15266m = -9223372036854775807L;
        this.f15256c = str;
        this.f15257d = i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void a(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void b() {
        this.f15260g = 0;
        this.f15261h = 0;
        this.f15263j = false;
        this.f15266m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void c(UQ uq) {
        AbstractC3796qC.b(this.f15258e);
        while (uq.r() > 0) {
            int i8 = this.f15260g;
            if (i8 == 0) {
                byte[] n8 = uq.n();
                int t7 = uq.t();
                int u7 = uq.u();
                while (true) {
                    if (t7 >= u7) {
                        uq.l(u7);
                        break;
                    }
                    int i9 = t7 + 1;
                    byte b8 = n8[t7];
                    boolean z7 = (b8 & 255) == 255;
                    boolean z8 = this.f15263j && (b8 & 224) == 224;
                    this.f15263j = z7;
                    if (z8) {
                        uq.l(i9);
                        this.f15263j = false;
                        this.f15254a.n()[1] = n8[t7];
                        this.f15261h = 2;
                        this.f15260g = 1;
                        break;
                    }
                    t7 = i9;
                }
            } else if (i8 != 1) {
                int min = Math.min(uq.r(), this.f15265l - this.f15261h);
                this.f15258e.a(uq, min);
                int i10 = this.f15261h + min;
                this.f15261h = i10;
                if (i10 >= this.f15265l) {
                    AbstractC3796qC.f(this.f15266m != -9223372036854775807L);
                    this.f15258e.b(this.f15266m, 1, this.f15265l, 0, null);
                    this.f15266m += this.f15264k;
                    this.f15261h = 0;
                    this.f15260g = 0;
                }
            } else {
                int min2 = Math.min(uq.r(), 4 - this.f15261h);
                uq.h(this.f15254a.n(), this.f15261h, min2);
                int i11 = this.f15261h + min2;
                this.f15261h = i11;
                if (i11 >= 4) {
                    this.f15254a.l(0);
                    if (this.f15255b.a(this.f15254a.w())) {
                        this.f15265l = this.f15255b.f16491c;
                        if (!this.f15262i) {
                            this.f15264k = (r0.f16495g * 1000000) / r0.f16492d;
                            C2723gJ0 c2723gJ0 = new C2723gJ0();
                            c2723gJ0.m(this.f15259f);
                            c2723gJ0.B(this.f15255b.f16490b);
                            c2723gJ0.r(4096);
                            c2723gJ0.r0(this.f15255b.f16493e);
                            c2723gJ0.C(this.f15255b.f16492d);
                            c2723gJ0.q(this.f15256c);
                            c2723gJ0.y(this.f15257d);
                            this.f15258e.c(c2723gJ0.H());
                            this.f15262i = true;
                        }
                        this.f15254a.l(0);
                        this.f15258e.a(this.f15254a, 4);
                        this.f15260g = 2;
                    } else {
                        this.f15261h = 0;
                        this.f15260g = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void d(InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        c3021j6.c();
        this.f15259f = c3021j6.b();
        this.f15258e = interfaceC4207u0.R(c3021j6.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void e(long j8, int i8) {
        this.f15266m = j8;
    }
}
