package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class W3 {

    /* renamed from: a, reason: collision with root package name */
    public int f19701a;

    /* renamed from: b, reason: collision with root package name */
    public long f19702b;

    /* renamed from: c, reason: collision with root package name */
    public int f19703c;

    /* renamed from: d, reason: collision with root package name */
    public int f19704d;

    /* renamed from: e, reason: collision with root package name */
    public int f19705e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f19706f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    private final UQ f19707g = new UQ(255);

    W3() {
    }

    public final void a() {
        this.f19701a = 0;
        this.f19702b = 0L;
        this.f19703c = 0;
        this.f19704d = 0;
        this.f19705e = 0;
    }

    public final boolean b(InterfaceC3989s0 interfaceC3989s0, boolean z7) {
        a();
        this.f19707g.i(27);
        if (AbstractC4316v0.c(interfaceC3989s0, this.f19707g.n(), 0, 27, z7) && this.f19707g.K() == 1332176723) {
            if (this.f19707g.C() != 0) {
                if (z7) {
                    return false;
                }
                throw zzbc.c("unsupported bit stream revision");
            }
            this.f19701a = this.f19707g.C();
            this.f19702b = this.f19707g.H();
            this.f19707g.I();
            this.f19707g.I();
            this.f19707g.I();
            int C7 = this.f19707g.C();
            this.f19703c = C7;
            this.f19704d = C7 + 27;
            this.f19707g.i(C7);
            if (AbstractC4316v0.c(interfaceC3989s0, this.f19707g.n(), 0, this.f19703c, z7)) {
                for (int i8 = 0; i8 < this.f19703c; i8++) {
                    this.f19706f[i8] = this.f19707g.C();
                    this.f19705e += this.f19706f[i8];
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r10 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r9.c() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r9.B(1) != (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.google.android.gms.internal.ads.InterfaceC3989s0 r9, long r10) {
        /*
            r8 = this;
            long r0 = r9.c()
            long r2 = r9.b()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            com.google.android.gms.internal.ads.AbstractC3796qC.d(r0)
            com.google.android.gms.internal.ads.UQ r0 = r8.f19707g
            r3 = 4
            r0.i(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2c
            long r4 = r9.c()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L2c
            goto L52
        L2c:
            com.google.android.gms.internal.ads.UQ r4 = r8.f19707g
            byte[] r4 = r4.n()
            boolean r4 = com.google.android.gms.internal.ads.AbstractC4316v0.c(r9, r4, r1, r3, r2)
            if (r4 == 0) goto L52
            com.google.android.gms.internal.ads.UQ r0 = r8.f19707g
            r0.l(r1)
            com.google.android.gms.internal.ads.UQ r0 = r8.f19707g
            long r4 = r0.K()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4e
            r9.h()
            return r2
        L4e:
            r9.D(r2)
            goto L1a
        L52:
            if (r0 == 0) goto L5c
            long r3 = r9.c()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L63
        L5c:
            int r3 = r9.B(r2)
            r4 = -1
            if (r3 != r4) goto L52
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.W3.c(com.google.android.gms.internal.ads.s0, long):boolean");
    }
}
