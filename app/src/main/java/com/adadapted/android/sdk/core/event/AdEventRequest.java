package com.adadapted.android.sdk.core.event;

import J6.AbstractC0650j;
import J6.r;
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
public final class AdEventRequest {
    private final String appId;
    private final List<AdEvent> events;
    private final String sdkVersion;
    private final String sessionId;
    private final String udid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final b[] $childSerializers = {null, null, null, null, new C6125f(AdEvent$$serializer.INSTANCE)};

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b serializer() {
            return AdEventRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AdEventRequest() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, 31, (AbstractC0650j) null);
    }

    public static /* synthetic */ AdEventRequest copy$default(AdEventRequest adEventRequest, String str, String str2, String str3, String str4, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = adEventRequest.sessionId;
        }
        if ((i8 & 2) != 0) {
            str2 = adEventRequest.appId;
        }
        String str5 = str2;
        if ((i8 & 4) != 0) {
            str3 = adEventRequest.udid;
        }
        String str6 = str3;
        if ((i8 & 8) != 0) {
            str4 = adEventRequest.sdkVersion;
        }
        String str7 = str4;
        if ((i8 & 16) != 0) {
            list = adEventRequest.events;
        }
        return adEventRequest.copy(str, str5, str6, str7, list);
    }

    public static /* synthetic */ void getAppId$annotations() {
    }

    public static /* synthetic */ void getSdkVersion$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }

    public static final /* synthetic */ void write$Self$advertising_sdk_release(AdEventRequest adEventRequest, d dVar, f fVar) {
        b[] bVarArr = $childSerializers;
        if (dVar.e(fVar, 0) || !r.a(adEventRequest.sessionId, "")) {
            dVar.g(fVar, 0, adEventRequest.sessionId);
        }
        if (dVar.e(fVar, 1) || !r.a(adEventRequest.appId, "")) {
            dVar.g(fVar, 1, adEventRequest.appId);
        }
        if (dVar.e(fVar, 2) || !r.a(adEventRequest.udid, "")) {
            dVar.g(fVar, 2, adEventRequest.udid);
        }
        if (dVar.e(fVar, 3) || !r.a(adEventRequest.sdkVersion, "")) {
            dVar.g(fVar, 3, adEventRequest.sdkVersion);
        }
        if (!dVar.e(fVar, 4) && r.a(adEventRequest.events, AbstractC6987o.e())) {
            return;
        }
        dVar.p(fVar, 4, bVarArr[4], adEventRequest.events);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.appId;
    }

    public final String component3() {
        return this.udid;
    }

    public final String component4() {
        return this.sdkVersion;
    }

    public final List<AdEvent> component5() {
        return this.events;
    }

    public final AdEventRequest copy(String str, String str2, String str3, String str4, List<AdEvent> list) {
        r.e(str, "sessionId");
        r.e(str2, "appId");
        r.e(str3, "udid");
        r.e(str4, "sdkVersion");
        r.e(list, "events");
        return new AdEventRequest(str, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdEventRequest)) {
            return false;
        }
        AdEventRequest adEventRequest = (AdEventRequest) obj;
        return r.a(this.sessionId, adEventRequest.sessionId) && r.a(this.appId, adEventRequest.appId) && r.a(this.udid, adEventRequest.udid) && r.a(this.sdkVersion, adEventRequest.sdkVersion) && r.a(this.events, adEventRequest.events);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final List<AdEvent> getEvents() {
        return this.events;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getUdid() {
        return this.udid;
    }

    public int hashCode() {
        return (((((((this.sessionId.hashCode() * 31) + this.appId.hashCode()) * 31) + this.udid.hashCode()) * 31) + this.sdkVersion.hashCode()) * 31) + this.events.hashCode();
    }

    public String toString() {
        return "AdEventRequest(sessionId=" + this.sessionId + ", appId=" + this.appId + ", udid=" + this.udid + ", sdkVersion=" + this.sdkVersion + ", events=" + this.events + ")";
    }

    public /* synthetic */ AdEventRequest(int i8, String str, String str2, String str3, String str4, List list, C0 c02) {
        if ((i8 & 1) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str;
        }
        if ((i8 & 2) == 0) {
            this.appId = "";
        } else {
            this.appId = str2;
        }
        if ((i8 & 4) == 0) {
            this.udid = "";
        } else {
            this.udid = str3;
        }
        if ((i8 & 8) == 0) {
            this.sdkVersion = "";
        } else {
            this.sdkVersion = str4;
        }
        if ((i8 & 16) == 0) {
            this.events = AbstractC6987o.e();
        } else {
            this.events = list;
        }
    }

    public AdEventRequest(String str, String str2, String str3, String str4, List<AdEvent> list) {
        r.e(str, "sessionId");
        r.e(str2, "appId");
        r.e(str3, "udid");
        r.e(str4, "sdkVersion");
        r.e(list, "events");
        this.sessionId = str;
        this.appId = str2;
        this.udid = str3;
        this.sdkVersion = str4;
        this.events = list;
    }

    public /* synthetic */ AdEventRequest(String str, String str2, String str3, String str4, List list, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) == 0 ? str4 : "", (i8 & 16) != 0 ? AbstractC6987o.e() : list);
    }
}
