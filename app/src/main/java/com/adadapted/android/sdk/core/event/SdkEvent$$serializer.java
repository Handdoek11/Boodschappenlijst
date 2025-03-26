package com.adadapted.android.sdk.core.event;

import J6.r;
import g7.b;
import i7.f;
import j7.c;
import j7.d;
import j7.e;
import java.util.Map;
import k7.C0;
import k7.C6124e0;
import k7.C6151s0;
import k7.H0;
import k7.K;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes.dex */
public final class SdkEvent$$serializer implements K {
    public static final int $stable = 0;
    public static final SdkEvent$$serializer INSTANCE;
    private static final /* synthetic */ C6151s0 descriptor;

    static {
        SdkEvent$$serializer sdkEvent$$serializer = new SdkEvent$$serializer();
        INSTANCE = sdkEvent$$serializer;
        C6151s0 c6151s0 = new C6151s0("com.adadapted.android.sdk.core.event.SdkEvent", sdkEvent$$serializer, 4);
        c6151s0.n("event_source", false);
        c6151s0.n("event_name", false);
        c6151s0.n("event_timestamp", true);
        c6151s0.n("event_params", false);
        descriptor = c6151s0;
    }

    private SdkEvent$$serializer() {
    }

    @Override // k7.K
    public b[] childSerializers() {
        b bVar = SdkEvent.$childSerializers[3];
        H0 h02 = H0.f38618a;
        return new b[]{h02, h02, C6124e0.f38674a, bVar};
    }

    @Override // g7.a
    public SdkEvent deserialize(e eVar) {
        int i8;
        String str;
        String str2;
        Map map;
        long j8;
        r.e(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c d8 = eVar.d(descriptor2);
        b[] bVarArr = SdkEvent.$childSerializers;
        String str3 = null;
        if (d8.x()) {
            String z7 = d8.z(descriptor2, 0);
            String z8 = d8.z(descriptor2, 1);
            long y7 = d8.y(descriptor2, 2);
            map = (Map) d8.i(descriptor2, 3, bVarArr[3], null);
            str = z7;
            i8 = 15;
            str2 = z8;
            j8 = y7;
        } else {
            boolean z9 = true;
            int i9 = 0;
            long j9 = 0;
            String str4 = null;
            Map map2 = null;
            while (z9) {
                int e8 = d8.e(descriptor2);
                if (e8 == -1) {
                    z9 = false;
                } else if (e8 == 0) {
                    str3 = d8.z(descriptor2, 0);
                    i9 |= 1;
                } else if (e8 == 1) {
                    str4 = d8.z(descriptor2, 1);
                    i9 |= 2;
                } else if (e8 == 2) {
                    j9 = d8.y(descriptor2, 2);
                    i9 |= 4;
                } else {
                    if (e8 != 3) {
                        throw new UnknownFieldException(e8);
                    }
                    map2 = (Map) d8.i(descriptor2, 3, bVarArr[3], map2);
                    i9 |= 8;
                }
            }
            i8 = i9;
            str = str3;
            str2 = str4;
            map = map2;
            j8 = j9;
        }
        d8.c(descriptor2);
        return new SdkEvent(i8, str, str2, j8, map, (C0) null);
    }

    @Override // g7.b, g7.h, g7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // g7.h
    public void serialize(j7.f fVar, SdkEvent sdkEvent) {
        r.e(fVar, "encoder");
        r.e(sdkEvent, "value");
        f descriptor2 = getDescriptor();
        d d8 = fVar.d(descriptor2);
        SdkEvent.write$Self$advertising_sdk_release(sdkEvent, d8, descriptor2);
        d8.c(descriptor2);
    }

    @Override // k7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
