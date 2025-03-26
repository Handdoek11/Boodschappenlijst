package N6;

import J6.r;

/* loaded from: classes2.dex */
public abstract class d {
    public static final String a(Object obj, Object obj2) {
        r.e(obj, "from");
        r.e(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void b(long j8, long j9) {
        if (j9 <= j8) {
            throw new IllegalArgumentException(a(Long.valueOf(j8), Long.valueOf(j9)).toString());
        }
    }

    public static final int c(int i8) {
        return 31 - Integer.numberOfLeadingZeros(i8);
    }

    public static final int d(int i8, int i9) {
        return (i8 >>> (32 - i9)) & ((-i9) >> 31);
    }
}
