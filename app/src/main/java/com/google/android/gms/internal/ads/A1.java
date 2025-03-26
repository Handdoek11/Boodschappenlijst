package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class A1 implements InterfaceC3880r0 {

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC4207u0 f13476f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13478h;

    /* renamed from: i, reason: collision with root package name */
    private long f13479i;

    /* renamed from: j, reason: collision with root package name */
    private int f13480j;

    /* renamed from: k, reason: collision with root package name */
    private int f13481k;

    /* renamed from: l, reason: collision with root package name */
    private int f13482l;

    /* renamed from: m, reason: collision with root package name */
    private long f13483m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13484n;

    /* renamed from: o, reason: collision with root package name */
    private C4754z1 f13485o;

    /* renamed from: p, reason: collision with root package name */
    private D1 f13486p;

    /* renamed from: a, reason: collision with root package name */
    private final UQ f13471a = new UQ(4);

    /* renamed from: b, reason: collision with root package name */
    private final UQ f13472b = new UQ(9);

    /* renamed from: c, reason: collision with root package name */
    private final UQ f13473c = new UQ(11);

    /* renamed from: d, reason: collision with root package name */
    private final UQ f13474d = new UQ();

    /* renamed from: e, reason: collision with root package name */
    private final B1 f13475e = new B1();

    /* renamed from: g, reason: collision with root package name */
    private int f13477g = 1;

    private final UQ b(InterfaceC3989s0 interfaceC3989s0) {
        if (this.f13482l > this.f13474d.s()) {
            UQ uq = this.f13474d;
            int s8 = uq.s();
            uq.j(new byte[Math.max(s8 + s8, this.f13482l)], 0);
        } else {
            this.f13474d.l(0);
        }
        this.f13474d.k(this.f13482l);
        interfaceC3989s0.H(this.f13474d.n(), 0, this.f13482l);
        return this.f13474d;
    }

    private final void c() {
        if (this.f13484n) {
            return;
        }
        this.f13476f.Q(new Q0(-9223372036854775807L, 0L));
        this.f13484n = true;
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
            this.f13477g = 1;
            this.f13478h = false;
        } else {
            this.f13477g = 3;
        }
        this.f13480j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC3989s0 r17, com.google.android.gms.internal.ads.O0 r18) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.A1.g(com.google.android.gms.internal.ads.s0, com.google.android.gms.internal.ads.O0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        C2684g0 c2684g0 = (C2684g0) interfaceC3989s0;
        c2684g0.G(this.f13471a.n(), 0, 3, false);
        this.f13471a.l(0);
        if (this.f13471a.E() != 4607062) {
            return false;
        }
        c2684g0.G(this.f13471a.n(), 0, 2, false);
        this.f13471a.l(0);
        if ((this.f13471a.G() & 250) != 0) {
            return false;
        }
        c2684g0.G(this.f13471a.n(), 0, 4, false);
        this.f13471a.l(0);
        int w7 = this.f13471a.w();
        interfaceC3989s0.h();
        C2684g0 c2684g02 = (C2684g0) interfaceC3989s0;
        c2684g02.g(w7, false);
        c2684g02.G(this.f13471a.n(), 0, 4, false);
        this.f13471a.l(0);
        return this.f13471a.w() == 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        this.f13476f = interfaceC4207u0;
    }
}
