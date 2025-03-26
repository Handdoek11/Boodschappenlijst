package com.adadapted.android.sdk.core.event;

import H.AbstractC0626b;
import J6.AbstractC0650j;
import J6.r;
import g7.b;
import g7.g;
import i7.f;
import j7.d;
import java.util.Date;
import k7.AbstractC6149r0;
import k7.C0;

@g
/* loaded from: classes.dex */
public final class AdEvent {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String adId;
    private final long createdAt;
    private final String eventType;
    private final String impressionId;
    private final String zoneId;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b serializer() {
            return AdEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdEvent(int i8, String str, String str2, String str3, String str4, long j8, C0 c02) {
        if (15 != (i8 & 15)) {
            AbstractC6149r0.a(i8, 15, AdEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.adId = str;
        this.zoneId = str2;
        this.impressionId = str3;
        this.eventType = str4;
        if ((i8 & 16) == 0) {
            this.createdAt = new Date().getTime() / 1000;
        } else {
            this.createdAt = j8;
        }
    }

    public static /* synthetic */ AdEvent copy$default(AdEvent adEvent, String str, String str2, String str3, String str4, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = adEvent.adId;
        }
        if ((i8 & 2) != 0) {
            str2 = adEvent.zoneId;
        }
        String str5 = str2;
        if ((i8 & 4) != 0) {
            str3 = adEvent.impressionId;
        }
        String str6 = str3;
        if ((i8 & 8) != 0) {
            str4 = adEvent.eventType;
        }
        String str7 = str4;
        if ((i8 & 16) != 0) {
            j8 = adEvent.createdAt;
        }
        return adEvent.copy(str, str5, str6, str7, j8);
    }

    public static /* synthetic */ void getAdId$annotations() {
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getEventType$annotations() {
    }

    public static /* synthetic */ void getImpressionId$annotations() {
    }

    public static final /* synthetic */ void write$Self$advertising_sdk_release(AdEvent adEvent, d dVar, f fVar) {
        dVar.g(fVar, 0, adEvent.adId);
        dVar.g(fVar, 1, adEvent.zoneId);
        dVar.g(fVar, 2, adEvent.impressionId);
        dVar.g(fVar, 3, adEvent.eventType);
        if (!dVar.e(fVar, 4) && adEvent.createdAt == new Date().getTime() / 1000) {
            return;
        }
        dVar.u(fVar, 4, adEvent.createdAt);
    }

    public final String component1() {
        return this.adId;
    }

    public final String component2() {
        return this.zoneId;
    }

    public final String component3() {
        return this.impressionId;
    }

    public final String component4() {
        return this.eventType;
    }

    public final long component5() {
        return this.createdAt;
    }

    public final AdEvent copy(String str, String str2, String str3, String str4, long j8) {
        r.e(str, "adId");
        r.e(str2, "zoneId");
        r.e(str3, "impressionId");
        r.e(str4, "eventType");
        return new AdEvent(str, str2, str3, str4, j8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdEvent)) {
            return false;
        }
        AdEvent adEvent = (AdEvent) obj;
        return r.a(this.adId, adEvent.adId) && r.a(this.zoneId, adEvent.zoneId) && r.a(this.impressionId, adEvent.impressionId) && r.a(this.eventType, adEvent.eventType) && this.createdAt == adEvent.createdAt;
    }

    public final String getAdId() {
        return this.adId;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    public final String getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        return (((((((this.adId.hashCode() * 31) + this.zoneId.hashCode()) * 31) + this.impressionId.hashCode()) * 31) + this.eventType.hashCode()) * 31) + AbstractC0626b.a(this.createdAt);
    }

    public String toString() {
        return "AdEvent(adId=" + this.adId + ", zoneId=" + this.zoneId + ", impressionId=" + this.impressionId + ", eventType=" + this.eventType + ", createdAt=" + this.createdAt + ")";
    }

    public AdEvent(String str, String str2, String str3, String str4, long j8) {
        r.e(str, "adId");
        r.e(str2, "zoneId");
        r.e(str3, "impressionId");
        r.e(str4, "eventType");
        this.adId = str;
        this.zoneId = str2;
        this.impressionId = str3;
        this.eventType = str4;
        this.createdAt = j8;
    }

    public /* synthetic */ AdEvent(String str, String str2, String str3, String str4, long j8, int i8, AbstractC0650j abstractC0650j) {
        this(str, str2, str3, str4, (i8 & 16) != 0 ? new Date().getTime() / 1000 : j8);
    }
}
