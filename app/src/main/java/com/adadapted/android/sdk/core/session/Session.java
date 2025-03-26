package com.adadapted.android.sdk.core.session;

import H.AbstractC0626b;
import J6.AbstractC0650j;
import J6.r;
import com.adadapted.android.sdk.constants.Config;
import com.adadapted.android.sdk.core.device.DeviceInfo;
import com.adadapted.android.sdk.core.device.DeviceInfo$$serializer;
import com.adadapted.android.sdk.core.view.Zone;
import com.adadapted.android.sdk.core.view.Zone$$serializer;
import g7.b;
import g7.g;
import i7.f;
import j7.d;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.C0;
import k7.H0;
import k7.Y;
import s.AbstractC6719b;
import y6.AbstractC6987o;

@g
/* loaded from: classes.dex */
public final class Session {
    private DeviceInfo deviceInfo;
    private final long expiration;
    private final boolean hasAds;
    private final String id;
    private final long refreshTime;
    private final boolean willServeAds;
    private Map<String, Zone> zones;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final b[] $childSerializers = {null, null, null, null, null, new Y(H0.f38618a, Zone$$serializer.INSTANCE), null};

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b serializer() {
            return Session$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Session() {
        this(null, false, false, 0L, 0L, null, 63, null);
    }

    private final boolean component2() {
        return this.willServeAds;
    }

    private final Map<String, Zone> component6() {
        return this.zones;
    }

    public static /* synthetic */ void getExpiration$annotations() {
    }

    public static /* synthetic */ void getHasAds$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getRefreshTime$annotations() {
    }

    private static /* synthetic */ void getWillServeAds$annotations() {
    }

    public static final /* synthetic */ void write$Self$advertising_sdk_release(Session session, d dVar, f fVar) {
        b[] bVarArr = $childSerializers;
        if (dVar.e(fVar, 0) || !r.a(session.id, "")) {
            dVar.g(fVar, 0, session.id);
        }
        if (dVar.e(fVar, 1) || session.willServeAds) {
            dVar.A(fVar, 1, session.willServeAds);
        }
        if (dVar.e(fVar, 2) || session.hasAds) {
            dVar.A(fVar, 2, session.hasAds);
        }
        if (dVar.e(fVar, 3) || session.refreshTime != Config.DEFAULT_AD_POLLING) {
            dVar.u(fVar, 3, session.refreshTime);
        }
        if (dVar.e(fVar, 4) || session.expiration != 0) {
            dVar.u(fVar, 4, session.expiration);
        }
        if (dVar.e(fVar, 5) || !r.a(session.zones, new HashMap())) {
            dVar.p(fVar, 5, bVarArr[5], session.zones);
        }
        if (!dVar.e(fVar, 6)) {
            String str = null;
            if (r.a(session.deviceInfo, new DeviceInfo((String) null, false, (String) null, 0.0f, (String) null, (String) null, (String) null, (String) null, (String) null, str, str, (String) null, (String) null, (String) null, 0, 0, (String) null, false, (String) null, 0L, (Map) null, 2097151, (AbstractC0650j) null))) {
                return;
            }
        }
        dVar.p(fVar, 6, DeviceInfo$$serializer.INSTANCE, session.deviceInfo);
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component3() {
        return this.hasAds;
    }

    public final long component4() {
        return this.refreshTime;
    }

    public final long component5() {
        return this.expiration;
    }

    public final Session copy(String str, boolean z7, boolean z8, long j8, long j9, Map<String, Zone> map) {
        r.e(str, "id");
        r.e(map, "zones");
        return new Session(str, z7, z8, j8, j9, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        return r.a(this.id, session.id) && this.willServeAds == session.willServeAds && this.hasAds == session.hasAds && this.refreshTime == session.refreshTime && this.expiration == session.expiration && r.a(this.zones, session.zones);
    }

    public final Map<String, Zone> getAllZones() {
        return this.zones;
    }

    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final long getExpiration() {
        return this.expiration;
    }

    public final boolean getHasAds() {
        return this.hasAds;
    }

    public final String getId() {
        return this.id;
    }

    public final long getRefreshTime() {
        return this.refreshTime;
    }

    public final Zone getZone(String str) {
        r.e(str, "zoneId");
        int i8 = 3;
        String str2 = null;
        byte b8 = 0;
        byte b9 = 0;
        byte b10 = 0;
        byte b11 = 0;
        byte b12 = 0;
        if (!this.zones.containsKey(str)) {
            return new Zone(b10 == true ? 1 : 0, b9 == true ? 1 : 0, i8, b8 == true ? 1 : 0);
        }
        Zone zone = this.zones.get(str);
        return zone == null ? new Zone(str2, b12 == true ? 1 : 0, i8, b11 == true ? 1 : 0) : zone;
    }

    public final List<String> getZonesWithAds() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Zone> entry : this.zones.entrySet()) {
            if (AbstractC6987o.t(entry.getValue().getAds())) {
                arrayList.add(entry.getValue().getId());
            }
        }
        return arrayList;
    }

    public final boolean hasActiveCampaigns() {
        return this.hasAds;
    }

    public final boolean hasExpired() {
        return new Date().getTime() / ((long) 1000) > this.expiration;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + AbstractC6719b.a(this.willServeAds)) * 31) + AbstractC6719b.a(this.hasAds)) * 31) + AbstractC0626b.a(this.refreshTime)) * 31) + AbstractC0626b.a(this.expiration)) * 31) + this.zones.hashCode();
    }

    public final void setDeviceInfo(DeviceInfo deviceInfo) {
        r.e(deviceInfo, "<set-?>");
        this.deviceInfo = deviceInfo;
    }

    public String toString() {
        return "Session(id=" + this.id + ", willServeAds=" + this.willServeAds + ", hasAds=" + this.hasAds + ", refreshTime=" + this.refreshTime + ", expiration=" + this.expiration + ", zones=" + this.zones + ")";
    }

    public final void updateZones(Map<String, Zone> map) {
        r.e(map, "newZones");
        this.zones = map;
    }

    public final boolean willNotServeAds() {
        return !this.willServeAds || this.refreshTime == 0;
    }

    public /* synthetic */ Session(int i8, String str, boolean z7, boolean z8, long j8, long j9, Map map, DeviceInfo deviceInfo, C0 c02) {
        this.id = (i8 & 1) == 0 ? "" : str;
        if ((i8 & 2) == 0) {
            this.willServeAds = false;
        } else {
            this.willServeAds = z7;
        }
        if ((i8 & 4) == 0) {
            this.hasAds = false;
        } else {
            this.hasAds = z8;
        }
        this.refreshTime = (i8 & 8) == 0 ? Config.DEFAULT_AD_POLLING : j8;
        this.expiration = (i8 & 16) == 0 ? 0L : j9;
        this.zones = (i8 & 32) == 0 ? new HashMap() : map;
        this.deviceInfo = (i8 & 64) == 0 ? new DeviceInfo((String) null, false, (String) null, 0.0f, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, false, (String) null, 0L, (Map) null, 2097151, (AbstractC0650j) null) : deviceInfo;
    }

    public Session(String str, boolean z7, boolean z8, long j8, long j9, Map<String, Zone> map) {
        r.e(str, "id");
        r.e(map, "zones");
        this.id = str;
        this.willServeAds = z7;
        this.hasAds = z8;
        this.refreshTime = j8;
        this.expiration = j9;
        this.zones = map;
        this.deviceInfo = new DeviceInfo((String) null, false, (String) null, 0.0f, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, false, (String) null, 0L, (Map) null, 2097151, (AbstractC0650j) null);
    }

    public /* synthetic */ Session(String str, boolean z7, boolean z8, long j8, long j9, Map map, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? false : z7, (i8 & 4) == 0 ? z8 : false, (i8 & 8) != 0 ? Config.DEFAULT_AD_POLLING : j8, (i8 & 16) != 0 ? 0L : j9, (i8 & 32) != 0 ? new HashMap() : map);
    }
}
