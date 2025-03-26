package com.adadapted.android.sdk.core.interfaces;

import com.adadapted.android.sdk.core.session.Session;

/* loaded from: classes.dex */
public interface AdGetListener {
    void onNewAdsLoadFailed();

    void onNewAdsLoaded(Session session);
}
