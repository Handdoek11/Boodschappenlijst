package com.google.android.gms.internal.ads;

import D2.C0492c1;
import D2.C0521m0;
import D2.InterfaceC0485a0;
import D2.InterfaceC0509i0;
import D2.InterfaceC0530p0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.Collections;

/* loaded from: classes.dex */
public final class XW extends D2.U implements InterfaceC4669yD {

    /* renamed from: o, reason: collision with root package name */
    private final Context f20055o;

    /* renamed from: s, reason: collision with root package name */
    private final C4652y40 f20056s;

    /* renamed from: t, reason: collision with root package name */
    private final String f20057t;

    /* renamed from: u, reason: collision with root package name */
    private final C4042sX f20058u;

    /* renamed from: v, reason: collision with root package name */
    private D2.c2 f20059v;

    /* renamed from: w, reason: collision with root package name */
    private final J60 f20060w;

    /* renamed from: x, reason: collision with root package name */
    private final H2.a f20061x;

    /* renamed from: y, reason: collision with root package name */
    private final HN f20062y;

    /* renamed from: z, reason: collision with root package name */
    private AbstractC4420vy f20063z;

    public XW(Context context, D2.c2 c2Var, String str, C4652y40 c4652y40, C4042sX c4042sX, H2.a aVar, HN hn) {
        this.f20055o = context;
        this.f20056s = c4652y40;
        this.f20059v = c2Var;
        this.f20057t = str;
        this.f20058u = c4042sX;
        this.f20060w = c4652y40.e();
        this.f20061x = aVar;
        this.f20062y = hn;
        c4652y40.n(this);
    }

    private final synchronized void v7(D2.c2 c2Var) {
        this.f20060w.O(c2Var);
        this.f20060w.U(this.f20059v.f1219E);
    }

