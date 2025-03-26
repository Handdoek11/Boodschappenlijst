package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2935iG0 implements InterfaceC4678yH0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4678yH0 f22934a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22935b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3042jG0 f22936c;

    public C2935iG0(C3042jG0 c3042jG0, InterfaceC4678yH0 interfaceC4678yH0) {
        this.f22936c = c3042jG0;
        this.f22934a = interfaceC4678yH0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4678yH0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.google.android.gms.internal.ads.Tz0 r13, com.google.android.gms.internal.ads.C4530wy0 r14, int r15) {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.jG0 r0 = r12.f22936c
            boolean r1 = r0.m()
            r2 = -3
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r12.f22935b
            r3 = 4
            r4 = -4
            if (r1 == 0) goto L14
            r14.c(r3)
            return r4
        L14:
            long r0 = r0.zzb()
            com.google.android.gms.internal.ads.yH0 r5 = r12.f22934a
            int r15 = r5.a(r13, r14, r15)
            r5 = -5
            r6 = -9223372036854775808
            if (r15 != r5) goto L4e
            com.google.android.gms.internal.ads.D r14 = r13.f19205a
            r14.getClass()
            int r15 = r14.f14314G
            r0 = 0
            if (r15 != 0) goto L32
            int r15 = r14.f14315H
            if (r15 == 0) goto L4d
            r15 = r0
        L32:
            com.google.android.gms.internal.ads.jG0 r1 = r12.f22936c
            long r1 = r1.f23229v
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L3b
            goto L3d
        L3b:
            int r0 = r14.f14315H
        L3d:
            com.google.android.gms.internal.ads.gJ0 r14 = r14.b()
            r14.g(r15)
            r14.h(r0)
            com.google.android.gms.internal.ads.D r14 = r14.H()
            r13.f19205a = r14
        L4d:
            return r5
        L4e:
            com.google.android.gms.internal.ads.jG0 r13 = r12.f22936c
            long r8 = r13.f23229v
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 == 0) goto L72
            if (r15 != r4) goto L5e
            long r10 = r14.f27697f
            int r13 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r13 >= 0) goto L68
        L5e:
            if (r15 != r2) goto L72
            int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r13 != 0) goto L72
            boolean r13 = r14.f27696e
            if (r13 != 0) goto L72
        L68:
            r14.b()
            r14.c(r3)
            r13 = 1
            r12.f22935b = r13
            return r4
        L72:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2935iG0.a(com.google.android.gms.internal.ads.Tz0, com.google.android.gms.internal.ads.wy0, int):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4678yH0
    public final boolean b() {
        return !this.f22936c.m() && this.f22934a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4678yH0
    public final int c(long j8) {
        if (this.f22936c.m()) {
            return -3;
        }
        return this.f22934a.c(j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4678yH0
    public final void d() {
        this.f22934a.d();
    }

    public final void e() {
        this.f22935b = false;
    }
}
