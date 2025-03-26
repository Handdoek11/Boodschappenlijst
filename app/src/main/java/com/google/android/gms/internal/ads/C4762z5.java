package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4762z5 implements InterfaceC4217u5 {

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f28283l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final C3457n6 f28284a;

    /* renamed from: b, reason: collision with root package name */
    private final UQ f28285b;

    /* renamed from: e, reason: collision with root package name */
    private final N5 f28288e;

    /* renamed from: f, reason: collision with root package name */
    private C4653y5 f28289f;

    /* renamed from: g, reason: collision with root package name */
    private long f28290g;

    /* renamed from: h, reason: collision with root package name */
    private String f28291h;

    /* renamed from: i, reason: collision with root package name */
    private Y0 f28292i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f28293j;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f28286c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    private final C4544x5 f28287d = new C4544x5(128);

    /* renamed from: k, reason: collision with root package name */
    private long f28294k = -9223372036854775807L;

    C4762z5(C3457n6 c3457n6) {
        UQ uq;
        this.f28284a = c3457n6;
        if (c3457n6 != null) {
            this.f28288e = new N5(178, 128);
            uq = new UQ();
        } else {
            uq = null;
            this.f28288e = null;
        }
        this.f28285b = uq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void a(boolean z7) {
        AbstractC3796qC.b(this.f28289f);
        if (z7) {
            this.f28289f.b(this.f28290g, 0, this.f28293j);
            this.f28289f.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void b() {
        AbstractC1366Ha0.h(this.f28286c);
        this.f28287d.b();
        C4653y5 c4653y5 = this.f28289f;
        if (c4653y5 != null) {
            c4653y5.d();
        }
        N5 n52 = this.f28288e;
        if (n52 != null) {
            n52.b();
        }
        this.f28290g = 0L;
        this.f28294k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01cc  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.internal.ads.UQ r18) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4762z5.c(com.google.android.gms.internal.ads.UQ):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void d(InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        c3021j6.c();
        this.f28291h = c3021j6.b();
        Y0 R7 = interfaceC4207u0.R(c3021j6.a(), 2);
        this.f28292i = R7;
        this.f28289f = new C4653y5(R7);
        C3457n6 c3457n6 = this.f28284a;
        if (c3457n6 != null) {
            c3457n6.b(interfaceC4207u0, c3021j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void e(long j8, int i8) {
        this.f28294k = j8;
    }
}
