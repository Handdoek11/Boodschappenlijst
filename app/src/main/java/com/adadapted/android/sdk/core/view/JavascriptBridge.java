package com.adadapted.android.sdk.core.view;

import J6.r;
import android.webkit.JavascriptInterface;
import com.adadapted.android.sdk.constants.EventStrings;
import com.adadapted.android.sdk.core.ad.Ad;
import com.adadapted.android.sdk.core.ad.AdContent;
import com.adadapted.android.sdk.core.atl.AddItContentPublisher;
import com.adadapted.android.sdk.core.atl.AddToListItem;
import com.adadapted.android.sdk.core.atl.PopupContent;
import com.adadapted.android.sdk.core.event.EventClient;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class JavascriptBridge {
    public static final int $stable = 8;
    private final Ad ad;

    public JavascriptBridge(Ad ad) {
        r.e(ad, "ad");
        this.ad = ad;
    }

    @JavascriptInterface
    public final void addItemToList(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        r.e(str, "payloadId");
        r.e(str2, "trackingId");
        r.e(str3, "title");
        r.e(str4, "brand");
        r.e(str5, "category");
        r.e(str6, "barCode");
        r.e(str7, "retailerSku");
        r.e(str8, "discount");
        r.e(str9, "productImage");
        HashMap hashMap = new HashMap();
        hashMap.put("tracking_id", str2);
        EventClient.INSTANCE.trackSdkEvent(EventStrings.POPUP_ATL_CLICKED, hashMap);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AddToListItem(str2, str3, str4, str5, str6, str7, str8, str9));
        AddItContentPublisher.INSTANCE.publishPopupContent(PopupContent.Companion.createPopupContent(str, arrayList));
    }

    @JavascriptInterface
    public final void deliverAdContent() {
        HashMap hashMap = new HashMap();
        hashMap.put("ad_id", this.ad.getId());
        EventClient.INSTANCE.trackSdkEvent(EventStrings.POPUP_CONTENT_CLICKED, hashMap);
        AddItContentPublisher.INSTANCE.publishAdContent(AdContent.Companion.createAddToListContent(this.ad));
    }
}
