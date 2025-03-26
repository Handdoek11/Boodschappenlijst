package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3995s3 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f26534a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f26535b = 0;

    static {
        int i8 = AbstractC2301cW.f21206a;
        f26534a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int a(int i8) {
        return (i8 >> 24) & 255;
    }

    public static C3503nb b(IY iy) {
        C2847hY c2847hY;
        C3064jZ c8 = iy.c(1751411826);
        C3064jZ c9 = iy.c(1801812339);
        C3064jZ c10 = iy.c(1768715124);
        if (c8 != null && c9 != null && c10 != null && i(c8.f23275b) == 1835299937) {
            UQ uq = c9.f23275b;
            uq.l(12);
            int w7 = uq.w();
            String[] strArr = new String[w7];
            for (int i8 = 0; i8 < w7; i8++) {
                int w8 = uq.w();
                uq.m(4);
                strArr[i8] = uq.b(w8 - 8, StandardCharsets.UTF_8);
            }
            UQ uq2 = c10.f23275b;
            uq2.l(8);
            ArrayList arrayList = new ArrayList();
            while (uq2.r() > 8) {
                int t7 = uq2.t() + uq2.w();
                int w9 = uq2.w() - 1;
                if (w9 < 0 || w9 >= w7) {
                    HL.f("BoxParsers", "Skipped metadata with unknown key index: " + w9);
                } else {
                    String str = strArr[w9];
                    while (true) {
                        int t8 = uq2.t();
                        if (t8 >= t7) {
                            c2847hY = null;
                            break;
                        }
                        int w10 = uq2.w();
                        if (uq2.w() == 1684108385) {
                            int w11 = uq2.w();
                            int w12 = uq2.w();
                            int i9 = w10 - 16;
                            byte[] bArr = new byte[i9];
                            uq2.h(bArr, 0, i9);
                            c2847hY = new C2847hY(str, bArr, w12, w11);
                            break;
                        }
                        uq2.l(t8 + w10);
                    }
                    if (c2847hY != null) {
                        arrayList.add(c2847hY);
                    }
                }
                uq2.l(t7);
            }
            if (!arrayList.isEmpty()) {
                return new C3503nb(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.C3503nb c(com.google.android.gms.internal.ads.C3064jZ r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC3995s3.c(com.google.android.gms.internal.ads.jZ):com.google.android.gms.internal.ads.nb");
    }

    public static C4323v30 d(UQ uq) {
        long J7;
        long J8;
        uq.l(8);
        if (a(uq.w()) == 0) {
            J7 = uq.K();
            J8 = uq.K();
        } else {
            J7 = uq.J();
            J8 = uq.J();
        }
        return new C4323v30(J7, J8, uq.K());
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02b7 A[ADDED_TO_REGION, LOOP:13: B:110:0x02b7->B:114:0x02c1, LOOP_START, PHI: r19
  0x02b7: PHI (r19v3 int) = (r19v2 int), (r19v4 int) binds: [B:109:0x02b5, B:114:0x02c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030a A[PHI: r1
  0x030a: PHI (r1v11 int) = (r1v10 int), (r1v14 int) binds: [B:116:0x02c9, B:129:0x0309] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b1 A[PHI: r9
  0x01b1: PHI (r9v5 int) = (r9v4 int), (r9v4 int), (r9v33 int), (r9v4 int) binds: [B:40:0x00f3, B:47:0x010f, B:64:0x01b0, B:46:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.N3 e(com.google.android.gms.internal.ads.K3 r39, com.google.android.gms.internal.ads.IY r40, com.google.android.gms.internal.ads.G0 r41) {
        /*
            Method dump skipped, instructions count: 1615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC3995s3.e(com.google.android.gms.internal.ads.K3, com.google.android.gms.internal.ads.IY, com.google.android.gms.internal.ads.G0):com.google.android.gms.internal.ads.N3");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0124, code lost:
    
        r6 = r1;
        r0 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0be1  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0be3  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0d75  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0d79  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0df9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List f(com.google.android.gms.internal.ads.IY r72, com.google.android.gms.internal.ads.G0 r73, long r74, com.google.android.gms.internal.ads.C4785zG0 r76, boolean r77, boolean r78, com.google.android.gms.internal.ads.InterfaceC1376Hf0 r79) {
        /*
            Method dump skipped, instructions count: 3587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC3995s3.f(com.google.android.gms.internal.ads.IY, com.google.android.gms.internal.ads.G0, long, com.google.android.gms.internal.ads.zG0, boolean, boolean, com.google.android.gms.internal.ads.Hf0):java.util.List");
    }

    public static void g(UQ uq) {
        int t7 = uq.t();
        uq.m(4);
        if (uq.w() != 1751411826) {
            t7 += 4;
        }
        uq.l(t7);
    }

    private static int h(UQ uq) {
        int C7 = uq.C();
        int i8 = C7 & ModuleDescriptor.MODULE_VERSION;
        while ((C7 & 128) == 128) {
            C7 = uq.C();
            i8 = (i8 << 7) | (C7 & ModuleDescriptor.MODULE_VERSION);
        }
        return i8;
    }

    private static int i(UQ uq) {
        uq.l(16);
        return uq.w();
    }

    private static Pair j(UQ uq, int i8, int i9) {
        Integer num;
        L3 l32;
        Pair create;
        int i10;
        int i11;
        byte[] bArr;
        int t7 = uq.t();
        while (t7 - i8 < i9) {
            uq.l(t7);
            int w7 = uq.w();
            AbstractC4316v0.b(w7 > 0, "childAtomSize must be positive");
            if (uq.w() == 1936289382) {
                int i12 = t7 + 8;
                int i13 = 0;
                int i14 = -1;
                String str = null;
                Integer num2 = null;
                while (i12 - t7 < w7) {
                    uq.l(i12);
                    int w8 = uq.w();
                    int w9 = uq.w();
                    if (w9 == 1718775137) {
                        num2 = Integer.valueOf(uq.w());
                    } else if (w9 == 1935894637) {
                        uq.m(4);
                        str = uq.b(4, StandardCharsets.UTF_8);
                    } else if (w9 == 1935894633) {
                        i14 = i12;
                        i13 = w8;
                    }
                    i12 += w8;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    AbstractC4316v0.b(num2 != null, "frma atom is mandatory");
                    AbstractC4316v0.b(i14 != -1, "schi atom is mandatory");
                    int i15 = i14 + 8;
                    while (true) {
                        if (i15 - i14 >= i13) {
                            num = num2;
                            l32 = null;
                            break;
                        }
                        uq.l(i15);
                        int w10 = uq.w();
                        if (uq.w() == 1952804451) {
                            int a8 = a(uq.w());
                            uq.m(1);
                            if (a8 == 0) {
                                uq.m(1);
                                i10 = 0;
                                i11 = 0;
                            } else {
                                int C7 = uq.C();
                                int i16 = (C7 & 240) >> 4;
                                i10 = C7 & 15;
                                i11 = i16;
                            }
                            boolean z7 = uq.C() == 1;
                            int C8 = uq.C();
                            byte[] bArr2 = new byte[16];
                            uq.h(bArr2, 0, 16);
                            if (z7 && C8 == 0) {
                                int C9 = uq.C();
                                byte[] bArr3 = new byte[C9];
                                uq.h(bArr3, 0, C9);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            l32 = new L3(z7, str, C8, bArr2, i11, i10, bArr);
                        } else {
                            i15 += w10;
                        }
                    }
                    AbstractC4316v0.b(l32 != null, "tenc atom is mandatory");
                    int i17 = AbstractC2301cW.f21206a;
                    create = Pair.create(num, l32);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            t7 += w7;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.Pz0 k(com.google.android.gms.internal.ads.UQ r15) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC3995s3.k(com.google.android.gms.internal.ads.UQ):com.google.android.gms.internal.ads.Pz0");
    }

    private static C3503nb l(UQ uq) {
        short e8 = uq.e();
        uq.m(2);
        String b8 = uq.b(e8, StandardCharsets.UTF_8);
        int max = Math.max(b8.lastIndexOf(43), b8.lastIndexOf(45));
        try {
            return new C3503nb(-9223372036854775807L, new R10(Float.parseFloat(b8.substring(0, max)), Float.parseFloat(b8.substring(max, b8.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static C2908i3 m(UQ uq, int i8) {
        uq.l(i8 + 12);
        uq.m(1);
        h(uq);
        uq.m(2);
        int C7 = uq.C();
        if ((C7 & 128) != 0) {
            uq.m(2);
        }
        if ((C7 & 64) != 0) {
            uq.m(uq.C());
        }
        if ((C7 & 32) != 0) {
            uq.m(2);
        }
        uq.m(1);
        h(uq);
        String d8 = AbstractC1650Pc.d(uq.C());
        if ("audio/mpeg".equals(d8) || "audio/vnd.dts".equals(d8) || "audio/vnd.dts.hd".equals(d8)) {
            return new C2908i3(d8, null, -1L, -1L);
        }
        uq.m(4);
        long K7 = uq.K();
        long K8 = uq.K();
        uq.m(1);
        int h8 = h(uq);
        byte[] bArr = new byte[h8];
        uq.h(bArr, 0, h8);
        return new C2908i3(d8, bArr, K8 <= 0 ? -1L : K8, K7 > 0 ? K7 : -1L);
    }

    private static ByteBuffer n() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:246:0x051b A[PHI: r1 r14 r23
  0x051b: PHI (r1v55 java.lang.String) = (r1v48 java.lang.String), (r1v56 java.lang.String), (r1v48 java.lang.String), (r1v48 java.lang.String) binds: [B:221:0x0485, B:223:0x0493, B:219:0x045b, B:218:0x0457] A[DONT_GENERATE, DONT_INLINE]
  0x051b: PHI (r14v7 int) = (r14v8 int), (r14v8 int), (r14v9 int), (r14v10 int) binds: [B:221:0x0485, B:223:0x0493, B:219:0x045b, B:218:0x0457] A[DONT_GENERATE, DONT_INLINE]
  0x051b: PHI (r23v2 com.google.android.gms.internal.ads.i3) = 
  (r23v1 com.google.android.gms.internal.ads.i3)
  (r23v3 com.google.android.gms.internal.ads.i3)
  (r23v1 com.google.android.gms.internal.ads.i3)
  (r23v1 com.google.android.gms.internal.ads.i3)
 binds: [B:221:0x0485, B:223:0x0493, B:219:0x045b, B:218:0x0457] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(com.google.android.gms.internal.ads.UQ r27, int r28, int r29, int r30, int r31, java.lang.String r32, boolean r33, com.google.android.gms.internal.ads.C4785zG0 r34, com.google.android.gms.internal.ads.C3451n3 r35, int r36) {
        /*
            Method dump skipped, instructions count: 1398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC3995s3.o(com.google.android.gms.internal.ads.UQ, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zG0, com.google.android.gms.internal.ads.n3, int):void");
    }
}
