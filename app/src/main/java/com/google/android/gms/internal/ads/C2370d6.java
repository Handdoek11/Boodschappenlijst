package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2370d6 implements W5 {

    /* renamed from: a, reason: collision with root package name */
    private final C4144tQ f21419a = new C4144tQ(new byte[4], 4);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2587f6 f21420b;

    public C2370d6(C2587f6 c2587f6) {
        this.f21420b = c2587f6;
    }

    @Override // com.google.android.gms.internal.ads.W5
    public final void b(BU bu, InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
    }

    @Override // com.google.android.gms.internal.ads.W5
    public final void c(UQ uq) {
        if (uq.C() == 0 && (uq.C() & 128) != 0) {
            uq.m(6);
            int r8 = uq.r() / 4;
            for (int i8 = 0; i8 < r8; i8++) {
                uq.g(this.f21419a, 4);
                C4144tQ c4144tQ = this.f21419a;
                int d8 = c4144tQ.d(16);
                c4144tQ.n(3);
                if (d8 == 0) {
                    this.f21419a.n(13);
                } else {
                    int d9 = this.f21419a.d(13);
                    if (this.f21420b.f21938g.get(d9) == null) {
                        C2587f6 c2587f6 = this.f21420b;
                        c2587f6.f21938g.put(d9, new X5(new C2478e6(c2587f6, d9)));
                        this.f21420b.f21944m++;
                    }
                }
            }
            this.f21420b.f21938g.remove(0);
        }
    }
}
