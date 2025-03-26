package com.adadapted.android.sdk.core.view;

import J6.AbstractC0650j;
import J6.r;

/* loaded from: classes.dex */
public final class ZoneContext {
    public static final int $stable = 0;
    private final String contextId;
    private final String zoneId;

    public ZoneContext() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ZoneContext copy$default(ZoneContext zoneContext, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = zoneContext.zoneId;
        }
        if ((i8 & 2) != 0) {
            str2 = zoneContext.contextId;
        }
        return zoneContext.copy(str, str2);
    }

    public final String component1() {
        return this.zoneId;
    }

    public final String component2() {
        return this.contextId;
    }

    public final ZoneContext copy(String str, String str2) {
        r.e(str, "zoneId");
        r.e(str2, "contextId");
        return new ZoneContext(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneContext)) {
            return false;
        }
        ZoneContext zoneContext = (ZoneContext) obj;
        return r.a(this.zoneId, zoneContext.zoneId) && r.a(this.contextId, zoneContext.contextId);
    }

    public final String getContextId() {
        return this.contextId;
    }

    public final String getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        return (this.zoneId.hashCode() * 31) + this.contextId.hashCode();
    }

    public String toString() {
        return "ZoneContext(zoneId=" + this.zoneId + ", contextId=" + this.contextId + ")";
    }

    public ZoneContext(String str, String str2) {
        r.e(str, "zoneId");
        r.e(str2, "contextId");
        this.zoneId = str;
        this.contextId = str2;
    }

    public /* synthetic */ ZoneContext(String str, String str2, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2);
    }
}
