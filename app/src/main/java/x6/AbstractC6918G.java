package x6;

/* renamed from: x6.G, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6918G {
    public static final int a(int i8, int i9) {
        return J6.r.f(i8 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE);
    }

    public static final int b(long j8, long j9) {
        return J6.r.g(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
    }

    public static final double c(long j8) {
        return ((j8 >>> 11) * 2048) + (j8 & 2047);
    }

    public static final String d(long j8) {
        return e(j8, 10);
    }

    public static final String e(long j8, int i8) {
        if (j8 >= 0) {
            String l8 = Long.toString(j8, S6.a.a(i8));
            J6.r.d(l8, "toString(...)");
            return l8;
        }
        long j9 = i8;
        long j10 = ((j8 >>> 1) / j9) << 1;
        long j11 = j8 - (j10 * j9);
        if (j11 >= j9) {
            j11 -= j9;
            j10++;
        }
        StringBuilder sb = new StringBuilder();
        String l9 = Long.toString(j10, S6.a.a(i8));
        J6.r.d(l9, "toString(...)");
        sb.append(l9);
        String l10 = Long.toString(j11, S6.a.a(i8));
        J6.r.d(l10, "toString(...)");
        sb.append(l10);
        return sb.toString();
    }
}
