package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.m5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3346m5 implements InterfaceC4217u5 {

    /* renamed from: a, reason: collision with root package name */
    private final C4144tQ f24439a;

    /* renamed from: b, reason: collision with root package name */
    private final UQ f24440b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24441c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24442d;

    /* renamed from: e, reason: collision with root package name */
    private String f24443e;

    /* renamed from: f, reason: collision with root package name */
    private Y0 f24444f;

    /* renamed from: g, reason: collision with root package name */
    private int f24445g;

    /* renamed from: h, reason: collision with root package name */
    private int f24446h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f24447i;

    /* renamed from: j, reason: collision with root package name */
    private long f24448j;

    /* renamed from: k, reason: collision with root package name */
    private D f24449k;

    /* renamed from: l, reason: collision with root package name */
    private int f24450l;

    /* renamed from: m, reason: collision with root package name */
    private long f24451m;

    public C3346m5(String str, int i8) {
        C4144tQ c4144tQ = new C4144tQ(new byte[128], 128);
        this.f24439a = c4144tQ;
        this.f24440b = new UQ(c4144tQ.f26885a);
        this.f24445g = 0;
        this.f24451m = -9223372036854775807L;
        this.f24441c = str;
        this.f24442d = i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void a(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void b() {
        this.f24445g = 0;
        this.f24446h = 0;
        this.f24447i = false;
        this.f24451m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void c(UQ uq) {
        AbstractC3796qC.b(this.f24444f);
        while (uq.r() > 0) {
            int i8 = this.f24445g;
            if (i8 == 0) {
                while (true) {
                    if (uq.r() <= 0) {
                        break;
                    }
                    if (this.f24447i) {
                        int C7 = uq.C();
                        if (C7 == 119) {
                            this.f24447i = false;
                            this.f24445g = 1;
                            UQ uq2 = this.f24440b;
                            uq2.n()[0] = 11;
                            uq2.n()[1] = 119;
                            this.f24446h = 2;
                            break;
                        }
                        this.f24447i = C7 == 11;
                    } else {
                        this.f24447i = uq.C() == 11;
                    }
                }
            } else if (i8 != 1) {
                int min = Math.min(uq.r(), this.f24450l - this.f24446h);
                this.f24444f.a(uq, min);
                int i9 = this.f24446h + min;
                this.f24446h = i9;
                if (i9 == this.f24450l) {
                    AbstractC3796qC.f(this.f24451m != -9223372036854775807L);
                    this.f24444f.b(this.f24451m, 1, this.f24450l, 0, null);
                    this.f24451m += this.f24448j;
                    this.f24445g = 0;
                }
            } else {
                byte[] n8 = this.f24440b.n();
                int min2 = Math.min(uq.r(), 128 - this.f24446h);
                uq.h(n8, this.f24446h, min2);
                int i10 = this.f24446h + min2;
                this.f24446h = i10;
                if (i10 == 128) {
                    this.f24439a.l(0);
                    O e8 = Q.e(this.f24439a);
                    D d8 = this.f24449k;
                    if (d8 == null || e8.f17809c != d8.f14311D || e8.f17808b != d8.f14312E || !Objects.equals(e8.f17807a, d8.f14334o)) {
                        C2723gJ0 c2723gJ0 = new C2723gJ0();
                        c2723gJ0.m(this.f24443e);
                        c2723gJ0.B(e8.f17807a);
                        c2723gJ0.r0(e8.f17809c);
                        c2723gJ0.C(e8.f17808b);
                        c2723gJ0.q(this.f24441c);
                        c2723gJ0.y(this.f24442d);
                        c2723gJ0.v(e8.f17812f);
                        if ("audio/ac3".equals(e8.f17807a)) {
                            c2723gJ0.q0(e8.f17812f);
                        }
                        D H7 = c2723gJ0.H();
                        this.f24449k = H7;
                        this.f24444f.c(H7);
                    }
                    this.f24450l = e8.f17810d;
                    this.f24448j = (e8.f17811e * 1000000) / this.f24449k.f14312E;
                    this.f24440b.l(0);
                    this.f24444f.a(this.f24440b, 128);
                    this.f24445g = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void d(InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        c3021j6.c();
        this.f24443e = c3021j6.b();
        this.f24444f = interfaceC4207u0.R(c3021j6.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void e(long j8, int i8) {
        this.f24451m = j8;
    }
}
