package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class XA implements JD, DG {

    /* renamed from: o, reason: collision with root package name */
    private AbstractC3964ro f20001o;

    /* renamed from: t, reason: collision with root package name */
    private final Context f20003t;

    /* renamed from: u, reason: collision with root package name */
    private final RunnableC3791q90 f20004u;

    /* renamed from: v, reason: collision with root package name */
    private final H2.a f20005v;

    /* renamed from: w, reason: collision with root package name */
    private final Executor f20006w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f20007x = false;

    /* renamed from: y, reason: collision with root package name */
    private boolean f20008y = false;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicBoolean f20002s = new AtomicBoolean();

    XA(Context context, RunnableC3791q90 runnableC3791q90, H2.a aVar, Executor executor) {
        this.f20003t = context;
        this.f20004u = runnableC3791q90;
        this.f20005v = aVar;
        this.f20006w = executor;
    }

    @Override // com.google.android.gms.internal.ads.DG
    public final void E(String str) {
        c();
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void Q(C4618xo c4618xo) {
        c();
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void T0(C60 c60) {
    }

    @Override // com.google.android.gms.internal.ads.DG
    public final void a(M2.N n8) {
        c();
    }

    final /* synthetic */ void b() {
        AbstractC1829Ue.e(this.f20003t);
        this.f20008y = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f20002s
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lb
            goto La5
        Lb:
            com.google.android.gms.internal.ads.Uf r0 = com.google.android.gms.internal.ads.AbstractC3295lg.f24370j
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 2
            if (r0 == 0) goto L1c
        L1a:
            r3 = r2
            goto L68
        L1c:
            com.google.android.gms.internal.ads.Uf r0 = com.google.android.gms.internal.ads.AbstractC3295lg.f24371k
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 3
            if (r0 == 0) goto L2c
            goto L68
        L2c:
            com.google.android.gms.internal.ads.Uf r0 = com.google.android.gms.internal.ads.AbstractC3295lg.f24369i
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
        L3a:
            r3 = r1
            goto L68
        L3c:
            com.google.android.gms.internal.ads.Bq r0 = C2.v.s()
            G2.r0 r0 = r0.j()
            com.google.android.gms.internal.ads.vq r0 = r0.g()
            java.lang.String r0 = r0.c()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            r4.<init>(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "local_flag_write"
            java.lang.String r0 = r4.optString(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r4 = "client"
            boolean r4 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r4 == 0) goto L60
            goto L1a
        L60:
            java.lang.String r4 = "service"
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r0 == 0) goto L3a
        L68:
            int r3 = r3 + (-1)
            if (r3 == r1) goto L80
            if (r3 == r2) goto L6f
            goto La5
        L6f:
            android.content.Context r0 = r5.f20003t
            com.google.android.gms.internal.ads.q90 r2 = r5.f20004u
            com.google.android.gms.internal.ads.Uk r3 = C2.v.j()
            H2.a r4 = H2.a.A0()
            com.google.android.gms.internal.ads.el r0 = r3.b(r0, r4, r2)
            goto L90
        L80:
            android.content.Context r0 = r5.f20003t
            com.google.android.gms.internal.ads.q90 r2 = r5.f20004u
            com.google.android.gms.internal.ads.Uk r3 = C2.v.j()
            H2.a r4 = H2.a.A0()
            com.google.android.gms.internal.ads.el r0 = r3.a(r0, r4, r2)
        L90:
            java.lang.String r2 = "google.afma.sdkConstants.getSdkConstants"
            com.google.android.gms.internal.ads.Yk r3 = com.google.android.gms.internal.ads.AbstractC2219bl.f20925b
            com.google.android.gms.internal.ads.Tk r0 = r0.a(r2, r3, r3)
            android.content.Context r2 = r5.f20003t
            H2.a r3 = r5.f20005v
            com.google.android.gms.internal.ads.to r4 = new com.google.android.gms.internal.ads.to
            r4.<init>(r2, r0, r3)
            r5.f20001o = r4
            r5.f20007x = r1
        La5:
            boolean r0 = r5.f20007x
            if (r0 != 0) goto Laa
            goto Ld3
        Laa:
            com.google.android.gms.internal.ads.ro r0 = r5.f20001o
            if (r0 == 0) goto Ld3
            com.google.common.util.concurrent.d r0 = r0.a()
            boolean r1 = r5.f20008y
            if (r1 != 0) goto Lce
            com.google.android.gms.internal.ads.Uf r1 = com.google.android.gms.internal.ads.AbstractC2426dg.f21634i
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lce
            com.google.android.gms.internal.ads.WA r1 = new com.google.android.gms.internal.ads.WA
            r1.<init>()
            java.util.concurrent.Executor r2 = r5.f20006w
            r0.f(r1, r2)
        Lce:
            java.lang.String r1 = "persistFlagsClient"
            com.google.android.gms.internal.ads.AbstractC1601Nq.a(r0, r1)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XA.c():void");
    }
}
