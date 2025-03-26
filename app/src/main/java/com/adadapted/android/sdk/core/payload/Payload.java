package com.adadapted.android.sdk.core.payload;

import J6.AbstractC0650j;
import J6.r;
import com.adadapted.android.sdk.core.atl.AddToListItem;
import com.adadapted.android.sdk.core.atl.AddToListItem$$serializer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import g7.b;
import g7.g;
import i7.f;
import j7.d;
import java.util.List;
import k7.C0;
import k7.C6125f;
import y6.AbstractC6987o;

@g
/* loaded from: classes.dex */
public final class Payload {
    private final String appId;
    private final String campaignId;
    private final List<AddToListItem> detailedListItems;
    private final int expireSeconds;
    private final String payloadId;
    private final String payloadImage;
    private final String payloadMessage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final b[] $childSerializers = {null, null, null, null, null, null, new C6125f(AddToListItem$$serializer.INSTANCE)};

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b serializer() {
            return Payload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Payload() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 0, (List) null, ModuleDescriptor.MODULE_VERSION, (AbstractC0650j) null);
    }

    public static /* synthetic */ Payload copy$default(Payload payload, String str, String str2, String str3, String str4, String str5, int i8, List list, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = payload.payloadId;
        }
        if ((i9 & 2) != 0) {
            str2 = payload.payloadMessage;
        }
        String str6 = str2;
        if ((i9 & 4) != 0) {
            str3 = payload.payloadImage;
        }
        String str7 = str3;
        if ((i9 & 8) != 0) {
            str4 = payload.campaignId;
        }
        String str8 = str4;
        if ((i9 & 16) != 0) {
            str5 = payload.appId;
        }
        String str9 = str5;
        if ((i9 & 32) != 0) {
            i8 = payload.expireSeconds;
        }
        int i10 = i8;
        if ((i9 & 64) != 0) {
            list = payload.detailedListItems;
        }
        return payload.copy(str, str6, str7, str8, str9, i10, list);
    }

    public static /* synthetic */ void getAppId$annotations() {
    }

    public static /* synthetic */ void getCampaignId$annotations() {
    }

    public static /* synthetic */ void getDetailedListItems$annotations() {
    }

    public static /* synthetic */ void getExpireSeconds$annotations() {
    }

    public static /* synthetic */ void getPayloadId$annotations() {
    }

    public static /* synthetic */ void getPayloadImage$annotations() {
    }

    public static /* synthetic */ void getPayloadMessage$annotations() {
    }

    public static final /* synthetic */ void write$Self$advertising_sdk_release(Payload payload, d dVar, f fVar) {
        b[] bVarArr = $childSerializers;
        if (dVar.e(fVar, 0) || !r.a(payload.payloadId, "")) {
            dVar.g(fVar, 0, payload.payloadId);
        }
        if (dVar.e(fVar, 1) || !r.a(payload.payloadMessage, "")) {
            dVar.g(fVar, 1, payload.payloadMessage);
        }
        if (dVar.e(fVar, 2) || !r.a(payload.payloadImage, "")) {
            dVar.g(fVar, 2, payload.payloadImage);
        }
        if (dVar.e(fVar, 3) || !r.a(payload.campaignId, "")) {
            dVar.g(fVar, 3, payload.campaignId);
        }
        if (dVar.e(fVar, 4) || !r.a(payload.appId, "")) {
            dVar.g(fVar, 4, payload.appId);
        }
        if (dVar.e(fVar, 5) || payload.expireSeconds != 0) {
            dVar.h(fVar, 5, payload.expireSeconds);
        }
        if (!dVar.e(fVar, 6) && r.a(payload.detailedListItems, AbstractC6987o.e())) {
            return;
        }
        dVar.p(fVar, 6, bVarArr[6], payload.detailedListItems);
    }

    public final String component1() {
        return this.payloadId;
    }

    public final String component2() {
        return this.payloadMessage;
    }

    public final String component3() {
        return this.payloadImage;
    }

    public final String component4() {
        return this.campaignId;
    }

    public final String component5() {
        return this.appId;
    }

    public final int component6() {
        return this.expireSeconds;
    }

    public final List<AddToListItem> component7() {
        return this.detailedListItems;
    }

    public final Payload copy(String str, String str2, String str3, String str4, String str5, int i8, List<AddToListItem> list) {
        r.e(str, "payloadId");
        r.e(str2, "payloadMessage");
        r.e(str3, "payloadImage");
        r.e(str4, "campaignId");
        r.e(str5, "appId");
        r.e(list, "detailedListItems");
        return new Payload(str, str2, str3, str4, str5, i8, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Payload)) {
            return false;
        }
        Payload payload = (Payload) obj;
        return r.a(this.payloadId, payload.payloadId) && r.a(this.payloadMessage, payload.payloadMessage) && r.a(this.payloadImage, payload.payloadImage) && r.a(this.campaignId, payload.campaignId) && r.a(this.appId, payload.appId) && this.expireSeconds == payload.expireSeconds && r.a(this.detailedListItems, payload.detailedListItems);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final List<AddToListItem> getDetailedListItems() {
        return this.detailedListItems;
    }

    public final int getExpireSeconds() {
        return this.expireSeconds;
    }

    public final String getPayloadId() {
        return this.payloadId;
    }

    public final String getPayloadImage() {
        return this.payloadImage;
    }

    public final String getPayloadMessage() {
        return this.payloadMessage;
    }

    public int hashCode() {
        return (((((((((((this.payloadId.hashCode() * 31) + this.payloadMessage.hashCode()) * 31) + this.payloadImage.hashCode()) * 31) + this.campaignId.hashCode()) * 31) + this.appId.hashCode()) * 31) + this.expireSeconds) * 31) + this.detailedListItems.hashCode();
    }

    public String toString() {
        return "Payload(payloadId=" + this.payloadId + ", payloadMessage=" + this.payloadMessage + ", payloadImage=" + this.payloadImage + ", campaignId=" + this.campaignId + ", appId=" + this.appId + ", expireSeconds=" + this.expireSeconds + ", detailedListItems=" + this.detailedListItems + ")";
    }

    public /* synthetic */ Payload(int i8, String str, String str2, String str3, String str4, String str5, int i9, List list, C0 c02) {
        if ((i8 & 1) == 0) {
            this.payloadId = "";
        } else {
            this.payloadId = str;
        }
        if ((i8 & 2) == 0) {
            this.payloadMessage = "";
        } else {
            this.payloadMessage = str2;
        }
        if ((i8 & 4) == 0) {
            this.payloadImage = "";
        } else {
            this.payloadImage = str3;
        }
        if ((i8 & 8) == 0) {
            this.campaignId = "";
        } else {
            this.campaignId = str4;
        }
        if ((i8 & 16) == 0) {
            this.appId = "";
        } else {
            this.appId = str5;
        }
        if ((i8 & 32) == 0) {
            this.expireSeconds = 0;
        } else {
            this.expireSeconds = i9;
        }
        if ((i8 & 64) == 0) {
            this.detailedListItems = AbstractC6987o.e();
        } else {
            this.detailedListItems = list;
        }
    }

    public Payload(String str, String str2, String str3, String str4, String str5, int i8, List<AddToListItem> list) {
        r.e(str, "payloadId");
        r.e(str2, "payloadMessage");
        r.e(str3, "payloadImage");
        r.e(str4, "campaignId");
        r.e(str5, "appId");
        r.e(list, "detailedListItems");
        this.payloadId = str;
        this.payloadMessage = str2;
        this.payloadImage = str3;
        this.campaignId = str4;
        this.appId = str5;
        this.expireSeconds = i8;
        this.detailedListItems = list;
    }

    public /* synthetic */ Payload(String str, String str2, String str3, String str4, String str5, int i8, List list, int i9, AbstractC0650j abstractC0650j) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2, (i9 & 4) != 0 ? "" : str3, (i9 & 8) != 0 ? "" : str4, (i9 & 16) == 0 ? str5 : "", (i9 & 32) != 0 ? 0 : i8, (i9 & 64) != 0 ? AbstractC6987o.e() : list);
    }
}
