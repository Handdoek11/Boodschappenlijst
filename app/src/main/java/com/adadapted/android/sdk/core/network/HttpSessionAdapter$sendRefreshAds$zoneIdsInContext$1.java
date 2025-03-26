package com.adadapted.android.sdk.core.network;

import I6.l;
import J6.r;
import J6.s;
import com.adadapted.android.sdk.core.view.ZoneContext;

/* loaded from: classes.dex */
final class HttpSessionAdapter$sendRefreshAds$zoneIdsInContext$1 extends s implements l {
    public static final HttpSessionAdapter$sendRefreshAds$zoneIdsInContext$1 INSTANCE = new HttpSessionAdapter$sendRefreshAds$zoneIdsInContext$1();

    HttpSessionAdapter$sendRefreshAds$zoneIdsInContext$1() {
        super(1);
    }

    @Override // I6.l
    public final CharSequence invoke(ZoneContext zoneContext) {
        r.e(zoneContext, "it");
        return zoneContext.getZoneId();
    }
}
