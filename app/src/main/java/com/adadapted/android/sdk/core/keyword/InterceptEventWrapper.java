package com.adadapted.android.sdk.core.keyword;

import J6.AbstractC0650j;
import J6.r;
import g7.b;
import g7.g;
import i7.f;
import j7.d;
import java.util.Set;
import k7.AbstractC6149r0;
import k7.C0;
import k7.C6116a0;

@g
/* loaded from: classes.dex */
public final class InterceptEventWrapper {
    private final String appId;
    private final Set<InterceptEvent> events;
    private final String sdkVersion;
    private final String sessionId;
    private final String udid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final b[] $childSerializers = {null, null, null, null, new C6116a0(InterceptEvent$$serializer.INSTANCE)};

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b serializer() {
            return InterceptEventWrapper$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ InterceptEventWrapper(int i8, String str, String str2, String str3, String str4, Set set, C0 c02) {
        if (31 != (i8 & 31)) {
            AbstractC6149r0.a(i8, 31, InterceptEventWrapper$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
        this.appId = str2;
        this.udid = str3;
        this.sdkVersion = str4;
        this.events = set;
    }

    public static /* synthetic */ InterceptEventWrapper copy$default(InterceptEventWrapper interceptEventWrapper, String str, String str2, String str3, String str4, Set set, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = interceptEventWrapper.sessionId;
        }
        if ((i8 & 2) != 0) {
            str2 = interceptEventWrapper.appId;
        }
        String str5 = str2;
        if ((i8 & 4) != 0) {
            str3 = interceptEventWrapper.udid;
        }
        String str6 = str3;
        if ((i8 & 8) != 0) {
            str4 = interceptEventWrapper.sdkVersion;
        }
        String str7 = str4;
        if ((i8 & 16) != 0) {
            set = interceptEventWrapper.events;
        }
        return interceptEventWrapper.copy(str, str5, str6, str7, set);
    }

    public static /* synthetic */ void getAppId$annotations() {
    }

    public static /* synthetic */ void getSdkVersion$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }

    public static final /* synthetic */ void write$Self$advertising_sdk_release(InterceptEventWrapper interceptEventWrapper, d dVar, f fVar) {
        b[] bVarArr = $childSerializers;
        dVar.g(fVar, 0, interceptEventWrapper.sessionId);
        dVar.g(fVar, 1, interceptEventWrapper.appId);
        dVar.g(fVar, 2, interceptEventWrapper.udid);
        dVar.g(fVar, 3, interceptEventWrapper.sdkVersion);
        dVar.p(fVar, 4, bVarArr[4], interceptEventWrapper.events);
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

    public final Set<InterceptEvent> component5() {
        return this.events;
    }

    public final InterceptEventWrapper copy(String str, String str2, String str3, String str4, Set<InterceptEvent> set) {
        r.e(str, "sessionId");
        r.e(str2, "appId");
        r.e(str3, "udid");
        r.e(str4, "sdkVersion");
        r.e(set, "events");
        return new InterceptEventWrapper(str, str2, str3, str4, set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterceptEventWrapper)) {
            return false;
        }
        InterceptEventWrapper interceptEventWrapper = (InterceptEventWrapper) obj;
        return r.a(this.sessionId, interceptEventWrapper.sessionId) && r.a(this.appId, interceptEventWrapper.appId) && r.a(this.udid, interceptEventWrapper.udid) && r.a(this.sdkVersion, interceptEventWrapper.sdkVersion) && r.a(this.events, interceptEventWrapper.events);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final Set<InterceptEvent> getEvents() {
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
        return "InterceptEventWrapper(sessionId=" + this.sessionId + ", appId=" + this.appId + ", udid=" + this.udid + ", sdkVersion=" + this.sdkVersion + ", events=" + this.events + ")";
    }

    public InterceptEventWrapper(String str, String str2, String str3, String str4, Set<InterceptEvent> set) {
        r.e(str, "sessionId");
        r.e(str2, "appId");
        r.e(str3, "udid");
        r.e(str4, "sdkVersion");
        r.e(set, "events");
        this.sessionId = str;
        this.appId = str2;
        this.udid = str3;
        this.sdkVersion = str4;
        this.events = set;
    }
}
