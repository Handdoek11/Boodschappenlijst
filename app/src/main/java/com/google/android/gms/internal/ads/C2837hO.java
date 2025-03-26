package com.google.android.gms.internal.ads;

import D2.InterfaceC0484a;
import G2.AbstractC0608p0;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import x2.InterfaceC6905d;

/* renamed from: com.google.android.gms.internal.ads.hO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2837hO implements InterfaceC6905d, JD, InterfaceC0484a, InterfaceC3033jC, EC, FC, ZC, InterfaceC3360mC, T80 {

    /* renamed from: o, reason: collision with root package name */
    private final List f22540o;

    /* renamed from: s, reason: collision with root package name */
    private final VN f22541s;

    /* renamed from: t, reason: collision with root package name */
    private long f22542t;

    public C2837hO(VN vn, AbstractC4630xu abstractC4630xu) {
        this.f22541s = vn;
        this.f22540o = Collections.singletonList(abstractC4630xu);
    }

    private final void x(Class cls, String str, Object... objArr) {
        this.f22541s.a(this.f22540o, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // D2.InterfaceC0484a
    public final void I0() {
        x(InterfaceC0484a.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void Q(C4618xo c4618xo) {
        this.f22542t = C2.v.c().b();
        x(JD.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void T0(C60 c60) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void a() {
        x(InterfaceC3033jC.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void b() {
        x(InterfaceC3033jC.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void c() {
        x(InterfaceC3033jC.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final void e(Context context) {
        x(FC.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.T80
    public final void g(M80 m80, String str, Throwable th) {
        x(L80.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final void i(Context context) {
        x(FC.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.T80
    public final void m(M80 m80, String str) {
        x(L80.class, "onTaskCreated", str);
    }

    @Override // x2.InterfaceC6905d
    public final void n(String str, String str2) {
        x(InterfaceC6905d.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void o(InterfaceC1460Jo interfaceC1460Jo, String str, String str2) {
        x(InterfaceC3033jC.class, "onRewarded", interfaceC1460Jo, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final void p(Context context) {
        x(FC.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void r() {
        x(EC.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360mC
    public final void r0(D2.W0 w02) {
        x(InterfaceC3360mC.class, "onAdFailedToLoad", Integer.valueOf(w02.f1162o), w02.f1163s, w02.f1164t);
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final void s() {
        AbstractC0608p0.k("Ad Request Latency : " + (C2.v.c().b() - this.f22542t));
        x(ZC.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.T80
    public final void t(M80 m80, String str) {
        x(L80.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.T80
    public final void w(M80 m80, String str) {
        x(L80.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void zza() {
        x(InterfaceC3033jC.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void zzb() {
        x(InterfaceC3033jC.class, "onAdLeftApplication", new Object[0]);
    }
}
