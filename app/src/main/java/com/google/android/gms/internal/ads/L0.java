package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class L0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f16722a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f16723b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f16724c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f16725d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f16726e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f16727f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f16728g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int b(int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        if (!m(i8) || (i9 = (i8 >>> 19) & 3) == 1 || (i10 = (i8 >>> 17) & 3) == 0 || (i11 = (i8 >>> 12) & 15) == 0 || i11 == 15 || (i12 = (i8 >>> 10) & 3) == 3) {
            return -1;
        }
        int i13 = i11 - 1;
        int i14 = f16723b[i12];
        if (i9 == 2) {
            i14 /= 2;
        } else if (i9 == 0) {
            i14 /= 4;
        }
        int i15 = (i8 >>> 9) & 1;
        if (i10 == 3) {
            return ((((i9 == 3 ? f16724c[i13] : f16725d[i13]) * 12) / i14) + i15) * 4;
        }
        int i16 = i9 == 3 ? i10 == 2 ? f16726e[i13] : f16727f[i13] : f16728g[i13];
        if (i9 == 3) {
            return ((i16 * 144) / i14) + i15;
        }
        return (((i10 == 1 ? 72 : 144) * i16) / i14) + i15;
    }

    public static int c(int i8) {
        int i9;
        int i10;
        if (!m(i8) || (i9 = (i8 >>> 19) & 3) == 1 || (i10 = (i8 >>> 17) & 3) == 0) {
            return -1;
        }
        int i11 = i8 >>> 12;
        int i12 = (i8 >>> 10) & 3;
        int i13 = i11 & 15;
        if (i13 == 0 || i13 == 15 || i12 == 3) {
            return -1;
        }
        return l(i9, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i8, int i9) {
        return i9 != 1 ? i9 != 2 ? 384 : 1152 : i8 == 3 ? 1152 : 576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(int i8) {
        return (i8 & (-2097152)) == -2097152;
    }
}
