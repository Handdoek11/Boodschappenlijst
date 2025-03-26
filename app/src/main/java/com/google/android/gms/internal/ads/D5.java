package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class D5 implements InterfaceC4217u5 {

    /* renamed from: a, reason: collision with root package name */
    private final Z5 f14399a;

    /* renamed from: b, reason: collision with root package name */
    private String f14400b;

    /* renamed from: c, reason: collision with root package name */
    private Y0 f14401c;

    /* renamed from: d, reason: collision with root package name */
    private C5 f14402d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14403e;

    /* renamed from: l, reason: collision with root package name */
    private long f14410l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f14404f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final N5 f14405g = new N5(32, 128);

    /* renamed from: h, reason: collision with root package name */
    private final N5 f14406h = new N5(33, 128);

    /* renamed from: i, reason: collision with root package name */
    private final N5 f14407i = new N5(34, 128);

    /* renamed from: j, reason: collision with root package name */
    private final N5 f14408j = new N5(39, 128);

    /* renamed from: k, reason: collision with root package name */
    private final N5 f14409k = new N5(40, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f14411m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final UQ f14412n = new UQ();

    public D5(Z5 z52) {
        this.f14399a = z52;
    }

    private final void f(byte[] bArr, int i8, int i9) {
        this.f14402d.c(bArr, i8, i9);
        if (!this.f14403e) {
            this.f14405g.a(bArr, i8, i9);
            this.f14406h.a(bArr, i8, i9);
            this.f14407i.a(bArr, i8, i9);
        }
        this.f14408j.a(bArr, i8, i9);
        this.f14409k.a(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void a(boolean z7) {
        AbstractC3796qC.b(this.f14401c);
        int i8 = AbstractC2301cW.f21206a;
        if (z7) {
            this.f14399a.c();
            this.f14402d.a(this.f14410l);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void b() {
        this.f14410l = 0L;
        this.f14411m = -9223372036854775807L;
        AbstractC1366Ha0.h(this.f14404f);
        this.f14405g.b();
        this.f14406h.b();
        this.f14407i.b();
        this.f14408j.b();
        this.f14409k.b();
        this.f14399a.c();
        C5 c52 = this.f14402d;
        if (c52 != null) {
            c52.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0154  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.internal.ads.UQ r28) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.D5.c(com.google.android.gms.internal.ads.UQ):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void d(InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        c3021j6.c();
        this.f14400b = c3021j6.b();
        Y0 R7 = interfaceC4207u0.R(c3021j6.a(), 2);
        this.f14401c = R7;
        this.f14402d = new C5(R7);
        this.f14399a.b(interfaceC4207u0, c3021j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void e(long j8, int i8) {
        this.f14411m = j8;
    }
}
