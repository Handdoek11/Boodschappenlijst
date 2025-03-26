package com.adadapted.android.sdk.core.device;

import H.AbstractC0626b;
import J6.AbstractC0650j;
import J6.r;
import g7.b;
import g7.g;
import i7.f;
import j7.d;
import java.util.Map;
import k7.C0;
import k7.H0;
import k7.Y;
import s.AbstractC6719b;
import y6.AbstractC6971J;

@g
/* loaded from: classes.dex */
public final class DeviceInfo {
    private static final b[] $childSerializers;
    public static final String UNKNOWN_VALUE = "Unknown";
    private final String appId;
    private final String bundleId;
    private final String bundleVersion;
    private final String carrier;
    private final long createdAt;
    private final String customIdentifier;
    private final String density;
    private final String deviceName;
    private final String deviceUdid;
    private final int dh;
    private final int dw;
    private final boolean isAllowRetargetingEnabled;
    private final boolean isProd;
    private final String locale;
    private final String os;
    private final String osv;
    private final Map<String, String> params;
    private final float scale;
    private final String sdkVersion;
    private final String timezone;
    private final String udid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final DeviceInfo empty() {
            return new DeviceInfo((String) null, false, (String) null, 0.0f, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, false, (String) null, 0L, (Map) null, 2097151, (AbstractC0650j) null);
        }

        public final b serializer() {
            return DeviceInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        H0 h02 = H0.f38618a;
        $childSerializers = new b[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Y(h02, h02)};
    }

    public DeviceInfo() {
        this((String) null, false, (String) null, 0.0f, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, false, (String) null, 0L, (Map) null, 2097151, (AbstractC0650j) null);
    }

    public static /* synthetic */ void getAppId$annotations() {
    }

    public static /* synthetic */ void getBundleId$annotations() {
    }

    public static /* synthetic */ void getBundleVersion$annotations() {
    }

