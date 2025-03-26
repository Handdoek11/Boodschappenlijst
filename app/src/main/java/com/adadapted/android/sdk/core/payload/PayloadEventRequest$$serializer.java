package com.adadapted.android.sdk.core.payload;

import J6.r;
import g7.b;
import i7.f;
import j7.d;
import j7.e;
import k7.C6151s0;
import k7.H0;
import k7.K;
import kotlinx.serialization.UnknownFieldException;
import l7.c;

/* loaded from: classes.dex */
public final class PayloadEventRequest$$serializer implements K {
    public static final int $stable = 0;
    public static final PayloadEventRequest$$serializer INSTANCE;
    private static final /* synthetic */ C6151s0 descriptor;

    static {
        PayloadEventRequest$$serializer payloadEventRequest$$serializer = new PayloadEventRequest$$serializer();
        INSTANCE = payloadEventRequest$$serializer;
        C6151s0 c6151s0 = new C6151s0("com.adadapted.android.sdk.core.payload.PayloadEventRequest", payloadEventRequest$$serializer, 9);
        c6151s0.n("app_id", false);
        c6151s0.n("udid", false);
        c6151s0.n("bundle_id", false);
        c6151s0.n("bundle_version", false);
        c6151s0.n("device", false);
        c6151s0.n("os", false);
        c6151s0.n("osv", false);
        c6151s0.n("sdk_version", false);
        c6151s0.n("tracking", false);
        descriptor = c6151s0;
    }

    private PayloadEventRequest$$serializer() {
    }

    @Override // k7.K
    public b[] childSerializers() {
        H0 h02 = H0.f38618a;
        return new b[]{h02, h02, h02, h02, h02, h02, h02, h02, c.f38825a};
    }

    @Override // g7.a
    public PayloadEventRequest deserialize(e eVar) {
        int i8;
        l7.b bVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        r.e(eVar, "decoder");
        f descriptor2 = getDescriptor();
        j7.c d8 = eVar.d(descriptor2);
        String str9 = null;
        if (d8.x()) {
            String z7 = d8.z(descriptor2, 0);
            String z8 = d8.z(descriptor2, 1);
            String z9 = d8.z(descriptor2, 2);
            String z10 = d8.z(descriptor2, 3);
            String z11 = d8.z(descriptor2, 4);
            String z12 = d8.z(descriptor2, 5);
            String z13 = d8.z(descriptor2, 6);
            str = z7;
            str8 = d8.z(descriptor2, 7);
            str7 = z13;
            str6 = z12;
            str4 = z10;
            bVar = (l7.b) d8.i(descriptor2, 8, c.f38825a, null);
            str5 = z11;
            str3 = z9;
            str2 = z8;
            i8 = 511;
        } else {
            boolean z14 = true;
            int i9 = 0;
            l7.b bVar2 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            while (z14) {
                int e8 = d8.e(descriptor2);
                switch (e8) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        i9 |= 1;
                        str9 = d8.z(descriptor2, 0);
                        continue;
                    case 1:
                        str10 = d8.z(descriptor2, 1);
                        i9 |= 2;
                        continue;
                    case 2:
                        str11 = d8.z(descriptor2, 2);
                        i9 |= 4;
                        break;
                    case 3:
                        str12 = d8.z(descriptor2, 3);
                        i9 |= 8;
                        break;
                    case 4:
                        str13 = d8.z(descriptor2, 4);
                        i9 |= 16;
                        break;
                    case 5:
                        str14 = d8.z(descriptor2, 5);
                        i9 |= 32;
                        break;
                    case 6:
                        str15 = d8.z(descriptor2, 6);
                        i9 |= 64;
                        break;
                    case 7:
                        str16 = d8.z(descriptor2, 7);
                        i9 |= 128;
                        break;
                    case 8:
                        bVar2 = (l7.b) d8.i(descriptor2, 8, c.f38825a, bVar2);
                        i9 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(e8);
                }
            }
            i8 = i9;
            bVar = bVar2;
            str = str9;
            str2 = str10;
            str3 = str11;
            str4 = str12;
            str5 = str13;
            str6 = str14;
            str7 = str15;
            str8 = str16;
        }
        d8.c(descriptor2);
        return new PayloadEventRequest(i8, str, str2, str3, str4, str5, str6, str7, str8, bVar, null);
    }

    @Override // g7.b, g7.h, g7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // g7.h
    public void serialize(j7.f fVar, PayloadEventRequest payloadEventRequest) {
        r.e(fVar, "encoder");
        r.e(payloadEventRequest, "value");
        f descriptor2 = getDescriptor();
        d d8 = fVar.d(descriptor2);
        PayloadEventRequest.write$Self$advertising_sdk_release(payloadEventRequest, d8, descriptor2);
        d8.c(descriptor2);
    }

    @Override // k7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
