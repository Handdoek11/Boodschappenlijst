package com.adadapted.android.sdk.core.device;

import J6.r;
import g7.b;
import i7.f;
import j7.c;
import j7.d;
import j7.e;
import java.util.Map;
import k7.C0;
import k7.C6124e0;
import k7.C6131i;
import k7.C6151s0;
import k7.H0;
import k7.J;
import k7.K;
import k7.U;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes.dex */
public final class DeviceInfo$$serializer implements K {
    public static final int $stable = 0;
    public static final DeviceInfo$$serializer INSTANCE;
    private static final /* synthetic */ C6151s0 descriptor;

    static {
        DeviceInfo$$serializer deviceInfo$$serializer = new DeviceInfo$$serializer();
        INSTANCE = deviceInfo$$serializer;
        C6151s0 c6151s0 = new C6151s0("com.adadapted.android.sdk.core.device.DeviceInfo", deviceInfo$$serializer, 21);
        c6151s0.n("app_id", true);
        c6151s0.n("isProd", true);
        c6151s0.n("customIdentifier", true);
        c6151s0.n("scale", true);
        c6151s0.n("bundle_id", true);
        c6151s0.n("bundle_version", true);
        c6151s0.n("udid", true);
        c6151s0.n("device_name", true);
        c6151s0.n("device_udid", true);
        c6151s0.n("device_os", true);
        c6151s0.n("device_osv", true);
        c6151s0.n("device_locale", true);
        c6151s0.n("device_timezone", true);
        c6151s0.n("device_carrier", true);
        c6151s0.n("device_width", true);
        c6151s0.n("device_height", true);
        c6151s0.n("device_density", true);
        c6151s0.n("allow_retargeting", true);
        c6151s0.n("sdk_version", true);
        c6151s0.n("created_at", true);
        c6151s0.n("params", true);
        descriptor = c6151s0;
    }

    private DeviceInfo$$serializer() {
    }

    @Override // k7.K
    public b[] childSerializers() {
        b bVar = DeviceInfo.$childSerializers[20];
        H0 h02 = H0.f38618a;
        C6131i c6131i = C6131i.f38691a;
        U u7 = U.f38656a;
        return new b[]{h02, c6131i, h02, J.f38626a, h02, h02, h02, h02, h02, h02, h02, h02, h02, h02, u7, u7, h02, c6131i, h02, C6124e0.f38674a, bVar};
    }

