package com.adadapted.android.sdk.core.payload;

import H.AbstractC0626b;
import J6.AbstractC0650j;
import J6.r;
import g7.b;
import g7.g;
import i7.f;
import j7.d;
import k7.AbstractC6149r0;
import k7.C0;

@g
/* loaded from: classes.dex */
public final class PayloadRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String appId;
    private final String bundleId;
    private final String bundleVersion;
    private final String device;
    private final String os;
    private final String osv;
    private final String sdkVersion;
    private final long timestamp;
    private final String udid;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b serializer() {
            return PayloadRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PayloadRequest(int i8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j8, C0 c02) {
        if (511 != (i8 & 511)) {
            AbstractC6149r0.a(i8, 511, PayloadRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.appId = str;
        this.udid = str2;
        this.bundleId = str3;
        this.bundleVersion = str4;
        this.device = str5;
        this.os = str6;
        this.osv = str7;
        this.sdkVersion = str8;
        this.timestamp = j8;
    }

    public static /* synthetic */ void getAppId$annotations() {
    }

    public static /* synthetic */ void getBundleId$annotations() {
    }

    public static /* synthetic */ void getBundleVersion$annotations() {
    }

    public static /* synthetic */ void getSdkVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$advertising_sdk_release(PayloadRequest payloadRequest, d dVar, f fVar) {
        dVar.g(fVar, 0, payloadRequest.appId);
        dVar.g(fVar, 1, payloadRequest.udid);
        dVar.g(fVar, 2, payloadRequest.bundleId);
        dVar.g(fVar, 3, payloadRequest.bundleVersion);
        dVar.g(fVar, 4, payloadRequest.device);
        dVar.g(fVar, 5, payloadRequest.os);
        dVar.g(fVar, 6, payloadRequest.osv);
        dVar.g(fVar, 7, payloadRequest.sdkVersion);
        dVar.u(fVar, 8, payloadRequest.timestamp);
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

    public final long component9() {
        return this.timestamp;
    }

    public final PayloadRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j8) {
        r.e(str, "appId");
        r.e(str2, "udid");
        r.e(str3, "bundleId");
        r.e(str4, "bundleVersion");
        r.e(str5, "device");
        r.e(str6, "os");
        r.e(str7, "osv");
        r.e(str8, "sdkVersion");
        return new PayloadRequest(str, str2, str3, str4, str5, str6, str7, str8, j8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayloadRequest)) {
            return false;
        }
        PayloadRequest payloadRequest = (PayloadRequest) obj;
        return r.a(this.appId, payloadRequest.appId) && r.a(this.udid, payloadRequest.udid) && r.a(this.bundleId, payloadRequest.bundleId) && r.a(this.bundleVersion, payloadRequest.bundleVersion) && r.a(this.device, payloadRequest.device) && r.a(this.os, payloadRequest.os) && r.a(this.osv, payloadRequest.osv) && r.a(this.sdkVersion, payloadRequest.sdkVersion) && this.timestamp == payloadRequest.timestamp;
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

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getUdid() {
        return this.udid;
    }

    public int hashCode() {
        return (((((((((((((((this.appId.hashCode() * 31) + this.udid.hashCode()) * 31) + this.bundleId.hashCode()) * 31) + this.bundleVersion.hashCode()) * 31) + this.device.hashCode()) * 31) + this.os.hashCode()) * 31) + this.osv.hashCode()) * 31) + this.sdkVersion.hashCode()) * 31) + AbstractC0626b.a(this.timestamp);
    }

    public String toString() {
        return "PayloadRequest(appId=" + this.appId + ", udid=" + this.udid + ", bundleId=" + this.bundleId + ", bundleVersion=" + this.bundleVersion + ", device=" + this.device + ", os=" + this.os + ", osv=" + this.osv + ", sdkVersion=" + this.sdkVersion + ", timestamp=" + this.timestamp + ")";
    }

    public PayloadRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j8) {
        r.e(str, "appId");
        r.e(str2, "udid");
        r.e(str3, "bundleId");
        r.e(str4, "bundleVersion");
        r.e(str5, "device");
        r.e(str6, "os");
        r.e(str7, "osv");
        r.e(str8, "sdkVersion");
        this.appId = str;
        this.udid = str2;
        this.bundleId = str3;
        this.bundleVersion = str4;
        this.device = str5;
        this.os = str6;
        this.osv = str7;
        this.sdkVersion = str8;
        this.timestamp = j8;
    }
}
