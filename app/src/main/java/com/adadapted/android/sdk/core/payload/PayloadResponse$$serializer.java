package com.adadapted.android.sdk.core.payload;

import J6.r;
import g7.b;
import i7.f;
import j7.c;
import j7.d;
import j7.e;
import java.util.List;
import k7.C6151s0;
import k7.K;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes.dex */
public final class PayloadResponse$$serializer implements K {
    public static final int $stable = 0;
    public static final PayloadResponse$$serializer INSTANCE;
    private static final /* synthetic */ C6151s0 descriptor;

    static {
        PayloadResponse$$serializer payloadResponse$$serializer = new PayloadResponse$$serializer();
        INSTANCE = payloadResponse$$serializer;
        C6151s0 c6151s0 = new C6151s0("com.adadapted.android.sdk.core.payload.PayloadResponse", payloadResponse$$serializer, 1);
        c6151s0.n("payloads", false);
        descriptor = c6151s0;
    }

    private PayloadResponse$$serializer() {
    }

    @Override // k7.K
    public b[] childSerializers() {
        return new b[]{PayloadResponse.$childSerializers[0]};
    }

    @Override // g7.a
    public PayloadResponse deserialize(e eVar) {
        List list;
        r.e(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c d8 = eVar.d(descriptor2);
        b[] bVarArr = PayloadResponse.$childSerializers;
        int i8 = 1;
        if (d8.x()) {
            list = (List) d8.i(descriptor2, 0, bVarArr[0], null);
        } else {
            boolean z7 = true;
            int i9 = 0;
            List list2 = null;
            while (z7) {
                int e8 = d8.e(descriptor2);
                if (e8 == -1) {
                    z7 = false;
                } else {
                    if (e8 != 0) {
                        throw new UnknownFieldException(e8);
                    }
                    list2 = (List) d8.i(descriptor2, 0, bVarArr[0], list2);
                    i9 = 1;
                }
            }
            list = list2;
            i8 = i9;
        }
        d8.c(descriptor2);
        return new PayloadResponse(i8, list, null);
    }

    @Override // g7.b, g7.h, g7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // g7.h
    public void serialize(j7.f fVar, PayloadResponse payloadResponse) {
        r.e(fVar, "encoder");
        r.e(payloadResponse, "value");
        f descriptor2 = getDescriptor();
        d d8 = fVar.d(descriptor2);
        d8.p(descriptor2, 0, PayloadResponse.$childSerializers[0], payloadResponse.payloads);
        d8.c(descriptor2);
    }

    @Override // k7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
