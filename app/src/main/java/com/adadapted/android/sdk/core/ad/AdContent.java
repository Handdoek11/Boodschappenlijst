package com.adadapted.android.sdk.core.ad;

import J6.AbstractC0650j;
import J6.r;
import com.adadapted.android.sdk.constants.EventStrings;
import com.adadapted.android.sdk.core.atl.AddToListContent;
import com.adadapted.android.sdk.core.atl.AddToListItem;
import com.adadapted.android.sdk.core.event.EventClient;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class AdContent implements AddToListContent {
    private static final String AD_ID = "ad_id";
    private static final String ITEM = "item";
    private static final String ITEM_NAME = "item_name";
    private static final String UNKNOWN_REASON = "Unknown Reason";
    private final Ad ad;
    private final EventClient eventClient;
    private boolean isHandled;
    private final List<AddToListItem> items;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final AdContent createAddToListContent(Ad ad) {
            r.e(ad, "ad");
            return new AdContent(ad, ad.getPayload().getDetailedListItems(), null, 4, null);
        }

        private Companion() {
        }
    }

    private AdContent(Ad ad, List<AddToListItem> list, EventClient eventClient) {
        this.ad = ad;
        this.items = list;
        this.eventClient = eventClient;
        if (ad.getPayload().getDetailedListItems().isEmpty()) {
            EventClient.trackSdkError$default(eventClient, EventStrings.AD_PAYLOAD_IS_EMPTY, "Ad " + ad.getId() + " has empty payload", null, 4, null);
        }
        this.isHandled = false;
    }

    private final synchronized void trackItem(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(AD_ID, this.ad.getId());
        hashMap.put(ITEM_NAME, str);
        this.eventClient.trackSdkEvent(EventStrings.ATL_ITEM_ADDED_TO_LIST, hashMap);
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public void acknowledge() {
        if (this.isHandled) {
            return;
        }
        this.isHandled = true;
        this.eventClient.trackInteraction(this.ad);
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public synchronized void failed(String str) {
        try {
            r.e(str, "message");
            if (this.isHandled) {
                return;
            }
            this.isHandled = true;
            HashMap hashMap = new HashMap();
            hashMap.put(AD_ID, this.ad.getId());
            EventClient eventClient = this.eventClient;
            if (str.length() == 0) {
                str = UNKNOWN_REASON;
            }
            eventClient.trackSdkError(EventStrings.ATL_ADDED_TO_LIST_FAILED, str, hashMap);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public List<AddToListItem> getItems() {
        return this.items;
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public String getSource() {
        return AddToListContent.Sources.IN_APP;
    }

    public final String getZoneId() {
        return this.ad.getZoneId();
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public boolean hasNoItems() {
        return this.items.isEmpty();
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public synchronized void itemAcknowledge(AddToListItem addToListItem) {
        try {
            r.e(addToListItem, ITEM);
            if (!this.isHandled) {
                this.isHandled = true;
                this.eventClient.trackInteraction(this.ad);
            }
            trackItem(addToListItem.getTitle());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public void itemFailed(AddToListItem addToListItem, String str) {
        r.e(addToListItem, ITEM);
        r.e(str, "message");
        this.isHandled = true;
        HashMap hashMap = new HashMap();
        hashMap.put(AD_ID, this.ad.getId());
        hashMap.put(ITEM, addToListItem.getTitle());
        EventClient eventClient = this.eventClient;
        if (str.length() == 0) {
            str = UNKNOWN_REASON;
        }
        eventClient.trackSdkError(EventStrings.ATL_ADDED_TO_LIST_ITEM_FAILED, str, hashMap);
    }

    /* synthetic */ AdContent(Ad ad, List list, EventClient eventClient, int i8, AbstractC0650j abstractC0650j) {
        this(ad, list, (i8 & 4) != 0 ? EventClient.INSTANCE : eventClient);
    }
}
