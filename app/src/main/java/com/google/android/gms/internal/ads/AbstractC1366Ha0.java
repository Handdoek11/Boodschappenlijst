package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ha0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1366Ha0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f15750a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f15751b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f15752c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int[] f15753d = new int[10];

    public static int a(byte[] bArr, int i8, int i9, boolean[] zArr) {
        int i10 = i9 - i8;
        AbstractC3796qC.f(i10 >= 0);
        if (i10 == 0) {
            return i9;
        }
        if (zArr[0]) {
            h(zArr);
            return i8 - 3;
        }
        if (i10 > 1 && zArr[1] && bArr[i8] == 1) {
            h(zArr);
            return i8 - 2;
        }
        if (i10 > 2 && zArr[2] && bArr[i8] == 0 && bArr[i8 + 1] == 1) {
            h(zArr);
            return i8 - 1;
        }
        int i11 = i9 - 1;
        int i12 = i8 + 2;
        while (i12 < i11) {
            byte b8 = bArr[i12];
            if ((b8 & 254) == 0) {
                int i13 = i12 - 2;
                if (bArr[i13] == 0 && bArr[i12 - 1] == 0 && b8 == 1) {
                    h(zArr);
                    return i13;
                }
                i12 = i13;
            }
            i12 += 3;
        }
        zArr[0] = i10 <= 2 ? !(i10 != 2 ? !(zArr[1] && bArr[i11] == 1) : !(zArr[2] && bArr[i9 + (-2)] == 0 && bArr[i11] == 1)) : bArr[i9 + (-3)] == 0 && bArr[i9 + (-2)] == 0 && bArr[i11] == 1;
        zArr[1] = i10 <= 1 ? zArr[2] && bArr[i11] == 0 : bArr[i9 + (-2)] == 0 && bArr[i11] == 0;
        zArr[2] = bArr[i11] == 0;
        return i9;
    }

    public static int b(byte[] bArr, int i8) {
        int i9;
        synchronized (f15752c) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i8) {
                while (true) {
                    try {
                        if (i10 >= i8 - 2) {
                            i10 = i8;
                            break;
                        }
                        int i12 = i10 + 1;
                        if (bArr[i10] == 0 && bArr[i12] == 0 && bArr[i10 + 2] == 3) {
                            break;
                        }
                        i10 = i12;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i10 < i8) {
                    int[] iArr = f15753d;
                    int length = iArr.length;
                    if (length <= i11) {
                        f15753d = Arrays.copyOf(iArr, length + length);
                    }
                    f15753d[i11] = i10;
                    i10 += 3;
                    i11++;
                }
            }
            i9 = i8 - i11;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = f15753d[i15] - i13;
                System.arraycopy(bArr, i13, bArr, i14, i16);
                int i17 = i14 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i14 = i17 + 2;
                bArr[i18] = 0;
                i13 += i16 + 3;
            }
            System.arraycopy(bArr, i13, bArr, i14, i9 - i14);
        }
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.C70 c(byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.C2594f90 r35) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1366Ha0.c(byte[], int, int, com.google.android.gms.internal.ads.f90):com.google.android.gms.internal.ads.C70");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x05de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.C2594f90 d(byte[] r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 2125
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1366Ha0.d(byte[], int, int):com.google.android.gms.internal.ads.f90");
    }

    public static G90 e(byte[] bArr, int i8, int i9) {
        C2961ib0 c2961ib0 = new C2961ib0(bArr, 4, i9);
        int c8 = c2961ib0.c();
        int c9 = c2961ib0.c();
        c2961ib0.e();
        return new G90(c8, c9, c2961ib0.h());
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0229 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0167 A[PHI: r2
  0x0167: PHI (r2v26 int) = (r2v4 int), (r2v3 int) binds: [B:86:0x016c, B:82:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016a A[PHI: r2
  0x016a: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v27 int) binds: [B:72:0x014f, B:74:0x0153, B:76:0x0157, B:78:0x015b, B:80:0x015f, B:83:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.C2850ha0 f(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1366Ha0.f(byte[], int, int):com.google.android.gms.internal.ads.ha0");
    }

    public static String g(List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            byte[] bArr = (byte[]) list.get(i8);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                C3843qh0 c3843qh0 = new C3843qh0();
                int i9 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i9 >= length2) {
                        break;
                    }
                    int a8 = a(bArr, i9, length2, zArr);
                    if (a8 != length2) {
                        c3843qh0.g(Integer.valueOf(a8));
                    }
                    i9 = a8 + 3;
                }
                AbstractC4169th0 j8 = c3843qh0.j();
                for (int i10 = 0; i10 < j8.size(); i10++) {
                    if (((Integer) j8.get(i10)).intValue() + 3 < length) {
                        C2961ib0 c2961ib0 = new C2961ib0(bArr, ((Integer) j8.get(i10)).intValue() + 3, length);
                        C4543x40 l8 = l(c2961ib0);
                        if (l8.f27737a == 33 && l8.f27738b == 0) {
                            c2961ib0.f(4);
                            int a9 = c2961ib0.a(3);
                            c2961ib0.e();
                            Y40 m8 = m(c2961ib0, true, a9, null);
                            return AbstractC4015sD.d(m8.f20202a, m8.f20203b, m8.f20204c, m8.f20205d, m8.f20206e, m8.f20207f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void h(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean i(byte b8) {
        if (((b8 & 96) >> 5) != 0) {
            return true;
        }
        int i8 = b8 & 31;
        return (i8 == 1 || i8 == 9 || i8 == 14) ? false : true;
    }

    private static int j(int i8, int i9, int i10, int i11) {
        return i8 - ((i9 == 1 ? 2 : 1) * (i10 + i11));
    }

    private static int k(int i8, int i9, int i10, int i11) {
        int i12 = 2;
        if (i9 != 1 && i9 != 2) {
            i12 = 1;
        }
        return i8 - (i12 * (i10 + i11));
    }

    private static C4543x40 l(C2961ib0 c2961ib0) {
        c2961ib0.e();
        return new C4543x40(c2961ib0.a(6), c2961ib0.a(6), c2961ib0.a(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.Y40 m(com.google.android.gms.internal.ads.C2961ib0 r18, boolean r19, int r20, com.google.android.gms.internal.ads.Y40 r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L41
            r2 = 2
            int r2 = r0.a(r2)
            boolean r7 = r18.h()
            r8 = 5
            int r8 = r0.a(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r18.h()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.a(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
        L3b:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L41:
            if (r2 == 0) goto L4f
            int r3 = r2.f20202a
            boolean r7 = r2.f20203b
            int r8 = r2.f20204c
            int r10 = r2.f20205d
            int[] r4 = r2.f20206e
            r12 = r3
            goto L3b
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.a(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r18.h()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r18.h()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.f(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.f(r5)
        L79:
            com.google.android.gms.internal.ads.Y40 r0 = new com.google.android.gms.internal.ads.Y40
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1366Ha0.m(com.google.android.gms.internal.ads.ib0, boolean, int, com.google.android.gms.internal.ads.Y40):com.google.android.gms.internal.ads.Y40");
    }

    private static void n(C2961ib0 c2961ib0) {
        int c8 = c2961ib0.c() + 1;
        c2961ib0.f(8);
        for (int i8 = 0; i8 < c8; i8++) {
            c2961ib0.c();
            c2961ib0.c();
            c2961ib0.e();
        }
        c2961ib0.f(20);
    }
}
