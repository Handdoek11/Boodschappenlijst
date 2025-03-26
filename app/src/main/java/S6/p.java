package S6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class p extends o {
    public static final Void j(String str) {
        J6.r.e(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static Integer k(String str) {
        J6.r.e(str, "<this>");
        return l(str, 10);
    }

    public static final Integer l(String str, int i8) {
        boolean z7;
        int i9;
        int i10;
        J6.r.e(str, "<this>");
        a.a(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        int i12 = -2147483647;
        if (J6.r.f(charAt, 48) < 0) {
            i9 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i12 = Integer.MIN_VALUE;
                z7 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z7 = false;
            }
        } else {
            z7 = false;
            i9 = 0;
        }
        int i13 = -59652323;
        while (i9 < length) {
            int b8 = b.b(str.charAt(i9), i8);
            if (b8 < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / i8))) || (i10 = i11 * i8) < i12 + b8) {
                return null;
            }
            i11 = i10 - b8;
            i9++;
        }
        return z7 ? Integer.valueOf(i11) : Integer.valueOf(-i11);
    }

    public static Long m(String str) {
        J6.r.e(str, "<this>");
        return n(str, 10);
    }

    public static final Long n(String str, int i8) {
        boolean z7;
        J6.r.e(str, "<this>");
        a.a(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char charAt = str.charAt(0);
        long j8 = -9223372036854775807L;
        if (J6.r.f(charAt, 48) < 0) {
            z7 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j8 = Long.MIN_VALUE;
                i9 = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z7 = false;
                i9 = 1;
            }
        } else {
            z7 = false;
        }
        long j9 = -256204778801521550L;
        long j10 = 0;
        long j11 = -256204778801521550L;
        while (i9 < length) {
            int b8 = b.b(str.charAt(i9), i8);
            if (b8 < 0) {
                return null;
            }
            if (j10 < j11) {
                if (j11 == j9) {
                    j11 = j8 / i8;
                    if (j10 < j11) {
                    }
                }
                return null;
            }
            long j12 = j10 * i8;
            long j13 = b8;
            if (j12 < j8 + j13) {
                return null;
            }
            j10 = j12 - j13;
            i9++;
            j9 = -256204778801521550L;
        }
        return z7 ? Long.valueOf(j10) : Long.valueOf(-j10);
    }
}
