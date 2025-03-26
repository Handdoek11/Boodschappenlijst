package com.adadapted.android.sdk.core.view;

import com.adadapted.android.sdk.core.ad.Ad;

/* loaded from: classes.dex */
public interface AdZonePresenterListener {
    void onAdAvailable(Ad ad);

    void onAdVisibilityChanged(Ad ad);

    void onAdsRefreshed(Zone zone);

    void onNoAdAvailable();

    void onZoneAvailable(Zone zone);
}
