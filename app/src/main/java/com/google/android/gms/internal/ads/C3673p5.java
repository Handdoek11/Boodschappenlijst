package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.p5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3673p5 implements InterfaceC3880r0 {

    /* renamed from: c, reason: collision with root package name */
    private final UQ f25334c;

    /* renamed from: d, reason: collision with root package name */
    private final C4144tQ f25335d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC4207u0 f25336e;

    /* renamed from: f, reason: collision with root package name */
    private long f25337f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25339h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25340i;

    /* renamed from: a, reason: collision with root package name */
    private final C3782q5 f25332a = new C3782q5(true, null, 0);

    /* renamed from: b, reason: collision with root package name */
    private final UQ f25333b = new UQ(2048);

    /* renamed from: g, reason: collision with root package name */
    private long f25338g = -1;

    public C3673p5(int i8) {
        UQ uq = new UQ(10);
        this.f25334c = uq;
        byte[] n8 = uq.n();
        this.f25335d = new C4144tQ(n8, n8.length);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ InterfaceC3880r0 a() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ List d() {
        return AbstractC4169th0.w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void f(long j8, long j9) {
        this.f25339h = false;
        this.f25332a.b();
        this.f25337f = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final int g(InterfaceC3989s0 interfaceC3989s0, O0 o02) {
        AbstractC3796qC.b(this.f25336e);
        int C7 = interfaceC3989s0.C(this.f25333b.n(), 0, 2048);
        if (!this.f25340i) {
            this.f25336e.Q(new Q0(-9223372036854775807L, 0L));
            this.f25340i = true;
        }
        if (C7 == -1) {
            return -1;
        }
        this.f25333b.l(0);
        this.f25333b.k(C7);
        if (!this.f25339h) {
            this.f25332a.e(this.f25337f, 4);
            this.f25339h = true;
        }
        this.f25332a.c(this.f25333b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        int i8 = 0;
        while (true) {
            C2684g0 c2684g0 = (C2684g0) interfaceC3989s0;
            c2684g0.G(this.f25334c.n(), 0, 10, false);
            this.f25334c.l(0);
            if (this.f25334c.E() != 4801587) {
                break;
            }
            this.f25334c.m(3);
            int B7 = this.f25334c.B();
            i8 += B7 + 10;
            c2684g0.g(B7, false);
        }
        interfaceC3989s0.h();
        C2684g0 c2684g02 = (C2684g0) interfaceC3989s0;
        c2684g02.g(i8, false);
        if (this.f25338g == -1) {
            this.f25338g = i8;
        }
        int i9 = 0;
        int i10 = 0;
        int i11 = i8;
        do {
            c2684g02.G(this.f25334c.n(), 0, 2, false);
            this.f25334c.l(0);
            if (C3782q5.f(this.f25334c.G())) {
                i9++;
                if (i9 >= 4 && i10 > 188) {
                    return true;
                }
                c2684g02.G(this.f25334c.n(), 0, 4, false);
                this.f25335d.l(14);
                int d8 = this.f25335d.d(13);
                if (d8 <= 6) {
                    i11++;
                    interfaceC3989s0.h();
                    c2684g02.g(i11, false);
                } else {
                    c2684g02.g(d8 - 6, false);
                    i10 += d8;
                }
            } else {
                i11++;
                interfaceC3989s0.h();
                c2684g02.g(i11, false);
            }
            i9 = 0;
            i10 = 0;
        } while (i11 - i8 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        this.f25336e = interfaceC4207u0;
        this.f25332a.d(interfaceC4207u0, new C3021j6(Integer.MIN_VALUE, 0, 1));
        interfaceC4207u0.P();
    }
}
