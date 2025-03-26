package com.google.android.gms.ads.mediation;

import J2.f;
import J2.n;
import J2.p;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeAdapter extends f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, n nVar, Bundle bundle, p pVar, Bundle bundle2);
}
