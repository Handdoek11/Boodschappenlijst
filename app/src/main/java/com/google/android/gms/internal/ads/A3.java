package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class A3 {
    /* JADX WARN: Removed duplicated region for block: B:127:0x025c A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:9:0x0035, B:11:0x0040, B:14:0x004f, B:17:0x005b, B:20:0x0068, B:23:0x0077, B:26:0x0084, B:29:0x0092, B:31:0x009c, B:39:0x00b7, B:40:0x00cd, B:41:0x00e0, B:44:0x00ec, B:47:0x00f9, B:50:0x0106, B:53:0x0113, B:56:0x0120, B:59:0x012d, B:62:0x013a, B:64:0x0144, B:66:0x014e, B:68:0x0158, B:72:0x0169, B:74:0x016f, B:76:0x0183, B:77:0x018a, B:79:0x0191, B:84:0x019c, B:89:0x01a8, B:127:0x025c, B:90:0x01bd, B:92:0x01c4, B:94:0x01ce, B:95:0x01e2, B:108:0x020e, B:111:0x021b, B:114:0x0227, B:117:0x0233, B:120:0x023f, B:123:0x024b, B:126:0x0255, B:128:0x0275, B:129:0x027c), top: B:134:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.InterfaceC1541Ma a(com.google.android.gms.internal.ads.UQ r15) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.A3.a(com.google.android.gms.internal.ads.UQ):com.google.android.gms.internal.ads.Ma");
    }

    private static int b(UQ uq) {
        int w7 = uq.w();
        if (uq.w() == 1684108385) {
            uq.m(8);
            int i8 = w7 - 16;
            if (i8 == 1) {
                return uq.C();
            }
            if (i8 == 2) {
                return uq.G();
            }
            if (i8 == 3) {
                return uq.E();
            }
            if (i8 == 4 && (uq.v() & 128) == 0) {
                return uq.F();
            }
        }
        HL.f("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static AbstractC3558o2 c(int i8, String str, UQ uq, boolean z7, boolean z8) {
        int b8 = b(uq);
        if (z8) {
            b8 = Math.min(1, b8);
        }
        if (b8 >= 0) {
            return z7 ? new C4538x2(str, null, AbstractC4169th0.x(Integer.toString(b8))) : new C2906i2("und", str, Integer.toString(b8));
        }
        HL.f("MetadataUtil", "Failed to parse uint8 attribute: ".concat(AbstractC3228l00.a(i8)));
        return null;
    }

    private static C4538x2 d(int i8, String str, UQ uq) {
        int w7 = uq.w();
        if (uq.w() == 1684108385 && w7 >= 22) {
            uq.m(10);
            int G7 = uq.G();
            if (G7 > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(G7);
                String sb2 = sb.toString();
                int G8 = uq.G();
                if (G8 > 0) {
                    sb2 = sb2 + "/" + G8;
                }
                return new C4538x2(str, null, AbstractC4169th0.x(sb2));
            }
        }
        HL.f("MetadataUtil", "Failed to parse index/count attribute: ".concat(AbstractC3228l00.a(i8)));
        return null;
    }

    private static C4538x2 e(int i8, String str, UQ uq) {
        int w7 = uq.w();
        if (uq.w() == 1684108385) {
            uq.m(8);
            return new C4538x2(str, null, AbstractC4169th0.x(uq.a(w7 - 16)));
        }
        HL.f("MetadataUtil", "Failed to parse text attribute: ".concat(AbstractC3228l00.a(i8)));
        return null;
    }
}
