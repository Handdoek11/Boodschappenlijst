package com.adadapted.android.sdk.core.interfaces;

import A6.d;
import com.adadapted.android.sdk.core.device.DeviceInfo;
import com.adadapted.android.sdk.core.session.Session;
import com.adadapted.android.sdk.core.view.ZoneContext;
import java.util.Set;

/* loaded from: classes.dex */
public interface SessionAdapter {
    Object sendInit(DeviceInfo deviceInfo, SessionInitListener sessionInitListener, d dVar);

    Object sendRefreshAds(Session session, AdGetListener adGetListener, Set<ZoneContext> set, d dVar);
}
