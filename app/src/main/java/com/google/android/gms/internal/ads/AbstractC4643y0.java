package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4643y0 {
    public static int a(UQ uq, int i8) {
        switch (i8) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i8 - 2);
            case 6:
                return uq.C() + 1;
            case 7:
                return uq.G() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i8 - 8);
            default:
                return -1;
        }
    }

    public static long b(InterfaceC3989s0 interfaceC3989s0, C0 c02) {
        interfaceC3989s0.h();
        interfaceC3989s0.z(1);
        byte[] bArr = new byte[1];
        interfaceC3989s0.I(bArr, 0, 1);
        int i8 = bArr[0] & 1;
        boolean z7 = 1 == i8;
        interfaceC3989s0.z(2);
        int i9 = 1 != i8 ? 6 : 7;
        UQ uq = new UQ(i9);
        uq.k(AbstractC4316v0.a(interfaceC3989s0, uq.n(), 0, i9));
        interfaceC3989s0.h();
        C4534x0 c4534x0 = new C4534x0();
        if (d(uq, c02, z7, c4534x0)) {
            return c4534x0.f27706a;
        }
        throw zzbc.a(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(com.google.android.gms.internal.ads.UQ r21, com.google.android.gms.internal.ads.C0 r22, int r23, com.google.android.gms.internal.ads.C4534x0 r24) {
        /*
            r0 = r21
            r1 = r22
            int r2 = r21.t()
            long r3 = r21.K()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r23
            long r7 = (long) r7
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r8 = 0
            if (r7 == 0) goto L19
            return r8
        L19:
            r9 = 1
            long r5 = r5 & r9
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r6 = 1
            if (r5 != 0) goto L23
            r5 = r6
            goto L24
        L23:
            r5 = r8
        L24:
            r7 = 12
            long r11 = r3 >> r7
            r13 = 8
            long r13 = r3 >> r13
            r15 = 4
            long r15 = r3 >> r15
            long r17 = r3 >> r6
            long r3 = r3 & r9
            r19 = 15
            long r6 = r15 & r19
            int r6 = (int) r6
            r7 = 7
            r15 = -1
            if (r6 > r7) goto L41
            int r7 = r1.f14057g
            int r7 = r7 + r15
            if (r6 != r7) goto Lb0
            goto L4a
        L41:
            r7 = 10
            if (r6 > r7) goto Lb0
            int r6 = r1.f14057g
            r7 = 2
            if (r6 != r7) goto Lb0
        L4a:
            r6 = 7
            long r6 = r17 & r6
            int r6 = (int) r6
            if (r6 != 0) goto L52
            goto L56
        L52:
            int r7 = r1.f14059i
            if (r6 != r7) goto Lb0
        L56:
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto Lb0
            r3 = r24
            boolean r3 = d(r0, r1, r5, r3)
            if (r3 == 0) goto Lb0
            long r3 = r11 & r19
            int r3 = (int) r3
            int r3 = a(r0, r3)
            if (r3 == r15) goto Lb0
            int r4 = r1.f14052b
            if (r3 > r4) goto Lb0
            long r3 = r13 & r19
            int r5 = r1.f14055e
            int r3 = (int) r3
            if (r3 != 0) goto L77
            goto L9b
        L77:
            r4 = 11
            if (r3 > r4) goto L80
            int r1 = r1.f14056f
            if (r3 == r1) goto L9b
            goto Lb0
        L80:
            r1 = 12
            if (r3 != r1) goto L8d
            int r1 = r21.C()
            int r1 = r1 * 1000
            if (r1 != r5) goto Lb0
            goto L9b
        L8d:
            r1 = 14
            if (r3 > r1) goto Lb0
            int r4 = r21.G()
            if (r3 != r1) goto L99
            int r4 = r4 * 10
        L99:
            if (r4 != r5) goto Lb0
        L9b:
            int r1 = r21.C()
            int r3 = r21.t()
            byte[] r0 = r21.n()
            int r3 = r3 + r15
            int r0 = com.google.android.gms.internal.ads.AbstractC2301cW.y(r0, r2, r3, r8)
            if (r1 != r0) goto Lb0
            r0 = 1
            return r0
        Lb0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC4643y0.c(com.google.android.gms.internal.ads.UQ, com.google.android.gms.internal.ads.C0, int, com.google.android.gms.internal.ads.x0):boolean");
    }

    private static boolean d(UQ uq, C0 c02, boolean z7, C4534x0 c4534x0) {
        try {
            long N7 = uq.N();
            if (!z7) {
                N7 *= c02.f14052b;
            }
            c4534x0.f27706a = N7;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
