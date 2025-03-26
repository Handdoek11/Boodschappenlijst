package com.adadapted.android.sdk.core.atl;

import J6.AbstractC0650j;
import J6.r;
import com.adadapted.android.sdk.constants.EventStrings;
import com.adadapted.android.sdk.core.atl.AddToListContent;
import com.adadapted.android.sdk.core.event.EventClient;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class PopupContent implements AddToListContent {
    private static final String ITEM_NAME = "item_name";
    private static final String PAYLOAD_ID = "payload_id";
    private static final String TRACKING_ID = "tracking_id";
    private boolean handled;
    private final List<AddToListItem> items;
    private final String payloadId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final PopupContent createPopupContent(String str, List<AddToListItem> list) {
            r.e(str, "payloadId");
            r.e(list, "items");
            return new PopupContent(str, list);
        }

        public final void markPopupContentAcknowledged(PopupContent popupContent) {
            r.e(popupContent, "content");
            HashMap hashMap = new HashMap();
            hashMap.put(PopupContent.PAYLOAD_ID, popupContent.getPayloadId());
            EventClient.INSTANCE.trackSdkEvent(EventStrings.POPUP_ADDED_TO_LIST, hashMap);
        }

        public final void markPopupContentFailed(PopupContent popupContent, String str) {
            r.e(popupContent, "content");
            r.e(str, "message");
            HashMap hashMap = new HashMap();
            hashMap.put(PopupContent.PAYLOAD_ID, popupContent.getPayloadId());
            EventClient.INSTANCE.trackSdkError(EventStrings.POPUP_CONTENT_FAILED, str, hashMap);
        }

        public final void markPopupContentItemAcknowledged(PopupContent popupContent, AddToListItem addToListItem) {
            r.e(popupContent, "content");
            r.e(addToListItem, "item");
            HashMap hashMap = new HashMap();
            hashMap.put(PopupContent.PAYLOAD_ID, popupContent.getPayloadId());
            hashMap.put(PopupContent.TRACKING_ID, addToListItem.getTrackingId());
            hashMap.put(PopupContent.ITEM_NAME, addToListItem.getTitle());
            EventClient.INSTANCE.trackSdkEvent(EventStrings.POPUP_ITEM_ADDED_TO_LIST, hashMap);
        }

        public final void markPopupContentItemFailed(PopupContent popupContent, AddToListItem addToListItem, String str) {
            r.e(popupContent, "content");
            r.e(addToListItem, "item");
            r.e(str, "message");
            HashMap hashMap = new HashMap();
            hashMap.put(PopupContent.PAYLOAD_ID, popupContent.getPayloadId());
            hashMap.put(PopupContent.TRACKING_ID, addToListItem.getTrackingId());
            EventClient.INSTANCE.trackSdkError(EventStrings.POPUP_CONTENT_ITEM_FAILED, str, hashMap);
        }

        private Companion() {
        }
    }

    public PopupContent(String str, List<AddToListItem> list) {
        r.e(str, "payloadId");
        r.e(list, "items");
        this.payloadId = str;
        this.items = list;
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public void acknowledge() {
        if (this.handled) {
            return;
        }
        this.handled = true;
        Companion.markPopupContentAcknowledged(this);
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public void failed(String str) {
        r.e(str, "message");
        if (this.handled) {
            return;
        }
        this.handled = true;
        Companion.markPopupContentFailed(this, str);
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public List<AddToListItem> getItems() {
        return this.items;
    }

    public final String getPayloadId() {
        return this.payloadId;
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public String getSource() {
        return AddToListContent.Sources.IN_APP;
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public boolean hasNoItems() {
        return this.items.isEmpty();
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public void itemAcknowledge(AddToListItem addToListItem) {
        r.e(addToListItem, "item");
        if (!this.handled) {
            this.handled = true;
            Companion.markPopupContentAcknowledged(this);
        }
        Companion.markPopupContentItemAcknowledged(this, addToListItem);
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public void itemFailed(AddToListItem addToListItem, String str) {
        r.e(addToListItem, "item");
        r.e(str, "message");
        Companion.markPopupContentItemFailed(this, addToListItem, str);
    }
}
