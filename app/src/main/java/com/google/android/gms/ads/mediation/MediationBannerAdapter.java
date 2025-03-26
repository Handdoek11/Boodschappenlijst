package com.google.android.gms.ads.mediation;

import J2.e;
import J2.f;
import J2.i;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import w2.C6882h;

@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerAdapter extends f {
    View getBannerView();

    @Override // J2.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // J2.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // J2.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(Context context, i iVar, Bundle bundle, C6882h c6882h, e eVar, Bundle bundle2);
}
