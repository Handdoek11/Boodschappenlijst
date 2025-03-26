package com.adadapted.android.sdk.core.ad;

import J6.r;
import com.adadapted.android.sdk.core.atl.AdditContent;
import com.adadapted.android.sdk.core.payload.Payload;
import com.adadapted.android.sdk.core.payload.Payload$$serializer;
import g7.b;
import i7.f;
import j7.c;
import j7.d;
import j7.e;
import k7.C6124e0;
import k7.C6131i;
import k7.C6151s0;
import k7.H0;
import k7.K;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes.dex */
public final class Ad$$serializer implements K {
    public static final int $stable = 0;
    public static final Ad$$serializer INSTANCE;
    private static final /* synthetic */ C6151s0 descriptor;

    static {
        Ad$$serializer ad$$serializer = new Ad$$serializer();
        INSTANCE = ad$$serializer;
        C6151s0 c6151s0 = new C6151s0("com.adadapted.android.sdk.core.ad.Ad", ad$$serializer, 8);
        c6151s0.n("ad_id", true);
        c6151s0.n("impression_id", true);
        c6151s0.n("creative_url", true);
        c6151s0.n("action_type", true);
        c6151s0.n("action_path", true);
        c6151s0.n(AdditContent.AdditSources.PAYLOAD, true);
        c6151s0.n("refresh_time", true);
        c6151s0.n("isImpressionTracked", true);
        descriptor = c6151s0;
    }

    private Ad$$serializer() {
    }

    @Override // k7.K
    public b[] childSerializers() {
        H0 h02 = H0.f38618a;
        return new b[]{h02, h02, h02, h02, h02, Payload$$serializer.INSTANCE, C6124e0.f38674a, C6131i.f38691a};
    }

    @Override // g7.a
    public Ad deserialize(e eVar) {
        boolean z7;
        Payload payload;
        int i8;
        long j8;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        r.e(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c d8 = eVar.d(descriptor2);
        if (d8.x()) {
            String z8 = d8.z(descriptor2, 0);
            String z9 = d8.z(descriptor2, 1);
            String z10 = d8.z(descriptor2, 2);
            String z11 = d8.z(descriptor2, 3);
            String z12 = d8.z(descriptor2, 4);
            Payload payload2 = (Payload) d8.i(descriptor2, 5, Payload$$serializer.INSTANCE, null);
            long y7 = d8.y(descriptor2, 6);
            str = z8;
            z7 = d8.A(descriptor2, 7);
            i8 = 255;
            payload = payload2;
            str4 = z11;
            str5 = z12;
            str3 = z10;
            str2 = z9;
            j8 = y7;
        } else {
            long j9 = 0;
            boolean z13 = true;
            boolean z14 = false;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            Payload payload3 = null;
            int i9 = 0;
            while (z13) {
                int e8 = d8.e(descriptor2);
                switch (e8) {
                    case -1:
                        z13 = false;
                        break;
                    case 0:
                        i9 |= 1;
                        str6 = d8.z(descriptor2, 0);
                        continue;
                    case 1:
                        str7 = d8.z(descriptor2, 1);
                        i9 |= 2;
                        continue;
                    case 2:
                        str8 = d8.z(descriptor2, 2);
                        i9 |= 4;
                        break;
                    case 3:
                        str9 = d8.z(descriptor2, 3);
                        i9 |= 8;
                        break;
                    case 4:
                        str10 = d8.z(descriptor2, 4);
                        i9 |= 16;
                        break;
                    case 5:
                        payload3 = (Payload) d8.i(descriptor2, 5, Payload$$serializer.INSTANCE, payload3);
                        i9 |= 32;
                        break;
                    case 6:
                        j9 = d8.y(descriptor2, 6);
                        i9 |= 64;
                        break;
                    case 7:
                        z14 = d8.A(descriptor2, 7);
                        i9 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(e8);
                }
            }
            z7 = z14;
            payload = payload3;
            i8 = i9;
            j8 = j9;
            str = str6;
            str2 = str7;
            str3 = str8;
            str4 = str9;
            str5 = str10;
        }
        d8.c(descriptor2);
        return new Ad(i8, str, str2, str3, str4, str5, payload, j8, z7, null);
    }

    @Override // g7.b, g7.h, g7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // g7.h
    public void serialize(j7.f fVar, Ad ad) {
        r.e(fVar, "encoder");
        r.e(ad, "value");
        f descriptor2 = getDescriptor();
        d d8 = fVar.d(descriptor2);
        Ad.write$Self$advertising_sdk_release(ad, d8, descriptor2);
        d8.c(descriptor2);
    }

    @Override // k7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