    @Override // g7.a
    public DeviceInfo deserialize(e eVar) {
        Map map;
        int i8;
        int i9;
        int i10;
        boolean z7;
        float f8;
        boolean z8;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        long j8;
        r.e(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c d8 = eVar.d(descriptor2);
        b[] bVarArr = DeviceInfo.$childSerializers;
        int i11 = 5;
        int i12 = 2;
        if (d8.x()) {
            String z9 = d8.z(descriptor2, 0);
            boolean A7 = d8.A(descriptor2, 1);
            String z10 = d8.z(descriptor2, 2);
            float s8 = d8.s(descriptor2, 3);
            String z11 = d8.z(descriptor2, 4);
            String z12 = d8.z(descriptor2, 5);
            String z13 = d8.z(descriptor2, 6);
            String z14 = d8.z(descriptor2, 7);
            String z15 = d8.z(descriptor2, 8);
            String z16 = d8.z(descriptor2, 9);
            String z17 = d8.z(descriptor2, 10);
            String z18 = d8.z(descriptor2, 11);
            String z19 = d8.z(descriptor2, 12);
            String z20 = d8.z(descriptor2, 13);
            int g8 = d8.g(descriptor2, 14);
            int g9 = d8.g(descriptor2, 15);
            String z21 = d8.z(descriptor2, 16);
            boolean A8 = d8.A(descriptor2, 17);
            String z22 = d8.z(descriptor2, 18);
            long y7 = d8.y(descriptor2, 19);
            str5 = z13;
            map = (Map) d8.i(descriptor2, 20, bVarArr[20], null);
            i8 = 2097151;
            str4 = z12;
            f8 = s8;
            str7 = z15;
            str3 = z11;
            str2 = z10;
            z8 = A7;
            str11 = z19;
            str9 = z17;
            str8 = z16;
            str6 = z14;
            str10 = z18;
            str14 = z22;
            z7 = A8;
            str13 = z21;
            i10 = g9;
            i9 = g8;
            str12 = z20;
            str = z9;
            j8 = y7;
        } else {
            boolean z23 = false;
            boolean z24 = true;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            float f9 = 0.0f;
            long j9 = 0;
            int i13 = 0;
            int i14 = 0;
            boolean z25 = false;
            Map map2 = null;
            int i15 = 0;
            while (z24) {
                int e8 = d8.e(descriptor2);
                switch (e8) {
                    case -1:
                        z24 = false;
                        i11 = 5;
                        i12 = 2;
                    case 0:
                        str15 = d8.z(descriptor2, 0);
                        i15 |= 1;
                        i11 = 5;
                        i12 = 2;
                    case 1:
                        z23 = d8.A(descriptor2, 1);
                        i15 |= 2;
                        i11 = 5;
                        i12 = 2;
                    case 2:
                        int i16 = i12;
                        str16 = d8.z(descriptor2, i16);
                        i15 |= 4;
                        i12 = i16;
                        i11 = 5;
                    case 3:
                        f9 = d8.s(descriptor2, 3);
                        i15 |= 8;
                        i12 = 2;
                    case 4:
                        str17 = d8.z(descriptor2, 4);
                        i15 |= 16;
                        i12 = 2;
                    case 5:
                        str18 = d8.z(descriptor2, i11);
                        i15 |= 32;
                        i12 = 2;
                    case 6:
                        str19 = d8.z(descriptor2, 6);
                        i15 |= 64;
                        i12 = 2;
                    case 7:
                        str20 = d8.z(descriptor2, 7);
                        i15 |= 128;
                        i12 = 2;
                    case 8:
                        str21 = d8.z(descriptor2, 8);
                        i15 |= 256;
                        i12 = 2;
                    case 9:
                        str22 = d8.z(descriptor2, 9);
                        i15 |= 512;
                        i12 = 2;
                    case 10:
                        str23 = d8.z(descriptor2, 10);
                        i15 |= 1024;
                        i12 = 2;
                    case 11:
                        str24 = d8.z(descriptor2, 11);
                        i15 |= 2048;
                        i12 = 2;
                    case 12:
                        str25 = d8.z(descriptor2, 12);
                        i15 |= 4096;
                        i12 = 2;
                    case 13:
                        str26 = d8.z(descriptor2, 13);
                        i15 |= 8192;
                        i12 = 2;
                    case 14:
                        i15 |= 16384;
                        i13 = d8.g(descriptor2, 14);
                        i12 = 2;
                    case 15:
                        i14 = d8.g(descriptor2, 15);
                        i15 |= 32768;
                        i12 = 2;
                    case 16:
                        str27 = d8.z(descriptor2, 16);
                        i15 |= 65536;
                        i12 = 2;
                    case 17:
                        z25 = d8.A(descriptor2, 17);
                        i15 |= 131072;
                        i12 = 2;
                    case 18:
                        str28 = d8.z(descriptor2, 18);
                        i15 |= 262144;
                        i12 = 2;
                    case 19:
                        j9 = d8.y(descriptor2, 19);
                        i15 |= 524288;
                        i12 = 2;
                    case 20:
                        map2 = (Map) d8.i(descriptor2, 20, bVarArr[20], map2);
                        i15 |= 1048576;
                        i12 = 2;
                    default:
                        throw new UnknownFieldException(e8);
                }
            }
            map = map2;
            i8 = i15;
            i9 = i13;
            i10 = i14;
            z7 = z25;
            f8 = f9;
            z8 = z23;
            str = str15;
            str2 = str16;
            str3 = str17;
            str4 = str18;
            str5 = str19;
            str6 = str20;
            str7 = str21;
            str8 = str22;
            str9 = str23;
            str10 = str24;
            str11 = str25;
            str12 = str26;
            str13 = str27;
            str14 = str28;
            j8 = j9;
        }
        d8.c(descriptor2);
        return new DeviceInfo(i8, str, z8, str2, f8, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, i9, i10, str13, z7, str14, j8, map, (C0) null);
    }

    @Override // g7.b, g7.h, g7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // g7.h
    public void serialize(j7.f fVar, DeviceInfo deviceInfo) {
        r.e(fVar, "encoder");
        r.e(deviceInfo, "value");
        f descriptor2 = getDescriptor();
        d d8 = fVar.d(descriptor2);
        DeviceInfo.write$Self$advertising_sdk_release(deviceInfo, d8, descriptor2);
        d8.c(descriptor2);
    }

    @Override // k7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
