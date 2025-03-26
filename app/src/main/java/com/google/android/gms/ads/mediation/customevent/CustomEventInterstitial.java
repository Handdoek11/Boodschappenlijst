package com.google.android.gms.ads.mediation.customevent;

import J2.e;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventInterstitial extends K2.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, K2.c cVar, String str, e eVar, Bundle bundle);

    void showInterstitial();
}