    private final synchronized boolean w7(D2.X1 x12) {
        try {
            if (x7()) {
                Z2.r.e("loadAd must be called on the main UI thread.");
            }
            C2.v.t();
            if (!G2.D0.i(this.f20055o) || x12.f1178J != null) {
                AbstractC2917i70.a(this.f20055o, x12.f1191w);
                return this.f20056s.a(x12, this.f20057t, null, new WW(this));
            }
            H2.p.d("Failed to load the ad because app ID is missing.");
            C4042sX c4042sX = this.f20058u;
            if (c4042sX != null) {
                c4042sX.r0(AbstractC3351m70.d(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean x7() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.Uf r0 = com.google.android.gms.internal.ads.AbstractC3077jg.f23300f
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.bb
            com.google.android.gms.internal.ads.if r3 = D2.A.c()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = r1
            goto L25
        L24:
            r0 = r2
        L25:
            H2.a r3 = r6.f20061x
            int r3 = r3.f2916t
            com.google.android.gms.internal.ads.bf r4 = com.google.android.gms.internal.ads.AbstractC3184kf.cb
            com.google.android.gms.internal.ads.if r5 = D2.A.c()
            java.lang.Object r4 = r5.a(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L3f
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XW.x7():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // D2.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void B() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.Uf r0 = com.google.android.gms.internal.ads.AbstractC3077jg.f23299e     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.Ya     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.if r1 = D2.A.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            H2.a r0 = r3.f20061x     // Catch: java.lang.Throwable -> L38
            int r0 = r0.f2916t     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.AbstractC3184kf.db     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.if r2 = D2.A.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4a
        L3a:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            Z2.r.e(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.vy r0 = r3.f20063z     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L48
            r0.a()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L48:
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XW.B():void");
    }

    @Override // D2.V
    public final void B6(InterfaceC4376vc interfaceC4376vc) {
    }

    @Override // D2.V
    public final synchronized boolean F0() {
        AbstractC4420vy abstractC4420vy = this.f20063z;
        if (abstractC4420vy != null) {
            if (abstractC4420vy.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // D2.V
    public final synchronized boolean G6() {
        return this.f20056s.zza();
    }

    @Override // D2.V
    public final void H2(D2.E e8) {
        if (x7()) {
            Z2.r.e("setAdListener must be called on the main UI thread.");
        }
        this.f20056s.m(e8);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // D2.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void I() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.Uf r0 = com.google.android.gms.internal.ads.AbstractC3077jg.f23301g     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.Za     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.if r1 = D2.A.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            H2.a r0 = r3.f20061x     // Catch: java.lang.Throwable -> L38
            int r0 = r0.f2916t     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.AbstractC3184kf.db     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.if r2 = D2.A.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "pause must be called on the main UI thread."
            Z2.r.e(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.vy r0 = r3.f20063z     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.JC r0 = r0.d()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.p1(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XW.I():void");
    }

    @Override // D2.V
    public final void I5(boolean z7) {
    }

    @Override // D2.V
    public final void J5(D2.H h8) {
        if (x7()) {
            Z2.r.e("setAdListener must be called on the main UI thread.");
        }
        this.f20058u.i(h8);
    }

    @Override // D2.V
    public final void M2(String str) {
    }

    @Override // D2.V
    public final void S1(InterfaceC0485a0 interfaceC0485a0) {
        Z2.r.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // D2.V
    public final synchronized boolean T3(D2.X1 x12) {
        v7(this.f20059v);
        return w7(x12);
    }

    @Override // D2.V
    public final void V0(String str) {
    }

    @Override // D2.V
    public final void Y() {
    }

    @Override // D2.V
    public final synchronized void a1(C0521m0 c0521m0) {
        Z2.r.e("setCorrelationIdProvider must be called on the main UI thread");
        this.f20060w.v(c0521m0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // D2.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c0() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.Uf r0 = com.google.android.gms.internal.ads.AbstractC3077jg.f23302h     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.Xa     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.if r1 = D2.A.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            H2.a r0 = r3.f20061x     // Catch: java.lang.Throwable -> L38
            int r0 = r0.f2916t     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.AbstractC3184kf.db     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.if r2 = D2.A.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "resume must be called on the main UI thread."
            Z2.r.e(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.vy r0 = r3.f20063z     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.JC r0 = r0.d()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.q1(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XW.c0():void");
    }

    @Override // D2.V
    public final Bundle d() {
        Z2.r.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // D2.V
    public final boolean e0() {
        return false;
    }

    @Override // D2.V
    public final synchronized void e3(InterfaceC1303Ff interfaceC1303Ff) {
        Z2.r.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f20056s.o(interfaceC1303Ff);
    }

    @Override // D2.V
    public final D2.H f() {
        return this.f20058u.e();
    }

    @Override // D2.V
    public final synchronized void f0() {
        Z2.r.e("recordManualImpression must be called on the main UI thread.");
        AbstractC4420vy abstractC4420vy = this.f20063z;
        if (abstractC4420vy != null) {
            abstractC4420vy.o();
        }
    }

    @Override // D2.V
    public final synchronized void f7(boolean z7) {
        try {
            if (x7()) {
                Z2.r.e("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f20060w.b(z7);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // D2.V
    public final synchronized D2.c2 g() {
        Z2.r.e("getAdSize must be called on the main UI thread.");
        AbstractC4420vy abstractC4420vy = this.f20063z;
        if (abstractC4420vy != null) {
            return R60.a(this.f20055o, Collections.singletonList(abstractC4420vy.m()));
        }
        return this.f20060w.D();
    }

    @Override // D2.V
    public final InterfaceC0509i0 h() {
        return this.f20058u.g();
    }

    @Override // D2.V
    public final void h6(InterfaceC0509i0 interfaceC0509i0) {
        if (x7()) {
            Z2.r.e("setAppEventListener must be called on the main UI thread.");
        }
        this.f20058u.C(interfaceC0509i0);
    }

    @Override // D2.V
    public final synchronized D2.U0 i() {
        AbstractC4420vy abstractC4420vy;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23653C6)).booleanValue() && (abstractC4420vy = this.f20063z) != null) {
            return abstractC4420vy.c();
        }
        return null;
    }

    @Override // D2.V
    public final void i3(D2.N0 n02) {
        if (x7()) {
            Z2.r.e("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!n02.c()) {
                this.f20062y.e();
            }
        } catch (RemoteException e8) {
            H2.p.c("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.f20058u.w(n02);
    }

    @Override // D2.V
    public final synchronized D2.Y0 j() {
        Z2.r.e("getVideoController must be called from the main thread.");
        AbstractC4420vy abstractC4420vy = this.f20063z;
        if (abstractC4420vy == null) {
            return null;
        }
        return abstractC4420vy.l();
    }

    @Override // D2.V
    public final void k2(InterfaceC1352Gn interfaceC1352Gn, String str) {
    }

    @Override // D2.V
    public final InterfaceC5852a l() {
        if (x7()) {
            Z2.r.e("getAdFrame must be called on the main UI thread.");
        }
        return BinderC5853b.p2(this.f20056s.b());
    }

    @Override // D2.V
    public final void l2(InterfaceC1704Qo interfaceC1704Qo) {
    }

    @Override // D2.V
    public final synchronized void m5(D2.c2 c2Var) {
        Z2.r.e("setAdSize must be called on the main UI thread.");
        this.f20060w.O(c2Var);
        this.f20059v = c2Var;
        AbstractC4420vy abstractC4420vy = this.f20063z;
        if (abstractC4420vy != null) {
            abstractC4420vy.p(this.f20056s.b(), c2Var);
        }
    }

    @Override // D2.V
    public final synchronized String r() {
        return this.f20057t;
    }

    @Override // D2.V
    public final synchronized void r6(D2.Q1 q12) {
        try {
            if (x7()) {
                Z2.r.e("setVideoOptions must be called on the main UI thread.");
            }
            this.f20060w.i(q12);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // D2.V
    public final synchronized String s() {
        AbstractC4420vy abstractC4420vy = this.f20063z;
        if (abstractC4420vy == null || abstractC4420vy.c() == null) {
            return null;
        }
        return abstractC4420vy.c().g();
    }

    @Override // D2.V
    public final synchronized String t() {
        AbstractC4420vy abstractC4420vy = this.f20063z;
        if (abstractC4420vy == null || abstractC4420vy.c() == null) {
            return null;
        }
        return abstractC4420vy.c().g();
    }

    @Override // D2.V
    public final void y3(InterfaceC1244Dn interfaceC1244Dn) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4669yD
    public final synchronized void zza() {
        try {
            if (!this.f20056s.r()) {
                this.f20056s.k();
                return;
            }
            D2.c2 D7 = this.f20060w.D();
            AbstractC4420vy abstractC4420vy = this.f20063z;
            if (abstractC4420vy != null && abstractC4420vy.n() != null && this.f20060w.t()) {
                D7 = R60.a(this.f20055o, Collections.singletonList(this.f20063z.n()));
            }
            v7(D7);
            this.f20060w.T(true);
            try {
                w7(this.f20060w.B());
            } catch (RemoteException unused) {
                H2.p.g("Failed to refresh the banner ad.");
            }
            this.f20060w.T(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4669yD
    public final synchronized void zzb() {
        if (this.f20056s.r()) {
            this.f20056s.p();
        } else {
            this.f20056s.l();
        }
    }

    @Override // D2.V
    public final void Q5(C0492c1 c0492c1) {
    }

    @Override // D2.V
    public final void S5(InterfaceC5852a interfaceC5852a) {
    }

    @Override // D2.V
    public final void v4(InterfaceC0530p0 interfaceC0530p0) {
    }

    @Override // D2.V
    public final void y4(D2.i2 i2Var) {
    }

    @Override // D2.V
    public final void R4(D2.X1 x12, D2.K k8) {
    }
}
