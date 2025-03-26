package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public abstract class Gy0 implements InterfaceC4773zA0, CA0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f15508b;

    /* renamed from: d, reason: collision with root package name */
    private DA0 f15510d;

    /* renamed from: e, reason: collision with root package name */
    private int f15511e;

    /* renamed from: f, reason: collision with root package name */
    private C2059aD0 f15512f;

    /* renamed from: g, reason: collision with root package name */
    private RC f15513g;

    /* renamed from: h, reason: collision with root package name */
    private int f15514h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC4678yH0 f15515i;

    /* renamed from: j, reason: collision with root package name */
    private D[] f15516j;

    /* renamed from: k, reason: collision with root package name */
    private long f15517k;

    /* renamed from: l, reason: collision with root package name */
    private long f15518l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f15520n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f15521o;

    /* renamed from: q, reason: collision with root package name */
    private BA0 f15523q;

    /* renamed from: a, reason: collision with root package name */
    private final Object f15507a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Tz0 f15509c = new Tz0();

    /* renamed from: m, reason: collision with root package name */
    private long f15519m = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    private AbstractC1981Yl f15522p = AbstractC1981Yl.f20311a;

    public Gy0(int i8) {
        this.f15508b = i8;
    }

    private final void L(long j8, boolean z7) {
        this.f15520n = false;
        this.f15518l = j8;
        this.f15519m = j8;
        a0(j8, z7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final void A() {
        AbstractC3796qC.f(this.f15514h == 0);
        B();
    }

    protected abstract void B();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C() {
        BA0 ba0;
        synchronized (this.f15507a) {
            ba0 = this.f15523q;
        }
        if (ba0 != null) {
            ba0.a(this);
        }
    }

    protected abstract void D();

    protected abstract void E();

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final void F() {
        AbstractC3796qC.f(this.f15514h == 0);
        Tz0 tz0 = this.f15509c;
        tz0.f19206b = null;
        tz0.f19205a = null;
        D();
    }

    protected abstract void G();

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final void H() {
        AbstractC3796qC.f(this.f15514h == 1);
        this.f15514h = 2;
        E();
    }

    protected abstract void I(D[] dArr, long j8, long j9, GG0 gg0);

    protected final boolean J() {
        if (y()) {
            return this.f15520n;
        }
        InterfaceC4678yH0 interfaceC4678yH0 = this.f15515i;
        interfaceC4678yH0.getClass();
        return interfaceC4678yH0.b();
    }

    protected final D[] K() {
        D[] dArr = this.f15516j;
        dArr.getClass();
        return dArr;
    }

    protected final int M(Tz0 tz0, C4530wy0 c4530wy0, int i8) {
        InterfaceC4678yH0 interfaceC4678yH0 = this.f15515i;
        interfaceC4678yH0.getClass();
        int a8 = interfaceC4678yH0.a(tz0, c4530wy0, i8);
        if (a8 == -4) {
            if (c4530wy0.f()) {
                this.f15519m = Long.MIN_VALUE;
                return this.f15520n ? -4 : -3;
            }
            long j8 = c4530wy0.f27697f + this.f15517k;
            c4530wy0.f27697f = j8;
            this.f15519m = Math.max(this.f15519m, j8);
        } else if (a8 == -5) {
            D d8 = tz0.f19205a;
            d8.getClass();
            long j9 = d8.f14339t;
            if (j9 != Long.MAX_VALUE) {
                C2723gJ0 b8 = d8.b();
                b8.F(j9 + this.f15517k);
                tz0.f19205a = b8.H();
                return -5;
            }
        }
        return a8;
    }

    protected final zzib N(Throwable th, D d8, boolean z7, int i8) {
        int i9 = 4;
        if (d8 != null && !this.f15521o) {
            this.f15521o = true;
            try {
                i9 = f(d8) & 7;
            } catch (zzib unused) {
            } finally {
                this.f15521o = false;
            }
        }
        return zzib.b(th, u(), this.f15511e, d8, i9, z7, i8);
    }

    protected final int O(long j8) {
        InterfaceC4678yH0 interfaceC4678yH0 = this.f15515i;
        interfaceC4678yH0.getClass();
        return interfaceC4678yH0.c(j8 - this.f15517k);
    }

    protected final long Q() {
        return this.f15518l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final void R() {
        this.f15520n = true;
    }

    protected final AbstractC1981Yl S() {
        return this.f15522p;
    }

    protected final RC T() {
        RC rc = this.f15513g;
        rc.getClass();
        return rc;
    }

    protected final Tz0 U() {
        Tz0 tz0 = this.f15509c;
        tz0.f19206b = null;
        tz0.f19205a = null;
        return tz0;
    }

    protected final DA0 V() {
        DA0 da0 = this.f15510d;
        da0.getClass();
        return da0;
    }

    protected final C2059aD0 W() {
        C2059aD0 c2059aD0 = this.f15512f;
        c2059aD0.getClass();
        return c2059aD0;
    }

    protected abstract void X();

    protected abstract void Z(boolean z7, boolean z8);

    protected abstract void a0(long j8, boolean z7);

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final void c(AbstractC1981Yl abstractC1981Yl) {
        if (Objects.equals(this.f15522p, abstractC1981Yl)) {
            return;
        }
        this.f15522p = abstractC1981Yl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final int d() {
        return this.f15514h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final void d0() {
        AbstractC3796qC.f(this.f15514h == 2);
        this.f15514h = 1;
        G();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final void g(DA0 da0, D[] dArr, InterfaceC4678yH0 interfaceC4678yH0, long j8, boolean z7, boolean z8, long j9, long j10, GG0 gg0) {
        AbstractC3796qC.f(this.f15514h == 0);
        this.f15510d = da0;
        this.f15514h = 1;
        Z(z7, z8);
        n(dArr, interfaceC4678yH0, j9, j10, gg0);
        L(j9, z7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public Zz0 j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final CA0 k() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final void l(long j8) {
        L(j8, false);
    }

    @Override // com.google.android.gms.internal.ads.CA0
    public final void m(BA0 ba0) {
        synchronized (this.f15507a) {
            this.f15523q = ba0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final void n(D[] dArr, InterfaceC4678yH0 interfaceC4678yH0, long j8, long j9, GG0 gg0) {
        AbstractC3796qC.f(!this.f15520n);
        this.f15515i = interfaceC4678yH0;
        if (this.f15519m == Long.MIN_VALUE) {
            this.f15519m = j8;
        }
        this.f15516j = dArr;
        this.f15517k = j9;
        I(dArr, j8, j9, gg0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final void o(int i8, C2059aD0 c2059aD0, RC rc) {
        this.f15511e = i8;
        this.f15512f = c2059aD0;
        this.f15513g = rc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final InterfaceC4678yH0 p() {
        return this.f15515i;
    }

    @Override // com.google.android.gms.internal.ads.CA0
    public final void q() {
        synchronized (this.f15507a) {
            this.f15523q = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final void r() {
        AbstractC3796qC.f(this.f15514h == 1);
        Tz0 tz0 = this.f15509c;
        tz0.f19206b = null;
        tz0.f19205a = null;
        this.f15514h = 0;
        this.f15515i = null;
        this.f15516j = null;
        this.f15520n = false;
        X();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public /* synthetic */ void t() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final long v() {
        return this.f15519m;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final void w() {
        InterfaceC4678yH0 interfaceC4678yH0 = this.f15515i;
        interfaceC4678yH0.getClass();
        interfaceC4678yH0.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final boolean y() {
        return this.f15519m == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0
    public final boolean z() {
        return this.f15520n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4773zA0, com.google.android.gms.internal.ads.CA0
    public final int zzb() {
        return this.f15508b;
    }
}
