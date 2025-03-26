package Q;

import J6.C0652l;

/* renamed from: Q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0684f {
    public static final int a(long j8, long j9) {
        boolean d8 = d(j8);
        return d8 != d(j9) ? d8 ? -1 : 1 : (int) Math.signum(c(j8) - c(j9));
    }

    public static final float c(long j8) {
        C0652l c0652l = C0652l.f3580a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final boolean d(long j8) {
        return ((int) (j8 & 4294967295L)) != 0;
    }

    public static long b(long j8) {
        return j8;
    }
}
