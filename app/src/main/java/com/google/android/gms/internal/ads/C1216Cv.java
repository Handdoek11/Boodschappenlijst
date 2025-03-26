package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Cv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1216Cv {

    /* renamed from: a, reason: collision with root package name */
    private final int f14258a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14259b;

    /* renamed from: c, reason: collision with root package name */
    private final float f14260c;

    /* renamed from: d, reason: collision with root package name */
    private final float f14261d;

    /* renamed from: e, reason: collision with root package name */
    private final float f14262e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14263f;

    /* renamed from: g, reason: collision with root package name */
    private final int f14264g;

    /* renamed from: h, reason: collision with root package name */
    private final int f14265h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f14266i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f14267j;

    /* renamed from: k, reason: collision with root package name */
    private int f14268k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f14269l;

    /* renamed from: m, reason: collision with root package name */
    private int f14270m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f14271n;

    /* renamed from: o, reason: collision with root package name */
    private int f14272o;

    /* renamed from: p, reason: collision with root package name */
    private int f14273p;

    /* renamed from: q, reason: collision with root package name */
    private int f14274q;

    /* renamed from: r, reason: collision with root package name */
    private int f14275r;

    /* renamed from: s, reason: collision with root package name */
    private int f14276s;

    /* renamed from: t, reason: collision with root package name */
    private int f14277t;

    /* renamed from: u, reason: collision with root package name */
    private int f14278u;

    /* renamed from: v, reason: collision with root package name */
    private int f14279v;

    /* renamed from: w, reason: collision with root package name */
    private double f14280w;

    public C1216Cv(int i8, int i9, float f8, float f9, int i10) {
        this.f14258a = i8;
        this.f14259b = i9;
        this.f14260c = f8;
        this.f14261d = f9;
        this.f14262e = i8 / i10;
        this.f14263f = i8 / 400;
        int i11 = i8 / 65;
        this.f14264g = i11;
        int i12 = i11 + i11;
        this.f14265h = i12;
        this.f14266i = new short[i12];
        int i13 = i12 * i9;
        this.f14267j = new short[i13];
        this.f14269l = new short[i13];
        this.f14271n = new short[i13];
    }

    private final int g(short[] sArr, int i8, int i9, int i10) {
        int i11 = 1;
        int i12 = 255;
        int i13 = 0;
        int i14 = 0;
        while (i9 <= i10) {
            int i15 = 0;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f14259b * i8;
                i15 += Math.abs(sArr[i17 + i16] - sArr[(i17 + i9) + i16]);
            }
            int i18 = i15 * i13;
            int i19 = i11 * i9;
            if (i18 < i19) {
                i11 = i15;
            }
            if (i18 < i19) {
                i13 = i9;
            }
            int i20 = i15 * i12;
            int i21 = i14 * i9;
            if (i20 > i21) {
                i14 = i15;
            }
            if (i20 > i21) {
                i12 = i9;
            }
            i9++;
        }
        this.f14278u = i11 / i13;
        this.f14279v = i14 / i12;
        return i13;
    }

    private final void h(short[] sArr, int i8, int i9) {
        short[] l8 = l(this.f14269l, this.f14270m, i9);
        this.f14269l = l8;
        int i10 = this.f14270m;
        int i11 = this.f14259b;
        System.arraycopy(sArr, i8 * i11, l8, i10 * i11, i9 * i11);
        this.f14270m += i9;
    }

    private final void i(short[] sArr, int i8, int i9) {
        int i10;
        for (int i11 = 0; i11 < this.f14265h / i9; i11++) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = this.f14259b;
                i10 = i14 * i9;
                if (i12 < i10) {
                    i13 += sArr[(i14 * i8) + (i10 * i11) + i12];
                    i12++;
                }
            }
            this.f14266i[i11] = (short) (i13 / i10);
        }
    }

    private static void j(int i8, int i9, short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12) {
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = (i11 * i9) + i13;
            int i15 = (i12 * i9) + i13;
            int i16 = (i10 * i9) + i13;
            for (int i17 = 0; i17 < i8; i17++) {
                sArr[i16] = (short) (((sArr2[i14] * (i8 - i17)) + (sArr3[i15] * i17)) / i8);
                i16 += i9;
                i14 += i9;
                i15 += i9;
            }
        }
    }

    private final void k() {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j8;
        long j9;
        double d8 = this.f14260c / this.f14261d;
        int i15 = this.f14270m;
        int i16 = 0;
        int i17 = 1;
        if (d8 > 1.00001d || d8 < 0.99999d) {
            int i18 = this.f14268k;
            if (i18 >= this.f14265h) {
                int i19 = 0;
                while (true) {
                    int i20 = this.f14275r;
                    if (i20 > 0) {
                        int min = Math.min(this.f14265h, i20);
                        h(this.f14267j, i19, min);
                        this.f14275r -= min;
                        i19 += min;
                    } else {
                        short[] sArr = this.f14267j;
                        int i21 = this.f14258a;
                        int i22 = i21 > 4000 ? i21 / 4000 : i17;
                        if (this.f14259b == i17 && i22 == i17) {
                            i8 = g(sArr, i19, this.f14263f, this.f14264g);
                        } else {
                            i(sArr, i19, i22);
                            int g8 = g(this.f14266i, i16, this.f14263f / i22, this.f14264g / i22);
                            if (i22 != i17) {
                                int i23 = g8 * i22;
                                int i24 = i22 * 4;
                                int i25 = this.f14263f;
                                int i26 = i23 - i24;
                                if (i26 >= i25) {
                                    i25 = i26;
                                }
                                int i27 = i23 + i24;
                                int i28 = this.f14264g;
                                if (i27 > i28) {
                                    i27 = i28;
                                }
                                if (this.f14259b == i17) {
                                    i8 = g(sArr, i19, i25, i27);
                                } else {
                                    i(sArr, i19, i17);
                                    i8 = g(this.f14266i, i16, i25, i27);
                                }
                            } else {
                                i8 = g8;
                            }
                        }
                        int i29 = this.f14278u;
                        int i30 = (i29 == 0 || (i11 = this.f14276s) == 0 || this.f14279v > i29 * 3 || i29 + i29 <= this.f14277t * 3) ? i8 : i11;
                        int i31 = i19 + i30;
                        this.f14277t = i29;
                        this.f14276s = i8;
                        double d9 = i30;
                        if (d8 > 1.0d) {
                            short[] sArr2 = this.f14267j;
                            double d10 = (-1.0d) + d8;
                            if (d8 >= 2.0d) {
                                double d11 = (d9 / d10) + this.f14280w;
                                int round = (int) Math.round(d11);
                                this.f14280w = d11 - round;
                                i10 = round;
                            } else {
                                double d12 = ((d9 * (2.0d - d8)) / d10) + this.f14280w;
                                int round2 = (int) Math.round(d12);
                                this.f14275r = round2;
                                this.f14280w = d12 - round2;
                                i10 = i30;
                            }
                            short[] l8 = l(this.f14269l, this.f14270m, i10);
                            this.f14269l = l8;
                            j(i10, this.f14259b, l8, this.f14270m, sArr2, i19, sArr2, i31);
                            this.f14270m += i10;
                            i19 += i30 + i10;
                        } else {
                            int i32 = i30;
                            short[] sArr3 = this.f14267j;
                            double d13 = 1.0d - d8;
                            if (d8 < 0.5d) {
                                double d14 = ((d9 * d8) / d13) + this.f14280w;
                                int round3 = (int) Math.round(d14);
                                this.f14280w = d14 - round3;
                                i9 = round3;
                            } else {
                                double d15 = ((d9 * ((d8 + d8) - 1.0d)) / d13) + this.f14280w;
                                int round4 = (int) Math.round(d15);
                                this.f14275r = round4;
                                this.f14280w = d15 - round4;
                                i9 = i32;
                            }
                            int i33 = i32 + i9;
                            short[] l9 = l(this.f14269l, this.f14270m, i33);
                            this.f14269l = l9;
                            int i34 = this.f14259b;
                            System.arraycopy(sArr3, i19 * i34, l9, this.f14270m * i34, i34 * i32);
                            j(i9, this.f14259b, this.f14269l, this.f14270m + i32, sArr3, i31, sArr3, i19);
                            this.f14270m += i33;
                            i19 += i9;
                        }
                    }
                    if (this.f14265h + i19 > i18) {
                        break;
                    }
                    i16 = 0;
                    i17 = 1;
                }
                int i35 = this.f14268k - i19;
                short[] sArr4 = this.f14267j;
                int i36 = this.f14259b;
                System.arraycopy(sArr4, i19 * i36, sArr4, 0, i36 * i35);
                this.f14268k = i35;
            }
        } else {
            h(this.f14267j, 0, this.f14268k);
            this.f14268k = 0;
        }
        float f8 = this.f14262e * this.f14261d;
        if (f8 == 1.0f || this.f14270m == i15) {
            return;
        }
        int i37 = this.f14258a;
        float f9 = i37 / f8;
        long j10 = i37;
        long j11 = (long) f9;
        while (j11 != 0 && j10 != 0 && j11 % 2 == 0 && j10 % 2 == 0) {
            j11 /= 2;
            j10 /= 2;
        }
        int i38 = this.f14270m - i15;
        short[] l10 = l(this.f14271n, this.f14272o, i38);
        this.f14271n = l10;
        short[] sArr5 = this.f14269l;
        int i39 = this.f14259b;
        System.arraycopy(sArr5, i15 * i39, l10, this.f14272o * i39, i39 * i38);
        this.f14270m = i15;
        this.f14272o += i38;
        int i40 = 0;
        while (true) {
            i12 = this.f14272o;
            i13 = i12 - 1;
            if (i40 >= i13) {
                break;
            }
            while (true) {
                i14 = this.f14273p + 1;
                j8 = i14;
                long j12 = j8 * j11;
                j9 = this.f14274q;
                if (j12 <= j9 * j10) {
                    break;
                }
                this.f14269l = l(this.f14269l, this.f14270m, 1);
                int i41 = 0;
                while (true) {
                    int i42 = this.f14259b;
                    if (i41 < i42) {
                        short[] sArr6 = this.f14269l;
                        int i43 = this.f14270m * i42;
                        short[] sArr7 = this.f14271n;
                        int i44 = (i40 * i42) + i41;
                        short s8 = sArr7[i44];
                        short s9 = sArr7[i44 + i42];
                        long j13 = this.f14274q * j10;
                        long j14 = j10;
                        long j15 = (r13 + 1) * j11;
                        long j16 = j15 - (this.f14273p * j11);
                        long j17 = j15 - j13;
                        sArr6[i43 + i41] = (short) (((j17 * s8) + ((j16 - j17) * s9)) / j16);
                        i41++;
                        j10 = j14;
                        j11 = j11;
                    }
                }
                this.f14274q++;
                this.f14270m++;
                j10 = j10;
                j11 = j11;
            }
            long j18 = j10;
            long j19 = j11;
            this.f14273p = i14;
            if (j8 == j18) {
                this.f14273p = 0;
                AbstractC3796qC.f(j9 == j19);
                this.f14274q = 0;
            }
            i40++;
            j10 = j18;
            j11 = j19;
        }
        if (i13 != 0) {
            short[] sArr8 = this.f14271n;
            int i45 = this.f14259b;
            System.arraycopy(sArr8, i13 * i45, sArr8, 0, (i12 - i13) * i45);
            this.f14272o -= i13;
        }
    }

    private final short[] l(short[] sArr, int i8, int i9) {
        int length = sArr.length;
        int i10 = this.f14259b;
        int i11 = length / i10;
        return i8 + i9 <= i11 ? sArr : Arrays.copyOf(sArr, (((i11 * 3) / 2) + i9) * i10);
    }

    public final int a() {
        int i8 = this.f14270m * this.f14259b;
        return i8 + i8;
    }

    public final int b() {
        int i8 = this.f14268k * this.f14259b;
        return i8 + i8;
    }

    public final void c() {
        this.f14268k = 0;
        this.f14270m = 0;
        this.f14272o = 0;
        this.f14273p = 0;
        this.f14274q = 0;
        this.f14275r = 0;
        this.f14276s = 0;
        this.f14277t = 0;
        this.f14278u = 0;
        this.f14279v = 0;
        this.f14280w = 0.0d;
    }

    public final void d(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f14259b, this.f14270m);
        shortBuffer.put(this.f14269l, 0, this.f14259b * min);
        int i8 = this.f14270m - min;
        this.f14270m = i8;
        int i9 = this.f14259b;
        short[] sArr = this.f14269l;
        System.arraycopy(sArr, min * i9, sArr, 0, i8 * i9);
    }

    public final void e() {
        int i8;
        int i9 = this.f14268k;
        int i10 = this.f14275r;
        int i11 = this.f14270m;
        float f8 = this.f14260c;
        float f9 = this.f14261d;
        int i12 = i11 + ((int) (((((((i9 - i10) / (f8 / f9)) + i10) + this.f14280w) + this.f14272o) / (this.f14262e * f9)) + 0.5d));
        this.f14280w = 0.0d;
        int i13 = this.f14265h;
        this.f14267j = l(this.f14267j, i9, i13 + i13 + i9);
        int i14 = 0;
        while (true) {
            int i15 = this.f14265h;
            int i16 = this.f14259b;
            i8 = i15 + i15;
            if (i14 >= i8 * i16) {
                break;
            }
            this.f14267j[(i16 * i9) + i14] = 0;
            i14++;
        }
        this.f14268k += i8;
        k();
        if (this.f14270m > i12) {
            this.f14270m = i12;
        }
        this.f14268k = 0;
        this.f14275r = 0;
        this.f14272o = 0;
    }

    public final void f(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i8 = this.f14259b;
        int i9 = remaining / i8;
        int i10 = i8 * i9;
        short[] l8 = l(this.f14267j, this.f14268k, i9);
        this.f14267j = l8;
        shortBuffer.get(l8, this.f14268k * this.f14259b, (i10 + i10) / 2);
        this.f14268k += i9;
        k();
    }
}
