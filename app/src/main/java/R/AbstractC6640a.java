package r;

import J6.r;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6640a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f42380a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f42381b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f42382c = new Object[0];

    public static final int a(int[] iArr, int i8, int i9) {
        r.e(iArr, "array");
        int i10 = i8 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = iArr[i12];
            if (i13 < i9) {
                i11 = i12 + 1;
            } else {
                if (i13 <= i9) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    public static final int b(long[] jArr, int i8, long j8) {
        r.e(jArr, "array");
        int i9 = i8 - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            long j9 = jArr[i11];
            if (j9 < j8) {
                i10 = i11 + 1;
            } else {
                if (j9 <= j8) {
                    return i11;
                }
                i9 = i11 - 1;
            }
        }
        return ~i10;
    }

    public static final boolean c(Object obj, Object obj2) {
        return r.a(obj, obj2);
    }

    public static final int d(int i8) {
        for (int i9 = 4; i9 < 32; i9++) {
            int i10 = (1 << i9) - 12;
            if (i8 <= i10) {
                return i10;
            }
        }
        return i8;
    }

    public static final int e(int i8) {
        return d(i8 * 4) / 4;
    }

    public static final int f(int i8) {
        return d(i8 * 8) / 8;
    }
}
