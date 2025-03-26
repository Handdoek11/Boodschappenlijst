package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3772q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f25687a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f25688b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f25689c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f25690d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f25691e = {5, 8, 10, 12};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f25692f = {6, 9, 12, 15};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f25693g = {2, 4, 6, 8};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f25694h = {9, 11, 13, 16};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f25695i = {5, 8, 10, 12};

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f25696j = 0;

    public static int a(byte[] bArr) {
        C4144tQ g8 = g(bArr);
        g8.n(42);
        return g8.d(true != g8.p() ? 8 : 12) + 1;
    }

    public static int b(byte[] bArr) {
        C4144tQ g8 = g(bArr);
        g8.n(32);
        return f(g8, f25695i, true) + 1;
    }

    public static D c(byte[] bArr, String str, String str2, int i8, C4785zG0 c4785zG0) {
        C4144tQ g8 = g(bArr);
        g8.n(60);
        int i9 = f25687a[g8.d(6)];
        int i10 = f25688b[g8.d(4)];
        int d8 = g8.d(5);
        int i11 = d8 >= 29 ? -1 : (f25689c[d8] * 1000) / 2;
        g8.n(10);
        int i12 = i9 + (g8.d(2) > 0 ? 1 : 0);
        C2723gJ0 c2723gJ0 = new C2723gJ0();
        c2723gJ0.m(str);
        c2723gJ0.B("audio/vnd.dts");
        c2723gJ0.q0(i11);
        c2723gJ0.r0(i12);
        c2723gJ0.C(i10);
        c2723gJ0.f(null);
        c2723gJ0.q(str2);
        c2723gJ0.y(i8);
        return c2723gJ0.H();
    }

    public static C3554o0 d(byte[] bArr) {
        int i8;
        int i9;
        int i10;
        long j8;
        int i11;
        C4144tQ g8 = g(bArr);
        g8.n(40);
        int d8 = g8.d(2);
        boolean p8 = g8.p();
        int i12 = true != p8 ? 16 : 20;
        g8.n(true != p8 ? 8 : 12);
        int d9 = g8.d(i12) + 1;
        boolean p9 = g8.p();
        int i13 = 0;
        if (p9) {
            i8 = g8.d(2);
            int d10 = g8.d(3) + 1;
            if (g8.p()) {
                g8.n(36);
            }
            int d11 = g8.d(3) + 1;
            int d12 = g8.d(3) + 1;
            if (d11 != 1 || d12 != 1) {
                throw zzbc.c("Multiple audio presentations or assets not supported");
            }
            int i14 = d8 + 1;
            int d13 = g8.d(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                if (((d13 >> i15) & 1) == 1) {
                    g8.n(8);
                }
            }
            int i16 = d10 * 512;
            if (g8.p()) {
                g8.n(2);
                int d14 = (g8.d(2) + 1) << 2;
                int d15 = g8.d(2) + 1;
                while (i13 < d15) {
                    g8.n(d14);
                    i13++;
                }
            }
            i13 = i16;
        } else {
            i8 = -1;
        }
        g8.n(i12);
        g8.n(12);
        if (p9) {
            if (g8.p()) {
                g8.n(4);
            }
            if (g8.p()) {
                g8.n(24);
            }
            if (g8.p()) {
                g8.o(g8.d(10) + 1);
            }
            g8.n(5);
            int i17 = f25690d[g8.d(4)];
            i10 = g8.d(8) + 1;
            i9 = i17;
        } else {
            i9 = -2147483647;
            i10 = -1;
        }
        if (p9) {
            if (i8 == 0) {
                i11 = 32000;
            } else if (i8 == 1) {
                i11 = 44100;
            } else {
                if (i8 != 2) {
                    throw zzbc.a("Unsupported reference clock code in DTS HD header: " + i8, null);
                }
                i11 = 48000;
            }
            j8 = AbstractC2301cW.M(i13, 1000000L, i11, RoundingMode.DOWN);
        } else {
            j8 = -9223372036854775807L;
        }
        return new C3554o0("audio/vnd.dts.hd;profile=lbr", i10, i9, d9, j8, 0, null);
    }

    public static C3554o0 e(byte[] bArr, AtomicInteger atomicInteger) {
        long j8;
        int i8;
        int i9;
        int i10;
        C4144tQ g8 = g(bArr);
        int d8 = g8.d(32);
        int f8 = f(g8, f25691e, true);
        int i11 = f8 + 1;
        char c8 = d8 == 1078008818 ? (char) 1 : (char) 0;
        if (c8 == 0) {
            j8 = -9223372036854775807L;
            i8 = -2147483647;
        } else {
            if (!g8.p()) {
                throw zzbc.c("Only supports full channel mask-based audio presentation");
            }
            int i12 = f8 - 1;
            if (((bArr[f8] & 255) | ((char) (bArr[i12] << 8))) != AbstractC2301cW.w(bArr, 0, i12, 65535)) {
                throw zzbc.a("CRC check failed", null);
            }
            int d9 = g8.d(2);
            if (d9 == 0) {
                i9 = 512;
            } else if (d9 == 1) {
                i9 = 480;
            } else {
                if (d9 != 2) {
                    throw zzbc.a("Unsupported base duration index in DTS UHD header: " + d9, null);
                }
                i9 = 384;
            }
            int d10 = g8.d(3) + 1;
            int d11 = g8.d(2);
            if (d11 == 0) {
                i10 = 32000;
            } else if (d11 == 1) {
                i10 = 44100;
            } else {
                if (d11 != 2) {
                    throw zzbc.a("Unsupported clock rate index in DTS UHD header: " + d11, null);
                }
                i10 = 48000;
            }
            if (g8.p()) {
                g8.n(36);
            }
            i8 = (1 << g8.d(2)) * i10;
            j8 = AbstractC2301cW.M(i9 * d10, 1000000L, i10, RoundingMode.DOWN);
        }
        int i13 = i8;
        long j9 = j8;
        int i14 = 0;
        for (char c9 = 0; c9 < c8; c9 = 1) {
            i14 += f(g8, f25692f, true);
        }
        for (int i15 = 0; i15 <= 0; i15++) {
            if (c8 != 0) {
                atomicInteger.set(f(g8, f25693g, true));
            }
            i14 += atomicInteger.get() != 0 ? f(g8, f25694h, true) : 0;
        }
        return new C3554o0("audio/vnd.dts.uhd;profile=p2", 2, i13, i11 + i14, j9, 0, null);
    }

    private static int f(C4144tQ c4144tQ, int[] iArr, boolean z7) {
        int i8 = 0;
        for (int i9 = 0; i9 < 3 && c4144tQ.p(); i9++) {
            i8++;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            i10 += 1 << iArr[i11];
        }
        return i10 + c4144tQ.d(iArr[i8]);
    }

    private static C4144tQ g(byte[] bArr) {
        byte b8 = bArr[0];
        if (b8 == Byte.MAX_VALUE || b8 == 100 || b8 == 64 || b8 == 113) {
            return new C4144tQ(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b9 = copyOf[0];
        if (b9 == -2 || b9 == -1 || b9 == 37 || b9 == -14 || b9 == -24) {
            for (int i8 = 0; i8 < copyOf.length - 1; i8 += 2) {
                byte b10 = copyOf[i8];
                int i9 = i8 + 1;
                copyOf[i8] = copyOf[i9];
                copyOf[i9] = b10;
            }
        }
        int length = copyOf.length;
        C4144tQ c4144tQ = new C4144tQ(copyOf, length);
        if (copyOf[0] == 31) {
            C4144tQ c4144tQ2 = new C4144tQ(copyOf, length);
            while (c4144tQ2.a() >= 16) {
                c4144tQ2.n(2);
                c4144tQ.g(c4144tQ2.d(14), 14);
            }
        }
        c4144tQ.k(copyOf, copyOf.length);
        return c4144tQ;
    }
}
