package com.adadapted.android.sdk.core.payload;

import J6.AbstractC0650j;
import J6.r;
import g7.g;
import i7.f;
import j7.d;
import k7.AbstractC6149r0;
import k7.C0;
import l7.b;
import l7.c;

@g
/* loaded from: classes.dex */
public final class PayloadEventRequest {
    private final String appId;
    private final String bundleId;
    private final String bundleVersion;
    private final String device;
    private final String os;
    private final String osv;
    private final String sdkVersion;
    private final b tracking;
    private final String udid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final g7.b serializer() {
            return PayloadEventRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PayloadEventRequest(int i8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, b bVar, C0 c02) {
        if (511 != (i8 & 511)) {
            AbstractC6149r0.a(i8, 511, PayloadEventRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.appId = str;
        this.udid = str2;
        this.bundleId = str3;
        this.bundleVersion = str4;
        this.device = str5;
        this.os = str6;
        this.osv = str7;
        this.sdkVersion = str8;
        this.tracking = bVar;
    }

    public static /* synthetic */ void getAppId$annotations() {
    }

    public static /* synthetic */ void getBundleId$annotations() {
    }

    public static /* synthetic */ void getBundleVersion$annotations() {
    }

    public static /* synthetic */ void getSdkVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$advertising_sdk_release(PayloadEventRequest payloadEventRequest, d dVar, f fVar) {
        dVar.g(fVar, 0, payloadEventRequest.appId);
        dVar.g(fVar, 1, payloadEventRequest.udid);
        dVar.g(fVar, 2, payloadEventRequest.bundleId);
        dVar.g(fVar, 3, payloadEventRequest.bundleVersion);
        dVar.g(fVar, 4, payloadEventRequest.device);
        dVar.g(fVar, 5, payloadEventRequest.os);
        dVar.g(fVar, 6, payloadEventRequest.osv);
        dVar.g(fVar, 7, payloadEventRequest.sdkVersion);
        dVar.p(fVar, 8, c.f38825a, payloadEventRequest.tracking);
    }

    public final String component1() {
        return this.appId;
    }

    public final String component2() {
        return this.udid;
    }

    public final String component3() {
        return this.bundleId;
    }

    public final String component4() {
        return this.bundleVersion;
    }

    public final String component5() {
        return this.device;
    }

    public final String component6() {
        return this.os;
    }

    public final String component7() {
        return this.osv;
    }

    public final String component8() {
        return this.sdkVersion;
    }

    public final b component9() {
        return this.tracking;
    }

    public final PayloadEventRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, b bVar) {
        r.e(str, "appId");
        r.e(str2, "udid");
        r.e(str3, "bundleId");
        r.e(str4, "bundleVersion");
        r.e(str5, "device");
        r.e(str6, "os");
        r.e(str7, "osv");
        r.e(str8, "sdkVersion");
        r.e(bVar, "tracking");
        return new PayloadEventRequest(str, str2, str3, str4, str5, str6, str7, str8, bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayloadEventRequest)) {
            return false;
        }
        PayloadEventRequest payloadEventRequest = (PayloadEventRequest) obj;
        return r.a(this.appId, payloadEventRequest.appId) && r.a(this.udid, payloadEventRequest.udid) && r.a(this.bundleId, payloadEventRequest.bundleId) && r.a(this.bundleVersion, payloadEventRequest.bundleVersion) && r.a(this.device, payloadEventRequest.device) && r.a(this.os, payloadEventRequest.os) && r.a(this.osv, payloadEventRequest.osv) && r.a(this.sdkVersion, payloadEventRequest.sdkVersion) && r.a(this.tracking, payloadEventRequest.tracking);
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

    public final String getDevice() {
        return this.device;
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

    public final b getTracking() {
        return this.tracking;
    }

    public final String getUdid() {
        return this.udid;
    }

    public int hashCode() {
        return (((((((((((((((this.appId.hashCode() * 31) + this.udid.hashCode()) * 31) + this.bundleId.hashCode()) * 31) + this.bundleVersion.hashCode()) * 31) + this.device.hashCode()) * 31) + this.os.hashCode()) * 31) + this.osv.hashCode()) * 31) + this.sdkVersion.hashCode()) * 31) + this.tracking.hashCode();
    }

    public String toString() {
        return "PayloadEventRequest(appId=" + this.appId + ", udid=" + this.udid + ", bundleId=" + this.bundleId + ", bundleVersion=" + this.bundleVersion + ", device=" + this.device + ", os=" + this.os + ", osv=" + this.osv + ", sdkVersion=" + this.sdkVersion + ", tracking=" + this.tracking + ")";
    }

    public PayloadEventRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, b bVar) {
        r.e(str, "appId");
        r.e(str2, "udid");
        r.e(str3, "bundleId");
        r.e(str4, "bundleVersion");
        r.e(str5, "device");
        r.e(str6, "os");
        r.e(str7, "osv");
        r.e(str8, "sdkVersion");
        r.e(bVar, "tracking");
        this.appId = str;
        this.udid = str2;
        this.bundleId = str3;
        this.bundleVersion = str4;
        this.device = str5;
        this.os = str6;
        this.osv = str7;
        this.sdkVersion = str8;
        this.tracking = bVar;
    }
}
