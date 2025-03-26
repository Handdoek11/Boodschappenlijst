package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class BG0 extends KH0 {

    /* renamed from: l, reason: collision with root package name */
    private final boolean f13760l;

    /* renamed from: m, reason: collision with root package name */
    private final C4721yl f13761m;

    /* renamed from: n, reason: collision with root package name */
    private final C1945Xk f13762n;

    /* renamed from: o, reason: collision with root package name */
    private C4676yG0 f13763o;

    /* renamed from: p, reason: collision with root package name */
    private C4567xG0 f13764p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13765q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f13766r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f13767s;

    public BG0(IG0 ig0, boolean z7) {
        boolean z8;
        super(ig0);
        if (z7) {
            ig0.u();
            z8 = true;
        } else {
            z8 = false;
        }
        this.f13760l = z8;
        this.f13761m = new C4721yl();
        this.f13762n = new C1945Xk();
        ig0.J();
        this.f13763o = C4676yG0.q(ig0.G());
    }

    private final Object L(Object obj) {
        return (this.f13763o.f28062d == null || !obj.equals(C4676yG0.f28060e)) ? obj : this.f13763o.f28062d;
    }

    private final boolean M(long j8) {
        C4567xG0 c4567xG0 = this.f13764p;
        int a8 = this.f13763o.a(c4567xG0.f27782o.f15340a);
        if (a8 == -1) {
            return false;
        }
        C4676yG0 c4676yG0 = this.f13763o;
        C1945Xk c1945Xk = this.f13762n;
        c4676yG0.d(a8, c1945Xk, false);
        long j9 = c1945Xk.f20119d;
        if (j9 != -9223372036854775807L && j8 >= j9) {
            j8 = Math.max(0L, j9 - 1);
        }
        c4567xG0.r(j8);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.KH0
    protected final GG0 D(GG0 gg0) {
        Object obj = this.f13763o.f28062d;
        Object obj2 = gg0.f15340a;
        if (obj != null && this.f13763o.f28062d.equals(obj2)) {
            obj2 = C4676yG0.f28060e;
        }
        return gg0.a(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    @Override // com.google.android.gms.internal.ads.KH0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void E(com.google.android.gms.internal.ads.AbstractC1981Yl r15) {
        /*
            r14 = this;
            boolean r0 = r14.f13766r
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.yG0 r0 = r14.f13763o
            com.google.android.gms.internal.ads.yG0 r15 = r0.p(r15)
            r14.f13763o = r15
            com.google.android.gms.internal.ads.xG0 r15 = r14.f13764p
            if (r15 == 0) goto L9e
            long r2 = r15.l()
            r14.M(r2)
            goto L9e
        L1a:
            boolean r0 = r15.o()
            if (r0 == 0) goto L36
            boolean r0 = r14.f13767s
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.yG0 r0 = r14.f13763o
            com.google.android.gms.internal.ads.yG0 r15 = r0.p(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.C4721yl.f28182o
            java.lang.Object r2 = com.google.android.gms.internal.ads.C4676yG0.f28060e
            com.google.android.gms.internal.ads.yG0 r15 = com.google.android.gms.internal.ads.C4676yG0.r(r15, r0, r2)
        L33:
            r14.f13763o = r15
            goto L9e
        L36:
            com.google.android.gms.internal.ads.yl r0 = r14.f13761m
            r2 = 0
            r3 = 0
            r15.e(r2, r0, r3)
            com.google.android.gms.internal.ads.yl r0 = r14.f13761m
            java.lang.Object r0 = r0.f28184a
            com.google.android.gms.internal.ads.xG0 r5 = r14.f13764p
            if (r5 == 0) goto L62
            long r6 = r5.m()
            com.google.android.gms.internal.ads.yG0 r8 = r14.f13763o
            com.google.android.gms.internal.ads.Xk r9 = r14.f13762n
            com.google.android.gms.internal.ads.GG0 r5 = r5.f27782o
            java.lang.Object r5 = r5.f15340a
            r8.n(r5, r9)
            com.google.android.gms.internal.ads.yG0 r5 = r14.f13763o
            com.google.android.gms.internal.ads.yl r8 = r14.f13761m
            r5.e(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.yl r9 = r14.f13761m
            com.google.android.gms.internal.ads.Xk r10 = r14.f13762n
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.l(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.f13767s
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.yG0 r0 = r14.f13763o
            com.google.android.gms.internal.ads.yG0 r15 = r0.p(r15)
            goto L86
        L82:
            com.google.android.gms.internal.ads.yG0 r15 = com.google.android.gms.internal.ads.C4676yG0.r(r15, r0, r3)
        L86:
            r14.f13763o = r15
            com.google.android.gms.internal.ads.xG0 r15 = r14.f13764p
            if (r15 == 0) goto L9e
            boolean r0 = r14.M(r4)
            if (r0 == 0) goto L9e
            com.google.android.gms.internal.ads.GG0 r15 = r15.f27782o
            java.lang.Object r0 = r15.f15340a
            java.lang.Object r0 = r14.L(r0)
            com.google.android.gms.internal.ads.GG0 r1 = r15.a(r0)
        L9e:
            r15 = 1
            r14.f13767s = r15
            r14.f13766r = r15
            com.google.android.gms.internal.ads.yG0 r15 = r14.f13763o
            r14.v(r15)
            if (r1 == 0) goto Lb2
            com.google.android.gms.internal.ads.xG0 r15 = r14.f13764p
            r15.getClass()
            r15.q(r1)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BG0.E(com.google.android.gms.internal.ads.Yl):void");
    }

    @Override // com.google.android.gms.internal.ads.KH0
    public final void F() {
        if (this.f13760l) {
            return;
        }
        this.f13765q = true;
        z(null, this.f16570k);
    }

    public final AbstractC1981Yl H() {
        return this.f13763o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3478nG0, com.google.android.gms.internal.ads.IG0
    public final void I() {
    }

    @Override // com.google.android.gms.internal.ads.IG0
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final C4567xG0 e(GG0 gg0, RI0 ri0, long j8) {
        C4567xG0 c4567xG0 = new C4567xG0(gg0, ri0, j8);
        c4567xG0.t(this.f16570k);
        if (this.f13766r) {
            c4567xG0.q(gg0.a(L(gg0.f15340a)));
        } else {
            this.f13764p = c4567xG0;
            if (!this.f13765q) {
                this.f13765q = true;
                z(null, this.f16570k);
            }
        }
        return c4567xG0;
    }

    @Override // com.google.android.gms.internal.ads.KH0, com.google.android.gms.internal.ads.IG0
    public final void b(EG0 eg0) {
        ((C4567xG0) eg0).s();
        if (eg0 == this.f13764p) {
            this.f13764p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2608fG0, com.google.android.gms.internal.ads.IG0
    public final void c(E7 e72) {
        if (this.f13767s) {
            this.f13763o = this.f13763o.p(new HH0(this.f13763o.f26863b, e72));
        } else {
            this.f13763o = C4676yG0.q(e72);
        }
        this.f16570k.c(e72);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3478nG0, com.google.android.gms.internal.ads.AbstractC2608fG0
    public final void w() {
        this.f13766r = false;
        this.f13765q = false;
        super.w();
    }
}
