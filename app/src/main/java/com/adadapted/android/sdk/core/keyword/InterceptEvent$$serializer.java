package com.adadapted.android.sdk.core.keyword;

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
public final class InterceptEvent$$serializer implements K {
    public static final int $stable = 0;
    public static final InterceptEvent$$serializer INSTANCE;
    private static final /* synthetic */ C6151s0 descriptor;

    static {
        InterceptEvent$$serializer interceptEvent$$serializer = new InterceptEvent$$serializer();
        INSTANCE = interceptEvent$$serializer;
        C6151s0 c6151s0 = new C6151s0("com.adadapted.android.sdk.core.keyword.InterceptEvent", interceptEvent$$serializer, 6);
        c6151s0.n("search_id", true);
        c6151s0.n("event_type", true);
        c6151s0.n("user_input", true);
        c6151s0.n("term_id", true);
        c6151s0.n("term", true);
        c6151s0.n("created_at", true);
        descriptor = c6151s0;
    }

    private InterceptEvent$$serializer() {
    }

    @Override // k7.K
    public b[] childSerializers() {
        H0 h02 = H0.f38618a;
        return new b[]{h02, h02, h02, h02, h02, C6124e0.f38674a};
    }

    @Override // g7.a
    public InterceptEvent deserialize(e eVar) {
        String str;
        int i8;
        String str2;
        String str3;
        String str4;
        String str5;
        long j8;
        r.e(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c d8 = eVar.d(descriptor2);
        if (d8.x()) {
            String z7 = d8.z(descriptor2, 0);
            String z8 = d8.z(descriptor2, 1);
            String z9 = d8.z(descriptor2, 2);
            str = z7;
            i8 = 63;
            str2 = d8.z(descriptor2, 3);
            str3 = d8.z(descriptor2, 4);
            str4 = z9;
            str5 = z8;
            j8 = d8.y(descriptor2, 5);
        } else {
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            boolean z10 = true;
            long j9 = 0;
            String str10 = null;
            int i9 = 0;
            while (z10) {
                int e8 = d8.e(descriptor2);
                switch (e8) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        str6 = d8.z(descriptor2, 0);
                        i9 |= 1;
                        continue;
                    case 1:
                        str9 = d8.z(descriptor2, 1);
                        i9 |= 2;
                        break;
                    case 2:
                        str8 = d8.z(descriptor2, 2);
                        i9 |= 4;
                        break;
                    case 3:
                        str10 = d8.z(descriptor2, 3);
                        i9 |= 8;
                        break;
                    case 4:
                        str7 = d8.z(descriptor2, 4);
                        i9 |= 16;
                        break;
                    case 5:
                        j9 = d8.y(descriptor2, 5);
                        i9 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(e8);
                }
            }
            str = str6;
            i8 = i9;
            str2 = str10;
            str3 = str7;
            str4 = str8;
            str5 = str9;
            j8 = j9;
        }
        d8.c(descriptor2);
        return new InterceptEvent(i8, str, str5, str4, str2, str3, j8, (C0) null);
    }

    @Override // g7.b, g7.h, g7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // g7.h
    public void serialize(j7.f fVar, InterceptEvent interceptEvent) {
        r.e(fVar, "encoder");
        r.e(interceptEvent, "value");
        f descriptor2 = getDescriptor();
        d d8 = fVar.d(descriptor2);
        InterceptEvent.write$Self$advertising_sdk_release(interceptEvent, d8, descriptor2);
        d8.c(descriptor2);
    }

    @Override // k7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
