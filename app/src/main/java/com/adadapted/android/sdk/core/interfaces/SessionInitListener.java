package com.adadapted.android.sdk.core.interfaces;

import com.adadapted.android.sdk.core.session.Session;

/* loaded from: classes.dex */
public interface SessionInitListener {
    void onSessionInitializeFailed();

    void onSessionInitialized(Session session);
}
