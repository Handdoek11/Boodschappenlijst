package com.google.android.gms.ads.mediation.customevent;

import J2.p;
import K2.d;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventNative extends K2.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, p pVar, Bundle bundle);
}
