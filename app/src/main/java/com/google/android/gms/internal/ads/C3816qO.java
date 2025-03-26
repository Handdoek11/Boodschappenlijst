package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3816qO {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3954rj f25910a;

    C3816qO(InterfaceC3954rj interfaceC3954rj) {
        this.f25910a = interfaceC3954rj;
    }

    private final void s(C3598oO c3598oO) {
        String a8 = C3598oO.a(c3598oO);
        H2.p.f("Dispatching AFMA event on publisher webview: ".concat(a8));
        this.f25910a.v(a8);
    }

    public final void a() {
        s(new C3598oO("initialize", null));
    }

    public final void b(long j8) {
        C3598oO c3598oO = new C3598oO("interstitial", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "onAdClicked";
        this.f25910a.v(C3598oO.a(c3598oO));
    }

    public final void c(long j8) {
        C3598oO c3598oO = new C3598oO("interstitial", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "onAdClosed";
        s(c3598oO);
    }

    public final void d(long j8, int i8) {
        C3598oO c3598oO = new C3598oO("interstitial", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "onAdFailedToLoad";
        c3598oO.f25172d = Integer.valueOf(i8);
        s(c3598oO);
    }

    public final void e(long j8) {
        C3598oO c3598oO = new C3598oO("interstitial", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "onAdLoaded";
        s(c3598oO);
    }

    public final void f(long j8) {
        C3598oO c3598oO = new C3598oO("interstitial", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "onNativeAdObjectNotAvailable";
        s(c3598oO);
    }

    public final void g(long j8) {
        C3598oO c3598oO = new C3598oO("interstitial", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "onAdOpened";
        s(c3598oO);
    }

    public final void h(long j8) {
        C3598oO c3598oO = new C3598oO("creation", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "nativeObjectCreated";
        s(c3598oO);
    }

    public final void i(long j8) {
        C3598oO c3598oO = new C3598oO("creation", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "nativeObjectNotCreated";
        s(c3598oO);
    }

    public final void j(long j8) {
        C3598oO c3598oO = new C3598oO("rewarded", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "onAdClicked";
        s(c3598oO);
    }

    public final void k(long j8) {
        C3598oO c3598oO = new C3598oO("rewarded", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "onRewardedAdClosed";
        s(c3598oO);
    }

    public final void l(long j8, InterfaceC2118ap interfaceC2118ap) {
        C3598oO c3598oO = new C3598oO("rewarded", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "onUserEarnedReward";
        c3598oO.f25173e = interfaceC2118ap.c();
        c3598oO.f25174f = Integer.valueOf(interfaceC2118ap.b());
        s(c3598oO);
    }

    public final void m(long j8, int i8) {
        C3598oO c3598oO = new C3598oO("rewarded", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "onRewardedAdFailedToLoad";
        c3598oO.f25172d = Integer.valueOf(i8);
        s(c3598oO);
    }

    public final void n(long j8, int i8) {
        C3598oO c3598oO = new C3598oO("rewarded", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "onRewardedAdFailedToShow";
        c3598oO.f25172d = Integer.valueOf(i8);
        s(c3598oO);
    }

    public final void o(long j8) {
        C3598oO c3598oO = new C3598oO("rewarded", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "onAdImpression";
        s(c3598oO);
    }

    public final void p(long j8) {
        C3598oO c3598oO = new C3598oO("rewarded", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "onRewardedAdLoaded";
        s(c3598oO);
    }

    public final void q(long j8) {
        C3598oO c3598oO = new C3598oO("rewarded", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "onNativeAdObjectNotAvailable";
        s(c3598oO);
    }

    public final void r(long j8) {
        C3598oO c3598oO = new C3598oO("rewarded", null);
        c3598oO.f25169a = Long.valueOf(j8);
        c3598oO.f25171c = "onRewardedAdOpened";
        s(c3598oO);
    }
}