    public static /* synthetic */ void getCarrier$annotations() {
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getDensity$annotations() {
    }

    public static /* synthetic */ void getDeviceName$annotations() {
    }

    public static /* synthetic */ void getDeviceUdid$annotations() {
    }

    public static /* synthetic */ void getDh$annotations() {
    }

    public static /* synthetic */ void getDw$annotations() {
    }

    public static /* synthetic */ void getLocale$annotations() {
    }

    public static /* synthetic */ void getOs$annotations() {
    }

    public static /* synthetic */ void getOsv$annotations() {
    }

    public static /* synthetic */ void getSdkVersion$annotations() {
    }

    public static /* synthetic */ void getTimezone$annotations() {
    }

    public static /* synthetic */ void isAllowRetargetingEnabled$annotations() {
    }

    public static final /* synthetic */ void write$Self$advertising_sdk_release(DeviceInfo deviceInfo, d dVar, f fVar) {
        b[] bVarArr = $childSerializers;
        if (dVar.e(fVar, 0) || !r.a(deviceInfo.appId, UNKNOWN_VALUE)) {
            dVar.g(fVar, 0, deviceInfo.appId);
        }
        if (dVar.e(fVar, 1) || deviceInfo.isProd) {
            dVar.A(fVar, 1, deviceInfo.isProd);
        }
        if (dVar.e(fVar, 2) || !r.a(deviceInfo.customIdentifier, "")) {
            dVar.g(fVar, 2, deviceInfo.customIdentifier);
        }
        if (dVar.e(fVar, 3) || Float.compare(deviceInfo.scale, 0.0f) != 0) {
            dVar.w(fVar, 3, deviceInfo.scale);
        }
        if (dVar.e(fVar, 4) || !r.a(deviceInfo.bundleId, "")) {
            dVar.g(fVar, 4, deviceInfo.bundleId);
        }
        if (dVar.e(fVar, 5) || !r.a(deviceInfo.bundleVersion, "")) {
            dVar.g(fVar, 5, deviceInfo.bundleVersion);
        }
        if (dVar.e(fVar, 6) || !r.a(deviceInfo.udid, "")) {
            dVar.g(fVar, 6, deviceInfo.udid);
        }
        if (dVar.e(fVar, 7) || !r.a(deviceInfo.deviceName, "")) {
            dVar.g(fVar, 7, deviceInfo.deviceName);
        }
        if (dVar.e(fVar, 8) || !r.a(deviceInfo.deviceUdid, "")) {
            dVar.g(fVar, 8, deviceInfo.deviceUdid);
        }
        if (dVar.e(fVar, 9) || !r.a(deviceInfo.os, UNKNOWN_VALUE)) {
            dVar.g(fVar, 9, deviceInfo.os);
        }
        if (dVar.e(fVar, 10) || !r.a(deviceInfo.osv, "")) {
            dVar.g(fVar, 10, deviceInfo.osv);
        }
        if (dVar.e(fVar, 11) || !r.a(deviceInfo.locale, "")) {
            dVar.g(fVar, 11, deviceInfo.locale);
        }
        if (dVar.e(fVar, 12) || !r.a(deviceInfo.timezone, "")) {
            dVar.g(fVar, 12, deviceInfo.timezone);
        }
        if (dVar.e(fVar, 13) || !r.a(deviceInfo.carrier, "")) {
            dVar.g(fVar, 13, deviceInfo.carrier);
        }
        if (dVar.e(fVar, 14) || deviceInfo.dw != 0) {
            dVar.h(fVar, 14, deviceInfo.dw);
        }
        if (dVar.e(fVar, 15) || deviceInfo.dh != 0) {
            dVar.h(fVar, 15, deviceInfo.dh);
        }
        if (dVar.e(fVar, 16) || !r.a(deviceInfo.density, "")) {
            dVar.g(fVar, 16, deviceInfo.density);
        }
        if (dVar.e(fVar, 17) || deviceInfo.isAllowRetargetingEnabled) {
            dVar.A(fVar, 17, deviceInfo.isAllowRetargetingEnabled);
        }
        if (dVar.e(fVar, 18) || !r.a(deviceInfo.sdkVersion, "")) {
            dVar.g(fVar, 18, deviceInfo.sdkVersion);
        }
        if (dVar.e(fVar, 19) || deviceInfo.createdAt != 0) {
            dVar.u(fVar, 19, deviceInfo.createdAt);
        }
        if (!dVar.e(fVar, 20) && r.a(deviceInfo.params, AbstractC6971J.e())) {
            return;
        }
        dVar.p(fVar, 20, bVarArr[20], deviceInfo.params);
    }

    public final String component1() {
        return this.appId;
    }

    public final String component10() {
        return this.os;
    }

    public final String component11() {
        return this.osv;
    }

    public final String component12() {
        return this.locale;
    }

    public final String component13() {
        return this.timezone;
    }

    public final String component14() {
        return this.carrier;
    }

    public final int component15() {
        return this.dw;
    }

    public final int component16() {
        return this.dh;
    }

    public final String component17() {
        return this.density;
    }

    public final boolean component18() {
        return this.isAllowRetargetingEnabled;
    }

    public final String component19() {
        return this.sdkVersion;
    }

    public final boolean component2() {
        return this.isProd;
    }

    public final long component20() {
        return this.createdAt;
    }

    public final Map<String, String> component21() {
        return this.params;
    }

    public final String component3() {
        return this.customIdentifier;
    }

    public final float component4() {
        return this.scale;
    }

    public final String component5() {
        return this.bundleId;
    }

    public final String component6() {
        return this.bundleVersion;
    }

    public final String component7() {
        return this.udid;
    }

    public final String component8() {
        return this.deviceName;
    }

    public final String component9() {
        return this.deviceUdid;
    }

    public final DeviceInfo copy(String str, boolean z7, String str2, float f8, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i8, int i9, String str13, boolean z8, String str14, long j8, Map<String, String> map) {
        r.e(str, "appId");
        r.e(str2, "customIdentifier");
        r.e(str3, "bundleId");
        r.e(str4, "bundleVersion");
        r.e(str5, "udid");
        r.e(str6, "deviceName");
        r.e(str7, "deviceUdid");
        r.e(str8, "os");
        r.e(str9, "osv");
        r.e(str10, "locale");
        r.e(str11, "timezone");
        r.e(str12, "carrier");
        r.e(str13, "density");
        r.e(str14, "sdkVersion");
        r.e(map, "params");
        return new DeviceInfo(str, z7, str2, f8, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, i8, i9, str13, z8, str14, j8, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return r.a(this.appId, deviceInfo.appId) && this.isProd == deviceInfo.isProd && r.a(this.customIdentifier, deviceInfo.customIdentifier) && Float.compare(this.scale, deviceInfo.scale) == 0 && r.a(this.bundleId, deviceInfo.bundleId) && r.a(this.bundleVersion, deviceInfo.bundleVersion) && r.a(this.udid, deviceInfo.udid) && r.a(this.deviceName, deviceInfo.deviceName) && r.a(this.deviceUdid, deviceInfo.deviceUdid) && r.a(this.os, deviceInfo.os) && r.a(this.osv, deviceInfo.osv) && r.a(this.locale, deviceInfo.locale) && r.a(this.timezone, deviceInfo.timezone) && r.a(this.carrier, deviceInfo.carrier) && this.dw == deviceInfo.dw && this.dh == deviceInfo.dh && r.a(this.density, deviceInfo.density) && this.isAllowRetargetingEnabled == deviceInfo.isAllowRetargetingEnabled && r.a(this.sdkVersion, deviceInfo.sdkVersion) && this.createdAt == deviceInfo.createdAt && r.a(this.params, deviceInfo.params);
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

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getCustomIdentifier() {
        return this.customIdentifier;
    }

    public final String getDensity() {
        return this.density;
    }

    public final String getDeviceName() {
        return this.deviceName;
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

    public final String getLocale() {
        return this.locale;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsv() {
        return this.osv;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final float getScale() {
        return this.scale;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getUdid() {
        return this.udid;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.appId.hashCode() * 31) + AbstractC6719b.a(this.isProd)) * 31) + this.customIdentifier.hashCode()) * 31) + Float.floatToIntBits(this.scale)) * 31) + this.bundleId.hashCode()) * 31) + this.bundleVersion.hashCode()) * 31) + this.udid.hashCode()) * 31) + this.deviceName.hashCode()) * 31) + this.deviceUdid.hashCode()) * 31) + this.os.hashCode()) * 31) + this.osv.hashCode()) * 31) + this.locale.hashCode()) * 31) + this.timezone.hashCode()) * 31) + this.carrier.hashCode()) * 31) + this.dw) * 31) + this.dh) * 31) + this.density.hashCode()) * 31) + AbstractC6719b.a(this.isAllowRetargetingEnabled)) * 31) + this.sdkVersion.hashCode()) * 31) + AbstractC0626b.a(this.createdAt)) * 31) + this.params.hashCode();
    }

    public final boolean isAllowRetargetingEnabled() {
        return this.isAllowRetargetingEnabled;
    }

    public final boolean isProd() {
        return this.isProd;
    }

    public String toString() {
        return "DeviceInfo(appId=" + this.appId + ", isProd=" + this.isProd + ", customIdentifier=" + this.customIdentifier + ", scale=" + this.scale + ", bundleId=" + this.bundleId + ", bundleVersion=" + this.bundleVersion + ", udid=" + this.udid + ", deviceName=" + this.deviceName + ", deviceUdid=" + this.deviceUdid + ", os=" + this.os + ", osv=" + this.osv + ", locale=" + this.locale + ", timezone=" + this.timezone + ", carrier=" + this.carrier + ", dw=" + this.dw + ", dh=" + this.dh + ", density=" + this.density + ", isAllowRetargetingEnabled=" + this.isAllowRetargetingEnabled + ", sdkVersion=" + this.sdkVersion + ", createdAt=" + this.createdAt + ", params=" + this.params + ")";
    }

    public /* synthetic */ DeviceInfo(int i8, String str, boolean z7, String str2, float f8, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i9, int i10, String str13, boolean z8, String str14, long j8, Map map, C0 c02) {
        if ((i8 & 1) == 0) {
            this.appId = UNKNOWN_VALUE;
        } else {
            this.appId = str;
        }
        if ((i8 & 2) == 0) {
            this.isProd = false;
        } else {
            this.isProd = z7;
        }
        if ((i8 & 4) == 0) {
            this.customIdentifier = "";
        } else {
            this.customIdentifier = str2;
        }
        this.scale = (i8 & 8) == 0 ? 0.0f : f8;
        if ((i8 & 16) == 0) {
            this.bundleId = "";
        } else {
            this.bundleId = str3;
        }
        if ((i8 & 32) == 0) {
            this.bundleVersion = "";
        } else {
            this.bundleVersion = str4;
        }
        if ((i8 & 64) == 0) {
            this.udid = "";
        } else {
            this.udid = str5;
        }
        if ((i8 & 128) == 0) {
            this.deviceName = "";
        } else {
            this.deviceName = str6;
        }
        if ((i8 & 256) == 0) {
            this.deviceUdid = "";
        } else {
            this.deviceUdid = str7;
        }
        if ((i8 & 512) == 0) {
            this.os = UNKNOWN_VALUE;
        } else {
            this.os = str8;
        }
        if ((i8 & 1024) == 0) {
            this.osv = "";
        } else {
            this.osv = str9;
        }
        if ((i8 & 2048) == 0) {
            this.locale = "";
        } else {
            this.locale = str10;
        }
        if ((i8 & 4096) == 0) {
            this.timezone = "";
        } else {
            this.timezone = str11;
        }
        if ((i8 & 8192) == 0) {
            this.carrier = "";
        } else {
            this.carrier = str12;
        }
        if ((i8 & 16384) == 0) {
            this.dw = 0;
        } else {
            this.dw = i9;
        }
        if ((32768 & i8) == 0) {
            this.dh = 0;
        } else {
            this.dh = i10;
        }
        if ((65536 & i8) == 0) {
            this.density = "";
        } else {
            this.density = str13;
        }
        if ((131072 & i8) == 0) {
            this.isAllowRetargetingEnabled = false;
        } else {
            this.isAllowRetargetingEnabled = z8;
        }
        if ((262144 & i8) == 0) {
            this.sdkVersion = "";
        } else {
            this.sdkVersion = str14;
        }
        this.createdAt = (524288 & i8) == 0 ? 0L : j8;
        this.params = (i8 & 1048576) == 0 ? AbstractC6971J.e() : map;
    }

    public DeviceInfo(String str, boolean z7, String str2, float f8, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i8, int i9, String str13, boolean z8, String str14, long j8, Map<String, String> map) {
        r.e(str, "appId");
        r.e(str2, "customIdentifier");
        r.e(str3, "bundleId");
        r.e(str4, "bundleVersion");
        r.e(str5, "udid");
        r.e(str6, "deviceName");
        r.e(str7, "deviceUdid");
        r.e(str8, "os");
        r.e(str9, "osv");
        r.e(str10, "locale");
        r.e(str11, "timezone");
        r.e(str12, "carrier");
        r.e(str13, "density");
        r.e(str14, "sdkVersion");
        r.e(map, "params");
        this.appId = str;
        this.isProd = z7;
        this.customIdentifier = str2;
        this.scale = f8;
        this.bundleId = str3;
        this.bundleVersion = str4;
        this.udid = str5;
        this.deviceName = str6;
        this.deviceUdid = str7;
        this.os = str8;
        this.osv = str9;
        this.locale = str10;
        this.timezone = str11;
        this.carrier = str12;
        this.dw = i8;
        this.dh = i9;
        this.density = str13;
        this.isAllowRetargetingEnabled = z8;
        this.sdkVersion = str14;
        this.createdAt = j8;
        this.params = map;
    }

    public /* synthetic */ DeviceInfo(String str, boolean z7, String str2, float f8, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i8, int i9, String str13, boolean z8, String str14, long j8, Map map, int i10, AbstractC0650j abstractC0650j) {
        this((i10 & 1) != 0 ? UNKNOWN_VALUE : str, (i10 & 2) != 0 ? false : z7, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? 0.0f : f8, (i10 & 16) != 0 ? "" : str3, (i10 & 32) != 0 ? "" : str4, (i10 & 64) != 0 ? "" : str5, (i10 & 128) != 0 ? "" : str6, (i10 & 256) != 0 ? "" : str7, (i10 & 512) == 0 ? str8 : UNKNOWN_VALUE, (i10 & 1024) != 0 ? "" : str9, (i10 & 2048) != 0 ? "" : str10, (i10 & 4096) != 0 ? "" : str11, (i10 & 8192) != 0 ? "" : str12, (i10 & 16384) != 0 ? 0 : i8, (i10 & 32768) != 0 ? 0 : i9, (i10 & 65536) != 0 ? "" : str13, (i10 & 131072) != 0 ? false : z8, (i10 & 262144) != 0 ? "" : str14, (i10 & 524288) != 0 ? 0L : j8, (i10 & 1048576) != 0 ? AbstractC6971J.e() : map);
    }
}
