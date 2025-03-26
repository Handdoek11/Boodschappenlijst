package com.google.android.gms.internal.ads;

import D2.C0492c1;
import D2.C0521m0;
import D2.InterfaceC0485a0;
import D2.InterfaceC0509i0;
import D2.InterfaceC0530p0;
import android.content.Context;
import android.os.Bundle;
import i3.InterfaceC5852a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.r40, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC3889r40 extends D2.U implements F2.z, InterfaceC3178kc {

    /* renamed from: A, reason: collision with root package name */
    private C2136ay f26070A;

    /* renamed from: B, reason: collision with root package name */
    protected C3767py f26071B;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC4630xu f26072o;

    /* renamed from: s, reason: collision with root package name */
    private final Context f26073s;

    /* renamed from: u, reason: collision with root package name */
    private final String f26075u;

    /* renamed from: v, reason: collision with root package name */
    private final C3236l40 f26076v;

    /* renamed from: w, reason: collision with root package name */
    private final C3018j40 f26077w;

    /* renamed from: x, reason: collision with root package name */
    private final H2.a f26078x;

    /* renamed from: y, reason: collision with root package name */
    private final HN f26079y;

    /* renamed from: t, reason: collision with root package name */
    private AtomicBoolean f26074t = new AtomicBoolean();

    /* renamed from: z, reason: collision with root package name */
    private long f26080z = -1;

    public BinderC3889r40(AbstractC4630xu abstractC4630xu, Context context, String str, C3236l40 c3236l40, C3018j40 c3018j40, H2.a aVar, HN hn) {
        this.f26072o = abstractC4630xu;
        this.f26073s = context;
        this.f26075u = str;
        this.f26076v = c3236l40;
        this.f26077w = c3018j40;
        this.f26078x = aVar;
        this.f26079y = hn;
        c3018j40.n(this);
    }

    private final synchronized void v7(int i8) {
        try {
            if (this.f26074t.compareAndSet(false, true)) {
                this.f26077w.c();
                C2136ay c2136ay = this.f26070A;
                if (c2136ay != null) {
                    C2.v.e().e(c2136ay);
                }
                if (this.f26071B != null) {
                    long j8 = -1;
                    if (this.f26080z != -1) {
                        j8 = C2.v.c().b() - this.f26080z;
                    }
                    this.f26071B.l(j8, i8);
                }
                B();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // D2.V
    public final synchronized void B() {
        Z2.r.e("destroy must be called on the main UI thread.");
        C3767py c3767py = this.f26071B;
        if (c3767py != null) {
            c3767py.a();
        }
    }

    @Override // D2.V
    public final void B6(InterfaceC4376vc interfaceC4376vc) {
        this.f26077w.r(interfaceC4376vc);
    }

    @Override // F2.z
    public final void D0() {
    }

    @Override // D2.V
    public final synchronized boolean F0() {
        return false;
    }

    @Override // D2.V
    public final synchronized boolean G6() {
        return this.f26076v.zza();
    }

    @Override // D2.V
    public final synchronized void I() {
        Z2.r.e("pause must be called on the main UI thread.");
    }

    @Override // F2.z
    public final void I3() {
    }

    @Override // D2.V
    public final void I5(boolean z7) {
    }

    @Override // D2.V
    public final void M2(String str) {
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
            com.google.android.gms.internal.ads.Uf r0 = com.google.android.gms.internal.ads.AbstractC3077jg.f23298d     // Catch: java.lang.Throwable -> L2d
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
            goto L91
        L2f:
            H2.a r2 = r5.f26078x     // Catch: java.lang.Throwable -> L2d
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
            android.content.Context r0 = r5.f26073s     // Catch: java.lang.Throwable -> L2d
            boolean r0 = G2.D0.i(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L6e
            D2.X r0 = r6.f1178J     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L5c
            goto L6e
        L5c:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            H2.p.d(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.j40 r6 = r5.f26077w     // Catch: java.lang.Throwable -> L2d
            r0 = 4
            r2 = 0
            D2.W0 r0 = com.google.android.gms.internal.ads.AbstractC3351m70.d(r0, r2, r2)     // Catch: java.lang.Throwable -> L2d
            r6.r0(r0)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r1
        L6e:
            boolean r0 = r5.G6()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L76
            monitor-exit(r5)
            return r1
        L76:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            r5.f26074t = r0     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.p40 r0 = new com.google.android.gms.internal.ads.p40     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.l40 r1 = r5.f26076v     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r5.f26075u     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.q40 r3 = new com.google.android.gms.internal.ads.q40     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r1.a(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L91:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC3889r40.T3(D2.X1):boolean");
    }

    @Override // D2.V
    public final void V0(String str) {
    }

    @Override // F2.z
    public final void W4(int i8) {
        if (i8 == 0) {
            throw null;
        }
        int i9 = i8 - 1;
        if (i9 == 0) {
            v7(2);
            return;
        }
        if (i9 == 1) {
            v7(4);
        } else if (i9 != 2) {
            v7(6);
        } else {
            v7(3);
        }
    }

    @Override // D2.V
    public final synchronized void Y() {
    }

    @Override // D2.V
    public final synchronized void a1(C0521m0 c0521m0) {
    }

    @Override // D2.V
    public final synchronized void c0() {
        Z2.r.e("resume must be called on the main UI thread.");
    }

    @Override // D2.V
    public final Bundle d() {
        return new Bundle();
    }

    @Override // D2.V
    public final boolean e0() {
        return false;
    }

    @Override // D2.V
    public final synchronized void e3(InterfaceC1303Ff interfaceC1303Ff) {
    }

    @Override // D2.V
    public final D2.H f() {
        return null;
    }

    @Override // D2.V
    public final synchronized void f0() {
    }

    @Override // D2.V
    public final synchronized void f7(boolean z7) {
    }

    @Override // D2.V
    public final synchronized D2.c2 g() {
        return null;
    }

    @Override // D2.V
    public final InterfaceC0509i0 h() {
        return null;
    }

    @Override // D2.V
    public final synchronized D2.U0 i() {
        return null;
    }

    @Override // D2.V
    public final synchronized D2.Y0 j() {
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
    }

    @Override // D2.V
    public final synchronized void m5(D2.c2 c2Var) {
        Z2.r.e("setAdSize must be called on the main UI thread.");
    }

    final /* synthetic */ void o() {
        v7(5);
    }

    public final void p() {
        this.f26072o.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.n40
            @Override // java.lang.Runnable
            public final void run() {
                this.f24871o.o();
            }
        });
    }

    @Override // F2.z
    public final void q2() {
    }

    @Override // D2.V
    public final synchronized String r() {
        return this.f26075u;
    }

    @Override // F2.z
    public final synchronized void r3() {
        if (this.f26071B != null) {
            this.f26080z = C2.v.c().b();
            int i8 = this.f26071B.i();
            if (i8 > 0) {
                C2136ay c2136ay = new C2136ay(this.f26072o.e(), C2.v.c());
                this.f26070A = c2136ay;
                c2136ay.c(i8, new Runnable() { // from class: com.google.android.gms.internal.ads.o40
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25090o.p();
                    }
                });
            }
        }
    }

    @Override // D2.V
    public final synchronized void r6(D2.Q1 q12) {
    }

    @Override // D2.V
    public final synchronized String s() {
        return null;
    }

    @Override // D2.V
    public final synchronized String t() {
        return null;
    }

    @Override // F2.z
    public final synchronized void w0() {
        C3767py c3767py = this.f26071B;
        if (c3767py != null) {
            c3767py.l(C2.v.c().b() - this.f26080z, 1);
        }
    }

    @Override // D2.V
    public final void y3(InterfaceC1244Dn interfaceC1244Dn) {
    }

    @Override // D2.V
    public final void y4(D2.i2 i2Var) {
        this.f26076v.k(i2Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3178kc
    public final void zza() {
        v7(3);
    }

    @Override // D2.V
    public final void H2(D2.E e8) {
    }

    @Override // D2.V
    public final void J5(D2.H h8) {
    }

    @Override // D2.V
    public final void Q5(C0492c1 c0492c1) {
    }

    @Override // D2.V
    public final void S1(InterfaceC0485a0 interfaceC0485a0) {
    }

    @Override // D2.V
    public final void S5(InterfaceC5852a interfaceC5852a) {
    }

    @Override // D2.V
    public final void h6(InterfaceC0509i0 interfaceC0509i0) {
    }

    @Override // D2.V
    public final void i3(D2.N0 n02) {
    }

    @Override // D2.V
    public final void v4(InterfaceC0530p0 interfaceC0530p0) {
    }

    @Override // D2.V
    public final void R4(D2.X1 x12, D2.K k8) {
    }
}
