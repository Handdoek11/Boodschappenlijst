package com.adadapted.android.sdk.core.event;

import J6.r;
import g7.b;
import i7.f;
import j7.c;
import j7.d;
import j7.e;
import k7.C0;
import k7.C6124e0;
import k7.C6151s0;
import k7.H0;
import k7.K;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes.dex */
public final class AdEvent$$serializer implements K {
    public static final int $stable = 0;
    public static final AdEvent$$serializer INSTANCE;
    private static final /* synthetic */ C6151s0 descriptor;

    static {
        AdEvent$$serializer adEvent$$serializer = new AdEvent$$serializer();
        INSTANCE = adEvent$$serializer;
        C6151s0 c6151s0 = new C6151s0("com.adadapted.android.sdk.core.event.AdEvent", adEvent$$serializer, 5);
        c6151s0.n("ad_id", false);
        c6151s0.n("zoneId", false);
        c6151s0.n("impression_id", false);
        c6151s0.n("event_type", false);
        c6151s0.n("created_at", true);
        descriptor = c6151s0;
    }

    private AdEvent$$serializer() {
    }

    @Override // k7.K
    public b[] childSerializers() {
        H0 h02 = H0.f38618a;
        return new b[]{h02, h02, h02, h02, C6124e0.f38674a};
    }

    @Override // g7.a
    public AdEvent deserialize(e eVar) {
        String str;
        String str2;
        int i8;
        String str3;
        String str4;
        long j8;
        r.e(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c d8 = eVar.d(descriptor2);
        if (d8.x()) {
            String z7 = d8.z(descriptor2, 0);
            String z8 = d8.z(descriptor2, 1);
            String z9 = d8.z(descriptor2, 2);
            str = z7;
            str2 = d8.z(descriptor2, 3);
            i8 = 31;
            str3 = z9;
            str4 = z8;
            j8 = d8.y(descriptor2, 4);
        } else {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            boolean z10 = true;
            long j9 = 0;
            String str8 = null;
            int i9 = 0;
            while (z10) {
                int e8 = d8.e(descriptor2);
                if (e8 == -1) {
                    z10 = false;
                } else if (e8 == 0) {
                    str5 = d8.z(descriptor2, 0);
                    i9 |= 1;
                } else if (e8 == 1) {
                    str7 = d8.z(descriptor2, 1);
                    i9 |= 2;
                } else if (e8 == 2) {
                    str6 = d8.z(descriptor2, 2);
                    i9 |= 4;
                } else if (e8 == 3) {
                    str8 = d8.z(descriptor2, 3);
                    i9 |= 8;
                } else {
                    if (e8 != 4) {
                        throw new UnknownFieldException(e8);
                    }
                    j9 = d8.y(descriptor2, 4);
                    i9 |= 16;
                }
            }
            str = str5;
            str2 = str8;
            i8 = i9;
            str3 = str6;
            str4 = str7;
            j8 = j9;
        }
        d8.c(descriptor2);
        return new AdEvent(i8, str, str4, str3, str2, j8, (C0) null);
    }

    @Override // g7.b, g7.h, g7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // g7.h
    public void serialize(j7.f fVar, AdEvent adEvent) {
        r.e(fVar, "encoder");
        r.e(adEvent, "value");
        f descriptor2 = getDescriptor();
        d d8 = fVar.d(descriptor2);
        AdEvent.write$Self$advertising_sdk_release(adEvent, d8, descriptor2);
        d8.c(descriptor2);
    }

    @Override // k7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
