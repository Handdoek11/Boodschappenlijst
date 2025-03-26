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
public final class SdkError {
    private static final b[] $childSerializers;
    private final String code;
    private final String message;
    private final Map<String, String> params;
    private final long timeStamp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b serializer() {
            return SdkError$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        H0 h02 = H0.f38618a;
        $childSerializers = new b[]{null, null, new Y(h02, h02), null};
    }

    public /* synthetic */ SdkError(int i8, String str, String str2, Map map, long j8, C0 c02) {
        if (7 != (i8 & 7)) {
            AbstractC6149r0.a(i8, 7, SdkError$$serializer.INSTANCE.getDescriptor());
        }
        this.code = str;
        this.message = str2;
        this.params = map;
        if ((i8 & 8) == 0) {
            this.timeStamp = new Date().getTime() / 1000;
        } else {
            this.timeStamp = j8;
        }
    }

    public static /* synthetic */ SdkError copy$default(SdkError sdkError, String str, String str2, Map map, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = sdkError.code;
        }
        if ((i8 & 2) != 0) {
            str2 = sdkError.message;
        }
        String str3 = str2;
        if ((i8 & 4) != 0) {
            map = sdkError.params;
        }
        Map map2 = map;
        if ((i8 & 8) != 0) {
            j8 = sdkError.timeStamp;
        }
        return sdkError.copy(str, str3, map2, j8);
    }

    public static /* synthetic */ void getCode$annotations() {
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    public static /* synthetic */ void getParams$annotations() {
    }

    public static /* synthetic */ void getTimeStamp$annotations() {
    }

    public static final /* synthetic */ void write$Self$advertising_sdk_release(SdkError sdkError, d dVar, f fVar) {
        b[] bVarArr = $childSerializers;
        dVar.g(fVar, 0, sdkError.code);
        dVar.g(fVar, 1, sdkError.message);
        dVar.p(fVar, 2, bVarArr[2], sdkError.params);
        if (!dVar.e(fVar, 3) && sdkError.timeStamp == new Date().getTime() / 1000) {
            return;
        }
        dVar.u(fVar, 3, sdkError.timeStamp);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final Map<String, String> component3() {
        return this.params;
    }

    public final long component4() {
        return this.timeStamp;
    }

    public final SdkError copy(String str, String str2, Map<String, String> map, long j8) {
        r.e(str, "code");
        r.e(str2, "message");
        r.e(map, "params");
        return new SdkError(str, str2, map, j8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkError)) {
            return false;
        }
        SdkError sdkError = (SdkError) obj;
        return r.a(this.code, sdkError.code) && r.a(this.message, sdkError.message) && r.a(this.params, sdkError.params) && this.timeStamp == sdkError.timeStamp;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return (((((this.code.hashCode() * 31) + this.message.hashCode()) * 31) + this.params.hashCode()) * 31) + AbstractC0626b.a(this.timeStamp);
    }

    public String toString() {
        return "SdkError(code=" + this.code + ", message=" + this.message + ", params=" + this.params + ", timeStamp=" + this.timeStamp + ")";
    }

    public SdkError(String str, String str2, Map<String, String> map, long j8) {
        r.e(str, "code");
        r.e(str2, "message");
        r.e(map, "params");
        this.code = str;
        this.message = str2;
        this.params = map;
        this.timeStamp = j8;
    }

    public /* synthetic */ SdkError(String str, String str2, Map map, long j8, int i8, AbstractC0650j abstractC0650j) {
        this(str, str2, map, (i8 & 8) != 0 ? new Date().getTime() / 1000 : j8);
    }
}
