package com.adadapted.android.sdk.core.payload;

import J6.r;
import g7.b;
import i7.f;
import j7.c;
import j7.d;
import j7.e;
import java.util.List;
import k7.C0;
import k7.C6151s0;
import k7.H0;
import k7.K;
import k7.U;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes.dex */
public final class Payload$$serializer implements K {
    public static final int $stable = 0;
    public static final Payload$$serializer INSTANCE;
    private static final /* synthetic */ C6151s0 descriptor;

    static {
        Payload$$serializer payload$$serializer = new Payload$$serializer();
        INSTANCE = payload$$serializer;
        C6151s0 c6151s0 = new C6151s0("com.adadapted.android.sdk.core.payload.Payload", payload$$serializer, 7);
        c6151s0.n("payload_id", true);
        c6151s0.n("payload_message", true);
        c6151s0.n("payload_image", true);
        c6151s0.n("campaign_id", true);
        c6151s0.n("app_id", true);
        c6151s0.n("expire_seconds", true);
        c6151s0.n("detailed_list_items", true);
        descriptor = c6151s0;
    }

    private Payload$$serializer() {
    }

    @Override // k7.K
    public b[] childSerializers() {
        b bVar = Payload.$childSerializers[6];
        H0 h02 = H0.f38618a;
        return new b[]{h02, h02, h02, h02, h02, U.f38656a, bVar};
    }

    @Override // g7.a
    public Payload deserialize(e eVar) {
        int i8;
        List list;
        int i9;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        r.e(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c d8 = eVar.d(descriptor2);
        b[] bVarArr = Payload.$childSerializers;
        if (d8.x()) {
            String z7 = d8.z(descriptor2, 0);
            String z8 = d8.z(descriptor2, 1);
            String z9 = d8.z(descriptor2, 2);
            String z10 = d8.z(descriptor2, 3);
            String z11 = d8.z(descriptor2, 4);
            int g8 = d8.g(descriptor2, 5);
            list = (List) d8.i(descriptor2, 6, bVarArr[6], null);
            str = z7;
            i8 = g8;
            str4 = z10;
            str5 = z11;
            str3 = z9;
            i9 = 127;
            str2 = z8;
        } else {
            boolean z12 = true;
            int i10 = 0;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            List list2 = null;
            int i11 = 0;
            while (z12) {
                int e8 = d8.e(descriptor2);
                switch (e8) {
                    case -1:
                        z12 = false;
                        break;
                    case 0:
                        i11 |= 1;
                        str6 = d8.z(descriptor2, 0);
                        continue;
                    case 1:
                        str7 = d8.z(descriptor2, 1);
                        i11 |= 2;
                        continue;
                    case 2:
                        str8 = d8.z(descriptor2, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        str9 = d8.z(descriptor2, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        str10 = d8.z(descriptor2, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        i10 = d8.g(descriptor2, 5);
                        i11 |= 32;
                        break;
                    case 6:
                        list2 = (List) d8.i(descriptor2, 6, bVarArr[6], list2);
                        i11 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(e8);
                }
            }
            i8 = i10;
            list = list2;
            i9 = i11;
            str = str6;
            str2 = str7;
            str3 = str8;
            str4 = str9;
            str5 = str10;
        }
        d8.c(descriptor2);
        return new Payload(i9, str, str2, str3, str4, str5, i8, list, (C0) null);
    }

    @Override // g7.b, g7.h, g7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // g7.h
    public void serialize(j7.f fVar, Payload payload) {
        r.e(fVar, "encoder");
        r.e(payload, "value");
        f descriptor2 = getDescriptor();
        d d8 = fVar.d(descriptor2);
        Payload.write$Self$advertising_sdk_release(payload, d8, descriptor2);
        d8.c(descriptor2);
    }

    @Override // k7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
