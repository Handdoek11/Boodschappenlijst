package com.adadapted.android.sdk.core.ad;

import J6.r;
import com.adadapted.android.sdk.core.atl.AddToListContent;

/* loaded from: classes.dex */
public interface AdContentListener {

    public static final class DefaultImpls {
        public static void onNonContentAction(AdContentListener adContentListener, String str, String str2) {
            r.e(str, "zoneId");
            r.e(str2, "adId");
        }
    }

    void onContentAvailable(String str, AddToListContent addToListContent);

    void onNonContentAction(String str, String str2);
}
