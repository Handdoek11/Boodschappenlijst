package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3229l1 implements InterfaceC3880r0 {

    /* renamed from: a, reason: collision with root package name */
    private final UQ f24246a;

    /* renamed from: b, reason: collision with root package name */
    private final C3011j1 f24247b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24248c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3344m4 f24249d;

    /* renamed from: e, reason: collision with root package name */
    private int f24250e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC4207u0 f24251f;

    /* renamed from: g, reason: collision with root package name */
    private C3338m1 f24252g;

    /* renamed from: h, reason: collision with root package name */
    private long f24253h;

    /* renamed from: i, reason: collision with root package name */
    private C3556o1[] f24254i;

    /* renamed from: j, reason: collision with root package name */
    private long f24255j;

    /* renamed from: k, reason: collision with root package name */
    private C3556o1 f24256k;

    /* renamed from: l, reason: collision with root package name */
    private int f24257l;

    /* renamed from: m, reason: collision with root package name */
    private long f24258m;

    /* renamed from: n, reason: collision with root package name */
    private long f24259n;

    /* renamed from: o, reason: collision with root package name */
    private int f24260o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f24261p;

    public C3229l1(int i8, InterfaceC3344m4 interfaceC3344m4) {
        this.f24249d = interfaceC3344m4;
        this.f24248c = 1 == (i8 ^ 1);
        this.f24246a = new UQ(12);
        this.f24247b = new C3011j1(null);
        this.f24251f = new M0();
        this.f24254i = new C3556o1[0];
        this.f24258m = -1L;
        this.f24259n = -1L;
        this.f24257l = -1;
        this.f24253h = -9223372036854775807L;
    }

    private final C3556o1 c(int i8) {
        for (C3556o1 c3556o1 : this.f24254i) {
            if (c3556o1.f(i8)) {
                return c3556o1;
            }
        }
        return null;
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
        this.f24255j = -1L;
        this.f24256k = null;
        for (C3556o1 c3556o1 : this.f24254i) {
            c3556o1.e(j8);
        }
        if (j8 == 0) {
            this.f24250e = this.f24254i.length != 0 ? 3 : 0;
        } else {
            this.f24250e = 6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02fd  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC3989s0 r28, com.google.android.gms.internal.ads.O0 r29) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3229l1.g(com.google.android.gms.internal.ads.s0, com.google.android.gms.internal.ads.O0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        interfaceC3989s0.I(this.f24246a.n(), 0, 12);
        this.f24246a.l(0);
        if (this.f24246a.y() != 1179011410) {
            return false;
        }
        this.f24246a.m(4);
        return this.f24246a.y() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        this.f24250e = 0;
        if (this.f24248c) {
            interfaceC4207u0 = new C3671p4(interfaceC4207u0, this.f24249d);
        }
        this.f24251f = interfaceC4207u0;
        this.f24255j = -1L;
    }
}
