package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class M5 {
    public static J5 a(C4144tQ c4144tQ) {
        int i8;
        int i9;
        char c8;
        int i10;
        int i11;
        char c9;
        int d8 = c4144tQ.d(8);
        int i12 = 5;
        int d9 = c4144tQ.d(5);
        if (d9 != 31) {
            switch (d9) {
                case 0:
                    i8 = 96000;
                    break;
                case 1:
                    i8 = 88200;
                    break;
                case 2:
                    i8 = 64000;
                    break;
                case 3:
                    i8 = 48000;
                    break;
                case 4:
                    i8 = 44100;
                    break;
                case 5:
                    i8 = 32000;
                    break;
                case 6:
                    i8 = 24000;
                    break;
                case 7:
                    i8 = 22050;
                    break;
                case 8:
                    i8 = 16000;
                    break;
                case 9:
                    i8 = 12000;
                    break;
                case 10:
                    i8 = 11025;
                    break;
                case 11:
                    i8 = 8000;
                    break;
                case 12:
                    i8 = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw zzbc.c("Unsupported sampling rate index " + d9);
                case 15:
                    i8 = 57600;
                    break;
                case 16:
                    i8 = 51200;
                    break;
                case 17:
                    i8 = 40000;
                    break;
                case 18:
                    i8 = 38400;
                    break;
                case 19:
                    i8 = 34150;
                    break;
                case 20:
                    i8 = 28800;
                    break;
                case C1445Je.zzm /* 21 */:
                    i8 = 25600;
                    break;
                case 22:
                    i8 = 20000;
                    break;
                case 23:
                    i8 = 19200;
                    break;
                case 24:
                    i8 = 17075;
                    break;
                case 25:
                    i8 = 14400;
                    break;
                case 26:
                    i8 = 12800;
                    break;
                case 27:
                    i8 = 9600;
                    break;
            }
        } else {
            i8 = c4144tQ.d(24);
        }
        int d10 = c4144tQ.d(3);
        int i13 = 1;
        if (d10 == 0) {
            i9 = 768;
        } else if (d10 == 1) {
            i9 = 1024;
        } else if (d10 == 2 || d10 == 3) {
            i9 = 2048;
        } else {
            if (d10 != 4) {
                throw zzbc.c("Unsupported coreSbrFrameLengthIndex " + d10);
            }
            i9 = 4096;
        }
        if (d10 == 0 || d10 == 1) {
            c8 = 0;
        } else if (d10 == 2) {
            c8 = 2;
        } else if (d10 == 3) {
            c8 = 3;
        } else {
            if (d10 != 4) {
                throw zzbc.c("Unsupported coreSbrFrameLengthIndex " + d10);
            }
            c8 = 1;
        }
        c4144tQ.n(2);
        e(c4144tQ);
        int d11 = c4144tQ.d(5);
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = 16;
            if (i14 < d11 + 1) {
                int d12 = c4144tQ.d(3);
                i15 += c(c4144tQ, 5, 8, 16) + 1;
                if ((d12 == 0 || d12 == 2) && c4144tQ.p()) {
                    e(c4144tQ);
                }
                i14++;
            } else {
                int c10 = c(c4144tQ, 4, 8, 16) + 1;
                c4144tQ.m();
                int i17 = 0;
                while (true) {
                    double d13 = 2.0d;
                    if (i17 >= c10) {
                        int i18 = d8;
                        byte[] bArr = null;
                        if (c4144tQ.p()) {
                            int c11 = c(c4144tQ, 2, 4, 8) + 1;
                            for (int i19 = 0; i19 < c11; i19++) {
                                int c12 = c(c4144tQ, 4, 8, 16);
                                int c13 = c(c4144tQ, 4, 8, 16);
                                if (c12 == 7) {
                                    int d14 = c4144tQ.d(4) + 1;
                                    c4144tQ.n(4);
                                    byte[] bArr2 = new byte[d14];
                                    for (int i20 = 0; i20 < d14; i20++) {
                                        bArr2[i20] = (byte) c4144tQ.d(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    c4144tQ.n(c13 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (i8) {
                            case 14700:
                            case 16000:
                                d13 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d13 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d13 = 1.0d;
                                break;
                            default:
                                throw zzbc.c("Unsupported sampling rate " + i8);
                        }
                        return new J5(i18, (int) (i8 * d13), (int) (i9 * d13), bArr3, null);
                    }
                    int d15 = c4144tQ.d(2);
                    if (d15 == 0) {
                        i10 = d8;
                        f(c4144tQ);
                        if (c8 > 0) {
                            d(c4144tQ);
                        }
                    } else if (d15 != i13) {
                        if (d15 == 3) {
                            c(c4144tQ, 4, 8, i16);
                            int c14 = c(c4144tQ, 4, 8, i16);
                            if (c4144tQ.p()) {
                                c(c4144tQ, 8, i16, 0);
                            }
                            c4144tQ.m();
                            if (c14 > 0) {
                                c4144tQ.n(c14 * 8);
                            }
                        }
                        i10 = d8;
                    } else {
                        if (f(c4144tQ)) {
                            c4144tQ.m();
                        }
                        if (c8 > 0) {
                            d(c4144tQ);
                            i11 = c4144tQ.d(2);
                            c9 = c8;
                        } else {
                            i11 = 0;
                            c9 = 0;
                        }
                        if (i11 > 0) {
                            c4144tQ.n(6);
                            int d16 = c4144tQ.d(2);
                            c4144tQ.n(4);
                            if (c4144tQ.p()) {
                                c4144tQ.n(i12);
                            }
                            if (i11 == 2 || i11 == 3) {
                                c4144tQ.n(6);
                            }
                            if (d16 == 2) {
                                c4144tQ.m();
                            }
                        }
                        i10 = d8;
                        int floor = ((int) Math.floor(Math.log(i15 - 1) / Math.log(2.0d))) + 1;
                        int d17 = c4144tQ.d(2);
                        if (d17 > 0 && c4144tQ.p()) {
                            c4144tQ.n(floor);
                        }
                        if (c4144tQ.p()) {
                            c4144tQ.n(floor);
                        }
                        if (c9 == 0 && d17 == 0) {
                            c4144tQ.m();
                        }
                    }
                    i17++;
                    d8 = i10;
                    i12 = 5;
                    i13 = 1;
                    i16 = 16;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(com.google.android.gms.internal.ads.C4144tQ r17, com.google.android.gms.internal.ads.I5 r18) {
        /*
            r0 = r17
            r1 = r18
            r17.b()
            r2 = 3
            r3 = 8
            int r2 = c(r0, r2, r3, r3)
            r1.f15864a = r2
            r4 = 0
            r5 = -1
            if (r2 == r5) goto Lc3
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L26
            r6 = r9
            goto L27
        L26:
            r6 = r4
        L27:
            com.google.android.gms.internal.ads.AbstractC3796qC.d(r6)
            r10 = 3
            r12 = 255(0xff, double:1.26E-321)
            long r14 = com.google.android.gms.internal.ads.AbstractC1768Si0.a(r10, r12)
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            com.google.android.gms.internal.ads.AbstractC1768Si0.a(r14, r5)
            int r5 = r17.a()
            r14 = -1
            if (r5 >= r2) goto L44
        L42:
            r5 = r14
            goto L6a
        L44:
            long r5 = r0.e(r2)
            int r16 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r16 != 0) goto L6a
            int r5 = r17.a()
            if (r5 >= r3) goto L53
            goto L42
        L53:
            long r5 = r0.e(r3)
            long r10 = r10 + r5
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 != 0) goto L69
            int r3 = r17.a()
            if (r3 >= r7) goto L63
            goto L42
        L63:
            long r5 = r0.e(r7)
            long r5 = r5 + r10
            goto L6a
        L69:
            r5 = r10
        L6a:
            r1.f15865b = r5
            int r3 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r3 != 0) goto L71
            return r4
        L71:
            r10 = 16
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 > 0) goto Lad
            r10 = 0
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 != 0) goto L9e
            int r3 = r1.f15864a
            r5 = 0
            if (r3 == r9) goto L97
            if (r3 == r2) goto L90
            r2 = 17
            if (r3 == r2) goto L89
            goto L9e
        L89:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.a(r0, r5)
            throw r0
        L90:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.a(r0, r5)
            throw r0
        L97:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.a(r0, r5)
            throw r0
        L9e:
            r2 = 11
            r3 = 24
            int r0 = c(r0, r2, r3, r3)
            r1.f15866c = r0
            r1 = -1
            if (r0 == r1) goto Lac
            return r9
        Lac:
            return r4
        Lad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Contains sub-stream with an invalid packet label "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.c(r0)
            throw r0
        Lc3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.M5.b(com.google.android.gms.internal.ads.tQ, com.google.android.gms.internal.ads.I5):boolean");
    }

    private static int c(C4144tQ c4144tQ, int i8, int i9, int i10) {
        AbstractC3796qC.d(Math.max(Math.max(i8, i9), i10) <= 31);
        int i11 = (1 << i8) - 1;
        int i12 = (1 << i9) - 1;
        AbstractC1698Qi0.a(AbstractC1698Qi0.a(i11, i12), 1 << i10);
        if (c4144tQ.a() < i8) {
            return -1;
        }
        int d8 = c4144tQ.d(i8);
        if (d8 != i11) {
            return d8;
        }
        if (c4144tQ.a() < i9) {
            return -1;
        }
        int d9 = c4144tQ.d(i9);
        int i13 = d8 + d9;
        if (d9 != i12) {
            return i13;
        }
        if (c4144tQ.a() < i10) {
            return -1;
        }
        return i13 + c4144tQ.d(i10);
    }

    private static void d(C4144tQ c4144tQ) {
        c4144tQ.n(3);
        c4144tQ.n(8);
        boolean p8 = c4144tQ.p();
        boolean p9 = c4144tQ.p();
        if (p8) {
            c4144tQ.n(5);
        }
        if (p9) {
            c4144tQ.n(6);
        }
    }

    private static void e(C4144tQ c4144tQ) {
        int d8;
        int d9 = c4144tQ.d(2);
        if (d9 == 0) {
            c4144tQ.n(6);
            return;
        }
        int c8 = c(c4144tQ, 5, 8, 16) + 1;
        if (d9 == 1) {
            c4144tQ.n(c8 * 7);
            return;
        }
        if (d9 == 2) {
            boolean p8 = c4144tQ.p();
            int i8 = true != p8 ? 5 : 1;
            int i9 = true == p8 ? 7 : 5;
            int i10 = true == p8 ? 8 : 6;
            int i11 = 0;
            while (i11 < c8) {
                if (c4144tQ.p()) {
                    c4144tQ.n(7);
                    d8 = 0;
                } else {
                    if (c4144tQ.d(2) == 3 && c4144tQ.d(i9) * i8 != 0) {
                        c4144tQ.m();
                    }
                    d8 = c4144tQ.d(i10) * i8;
                    if (d8 != 0 && d8 != 180) {
                        c4144tQ.m();
                    }
                    c4144tQ.m();
                }
                if (d8 != 0 && d8 != 180 && c4144tQ.p()) {
                    i11++;
                }
                i11++;
            }
        }
    }

    private static boolean f(C4144tQ c4144tQ) {
        c4144tQ.n(3);
        boolean p8 = c4144tQ.p();
        if (p8) {
            c4144tQ.n(13);
        }
        return p8;
    }
}
