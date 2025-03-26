package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class O5 implements W5 {

    /* renamed from: a, reason: collision with root package name */
    private D f17834a;

    /* renamed from: b, reason: collision with root package name */
    private BU f17835b;

    /* renamed from: c, reason: collision with root package name */
    private Y0 f17836c;

    public O5(String str) {
        C2723gJ0 c2723gJ0 = new C2723gJ0();
        c2723gJ0.B(str);
        this.f17834a = c2723gJ0.H();
    }

    @Override // com.google.android.gms.internal.ads.W5
    public final void b(BU bu, InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        this.f17835b = bu;
        c3021j6.c();
        Y0 R7 = interfaceC4207u0.R(c3021j6.a(), 5);
        this.f17836c = R7;
        R7.c(this.f17834a);
    }

    @Override // com.google.android.gms.internal.ads.W5
    public final void c(UQ uq) {
        AbstractC3796qC.b(this.f17835b);
        int i8 = AbstractC2301cW.f21206a;
        long e8 = this.f17835b.e();
        long f8 = this.f17835b.f();
        if (e8 == -9223372036854775807L || f8 == -9223372036854775807L) {
            return;
        }
        D d8 = this.f17834a;
        if (f8 != d8.f14339t) {
            C2723gJ0 b8 = d8.b();
            b8.F(f8);
            D H7 = b8.H();
            this.f17834a = H7;
            this.f17836c.c(H7);
        }
        int r8 = uq.r();
        this.f17836c.a(uq, r8);
        this.f17836c.b(e8, 1, r8, 0, null);
    }
}
