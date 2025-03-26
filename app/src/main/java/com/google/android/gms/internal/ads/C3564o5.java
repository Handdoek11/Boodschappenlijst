package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3564o5 implements InterfaceC4217u5 {

    /* renamed from: a, reason: collision with root package name */
    private final C4144tQ f25091a;

    /* renamed from: b, reason: collision with root package name */
    private final UQ f25092b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25093c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25094d;

    /* renamed from: e, reason: collision with root package name */
    private String f25095e;

    /* renamed from: f, reason: collision with root package name */
    private Y0 f25096f;

    /* renamed from: g, reason: collision with root package name */
    private int f25097g;

    /* renamed from: h, reason: collision with root package name */
    private int f25098h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25099i;

    /* renamed from: j, reason: collision with root package name */
    private long f25100j;

    /* renamed from: k, reason: collision with root package name */
    private D f25101k;

    /* renamed from: l, reason: collision with root package name */
    private int f25102l;

    /* renamed from: m, reason: collision with root package name */
    private long f25103m;

    public C3564o5(String str, int i8) {
        C4144tQ c4144tQ = new C4144tQ(new byte[16], 16);
        this.f25091a = c4144tQ;
        this.f25092b = new UQ(c4144tQ.f26885a);
        this.f25097g = 0;
        this.f25098h = 0;
        this.f25099i = false;
        this.f25103m = -9223372036854775807L;
        this.f25093c = str;
        this.f25094d = i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void a(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void b() {
        this.f25097g = 0;
        this.f25098h = 0;
        this.f25099i = false;
        this.f25103m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void c(UQ uq) {
        AbstractC3796qC.b(this.f25096f);
        while (uq.r() > 0) {
            int i8 = this.f25097g;
            if (i8 == 0) {
                while (uq.r() > 0) {
                    if (this.f25099i) {
                        int C7 = uq.C();
                        this.f25099i = C7 == 172;
                        if (C7 != 64) {
                            if (C7 == 65) {
                                C7 = 65;
                            }
                        }
                        this.f25097g = 1;
                        UQ uq2 = this.f25092b;
                        uq2.n()[0] = -84;
                        uq2.n()[1] = C7 == 65 ? (byte) 65 : (byte) 64;
                        this.f25098h = 2;
                    } else {
                        this.f25099i = uq.C() == 172;
                    }
                }
            } else if (i8 != 1) {
                int min = Math.min(uq.r(), this.f25102l - this.f25098h);
                this.f25096f.a(uq, min);
                int i9 = this.f25098h + min;
                this.f25098h = i9;
                if (i9 == this.f25102l) {
                    AbstractC3796qC.f(this.f25103m != -9223372036854775807L);
                    this.f25096f.b(this.f25103m, 1, this.f25102l, 0, null);
                    this.f25103m += this.f25100j;
                    this.f25097g = 0;
                }
            } else {
                byte[] n8 = this.f25092b.n();
                int min2 = Math.min(uq.r(), 16 - this.f25098h);
                uq.h(n8, this.f25098h, min2);
                int i10 = this.f25098h + min2;
                this.f25098h = i10;
                if (i10 == 16) {
                    this.f25091a.l(0);
                    S a8 = U.a(this.f25091a);
                    D d8 = this.f25101k;
                    if (d8 == null || d8.f14311D != 2 || a8.f18725a != d8.f14312E || !"audio/ac4".equals(d8.f14334o)) {
                        C2723gJ0 c2723gJ0 = new C2723gJ0();
                        c2723gJ0.m(this.f25095e);
                        c2723gJ0.B("audio/ac4");
                        c2723gJ0.r0(2);
                        c2723gJ0.C(a8.f18725a);
                        c2723gJ0.q(this.f25093c);
                        c2723gJ0.y(this.f25094d);
                        D H7 = c2723gJ0.H();
                        this.f25101k = H7;
                        this.f25096f.c(H7);
                    }
                    this.f25102l = a8.f18726b;
                    this.f25100j = (a8.f18727c * 1000000) / this.f25101k.f14312E;
                    this.f25092b.l(0);
                    this.f25096f.a(this.f25092b, 16);
                    this.f25097g = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void d(InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        c3021j6.c();
        this.f25095e = c3021j6.b();
        this.f25096f = interfaceC4207u0.R(c3021j6.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void e(long j8, int i8) {
        this.f25103m = j8;
    }
}
