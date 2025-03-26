package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class H1 implements InterfaceC3880r0 {

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC4207u0 f15587b;

    /* renamed from: c, reason: collision with root package name */
    private int f15588c;

    /* renamed from: d, reason: collision with root package name */
    private int f15589d;

    /* renamed from: e, reason: collision with root package name */
    private int f15590e;

    /* renamed from: g, reason: collision with root package name */
    private C2 f15592g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC3989s0 f15593h;

    /* renamed from: i, reason: collision with root package name */
    private K1 f15594i;

    /* renamed from: j, reason: collision with root package name */
    private D3 f15595j;

    /* renamed from: a, reason: collision with root package name */
    private final UQ f15586a = new UQ(6);

    /* renamed from: f, reason: collision with root package name */
    private long f15591f = -1;

    private final int b(InterfaceC3989s0 interfaceC3989s0) {
        this.f15586a.i(2);
        ((C2684g0) interfaceC3989s0).G(this.f15586a.n(), 0, 2, false);
        return this.f15586a.G();
    }

    private final void c() {
        InterfaceC4207u0 interfaceC4207u0 = this.f15587b;
        interfaceC4207u0.getClass();
        interfaceC4207u0.P();
        this.f15587b.Q(new Q0(-9223372036854775807L, 0L));
        this.f15588c = 6;
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
        if (j8 == 0) {
            this.f15588c = 0;
            this.f15595j = null;
        } else if (this.f15588c == 5) {
            D3 d32 = this.f15595j;
            d32.getClass();
            d32.f(j8, j9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC3989s0 r24, com.google.android.gms.internal.ads.O0 r25) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.H1.g(com.google.android.gms.internal.ads.s0, com.google.android.gms.internal.ads.O0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        if (b(interfaceC3989s0) != 65496) {
            return false;
        }
        int b8 = b(interfaceC3989s0);
        this.f15589d = b8;
        if (b8 == 65504) {
            this.f15586a.i(2);
            C2684g0 c2684g0 = (C2684g0) interfaceC3989s0;
            c2684g0.G(this.f15586a.n(), 0, 2, false);
            c2684g0.g(this.f15586a.G() - 2, false);
            b8 = b(interfaceC3989s0);
            this.f15589d = b8;
        }
        if (b8 == 65505) {
            C2684g0 c2684g02 = (C2684g0) interfaceC3989s0;
            c2684g02.g(2, false);
            this.f15586a.i(6);
            c2684g02.G(this.f15586a.n(), 0, 6, false);
            if (this.f15586a.K() == 1165519206 && this.f15586a.G() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        this.f15587b = interfaceC4207u0;
    }
}
