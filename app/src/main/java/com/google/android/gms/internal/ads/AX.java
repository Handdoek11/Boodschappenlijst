package com.google.android.gms.internal.ads;

import D2.C0492c1;
import D2.C0521m0;
import D2.InterfaceC0485a0;
import D2.InterfaceC0509i0;
import D2.InterfaceC0530p0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import i3.BinderC5853b;
import i3.InterfaceC5852a;

/* loaded from: classes.dex */
public final class AX extends D2.U {

    /* renamed from: A, reason: collision with root package name */
    private PG f13575A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f13576B = ((Boolean) D2.A.c().a(AbstractC3184kf.f23743O0)).booleanValue();

    /* renamed from: o, reason: collision with root package name */
    private final D2.c2 f13577o;

    /* renamed from: s, reason: collision with root package name */
    private final Context f13578s;

    /* renamed from: t, reason: collision with root package name */
    private final C3783q50 f13579t;

    /* renamed from: u, reason: collision with root package name */
    private final String f13580u;

    /* renamed from: v, reason: collision with root package name */
    private final H2.a f13581v;

    /* renamed from: w, reason: collision with root package name */
    private final C4042sX f13582w;

    /* renamed from: x, reason: collision with root package name */
    private final S50 f13583x;

    /* renamed from: y, reason: collision with root package name */
    private final N9 f13584y;

    /* renamed from: z, reason: collision with root package name */
    private final HN f13585z;

    public AX(Context context, D2.c2 c2Var, String str, C3783q50 c3783q50, C4042sX c4042sX, S50 s50, H2.a aVar, N9 n9, HN hn) {
        this.f13577o = c2Var;
        this.f13580u = str;
        this.f13578s = context;
        this.f13579t = c3783q50;
        this.f13582w = c4042sX;
        this.f13583x = s50;
        this.f13581v = aVar;
        this.f13584y = n9;
        this.f13585z = hn;
    }

