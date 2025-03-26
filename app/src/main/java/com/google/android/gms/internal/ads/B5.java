package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class B5 implements InterfaceC4217u5 {

    /* renamed from: a, reason: collision with root package name */
    private final Z5 f13728a;

    /* renamed from: e, reason: collision with root package name */
    private long f13732e;

    /* renamed from: g, reason: collision with root package name */
    private String f13734g;

    /* renamed from: h, reason: collision with root package name */
    private Y0 f13735h;

    /* renamed from: i, reason: collision with root package name */
    private A5 f13736i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13737j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13739l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f13733f = new boolean[3];

    /* renamed from: b, reason: collision with root package name */
    private final N5 f13729b = new N5(7, 128);

    /* renamed from: c, reason: collision with root package name */
    private final N5 f13730c = new N5(8, 128);

    /* renamed from: d, reason: collision with root package name */
    private final N5 f13731d = new N5(6, 128);

    /* renamed from: k, reason: collision with root package name */
    private long f13738k = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private final UQ f13740m = new UQ();

    public B5(Z5 z52, boolean z7, boolean z8) {
        this.f13728a = z52;
    }

    private final void f(byte[] bArr, int i8, int i9) {
        if (!this.f13737j) {
            this.f13729b.a(bArr, i8, i9);
            this.f13730c.a(bArr, i8, i9);
        }
        this.f13731d.a(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void a(boolean z7) {
        AbstractC3796qC.b(this.f13735h);
        int i8 = AbstractC2301cW.f21206a;
        if (z7) {
            this.f13728a.c();
            this.f13736i.a(this.f13732e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void b() {
        this.f13732e = 0L;
        this.f13739l = false;
        this.f13738k = -9223372036854775807L;
        AbstractC1366Ha0.h(this.f13733f);
        this.f13729b.b();
        this.f13730c.b();
        this.f13731d.b();
        this.f13728a.c();
        A5 a52 = this.f13736i;
        if (a52 != null) {
            a52.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.internal.ads.UQ r19) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.B5.c(com.google.android.gms.internal.ads.UQ):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void d(InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        c3021j6.c();
        this.f13734g = c3021j6.b();
        Y0 R7 = interfaceC4207u0.R(c3021j6.a(), 2);
        this.f13735h = R7;
        this.f13736i = new A5(R7, false, false);
        this.f13728a.b(interfaceC4207u0, c3021j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void e(long j8, int i8) {
        this.f13738k = j8;
        int i9 = i8 & 2;
        this.f13739l = (i9 != 0) | this.f13739l;
    }
}
