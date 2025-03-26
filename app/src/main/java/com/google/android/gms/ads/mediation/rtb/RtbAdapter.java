package com.google.android.gms.ads.mediation.rtb;

import J2.a;
import J2.d;
import J2.g;
import J2.h;
import J2.k;
import J2.m;
import J2.o;
import L2.b;
import w2.C6876b;

/* loaded from: classes.dex */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(L2.a aVar, b bVar);

    public void loadRtbAppOpenAd(g gVar, d dVar) {
        loadAppOpenAd(gVar, dVar);
    }

    public void loadRtbBannerAd(h hVar, d dVar) {
        loadBannerAd(hVar, dVar);
    }

    @Deprecated
    public void loadRtbInterscrollerAd(h hVar, d dVar) {
        dVar.a(new C6876b(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(k kVar, d dVar) {
        loadInterstitialAd(kVar, dVar);
    }

    @Deprecated
    public void loadRtbNativeAd(m mVar, d dVar) {
        loadNativeAd(mVar, dVar);
    }

    public void loadRtbNativeAdMapper(m mVar, d dVar) {
        loadNativeAdMapper(mVar, dVar);
    }

    public void loadRtbRewardedAd(o oVar, d dVar) {
        loadRewardedAd(oVar, dVar);
    }

    public void loadRtbRewardedInterstitialAd(o oVar, d dVar) {
        loadRewardedInterstitialAd(oVar, dVar);
    }
}