    private final synchronized boolean v7() {
        PG pg = this.f13575A;
        if (pg != null) {
            if (!pg.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // D2.V
    public final synchronized void B() {
        Z2.r.e("destroy must be called on the main UI thread.");
        PG pg = this.f13575A;
        if (pg != null) {
            pg.d().m1(null);
        }
    }

    @Override // D2.V
    public final void B6(InterfaceC4376vc interfaceC4376vc) {
    }

    @Override // D2.V
    public final synchronized boolean F0() {
        return false;
    }

    @Override // D2.V
    public final synchronized boolean G6() {
        return this.f13579t.zza();
    }

    @Override // D2.V
    public final synchronized void I() {
        Z2.r.e("pause must be called on the main UI thread.");
        PG pg = this.f13575A;
        if (pg != null) {
            pg.d().p1(null);
        }
    }

    @Override // D2.V
    public final synchronized void I5(boolean z7) {
        Z2.r.e("setImmersiveMode must be called on the main UI thread.");
        this.f13576B = z7;
    }

    @Override // D2.V
    public final void J5(D2.H h8) {
        Z2.r.e("setAdListener must be called on the main UI thread.");
        this.f13582w.i(h8);
    }

    @Override // D2.V
    public final void M2(String str) {
    }

    @Override // D2.V
    public final void R4(D2.X1 x12, D2.K k8) {
        this.f13582w.t(k8);
        T3(x12);
    }

    @Override // D2.V
    public final void S1(InterfaceC0485a0 interfaceC0485a0) {
        Z2.r.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // D2.V
    public final synchronized void S5(InterfaceC5852a interfaceC5852a) {
        if (this.f13575A == null) {
            H2.p.g("Interstitial can not be shown before loaded.");
            this.f13582w.m(AbstractC3351m70.d(9, null, null));
            return;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23785T2)).booleanValue()) {
            this.f13584y.c().c(new Throwable().getStackTrace());
        }
        this.f13575A.j(this.f13576B, (Activity) BinderC5853b.J0(interfaceC5852a));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // D2.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean T3(D2.X1 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.B0()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L9
            goto L4c
        L9:
            com.google.android.gms.internal.ads.Uf r0 = com.google.android.gms.internal.ads.AbstractC3077jg.f23303i     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.bb     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.if r2 = D2.A.c()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2f
        L2b:
            r0 = r1
            goto L2f
        L2d:
            r6 = move-exception
            goto L95
        L2f:
            H2.a r2 = r5.f13581v     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.f2916t     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.bf r3 = com.google.android.gms.internal.ads.AbstractC3184kf.cb     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.if r4 = D2.A.c()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L2d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L2d
            if (r2 < r3) goto L47
            if (r0 != 0) goto L4c
        L47:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            Z2.r.e(r0)     // Catch: java.lang.Throwable -> L2d
        L4c:
            C2.v.t()     // Catch: java.lang.Throwable -> L2d
            android.content.Context r0 = r5.f13578s     // Catch: java.lang.Throwable -> L2d
            boolean r0 = G2.D0.i(r0)     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            if (r0 == 0) goto L6e
            D2.X r0 = r6.f1178J     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L6e
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            H2.p.d(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.sX r6 = r5.f13582w     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L93
            r0 = 4
            D2.W0 r0 = com.google.android.gms.internal.ads.AbstractC3351m70.d(r0, r2, r2)     // Catch: java.lang.Throwable -> L2d
            r6.r0(r0)     // Catch: java.lang.Throwable -> L2d
            goto L93
        L6e:
            boolean r0 = r5.v7()     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L93
            android.content.Context r0 = r5.f13578s     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r6.f1191w     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.AbstractC2917i70.a(r0, r1)     // Catch: java.lang.Throwable -> L2d
            r5.f13575A = r2     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.q50 r0 = r5.f13579t     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r5.f13580u     // Catch: java.lang.Throwable -> L2d
            D2.c2 r2 = r5.f13577o     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.j50 r3 = new com.google.android.gms.internal.ads.j50     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zX r2 = new com.google.android.gms.internal.ads.zX     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r0.a(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L93:
            monitor-exit(r5)
            return r1
        L95:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AX.T3(D2.X1):boolean");
    }

    @Override // D2.V
    public final void V0(String str) {
    }

    @Override // D2.V
    public final synchronized void Y() {
        Z2.r.e("showInterstitial must be called on the main UI thread.");
        if (this.f13575A == null) {
            H2.p.g("Interstitial can not be shown before loaded.");
            this.f13582w.m(AbstractC3351m70.d(9, null, null));
        } else {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23785T2)).booleanValue()) {
                this.f13584y.c().c(new Throwable().getStackTrace());
            }
            this.f13575A.j(this.f13576B, null);
        }
    }

    @Override // D2.V
    public final synchronized void c0() {
        Z2.r.e("resume must be called on the main UI thread.");
        PG pg = this.f13575A;
        if (pg != null) {
            pg.d().q1(null);
        }
    }

    @Override // D2.V
    public final Bundle d() {
        Z2.r.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // D2.V
    public final synchronized boolean e0() {
        Z2.r.e("isLoaded must be called on the main UI thread.");
        return v7();
    }

    @Override // D2.V
    public final synchronized void e3(InterfaceC1303Ff interfaceC1303Ff) {
        Z2.r.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f13579t.h(interfaceC1303Ff);
    }

    @Override // D2.V
    public final D2.H f() {
        return this.f13582w.e();
    }

    @Override // D2.V
    public final void f0() {
    }

    @Override // D2.V
    public final void f7(boolean z7) {
    }

    @Override // D2.V
    public final D2.c2 g() {
        return null;
    }

    @Override // D2.V
    public final InterfaceC0509i0 h() {
        return this.f13582w.g();
    }

    @Override // D2.V
    public final void h6(InterfaceC0509i0 interfaceC0509i0) {
        Z2.r.e("setAppEventListener must be called on the main UI thread.");
        this.f13582w.C(interfaceC0509i0);
    }

    @Override // D2.V
    public final synchronized D2.U0 i() {
        PG pg;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23653C6)).booleanValue() && (pg = this.f13575A) != null) {
            return pg.c();
        }
        return null;
    }

    @Override // D2.V
    public final void i3(D2.N0 n02) {
        Z2.r.e("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!n02.c()) {
                this.f13585z.e();
            }
        } catch (RemoteException e8) {
            H2.p.c("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.f13582w.w(n02);
    }

    @Override // D2.V
    public final D2.Y0 j() {
        return null;
    }

    @Override // D2.V
    public final void k2(InterfaceC1352Gn interfaceC1352Gn, String str) {
    }

    @Override // D2.V
    public final InterfaceC5852a l() {
        return null;
    }

    @Override // D2.V
    public final void l2(InterfaceC1704Qo interfaceC1704Qo) {
        this.f13583x.w(interfaceC1704Qo);
    }

    @Override // D2.V
    public final synchronized String r() {
        return this.f13580u;
    }

    @Override // D2.V
    public final synchronized String s() {
        PG pg = this.f13575A;
        if (pg == null || pg.c() == null) {
            return null;
        }
        return pg.c().g();
    }

    @Override // D2.V
    public final synchronized String t() {
        PG pg = this.f13575A;
        if (pg == null || pg.c() == null) {
            return null;
        }
        return pg.c().g();
    }

    @Override // D2.V
    public final void v4(InterfaceC0530p0 interfaceC0530p0) {
        this.f13582w.E(interfaceC0530p0);
    }

    @Override // D2.V
    public final void y3(InterfaceC1244Dn interfaceC1244Dn) {
    }

    @Override // D2.V
    public final void H2(D2.E e8) {
    }

    @Override // D2.V
    public final void Q5(C0492c1 c0492c1) {
    }

    @Override // D2.V
    public final void a1(C0521m0 c0521m0) {
    }

    @Override // D2.V
    public final void m5(D2.c2 c2Var) {
    }

    @Override // D2.V
    public final void r6(D2.Q1 q12) {
    }

    @Override // D2.V
    public final void y4(D2.i2 i2Var) {
    }
}
