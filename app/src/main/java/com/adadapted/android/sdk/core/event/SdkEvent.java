package com.adadapted.android.sdk.core.event;

import H.AbstractC0626b;
import J6.AbstractC0650j;
import J6.r;
import g7.b;
import g7.g;
import i7.f;
import j7.d;
import java.util.Date;
import java.util.Map;
import k7.AbstractC6149r0;
import k7.C0;
import k7.H0;
import k7.Y;

@g
/* loaded from: classes.dex */
public final class SdkEvent {
    private static final b[] $childSerializers;
    private final String name;
    private final Map<String, String> params;
    private final long timeStamp;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b serializer() {
            return SdkEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        H0 h02 = H0.f38618a;
        $childSerializers = new b[]{null, null, null, new Y(h02, h02)};
    }

    public /* synthetic */ SdkEvent(int i8, String str, String str2, long j8, Map map, C0 c02) {
        if (11 != (i8 & 11)) {
            AbstractC6149r0.a(i8, 11, SdkEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.name = str2;
        if ((i8 & 4) == 0) {
            this.timeStamp = new Date().getTime() / 1000;
        } else {
            this.timeStamp = j8;
        }
        this.params = map;
    }

    public static /* synthetic */ SdkEvent copy$default(SdkEvent sdkEvent, String str, String str2, long j8, Map map, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = sdkEvent.type;
        }
        if ((i8 & 2) != 0) {
            str2 = sdkEvent.name;
        }
        String str3 = str2;
        if ((i8 & 4) != 0) {
            j8 = sdkEvent.timeStamp;
        }
        long j9 = j8;
        if ((i8 & 8) != 0) {
            map = sdkEvent.params;
        }
        return sdkEvent.copy(str, str3, j9, map);
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getParams$annotations() {
    }

    public static /* synthetic */ void getTimeStamp$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$advertising_sdk_release(SdkEvent sdkEvent, d dVar, f fVar) {
        b[] bVarArr = $childSerializers;
        dVar.g(fVar, 0, sdkEvent.type);
        dVar.g(fVar, 1, sdkEvent.name);
        if (dVar.e(fVar, 2) || sdkEvent.timeStamp != new Date().getTime() / 1000) {
            dVar.u(fVar, 2, sdkEvent.timeStamp);
        }
        dVar.p(fVar, 3, bVarArr[3], sdkEvent.params);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.name;
    }

    public final long component3() {
        return this.timeStamp;
    }

    public final Map<String, String> component4() {
        return this.params;
    }

    public final SdkEvent copy(String str, String str2, long j8, Map<String, String> map) {
        r.e(str, "type");
        r.e(str2, "name");
        r.e(map, "params");
        return new SdkEvent(str, str2, j8, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkEvent)) {
            return false;
        }
        SdkEvent sdkEvent = (SdkEvent) obj;
        return r.a(this.type, sdkEvent.type) && r.a(this.name, sdkEvent.name) && this.timeStamp == sdkEvent.timeStamp && r.a(this.params, sdkEvent.params);
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.name.hashCode()) * 31) + AbstractC0626b.a(this.timeStamp)) * 31) + this.params.hashCode();
    }

    public String toString() {
        return "SdkEvent(type=" + this.type + ", name=" + this.name + ", timeStamp=" + this.timeStamp + ", params=" + this.params + ")";
    }

    public SdkEvent(String str, String str2, long j8, Map<String, String> map) {
        r.e(str, "type");
        r.e(str2, "name");
        r.e(map, "params");
        this.type = str;
        this.name = str2;
        this.timeStamp = j8;
        this.params = map;
    }

    public /* synthetic */ SdkEvent(String str, String str2, long j8, Map map, int i8, AbstractC0650j abstractC0650j) {
        this(str, str2, (i8 & 4) != 0 ? new Date().getTime() / 1000 : j8, map);
    }
}
