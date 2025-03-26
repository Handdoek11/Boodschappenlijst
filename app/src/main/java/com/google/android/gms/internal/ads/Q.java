package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f18329a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f18330b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f18331c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f18332d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f18333e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f18334f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f18335g = 0;

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f18329a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b8 = bArr[4];
            return f((b8 & 192) >> 6, b8 & 63);
        }
        int i8 = bArr[2] & 7;
        int i9 = ((bArr[3] & 255) | (i8 << 8)) + 1;
        return i9 + i9;
    }

    public static D c(UQ uq, String str, String str2, C4785zG0 c4785zG0) {
        C4144tQ c4144tQ = new C4144tQ();
        c4144tQ.j(uq);
        int i8 = f18330b[c4144tQ.d(2)];
        c4144tQ.n(8);
        int i9 = f18332d[c4144tQ.d(3)];
        if (c4144tQ.d(1) != 0) {
            i9++;
        }
        int i10 = f18333e[c4144tQ.d(5)] * 1000;
        c4144tQ.f();
        uq.l(c4144tQ.b());
        C2723gJ0 c2723gJ0 = new C2723gJ0();
        c2723gJ0.m(str);
        c2723gJ0.B("audio/ac3");
        c2723gJ0.r0(i9);
        c2723gJ0.C(i8);
        c2723gJ0.f(c4785zG0);
        c2723gJ0.q(str2);
        c2723gJ0.q0(i10);
        c2723gJ0.v(i10);
        return c2723gJ0.H();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.D d(com.google.android.gms.internal.ads.UQ r7, java.lang.String r8, java.lang.String r9, com.google.android.gms.internal.ads.C4785zG0 r10) {
        /*
            com.google.android.gms.internal.ads.tQ r0 = new com.google.android.gms.internal.ads.tQ
            r0.<init>()
            r0.j(r7)
            r1 = 13
            int r1 = r0.d(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.n(r2)
            r3 = 2
            int r3 = r0.d(r3)
            int[] r4 = com.google.android.gms.internal.ads.Q.f18330b
            r3 = r4[r3]
            r4 = 10
            r0.n(r4)
            int[] r4 = com.google.android.gms.internal.ads.Q.f18332d
            int r5 = r0.d(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.d(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.n(r2)
            r2 = 4
            int r2 = r0.d(r2)
            r0.n(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.n(r2)
            int r2 = r0.d(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.n(r5)
        L4f:
            int r2 = r0.a()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.n(r6)
            int r2 = r0.d(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.f()
            int r0 = r0.b()
            r7.l(r0)
            com.google.android.gms.internal.ads.gJ0 r7 = new com.google.android.gms.internal.ads.gJ0
            r7.<init>()
            r7.m(r8)
            r7.B(r2)
            r7.r0(r4)
            r7.C(r3)
            r7.f(r10)
            r7.q(r9)
            r7.v(r1)
            com.google.android.gms.internal.ads.D r7 = r7.H()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Q.d(com.google.android.gms.internal.ads.UQ, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zG0):com.google.android.gms.internal.ads.D");
    }

    public static O e(C4144tQ c4144tQ) {
        int i8;
        int i9;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int c8 = c4144tQ.c();
        c4144tQ.n(40);
        int d8 = c4144tQ.d(5);
        c4144tQ.l(c8);
        int i19 = -1;
        if (d8 > 10) {
            c4144tQ.n(16);
            int d9 = c4144tQ.d(2);
            if (d9 == 0) {
                i19 = 0;
            } else if (d9 == 1) {
                i19 = 1;
            } else if (d9 == 2) {
                i19 = 2;
            }
            c4144tQ.n(3);
            int d10 = c4144tQ.d(11) + 1;
            int d11 = c4144tQ.d(2);
            if (d11 == 3) {
                i15 = f18331c[c4144tQ.d(2)];
                i16 = 6;
                i14 = 3;
            } else {
                int d12 = c4144tQ.d(2);
                int i20 = f18329a[d12];
                i14 = d12;
                i15 = f18330b[d11];
                i16 = i20;
            }
            int i21 = d10 + d10;
            int i22 = (i21 * i15) / (i16 * 32);
            int d13 = c4144tQ.d(3);
            boolean p8 = c4144tQ.p();
            i8 = f18332d[d13] + (p8 ? 1 : 0);
            c4144tQ.n(10);
            if (c4144tQ.p()) {
                c4144tQ.n(8);
            }
            if (d13 == 0) {
                c4144tQ.n(5);
                if (c4144tQ.p()) {
                    c4144tQ.n(8);
                }
                i17 = 0;
                d13 = 0;
            } else {
                i17 = d13;
            }
            if (i19 == 1) {
                if (c4144tQ.p()) {
                    c4144tQ.n(16);
                }
                i18 = 1;
            } else {
                i18 = i19;
            }
            if (c4144tQ.p()) {
                if (i17 > 2) {
                    c4144tQ.n(2);
                }
                if ((i17 & 1) != 0 && i17 > 2) {
                    c4144tQ.n(6);
                }
                if ((i17 & 4) != 0) {
                    c4144tQ.n(6);
                }
                if (p8 && c4144tQ.p()) {
                    c4144tQ.n(5);
                }
                if (i18 == 0) {
                    if (c4144tQ.p()) {
                        c4144tQ.n(6);
                    }
                    if (i17 == 0 && c4144tQ.p()) {
                        c4144tQ.n(6);
                    }
                    if (c4144tQ.p()) {
                        c4144tQ.n(6);
                    }
                    int d14 = c4144tQ.d(2);
                    if (d14 == 1) {
                        c4144tQ.n(5);
                    } else if (d14 == 2) {
                        c4144tQ.n(12);
                    } else if (d14 == 3) {
                        int d15 = c4144tQ.d(5);
                        if (c4144tQ.p()) {
                            c4144tQ.n(5);
                            if (c4144tQ.p()) {
                                c4144tQ.n(4);
                            }
                            if (c4144tQ.p()) {
                                c4144tQ.n(4);
                            }
                            if (c4144tQ.p()) {
                                c4144tQ.n(4);
                            }
                            if (c4144tQ.p()) {
                                c4144tQ.n(4);
                            }
                            if (c4144tQ.p()) {
                                c4144tQ.n(4);
                            }
                            if (c4144tQ.p()) {
                                c4144tQ.n(4);
                            }
                            if (c4144tQ.p()) {
                                c4144tQ.n(4);
                            }
                            if (c4144tQ.p()) {
                                if (c4144tQ.p()) {
                                    c4144tQ.n(4);
                                }
                                if (c4144tQ.p()) {
                                    c4144tQ.n(4);
                                }
                            }
                        }
                        if (c4144tQ.p()) {
                            c4144tQ.n(5);
                            if (c4144tQ.p()) {
                                c4144tQ.n(7);
                                if (c4144tQ.p()) {
                                    c4144tQ.n(8);
                                }
                            }
                        }
                        c4144tQ.n((d15 + 2) * 8);
                        c4144tQ.f();
                    }
                    if (i17 < 2) {
                        if (c4144tQ.p()) {
                            c4144tQ.n(14);
                        }
                        if (d13 == 0 && c4144tQ.p()) {
                            c4144tQ.n(14);
                        }
                    }
                    if (!c4144tQ.p()) {
                        i18 = 0;
                    } else if (i14 == 0) {
                        c4144tQ.n(5);
                        i18 = 0;
                        i14 = 0;
                    } else {
                        for (int i23 = 0; i23 < i16; i23++) {
                            if (c4144tQ.p()) {
                                c4144tQ.n(5);
                            }
                        }
                        i18 = 0;
                    }
                }
            }
            if (c4144tQ.p()) {
                c4144tQ.n(5);
                if (i17 == 2) {
                    c4144tQ.n(4);
                    i17 = 2;
                }
                if (i17 >= 6) {
                    c4144tQ.n(2);
                }
                if (c4144tQ.p()) {
                    c4144tQ.n(8);
                }
                if (i17 == 0 && c4144tQ.p()) {
                    c4144tQ.n(8);
                }
                if (d11 < 3) {
                    c4144tQ.m();
                }
            }
            if (i18 == 0 && i14 != 3) {
                c4144tQ.m();
            }
            if (i18 == 2 && (i14 == 3 || c4144tQ.p())) {
                c4144tQ.n(6);
            }
            str = (c4144tQ.p() && c4144tQ.d(6) == 1 && c4144tQ.d(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i9 = i19;
            i11 = i21;
            i12 = i15;
            i13 = i16 * 256;
            i10 = i22;
        } else {
            c4144tQ.n(32);
            int d16 = c4144tQ.d(2);
            String str2 = d16 == 3 ? null : "audio/ac3";
            int d17 = c4144tQ.d(6);
            int i24 = f18333e[d17 / 2] * 1000;
            int f8 = f(d16, d17);
            c4144tQ.n(8);
            int d18 = c4144tQ.d(3);
            if ((d18 & 1) != 0 && d18 != 1) {
                c4144tQ.n(2);
            }
            if ((d18 & 4) != 0) {
                c4144tQ.n(2);
            }
            if (d18 == 2) {
                c4144tQ.n(2);
            }
            int i25 = d16 < 3 ? f18330b[d16] : -1;
            i8 = f18332d[d18] + (c4144tQ.p() ? 1 : 0);
            i9 = -1;
            str = str2;
            i10 = i24;
            i11 = f8;
            i12 = i25;
            i13 = 1536;
        }
        return new O(str, i9, i8, i12, i11, i13, i10, null);
    }

    private static int f(int i8, int i9) {
        int i10;
        if (i8 < 0 || i8 >= 3 || i9 < 0 || (i10 = i9 >> 1) >= 19) {
            return -1;
        }
        int i11 = f18330b[i8];
        if (i11 == 44100) {
            int i12 = f18334f[i10] + (i9 & 1);
            return i12 + i12;
        }
        int i13 = f18333e[i10];
        return i11 == 32000 ? i13 * 6 : i13 * 4;
    }
}
