package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4567xG0 implements EG0, DG0 {

    /* renamed from: o, reason: collision with root package name */
    public final GG0 f27782o;

    /* renamed from: s, reason: collision with root package name */
    private final long f27783s;

    /* renamed from: t, reason: collision with root package name */
    private IG0 f27784t;

    /* renamed from: u, reason: collision with root package name */
    private EG0 f27785u;

    /* renamed from: v, reason: collision with root package name */
    private DG0 f27786v;

    /* renamed from: w, reason: collision with root package name */
    private long f27787w = -9223372036854775807L;

    /* renamed from: x, reason: collision with root package name */
    private final RI0 f27788x;

    public C4567xG0(GG0 gg0, RI0 ri0, long j8) {
        this.f27782o = gg0;
        this.f27788x = ri0;
        this.f27783s = j8;
    }

    private final long u(long j8) {
        long j9 = this.f27787w;
        return j9 != -9223372036854775807L ? j9 : j8;
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final long a() {
        EG0 eg0 = this.f27785u;
        int i8 = AbstractC2301cW.f21206a;
        return eg0.a();
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long b(long j8) {
        EG0 eg0 = this.f27785u;
        int i8 = AbstractC2301cW.f21206a;
        return eg0.b(j8);
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final void c(long j8) {
        EG0 eg0 = this.f27785u;
        int i8 = AbstractC2301cW.f21206a;
        eg0.c(j8);
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long d() {
        EG0 eg0 = this.f27785u;
        int i8 = AbstractC2301cW.f21206a;
        return eg0.d();
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final JH0 e() {
        EG0 eg0 = this.f27785u;
        int i8 = AbstractC2301cW.f21206a;
        return eg0.e();
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final boolean f(Yz0 yz0) {
        EG0 eg0 = this.f27785u;
        return eg0 != null && eg0.f(yz0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4787zH0
    public final /* bridge */ /* synthetic */ void g(BH0 bh0) {
        DG0 dg0 = this.f27786v;
        int i8 = AbstractC2301cW.f21206a;
        dg0.g(this);
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long h(long j8, FA0 fa0) {
        EG0 eg0 = this.f27785u;
        int i8 = AbstractC2301cW.f21206a;
        return eg0.h(j8, fa0);
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void i() {
        EG0 eg0 = this.f27785u;
        if (eg0 != null) {
            eg0.i();
            return;
        }
        IG0 ig0 = this.f27784t;
        if (ig0 != null) {
            ig0.I();
        }
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void j(long j8, boolean z7) {
        EG0 eg0 = this.f27785u;
        int i8 = AbstractC2301cW.f21206a;
        eg0.j(j8, false);
    }

    @Override // com.google.android.gms.internal.ads.DG0
    public final void k(EG0 eg0) {
        DG0 dg0 = this.f27786v;
        int i8 = AbstractC2301cW.f21206a;
        dg0.k(this);
    }

    public final long l() {
        return this.f27787w;
    }

    public final long m() {
        return this.f27783s;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long n(BI0[] bi0Arr, boolean[] zArr, InterfaceC4678yH0[] interfaceC4678yH0Arr, boolean[] zArr2, long j8) {
        long j9 = this.f27787w;
        long j10 = (j9 == -9223372036854775807L || j8 != this.f27783s) ? j8 : j9;
        this.f27787w = -9223372036854775807L;
        EG0 eg0 = this.f27785u;
        int i8 = AbstractC2301cW.f21206a;
        return eg0.n(bi0Arr, zArr, interfaceC4678yH0Arr, zArr2, j10);
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void o(DG0 dg0, long j8) {
        this.f27786v = dg0;
        EG0 eg0 = this.f27785u;
        if (eg0 != null) {
            eg0.o(this, u(this.f27783s));
        }
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final boolean p() {
        EG0 eg0 = this.f27785u;
        return eg0 != null && eg0.p();
    }

    public final void q(GG0 gg0) {
        long u7 = u(this.f27783s);
        IG0 ig0 = this.f27784t;
        ig0.getClass();
        EG0 e8 = ig0.e(gg0, this.f27788x, u7);
        this.f27785u = e8;
        if (this.f27786v != null) {
            e8.o(this, u7);
        }
    }

    public final void r(long j8) {
        this.f27787w = j8;
    }

    public final void s() {
        EG0 eg0 = this.f27785u;
        if (eg0 != null) {
            IG0 ig0 = this.f27784t;
            ig0.getClass();
            ig0.b(eg0);
        }
    }

    public final void t(IG0 ig0) {
        AbstractC3796qC.f(this.f27784t == null);
        this.f27784t = ig0;
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final long zzb() {
        EG0 eg0 = this.f27785u;
        int i8 = AbstractC2301cW.f21206a;
        return eg0.zzb();
    }
}
