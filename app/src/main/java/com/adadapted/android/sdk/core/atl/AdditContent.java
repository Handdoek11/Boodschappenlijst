package com.adadapted.android.sdk.core.atl;

import J6.AbstractC0650j;
import J6.r;
import com.adadapted.android.sdk.constants.EventStrings;
import com.adadapted.android.sdk.core.event.EventClient;
import com.adadapted.android.sdk.core.payload.PayloadClient;
import java.util.List;

/* loaded from: classes.dex */
public final class AdditContent implements AddToListContent {
    public static final int $stable = 8;
    private final String additSource;
    private final EventClient eventClient;
    private boolean handled;
    private final String image;
    private final List<AddToListItem> items;
    private final String message;
    private final PayloadClient payloadClient;
    private final String payloadId;
    private final String source;
    private final int type;

    public static final class AdditSources {
        public static final int $stable = 0;
        public static final String DEEPLINK = "deeplink";
        public static final AdditSources INSTANCE = new AdditSources();
        public static final String PAYLOAD = "payload";

        private AdditSources() {
        }
    }

    public AdditContent(String str, String str2, String str3, int i8, String str4, String str5, List<AddToListItem> list, PayloadClient payloadClient, EventClient eventClient) {
        r.e(str, "payloadId");
        r.e(str2, "message");
        r.e(str3, "image");
        r.e(str4, "source");
        r.e(str5, "additSource");
        r.e(list, "items");
        r.e(payloadClient, "payloadClient");
        r.e(eventClient, "eventClient");
        this.payloadId = str;
        this.message = str2;
        this.image = str3;
        this.type = i8;
        this.source = str4;
        this.additSource = str5;
        this.items = list;
        this.payloadClient = payloadClient;
        this.eventClient = eventClient;
        if (list.isEmpty()) {
            EventClient.trackSdkError$default(eventClient, EventStrings.ADDIT_PAYLOAD_IS_EMPTY, "Payload %s has empty payload" + str, null, 4, null);
        }
        this.handled = false;
    }

    private final String component5() {
        return this.source;
    }

    private final List<AddToListItem> component7() {
        return this.items;
    }

    private final PayloadClient component8() {
        return this.payloadClient;
    }

    private final EventClient component9() {
        return this.eventClient;
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public synchronized void acknowledge() {
        if (this.handled) {
            return;
        }
        this.handled = true;
        this.payloadClient.markContentAcknowledged(this);
    }

    public final String component1() {
        return this.payloadId;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.image;
    }

    public final int component4() {
        return this.type;
    }

    public final String component6() {
        return this.additSource;
    }

    public final AdditContent copy(String str, String str2, String str3, int i8, String str4, String str5, List<AddToListItem> list, PayloadClient payloadClient, EventClient eventClient) {
        r.e(str, "payloadId");
        r.e(str2, "message");
        r.e(str3, "image");
        r.e(str4, "source");
        r.e(str5, "additSource");
        r.e(list, "items");
        r.e(payloadClient, "payloadClient");
        r.e(eventClient, "eventClient");
        return new AdditContent(str, str2, str3, i8, str4, str5, list, payloadClient, eventClient);
    }

    public final synchronized void duplicate() {
        if (this.handled) {
            return;
        }
        this.handled = true;
        this.payloadClient.markContentDuplicate(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditContent)) {
            return false;
        }
        AdditContent additContent = (AdditContent) obj;
        return r.a(this.payloadId, additContent.payloadId) && r.a(this.message, additContent.message) && r.a(this.image, additContent.image) && this.type == additContent.type && r.a(this.source, additContent.source) && r.a(this.additSource, additContent.additSource) && r.a(this.items, additContent.items) && r.a(this.payloadClient, additContent.payloadClient) && r.a(this.eventClient, additContent.eventClient);
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public synchronized void failed(String str) {
        r.e(str, "message");
        if (this.handled) {
            return;
        }
        this.handled = true;
        this.payloadClient.markContentFailed(this, str);
    }

    public final String getAdditSource() {
        return this.additSource;
    }

    public final String getImage() {
        return this.image;
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public List<AddToListItem> getItems() {
        return this.items;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPayloadId() {
        return this.payloadId;
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public String getSource() {
        return this.source;
    }

    public final int getType() {
        return this.type;
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public boolean hasNoItems() {
        return this.items.isEmpty();
    }

    public int hashCode() {
        return (((((((((((((((this.payloadId.hashCode() * 31) + this.message.hashCode()) * 31) + this.image.hashCode()) * 31) + this.type) * 31) + this.source.hashCode()) * 31) + this.additSource.hashCode()) * 31) + this.items.hashCode()) * 31) + this.payloadClient.hashCode()) * 31) + this.eventClient.hashCode();
    }

    public final boolean isPayloadSource() {
        return r.a(this.additSource, AdditSources.PAYLOAD);
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public synchronized void itemAcknowledge(AddToListItem addToListItem) {
        try {
            r.e(addToListItem, "item");
            if (!this.handled) {
                this.handled = true;
                this.payloadClient.markContentAcknowledged(this);
            }
            this.payloadClient.markContentItemAcknowledged(this, addToListItem);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.adadapted.android.sdk.core.atl.AddToListContent
    public synchronized void itemFailed(AddToListItem addToListItem, String str) {
        try {
            r.e(addToListItem, "item");
            r.e(str, "message");
            if (!this.handled) {
                this.handled = true;
                this.payloadClient.markContentFailed(this, str);
            }
            this.payloadClient.markContentItemFailed(this, addToListItem, str);
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        return "AdditContent(payloadId=" + this.payloadId + ", message=" + this.message + ", image=" + this.image + ", type=" + this.type + ", source=" + this.source + ", additSource=" + this.additSource + ", items=" + this.items + ", payloadClient=" + this.payloadClient + ", eventClient=" + this.eventClient + ")";
    }

    public /* synthetic */ AdditContent(String str, String str2, String str3, int i8, String str4, String str5, List list, PayloadClient payloadClient, EventClient eventClient, int i9, AbstractC0650j abstractC0650j) {
        this(str, str2, str3, i8, str4, str5, list, (i9 & 128) != 0 ? PayloadClient.INSTANCE : payloadClient, (i9 & 256) != 0 ? EventClient.INSTANCE : eventClient);
    }
}
