package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class U5 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4217u5 f19287a;

    /* renamed from: b, reason: collision with root package name */
    private final BU f19288b;

    /* renamed from: c, reason: collision with root package name */
    private final C4144tQ f19289c = new C4144tQ(new byte[64], 64);

    /* renamed from: d, reason: collision with root package name */
    private boolean f19290d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19291e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19292f;

    public U5(InterfaceC4217u5 interfaceC4217u5, BU bu) {
        this.f19287a = interfaceC4217u5;
        this.f19288b = bu;
    }

    public final void a(UQ uq) {
        long j8;
        long j9;
        uq.h(this.f19289c.f26885a, 0, 3);
        this.f19289c.l(0);
        this.f19289c.n(8);
        this.f19290d = this.f19289c.p();
        this.f19291e = this.f19289c.p();
        this.f19289c.n(6);
        C4144tQ c4144tQ = this.f19289c;
        uq.h(c4144tQ.f26885a, 0, c4144tQ.d(8));
        this.f19289c.l(0);
        if (this.f19290d) {
            this.f19289c.n(4);
            long d8 = this.f19289c.d(3);
            this.f19289c.n(1);
            int d9 = this.f19289c.d(15) << 15;
            this.f19289c.n(1);
            long d10 = this.f19289c.d(15);
            this.f19289c.n(1);
            if (this.f19292f || !this.f19291e) {
                j9 = d8;
            } else {
                this.f19289c.n(4);
                this.f19289c.n(1);
                int d11 = this.f19289c.d(15) << 15;
                this.f19289c.n(1);
                j9 = d8;
                long d12 = this.f19289c.d(15);
                this.f19289c.n(1);
                this.f19288b.b(d11 | (this.f19289c.d(3) << 30) | d12);
                this.f19292f = true;
            }
            j8 = this.f19288b.b((j9 << 30) | d9 | d10);
        } else {
            j8 = 0;
        }
        this.f19287a.e(j8, 4);
        this.f19287a.c(uq);
        this.f19287a.a(false);
    }

    public final void b() {
        this.f19292f = false;
        this.f19287a.b();
    }
}
