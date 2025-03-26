package com.google.android.gms.internal.ads;

import D2.InterfaceC0485a0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import i3.BinderC5853b;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.n60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC3458n60 extends AbstractBinderC1530Lo {

    /* renamed from: o, reason: collision with root package name */
    private final C2371d60 f24878o;

    /* renamed from: s, reason: collision with root package name */
    private final S50 f24879s;

    /* renamed from: t, reason: collision with root package name */
    private final D60 f24880t;

    /* renamed from: u, reason: collision with root package name */
    private IL f24881u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f24882v = false;

    public BinderC3458n60(C2371d60 c2371d60, S50 s50, D60 d60) {
        this.f24878o = c2371d60;
        this.f24879s = s50;
        this.f24880t = d60;
    }

    private final synchronized boolean w7() {
        IL il = this.f24881u;
        if (il != null) {
            if (!il.l()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final void B4(InterfaceC0485a0 interfaceC0485a0) {
        Z2.r.e("setAdMetadataListener can only be called from the UI thread.");
        if (interfaceC0485a0 == null) {
            this.f24879s.g(null);
        } else {
            this.f24879s.g(new C3349m60(this, interfaceC0485a0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final void G2(C1495Ko c1495Ko) {
        Z2.r.e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f24879s.C(c1495Ko);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final synchronized void N(boolean z7) {
        Z2.r.e("setImmersiveMode must be called on the main UI thread.");
        this.f24882v = z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) D2.A.c().a(com.google.android.gms.internal.ads.AbstractC3184kf.f24015t5)).booleanValue() == false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void U4(com.google.android.gms.internal.ads.C1739Ro r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            Z2.r.e(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.f18700s     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.AbstractC3184kf.f23997r5     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.if r2 = D2.A.c()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L64
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.Bq r2 = C2.v.s()     // Catch: java.lang.Throwable -> L20
            r2.x(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.w7()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.f24015t5     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.if r1 = D2.A.c()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.U50 r0 = new com.google.android.gms.internal.ads.U50     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.f24881u = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.d60 r1 = r4.f24878o     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.i(r2)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.d60 r1 = r4.f24878o     // Catch: java.lang.Throwable -> L20
            D2.X1 r2 = r5.f18699o     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.f18700s     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.l60 r3 = new com.google.android.gms.internal.ads.l60     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.a(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L64:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC3458n60.U4(com.google.android.gms.internal.ads.Ro):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final synchronized void X(InterfaceC5852a interfaceC5852a) {
        try {
            Z2.r.e("showAd must be called on the main UI thread.");
            if (this.f24881u != null) {
                Activity activity = null;
                if (interfaceC5852a != null) {
                    Object J02 = BinderC5853b.J0(interfaceC5852a);
                    if (J02 instanceof Activity) {
                        activity = (Activity) J02;
                    }
                }
                this.f24881u.o(this.f24882v, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final void Y6(InterfaceC1704Qo interfaceC1704Qo) {
        Z2.r.e("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f24879s.w(interfaceC1704Qo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final synchronized D2.U0 a() {
        IL il;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23653C6)).booleanValue() && (il = this.f24881u) != null) {
            return il.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final synchronized void a0(InterfaceC5852a interfaceC5852a) {
        Z2.r.e("resume must be called on the main UI thread.");
        if (this.f24881u != null) {
            this.f24881u.d().q1(interfaceC5852a == null ? null : (Context) BinderC5853b.J0(interfaceC5852a));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final void b() {
        u0(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final synchronized String d() {
        IL il = this.f24881u;
        if (il == null || il.c() == null) {
            return null;
        }
        return il.c().g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final void e() {
        j0(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final void h() {
        a0(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final synchronized void j0(InterfaceC5852a interfaceC5852a) {
        Z2.r.e("pause must be called on the main UI thread.");
        if (this.f24881u != null) {
            this.f24881u.d().p1(interfaceC5852a == null ? null : (Context) BinderC5853b.J0(interfaceC5852a));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final synchronized void q() {
        X(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final synchronized void r0(String str) {
        Z2.r.e("#008 Must be called on the main UI thread.: setCustomData");
        this.f24880t.f14415b = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final boolean s() {
        Z2.r.e("isLoaded must be called on the main UI thread.");
        return w7();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final synchronized void s0(String str) {
        Z2.r.e("setUserId must be called on the main UI thread.");
        this.f24880t.f14414a = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final boolean t() {
        IL il = this.f24881u;
        return il != null && il.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final synchronized void u0(InterfaceC5852a interfaceC5852a) {
        Z2.r.e("destroy must be called on the main UI thread.");
        Context context = null;
        this.f24879s.g(null);
        if (this.f24881u != null) {
            if (interfaceC5852a != null) {
                context = (Context) BinderC5853b.J0(interfaceC5852a);
            }
            this.f24881u.d().m1(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1564Mo
    public final Bundle zzb() {
        Z2.r.e("getAdMetadata can only be called from the UI thread.");
        IL il = this.f24881u;
        return il != null ? il.i() : new Bundle();
    }
}
