package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4435w5 implements InterfaceC4217u5 {

    /* renamed from: q, reason: collision with root package name */
    private static final double[] f27440q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f27441a;

    /* renamed from: b, reason: collision with root package name */
    private Y0 f27442b;

    /* renamed from: c, reason: collision with root package name */
    private final C3457n6 f27443c;

    /* renamed from: d, reason: collision with root package name */
    private final UQ f27444d;

    /* renamed from: e, reason: collision with root package name */
    private final N5 f27445e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f27446f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    private final C4326v5 f27447g = new C4326v5(128);

    /* renamed from: h, reason: collision with root package name */
    private long f27448h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f27449i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f27450j;

    /* renamed from: k, reason: collision with root package name */
    private long f27451k;

    /* renamed from: l, reason: collision with root package name */
    private long f27452l;

    /* renamed from: m, reason: collision with root package name */
    private long f27453m;

    /* renamed from: n, reason: collision with root package name */
    private long f27454n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f27455o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f27456p;

    C4435w5(C3457n6 c3457n6) {
        UQ uq;
        this.f27443c = c3457n6;
        if (c3457n6 != null) {
            this.f27445e = new N5(178, 128);
            uq = new UQ();
        } else {
            uq = null;
            this.f27445e = null;
        }
        this.f27444d = uq;
        this.f27452l = -9223372036854775807L;
        this.f27454n = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void a(boolean z7) {
        AbstractC3796qC.b(this.f27442b);
        if (z7) {
            boolean z8 = this.f27455o;
            long j8 = this.f27448h - this.f27453m;
            this.f27442b.b(this.f27454n, z8 ? 1 : 0, (int) j8, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void b() {
        AbstractC1366Ha0.h(this.f27446f);
        this.f27447g.b();
        N5 n52 = this.f27445e;
        if (n52 != null) {
            n52.b();
        }
        this.f27448h = 0L;
        this.f27449i = false;
        this.f27452l = -9223372036854775807L;
        this.f27454n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.internal.ads.UQ r28) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4435w5.c(com.google.android.gms.internal.ads.UQ):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void d(InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        c3021j6.c();
        this.f27441a = c3021j6.b();
        this.f27442b = interfaceC4207u0.R(c3021j6.a(), 2);
        C3457n6 c3457n6 = this.f27443c;
        if (c3457n6 != null) {
            c3457n6.b(interfaceC4207u0, c3021j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void e(long j8, int i8) {
        this.f27452l = j8;
    }
}
