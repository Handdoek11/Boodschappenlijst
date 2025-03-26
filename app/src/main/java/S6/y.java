package S6;

import kotlin.KotlinNothingValueException;
import x6.C6914C;

/* loaded from: classes2.dex */
public abstract class y {
    public static final byte a(String str) {
        J6.r.e(str, "<this>");
        x6.v b8 = b(str);
        if (b8 != null) {
            return b8.i();
        }
        p.j(str);
        throw new KotlinNothingValueException();
    }

    public static final x6.v b(String str) {
        J6.r.e(str, "<this>");
        return c(str, 10);
    }

    public static final x6.v c(String str, int i8) {
        J6.r.e(str, "<this>");
        x6.x f8 = f(str, i8);
        if (f8 == null) {
            return null;
        }
        int i9 = f8.i();
        if (Integer.compare(i9 ^ Integer.MIN_VALUE, x6.x.c(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return x6.v.a(x6.v.c((byte) i9));
    }

    public static final int d(String str) {
        J6.r.e(str, "<this>");
        x6.x e8 = e(str);
        if (e8 != null) {
            return e8.i();
        }
        p.j(str);
        throw new KotlinNothingValueException();
    }

    public static final x6.x e(String str) {
        J6.r.e(str, "<this>");
        return f(str, 10);
    }

    public static final x6.x f(String str, int i8) {
        int i9;
        J6.r.e(str, "<this>");
        a.a(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char charAt = str.charAt(0);
        if (J6.r.f(charAt, 48) < 0) {
            i9 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i9 = 0;
        }
        int c8 = x6.x.c(i8);
        int i11 = 119304647;
        while (i9 < length) {
            int b8 = b.b(str.charAt(i9), i8);
            if (b8 < 0) {
                return null;
            }
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) > 0) {
                if (i11 == 119304647) {
                    i11 = x.a(-1, c8);
                    if (Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int c9 = x6.x.c(i10 * c8);
            int c10 = x6.x.c(x6.x.c(b8) + c9);
            if (Integer.compare(c10 ^ Integer.MIN_VALUE, c9 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i9++;
            i10 = c10;
        }
        return x6.x.a(i10);
    }

    public static final long g(String str) {
        J6.r.e(str, "<this>");
        x6.z h8 = h(str);
        if (h8 != null) {
            return h8.k();
        }
        p.j(str);
        throw new KotlinNothingValueException();
    }

    public static final x6.z h(String str) {
        J6.r.e(str, "<this>");
        return i(str, 10);
    }

    public static final x6.z i(String str, int i8) {
        J6.r.e(str, "<this>");
        a.a(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char charAt = str.charAt(0);
        if (J6.r.f(charAt, 48) < 0) {
            i9 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long c8 = x6.z.c(i8);
        long j8 = 0;
        long j9 = 512409557603043100L;
        while (i9 < length) {
            if (b.b(str.charAt(i9), i8) < 0) {
                return null;
            }
            if (Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE) > 0) {
                if (j9 == 512409557603043100L) {
                    j9 = v.a(-1L, c8);
                    if (Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long c9 = x6.z.c(j8 * c8);
            long c10 = x6.z.c(x6.z.c(x6.x.c(r13) & 4294967295L) + c9);
            if (Long.compare(c10 ^ Long.MIN_VALUE, c9 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i9++;
            j8 = c10;
        }
        return x6.z.a(j8);
    }

    public static final short j(String str) {
        J6.r.e(str, "<this>");
        C6914C k8 = k(str);
        if (k8 != null) {
            return k8.i();
        }
        p.j(str);
        throw new KotlinNothingValueException();
    }

    public static final C6914C k(String str) {
        J6.r.e(str, "<this>");
        return l(str, 10);
    }

    public static final C6914C l(String str, int i8) {
        J6.r.e(str, "<this>");
        x6.x f8 = f(str, i8);
        if (f8 == null) {
            return null;
        }
        int i9 = f8.i();
        if (Integer.compare(i9 ^ Integer.MIN_VALUE, x6.x.c(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return C6914C.a(C6914C.c((short) i9));
    }
}
