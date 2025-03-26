package com.adadapted.android.sdk.core.view;

import J6.r;
import java.util.List;
import k7.C6124e0;
import k7.C6151s0;
import k7.H0;
import k7.K;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes.dex */
public final class Zone$$serializer implements K {
    public static final int $stable = 0;
    public static final Zone$$serializer INSTANCE;
    private static final /* synthetic */ C6151s0 descriptor;

    static {
        Zone$$serializer zone$$serializer = new Zone$$serializer();
        INSTANCE = zone$$serializer;
        C6151s0 c6151s0 = new C6151s0("com.adadapted.android.sdk.core.view.Zone", zone$$serializer, 6);
        c6151s0.n("id", true);
        c6151s0.n("ads", true);
        c6151s0.n("port_height", true);
        c6151s0.n("port_width", true);
        c6151s0.n("land_height", true);
        c6151s0.n("land_width", true);
        descriptor = c6151s0;
    }

    private Zone$$serializer() {
    }

    @Override // k7.K
    public g7.b[] childSerializers() {
        g7.b bVar = Zone.$childSerializers[1];
        C6124e0 c6124e0 = C6124e0.f38674a;
        return new g7.b[]{H0.f38618a, bVar, c6124e0, c6124e0, c6124e0, c6124e0};
    }

    @Override // g7.a
    public Zone deserialize(j7.e eVar) {
        int i8;
        List list;
        String str;
        long j8;
        long j9;
        long j10;
        long j11;
        r.e(eVar, "decoder");
        i7.f descriptor2 = getDescriptor();
        j7.c d8 = eVar.d(descriptor2);
        g7.b[] bVarArr = Zone.$childSerializers;
        int i9 = 5;
        String str2 = null;
        if (d8.x()) {
            String z7 = d8.z(descriptor2, 0);
            List list2 = (List) d8.i(descriptor2, 1, bVarArr[1], null);
            long y7 = d8.y(descriptor2, 2);
            long y8 = d8.y(descriptor2, 3);
            list = list2;
            str = z7;
            i8 = 63;
            j8 = d8.y(descriptor2, 4);
            j9 = y7;
            j10 = y8;
            j11 = d8.y(descriptor2, 5);
        } else {
            long j12 = 0;
            boolean z8 = true;
            int i10 = 0;
            List list3 = null;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            while (z8) {
                int e8 = d8.e(descriptor2);
                switch (e8) {
                    case -1:
                        z8 = false;
                        i9 = 5;
                    case 0:
                        str2 = d8.z(descriptor2, 0);
                        i10 |= 1;
                        i9 = 5;
                    case 1:
                        list3 = (List) d8.i(descriptor2, 1, bVarArr[1], list3);
                        i10 |= 2;
                        i9 = 5;
                    case 2:
                        j13 = d8.y(descriptor2, 2);
                        i10 |= 4;
                    case 3:
                        j14 = d8.y(descriptor2, 3);
                        i10 |= 8;
                    case 4:
                        j12 = d8.y(descriptor2, 4);
                        i10 |= 16;
                    case 5:
                        j15 = d8.y(descriptor2, i9);
                        i10 |= 32;
                    default:
                        throw new UnknownFieldException(e8);
                }
            }
            i8 = i10;
            list = list3;
            str = str2;
            j8 = j12;
            j9 = j13;
            j10 = j14;
            j11 = j15;
        }
        d8.c(descriptor2);
        return new Zone(i8, str, list, j9, j10, j8, j11, null);
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return descriptor;
    }

    @Override // g7.h
    public void serialize(j7.f fVar, Zone zone) {
        r.e(fVar, "encoder");
        r.e(zone, "value");
        i7.f descriptor2 = getDescriptor();
        j7.d d8 = fVar.d(descriptor2);
        Zone.write$Self$advertising_sdk_release(zone, d8, descriptor2);
        d8.c(descriptor2);
    }

    @Override // k7.K
    public g7.b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
