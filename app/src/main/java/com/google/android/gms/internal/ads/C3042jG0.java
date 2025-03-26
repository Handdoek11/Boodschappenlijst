package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3042jG0 implements EG0, DG0 {

    /* renamed from: o, reason: collision with root package name */
    public final EG0 f23225o;

    /* renamed from: s, reason: collision with root package name */
    private DG0 f23226s;

    /* renamed from: t, reason: collision with root package name */
    private C2935iG0[] f23227t = new C2935iG0[0];

    /* renamed from: u, reason: collision with root package name */
    private long f23228u = 0;

    /* renamed from: v, reason: collision with root package name */
    long f23229v;

    public C3042jG0(EG0 eg0, boolean z7, long j8, long j9) {
        this.f23225o = eg0;
        this.f23229v = j9;
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final long a() {
        long a8 = this.f23225o.a();
        if (a8 != Long.MIN_VALUE) {
            long j8 = this.f23229v;
            if (j8 == Long.MIN_VALUE || a8 < j8) {
                return a8;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // com.google.android.gms.internal.ads.EG0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f23228u = r0
            com.google.android.gms.internal.ads.iG0[] r0 = r7.f23227t
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.e()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.gms.internal.ads.EG0 r0 = r7.f23225o
            long r0 = r0.b(r8)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L35
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 < 0) goto L36
            long r3 = r7.f23229v
            r5 = -9223372036854775808
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L35
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 > 0) goto L36
        L35:
            r2 = r9
        L36:
            com.google.android.gms.internal.ads.AbstractC3796qC.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3042jG0.b(long):long");
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final void c(long j8) {
        this.f23225o.c(j8);
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long d() {
        if (m()) {
            long j8 = this.f23228u;
            this.f23228u = -9223372036854775807L;
            long d8 = d();
            return d8 != -9223372036854775807L ? d8 : j8;
        }
        long d9 = this.f23225o.d();
        if (d9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC3796qC.f(d9 >= 0);
        long j9 = this.f23229v;
        AbstractC3796qC.f(j9 == Long.MIN_VALUE || d9 <= j9);
        return d9;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final JH0 e() {
        return this.f23225o.e();
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final boolean f(Yz0 yz0) {
        return this.f23225o.f(yz0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4787zH0
    public final /* bridge */ /* synthetic */ void g(BH0 bh0) {
        DG0 dg0 = this.f23226s;
        dg0.getClass();
        dg0.g(this);
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long h(long j8, FA0 fa0) {
        if (j8 == 0) {
            return 0L;
        }
        long max = Math.max(0L, Math.min(fa0.f15097a, j8));
        long j9 = fa0.f15098b;
        long j10 = this.f23229v;
        long max2 = Math.max(0L, Math.min(j9, j10 == Long.MIN_VALUE ? Long.MAX_VALUE : j10 - j8));
        if (max != fa0.f15097a || max2 != fa0.f15098b) {
            fa0 = new FA0(max, max2);
        }
        return this.f23225o.h(j8, fa0);
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void i() {
        this.f23225o.i();
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void j(long j8, boolean z7) {
        this.f23225o.j(j8, false);
    }

    @Override // com.google.android.gms.internal.ads.DG0
    public final void k(EG0 eg0) {
        DG0 dg0 = this.f23226s;
        dg0.getClass();
        dg0.k(this);
    }

    public final void l(long j8, long j9) {
        this.f23229v = j9;
    }

    final boolean m() {
        return this.f23228u != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    @Override // com.google.android.gms.internal.ads.EG0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long n(com.google.android.gms.internal.ads.BI0[] r15, boolean[] r16, com.google.android.gms.internal.ads.InterfaceC4678yH0[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.android.gms.internal.ads.iG0[] r3 = new com.google.android.gms.internal.ads.C2935iG0[r2]
            r0.f23227t = r3
            com.google.android.gms.internal.ads.yH0[] r2 = new com.google.android.gms.internal.ads.InterfaceC4678yH0[r2]
            r3 = 0
            r4 = r3
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            com.google.android.gms.internal.ads.iG0[] r5 = r0.f23227t
            r6 = r1[r4]
            com.google.android.gms.internal.ads.iG0 r6 = (com.google.android.gms.internal.ads.C2935iG0) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            com.google.android.gms.internal.ads.yH0 r11 = r6.f22934a
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            com.google.android.gms.internal.ads.EG0 r4 = r0.f23225o
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.n(r5, r6, r7, r8, r9)
            boolean r6 = r14.m()
            r7 = 0
            if (r6 == 0) goto L3d
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L3d
            r9 = r7
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f23228u = r12
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            r9 = 1
            if (r6 == 0) goto L5d
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 < 0) goto L5c
            long r6 = r0.f23229v
            r12 = -9223372036854775808
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 == 0) goto L5d
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L5c
            goto L5d
        L5c:
            r9 = r3
        L5d:
            com.google.android.gms.internal.ads.AbstractC3796qC.f(r9)
        L60:
            int r6 = r1.length
            if (r3 >= r6) goto L86
            r6 = r2[r3]
            if (r6 != 0) goto L6c
            com.google.android.gms.internal.ads.iG0[] r6 = r0.f23227t
            r6[r3] = r11
            goto L7d
        L6c:
            com.google.android.gms.internal.ads.iG0[] r7 = r0.f23227t
            r8 = r7[r3]
            if (r8 == 0) goto L76
            com.google.android.gms.internal.ads.yH0 r8 = r8.f22934a
            if (r8 == r6) goto L7d
        L76:
            com.google.android.gms.internal.ads.iG0 r8 = new com.google.android.gms.internal.ads.iG0
            r8.<init>(r14, r6)
            r7[r3] = r8
        L7d:
            com.google.android.gms.internal.ads.iG0[] r6 = r0.f23227t
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L60
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3042jG0.n(com.google.android.gms.internal.ads.BI0[], boolean[], com.google.android.gms.internal.ads.yH0[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void o(DG0 dg0, long j8) {
        this.f23226s = dg0;
        this.f23225o.o(this, j8);
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final boolean p() {
        return this.f23225o.p();
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final long zzb() {
        long zzb = this.f23225o.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j8 = this.f23229v;
            if (j8 == Long.MIN_VALUE || zzb < j8) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }
}
