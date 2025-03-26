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
public final class SdkError$$serializer implements K {
    public static final int $stable = 0;
    public static final SdkError$$serializer INSTANCE;
    private static final /* synthetic */ C6151s0 descriptor;

    static {
        SdkError$$serializer sdkError$$serializer = new SdkError$$serializer();
        INSTANCE = sdkError$$serializer;
        C6151s0 c6151s0 = new C6151s0("com.adadapted.android.sdk.core.event.SdkError", sdkError$$serializer, 4);
        c6151s0.n("error_code", false);
        c6151s0.n("error_message", false);
        c6151s0.n("error_params", false);
        c6151s0.n("error_timestamp", true);
        descriptor = c6151s0;
    }

    private SdkError$$serializer() {
    }

    @Override // k7.K
    public b[] childSerializers() {
        b bVar = SdkError.$childSerializers[2];
        H0 h02 = H0.f38618a;
        return new b[]{h02, h02, bVar, C6124e0.f38674a};
    }

    @Override // g7.a
    public SdkError deserialize(e eVar) {
        int i8;
        String str;
        long j8;
        String str2;
        Map map;
        r.e(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c d8 = eVar.d(descriptor2);
        b[] bVarArr = SdkError.$childSerializers;
        String str3 = null;
        if (d8.x()) {
            String z7 = d8.z(descriptor2, 0);
            String z8 = d8.z(descriptor2, 1);
            map = (Map) d8.i(descriptor2, 2, bVarArr[2], null);
            str = z7;
            j8 = d8.y(descriptor2, 3);
            str2 = z8;
            i8 = 15;
        } else {
            long j9 = 0;
            boolean z9 = true;
            int i9 = 0;
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
                    map2 = (Map) d8.i(descriptor2, 2, bVarArr[2], map2);
                    i9 |= 4;
                } else {
                    if (e8 != 3) {
                        throw new UnknownFieldException(e8);
                    }
                    j9 = d8.y(descriptor2, 3);
                    i9 |= 8;
                }
            }
            i8 = i9;
            str = str3;
            j8 = j9;
            str2 = str4;
            map = map2;
        }
        d8.c(descriptor2);
        return new SdkError(i8, str, str2, map, j8, (C0) null);
    }

    @Override // g7.b, g7.h, g7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // g7.h
    public void serialize(j7.f fVar, SdkError sdkError) {
        r.e(fVar, "encoder");
        r.e(sdkError, "value");
        f descriptor2 = getDescriptor();
        d d8 = fVar.d(descriptor2);
        SdkError.write$Self$advertising_sdk_release(sdkError, d8, descriptor2);
        d8.c(descriptor2);
    }

    @Override // k7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
