package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class JT implements CH {

    /* renamed from: a, reason: collision with root package name */
    private final H2.a f16252a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.common.util.concurrent.d f16253b;

    /* renamed from: c, reason: collision with root package name */
    private final C3785q60 f16254c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4410vt f16255d;

    /* renamed from: e, reason: collision with root package name */
    private final L60 f16256e;

    /* renamed from: f, reason: collision with root package name */
    private final C1767Si f16257f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f16258g;

    /* renamed from: h, reason: collision with root package name */
    private final US f16259h;

    /* renamed from: i, reason: collision with root package name */
    private final HN f16260i;

    JT(H2.a aVar, com.google.common.util.concurrent.d dVar, C3785q60 c3785q60, InterfaceC4410vt interfaceC4410vt, L60 l60, boolean z7, C1767Si c1767Si, US us, HN hn) {
        this.f16252a = aVar;
        this.f16253b = dVar;
        this.f16254c = c3785q60;
        this.f16255d = interfaceC4410vt;
        this.f16256e = l60;
        this.f16258g = z7;
        this.f16257f = c1767Si;
        this.f16259h = us;
        this.f16260i = hn;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    @Override // com.google.android.gms.internal.ads.CH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r20, android.content.Context r21, com.google.android.gms.internal.ads.C4558xC r22) {
        /*
            r19 = this;
            r0 = r19
            com.google.common.util.concurrent.d r1 = r0.f16253b
            java.lang.Object r1 = com.google.android.gms.internal.ads.AbstractC2326ck0.q(r1)
            com.google.android.gms.internal.ads.fy r1 = (com.google.android.gms.internal.ads.AbstractC2679fy) r1
            com.google.android.gms.internal.ads.vt r2 = r0.f16255d
            r3 = 1
            r2.X0(r3)
            C2.l r2 = new C2.l
            boolean r4 = r0.f16258g
            if (r4 == 0) goto L1e
            com.google.android.gms.internal.ads.Si r4 = r0.f16257f
            boolean r4 = r4.e(r3)
            r5 = r4
            goto L1f
        L1e:
            r5 = r3
        L1f:
            boolean r4 = r0.f16258g
            if (r4 == 0) goto L2b
            com.google.android.gms.internal.ads.Si r6 = r0.f16257f
            boolean r6 = r6.d()
        L29:
            r7 = r6
            goto L2d
        L2b:
            r6 = 0
            goto L29
        L2d:
            if (r4 == 0) goto L37
            com.google.android.gms.internal.ads.Si r4 = r0.f16257f
            float r4 = r4.a()
        L35:
            r8 = r4
            goto L39
        L37:
            r4 = 0
            goto L35
        L39:
            com.google.android.gms.internal.ads.q60 r4 = r0.f16254c
            boolean r11 = r4.f25766O
            r12 = 0
            r6 = 1
            r9 = -1
            r4 = r2
            r10 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r22 == 0) goto L4b
            r22.c()
        L4b:
            C2.v.m()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r15 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.rH r6 = r1.i()
            com.google.android.gms.internal.ads.vt r8 = r0.f16255d
            com.google.android.gms.internal.ads.q60 r1 = r0.f16254c
            int r1 = r1.f25768Q
            r4 = -1
            if (r1 == r4) goto L5f
        L5d:
            r9 = r1
            goto L7a
        L5f:
            com.google.android.gms.internal.ads.L60 r1 = r0.f16256e
            D2.i2 r1 = r1.f16772j
            if (r1 == 0) goto L70
            int r1 = r1.f1295o
            if (r1 != r3) goto L6b
            r1 = 7
            goto L5d
        L6b:
            r4 = 2
            if (r1 != r4) goto L70
            r1 = 6
            goto L5d
        L70:
            java.lang.String r1 = "Error setting app open orientation; no targeting orientation available."
            H2.p.b(r1)
            com.google.android.gms.internal.ads.q60 r1 = r0.f16254c
            int r1 = r1.f25768Q
            goto L5d
        L7a:
            H2.a r10 = r0.f16252a
            com.google.android.gms.internal.ads.q60 r1 = r0.f16254c
            java.lang.String r11 = r1.f25753B
            com.google.android.gms.internal.ads.u60 r4 = r1.f25814s
            java.lang.String r13 = r4.f26997b
            java.lang.String r14 = r4.f26996a
            com.google.android.gms.internal.ads.L60 r4 = r0.f16256e
            boolean r1 = r1.b()
            if (r1 == 0) goto L93
            com.google.android.gms.internal.ads.US r1 = r0.f16259h
        L90:
            r17 = r1
            goto L95
        L93:
            r1 = 0
            goto L90
        L95:
            java.lang.String r1 = r4.f16768f
            com.google.android.gms.internal.ads.vt r4 = r0.f16255d
            java.lang.String r18 = r4.r()
            r5 = 0
            r7 = 0
            r4 = r15
            r12 = r2
            r2 = r15
            r15 = r1
            r16 = r22
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.google.android.gms.internal.ads.HN r1 = r0.f16260i
            r4 = r21
            F2.y.a(r4, r2, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.JT.a(boolean, android.content.Context, com.google.android.gms.internal.ads.xC):void");
    }
}
