package com.adadapted.android.sdk.core.event;

import J6.AbstractC0650j;
import J6.r;
import com.adadapted.android.sdk.core.device.DeviceInfo;
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
public final class EventRequest {
    private final String appId;
    private final String bundleId;
    private final String bundleVersion;
    private final String carrier;
    private final String density;
    private final String device;
    private final String deviceUdid;
    private final int dh;
    private final int dw;
    private final List<SdkError> errors;
    private final List<SdkEvent> events;
    private final int isAllowRetargetingEnabled;
    private final String locale;
    private final String os;
    private final String osv;
    private final String sdkVersion;
    private final String sessionId;
    private final String timezone;
    private final String udid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final b[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C6125f(SdkEvent$$serializer.INSTANCE), new C6125f(SdkError$$serializer.INSTANCE)};

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b serializer() {
            return EventRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EventRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, 0, (List) null, (List) null, 524287, (AbstractC0650j) null);
    }

    public static /* synthetic */ void getAppId$annotations() {
    }

    public static /* synthetic */ void getBundleId$annotations() {
    }

    public static /* synthetic */ void getBundleVersion$annotations() {
    }

    public static /* synthetic */ void getDeviceUdid$annotations() {
    }

    public static /* synthetic */ void getSdkVersion$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }

    public static /* synthetic */ void isAllowRetargetingEnabled$annotations() {
    }

    public static final /* synthetic */ void write$Self$advertising_sdk_release(EventRequest eventRequest, d dVar, f fVar) {
        b[] bVarArr = $childSerializers;
        if (dVar.e(fVar, 0) || !r.a(eventRequest.sessionId, "")) {
            dVar.g(fVar, 0, eventRequest.sessionId);
        }
        if (dVar.e(fVar, 1) || !r.a(eventRequest.appId, "")) {
            dVar.g(fVar, 1, eventRequest.appId);
        }
        if (dVar.e(fVar, 2) || !r.a(eventRequest.bundleId, "")) {
            dVar.g(fVar, 2, eventRequest.bundleId);
        }
        if (dVar.e(fVar, 3) || !r.a(eventRequest.bundleVersion, "")) {
            dVar.g(fVar, 3, eventRequest.bundleVersion);
        }
        if (dVar.e(fVar, 4) || !r.a(eventRequest.udid, "")) {
            dVar.g(fVar, 4, eventRequest.udid);
        }
        if (dVar.e(fVar, 5) || !r.a(eventRequest.device, "")) {
            dVar.g(fVar, 5, eventRequest.device);
        }
        if (dVar.e(fVar, 6) || !r.a(eventRequest.deviceUdid, "")) {
            dVar.g(fVar, 6, eventRequest.deviceUdid);
        }
        if (dVar.e(fVar, 7) || !r.a(eventRequest.os, DeviceInfo.UNKNOWN_VALUE)) {
            dVar.g(fVar, 7, eventRequest.os);
        }
        if (dVar.e(fVar, 8) || !r.a(eventRequest.osv, "")) {
            dVar.g(fVar, 8, eventRequest.osv);
        }
        if (dVar.e(fVar, 9) || !r.a(eventRequest.locale, "")) {
            dVar.g(fVar, 9, eventRequest.locale);
        }
        if (dVar.e(fVar, 10) || !r.a(eventRequest.timezone, "")) {
            dVar.g(fVar, 10, eventRequest.timezone);
        }
        if (dVar.e(fVar, 11) || !r.a(eventRequest.carrier, "")) {
            dVar.g(fVar, 11, eventRequest.carrier);
        }
        if (dVar.e(fVar, 12) || eventRequest.dw != 0) {
            dVar.h(fVar, 12, eventRequest.dw);
        }
        if (dVar.e(fVar, 13) || eventRequest.dh != 0) {
            dVar.h(fVar, 13, eventRequest.dh);
        }
        if (dVar.e(fVar, 14) || !r.a(eventRequest.density, "")) {
            dVar.g(fVar, 14, eventRequest.density);
        }
        if (dVar.e(fVar, 15) || !r.a(eventRequest.sdkVersion, "")) {
            dVar.g(fVar, 15, eventRequest.sdkVersion);
        }
        if (dVar.e(fVar, 16) || eventRequest.isAllowRetargetingEnabled != 0) {
            dVar.h(fVar, 16, eventRequest.isAllowRetargetingEnabled);
        }
        if (dVar.e(fVar, 17) || !r.a(eventRequest.events, AbstractC6987o.e())) {
            dVar.p(fVar, 17, bVarArr[17], eventRequest.events);
        }
        if (!dVar.e(fVar, 18) && r.a(eventRequest.errors, AbstractC6987o.e())) {
            return;
        }
        dVar.p(fVar, 18, bVarArr[18], eventRequest.errors);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component10() {
        return this.locale;
    }

    public final String component11() {
        return this.timezone;
    }

    public final String component12() {
        return this.carrier;
    }

    public final int component13() {
        return this.dw;
    }

    public final int component14() {
        return this.dh;
    }

    public final String component15() {
        return this.density;
    }

    public final String component16() {
        return this.sdkVersion;
    }

    public final int component17() {
        return this.isAllowRetargetingEnabled;
    }

    public final List<SdkEvent> component18() {
        return this.events;
    }

    public final List<SdkError> component19() {
        return this.errors;
    }

    public final String component2() {
        return this.appId;
    }

    public final String component3() {
        return this.bundleId;
    }

    public final String component4() {
        return this.bundleVersion;
    }

    public final String component5() {
        return this.udid;
    }

    public final String component6() {
        return this.device;
    }

    public final String component7() {
        return this.deviceUdid;
    }

    public final String component8() {
        return this.os;
    }

    public final String component9() {
        return this.osv;
    }

    public final EventRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i8, int i9, String str13, String str14, int i10, List<SdkEvent> list, List<SdkError> list2) {
        r.e(str, "sessionId");
        r.e(str2, "appId");
        r.e(str3, "bundleId");
        r.e(str4, "bundleVersion");
        r.e(str5, "udid");
        r.e(str6, "device");
        r.e(str7, "deviceUdid");
        r.e(str8, "os");
        r.e(str9, "osv");
        r.e(str10, "locale");
        r.e(str11, "timezone");
        r.e(str12, "carrier");
        r.e(str13, "density");
        r.e(str14, "sdkVersion");
        r.e(list, "events");
        r.e(list2, "errors");
        return new EventRequest(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, i8, i9, str13, str14, i10, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventRequest)) {
            return false;
        }
        EventRequest eventRequest = (EventRequest) obj;
        return r.a(this.sessionId, eventRequest.sessionId) && r.a(this.appId, eventRequest.appId) && r.a(this.bundleId, eventRequest.bundleId) && r.a(this.bundleVersion, eventRequest.bundleVersion) && r.a(this.udid, eventRequest.udid) && r.a(this.device, eventRequest.device) && r.a(this.deviceUdid, eventRequest.deviceUdid) && r.a(this.os, eventRequest.os) && r.a(this.osv, eventRequest.osv) && r.a(this.locale, eventRequest.locale) && r.a(this.timezone, eventRequest.timezone) && r.a(this.carrier, eventRequest.carrier) && this.dw == eventRequest.dw && this.dh == eventRequest.dh && r.a(this.density, eventRequest.density) && r.a(this.sdkVersion, eventRequest.sdkVersion) && this.isAllowRetargetingEnabled == eventRequest.isAllowRetargetingEnabled && r.a(this.events, eventRequest.events) && r.a(this.errors, eventRequest.errors);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBundleId() {
        return this.bundleId;
    }

    public final String getBundleVersion() {
        return this.bundleVersion;
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final String getDensity() {
        return this.density;
    }

    public final String getDevice() {
        return this.device;
    }

    public final String getDeviceUdid() {
        return this.deviceUdid;
    }

    public final int getDh() {
        return this.dh;
    }

    public final int getDw() {
        return this.dw;
    }

    public final List<SdkError> getErrors() {
        return this.errors;
    }

    public final List<SdkEvent> getEvents() {
        return this.events;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsv() {
        return this.osv;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getUdid() {
        return this.udid;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.sessionId.hashCode() * 31) + this.appId.hashCode()) * 31) + this.bundleId.hashCode()) * 31) + this.bundleVersion.hashCode()) * 31) + this.udid.hashCode()) * 31) + this.device.hashCode()) * 31) + this.deviceUdid.hashCode()) * 31) + this.os.hashCode()) * 31) + this.osv.hashCode()) * 31) + this.locale.hashCode()) * 31) + this.timezone.hashCode()) * 31) + this.carrier.hashCode()) * 31) + this.dw) * 31) + this.dh) * 31) + this.density.hashCode()) * 31) + this.sdkVersion.hashCode()) * 31) + this.isAllowRetargetingEnabled) * 31) + this.events.hashCode()) * 31) + this.errors.hashCode();
    }

    public final int isAllowRetargetingEnabled() {
        return this.isAllowRetargetingEnabled;
    }

    public String toString() {
        return "EventRequest(sessionId=" + this.sessionId + ", appId=" + this.appId + ", bundleId=" + this.bundleId + ", bundleVersion=" + this.bundleVersion + ", udid=" + this.udid + ", device=" + this.device + ", deviceUdid=" + this.deviceUdid + ", os=" + this.os + ", osv=" + this.osv + ", locale=" + this.locale + ", timezone=" + this.timezone + ", carrier=" + this.carrier + ", dw=" + this.dw + ", dh=" + this.dh + ", density=" + this.density + ", sdkVersion=" + this.sdkVersion + ", isAllowRetargetingEnabled=" + this.isAllowRetargetingEnabled + ", events=" + this.events + ", errors=" + this.errors + ")";
    }

    public /* synthetic */ EventRequest(int i8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i9, int i10, String str13, String str14, int i11, List list, List list2, C0 c02) {
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
            this.bundleId = "";
        } else {
            this.bundleId = str3;
        }
        if ((i8 & 8) == 0) {
            this.bundleVersion = "";
        } else {
            this.bundleVersion = str4;
        }
        if ((i8 & 16) == 0) {
            this.udid = "";
        } else {
            this.udid = str5;
        }
        if ((i8 & 32) == 0) {
            this.device = "";
        } else {
            this.device = str6;
        }
        if ((i8 & 64) == 0) {
            this.deviceUdid = "";
        } else {
            this.deviceUdid = str7;
        }
        this.os = (i8 & 128) == 0 ? DeviceInfo.UNKNOWN_VALUE : str8;
        if ((i8 & 256) == 0) {
            this.osv = "";
        } else {
            this.osv = str9;
        }
        if ((i8 & 512) == 0) {
            this.locale = "";
        } else {
            this.locale = str10;
        }
        if ((i8 & 1024) == 0) {
            this.timezone = "";
        } else {
            this.timezone = str11;
        }
        if ((i8 & 2048) == 0) {
            this.carrier = "";
        } else {
            this.carrier = str12;
        }
        if ((i8 & 4096) == 0) {
            this.dw = 0;
        } else {
            this.dw = i9;
        }
        if ((i8 & 8192) == 0) {
            this.dh = 0;
        } else {
            this.dh = i10;
        }
        if ((i8 & 16384) == 0) {
            this.density = "";
        } else {
            this.density = str13;
        }
        if ((32768 & i8) == 0) {
            this.sdkVersion = "";
        } else {
            this.sdkVersion = str14;
        }
        if ((65536 & i8) == 0) {
            this.isAllowRetargetingEnabled = 0;
        } else {
            this.isAllowRetargetingEnabled = i11;
        }
        this.events = (131072 & i8) == 0 ? AbstractC6987o.e() : list;
        this.errors = (i8 & 262144) == 0 ? AbstractC6987o.e() : list2;
    }

    public EventRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i8, int i9, String str13, String str14, int i10, List<SdkEvent> list, List<SdkError> list2) {
        r.e(str, "sessionId");
        r.e(str2, "appId");
        r.e(str3, "bundleId");
        r.e(str4, "bundleVersion");
        r.e(str5, "udid");
        r.e(str6, "device");
        r.e(str7, "deviceUdid");
        r.e(str8, "os");
        r.e(str9, "osv");
        r.e(str10, "locale");
        r.e(str11, "timezone");
        r.e(str12, "carrier");
        r.e(str13, "density");
        r.e(str14, "sdkVersion");
        r.e(list, "events");
        r.e(list2, "errors");
        this.sessionId = str;
        this.appId = str2;
        this.bundleId = str3;
        this.bundleVersion = str4;
        this.udid = str5;
        this.device = str6;
        this.deviceUdid = str7;
        this.os = str8;
        this.osv = str9;
        this.locale = str10;
        this.timezone = str11;
        this.carrier = str12;
        this.dw = i8;
        this.dh = i9;
        this.density = str13;
        this.sdkVersion = str14;
        this.isAllowRetargetingEnabled = i10;
        this.events = list;
        this.errors = list2;
    }

    public /* synthetic */ EventRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i8, int i9, String str13, String str14, int i10, List list, List list2, int i11, AbstractC0650j abstractC0650j) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? "" : str6, (i11 & 64) != 0 ? "" : str7, (i11 & 128) != 0 ? DeviceInfo.UNKNOWN_VALUE : str8, (i11 & 256) != 0 ? "" : str9, (i11 & 512) != 0 ? "" : str10, (i11 & 1024) != 0 ? "" : str11, (i11 & 2048) != 0 ? "" : str12, (i11 & 4096) != 0 ? 0 : i8, (i11 & 8192) != 0 ? 0 : i9, (i11 & 16384) != 0 ? "" : str13, (i11 & 32768) != 0 ? "" : str14, (i11 & 65536) != 0 ? 0 : i10, (i11 & 131072) != 0 ? AbstractC6987o.e() : list, (i11 & 262144) != 0 ? AbstractC6987o.e() : list2);
    }
}
