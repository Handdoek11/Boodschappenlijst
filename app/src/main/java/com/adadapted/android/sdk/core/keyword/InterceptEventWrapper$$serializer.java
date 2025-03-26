package com.adadapted.android.sdk.core.keyword;

import J6.r;
import g7.b;
import i7.f;
import j7.c;
import j7.d;
import j7.e;
import java.util.Set;
import k7.C6151s0;
import k7.H0;
import k7.K;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes.dex */
public final class InterceptEventWrapper$$serializer implements K {
    public static final int $stable = 0;
    public static final InterceptEventWrapper$$serializer INSTANCE;
    private static final /* synthetic */ C6151s0 descriptor;

    static {
        InterceptEventWrapper$$serializer interceptEventWrapper$$serializer = new InterceptEventWrapper$$serializer();
        INSTANCE = interceptEventWrapper$$serializer;
        C6151s0 c6151s0 = new C6151s0("com.adadapted.android.sdk.core.keyword.InterceptEventWrapper", interceptEventWrapper$$serializer, 5);
        c6151s0.n("session_id", false);
        c6151s0.n("app_id", false);
        c6151s0.n("udid", false);
        c6151s0.n("sdk_version", false);
        c6151s0.n("events", false);
        descriptor = c6151s0;
    }

    private InterceptEventWrapper$$serializer() {
    }

    @Override // k7.K
    public b[] childSerializers() {
        b bVar = InterceptEventWrapper.$childSerializers[4];
        H0 h02 = H0.f38618a;
        return new b[]{h02, h02, h02, h02, bVar};
    }

    @Override // g7.a
    public InterceptEventWrapper deserialize(e eVar) {
        int i8;
        String str;
        String str2;
        String str3;
        String str4;
        Set set;
        r.e(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c d8 = eVar.d(descriptor2);
        b[] bVarArr = InterceptEventWrapper.$childSerializers;
        String str5 = null;
        if (d8.x()) {
            String z7 = d8.z(descriptor2, 0);
            String z8 = d8.z(descriptor2, 1);
            String z9 = d8.z(descriptor2, 2);
            String z10 = d8.z(descriptor2, 3);
            set = (Set) d8.i(descriptor2, 4, bVarArr[4], null);
            str = z7;
            str4 = z10;
            str3 = z9;
            i8 = 31;
            str2 = z8;
        } else {
            boolean z11 = true;
            int i9 = 0;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            Set set2 = null;
            while (z11) {
                int e8 = d8.e(descriptor2);
                if (e8 == -1) {
                    z11 = false;
                } else if (e8 == 0) {
                    str5 = d8.z(descriptor2, 0);
                    i9 |= 1;
                } else if (e8 == 1) {
                    str6 = d8.z(descriptor2, 1);
                    i9 |= 2;
                } else if (e8 == 2) {
                    str7 = d8.z(descriptor2, 2);
                    i9 |= 4;
                } else if (e8 == 3) {
                    str8 = d8.z(descriptor2, 3);
                    i9 |= 8;
                } else {
                    if (e8 != 4) {
                        throw new UnknownFieldException(e8);
                    }
                    set2 = (Set) d8.i(descriptor2, 4, bVarArr[4], set2);
                    i9 |= 16;
                }
            }
            i8 = i9;
            str = str5;
            str2 = str6;
            str3 = str7;
            str4 = str8;
            set = set2;
        }
        d8.c(descriptor2);
        return new InterceptEventWrapper(i8, str, str2, str3, str4, set, null);
    }

    @Override // g7.b, g7.h, g7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // g7.h
    public void serialize(j7.f fVar, InterceptEventWrapper interceptEventWrapper) {
        r.e(fVar, "encoder");
        r.e(interceptEventWrapper, "value");
        f descriptor2 = getDescriptor();
        d d8 = fVar.d(descriptor2);
        InterceptEventWrapper.write$Self$advertising_sdk_release(interceptEventWrapper, d8, descriptor2);
        d8.c(descriptor2);
    }

    @Override // k7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
