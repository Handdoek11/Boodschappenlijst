package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Sf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1762Sf0 {
    public static int a(int i8, int i9, String str) {
        String b8;
        if (i8 >= 0 && i8 < i9) {
            return i8;
        }
        if (i8 < 0) {
            b8 = AbstractC3187kg0.b("%s (%s) must not be negative", "index", Integer.valueOf(i8));
        } else {
            if (i9 < 0) {
                throw new IllegalArgumentException("negative size: " + i9);
            }
            b8 = AbstractC3187kg0.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(b8);
    }

    public static int b(int i8, int i9, String str) {
        if (i8 < 0 || i8 > i9) {
            throw new IndexOutOfBoundsException(n(i8, i9, "index"));
        }
        return i8;
    }

    public static Object c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object d(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(AbstractC3187kg0.b(str, obj2));
    }

    public static void e(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void g(boolean z7, String str, char c8) {
        if (!z7) {
            throw new IllegalArgumentException(AbstractC3187kg0.b(str, Character.valueOf(c8)));
        }
    }

    public static void h(boolean z7, String str, long j8) {
        if (!z7) {
            throw new IllegalArgumentException(AbstractC3187kg0.b(str, Long.valueOf(j8)));
        }
    }

    public static void i(boolean z7, String str, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(AbstractC3187kg0.b(str, obj));
        }
    }

    public static void j(boolean z7, String str, int i8, int i9) {
        if (!z7) {
            throw new IllegalArgumentException(AbstractC3187kg0.b(str, Integer.valueOf(i8), Integer.valueOf(i9)));
        }
    }

    public static void k(int i8, int i9, int i10) {
        if (i8 < 0 || i9 < i8 || i9 > i10) {
            throw new IndexOutOfBoundsException((i8 < 0 || i8 > i10) ? n(i8, i10, "start index") : (i9 < 0 || i9 > i10) ? n(i9, i10, "end index") : AbstractC3187kg0.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i8)));
        }
    }

    public static void l(boolean z7) {
        if (!z7) {
            throw new IllegalStateException();
        }
    }

    public static void m(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String n(int i8, int i9, String str) {
        if (i8 < 0) {
            return AbstractC3187kg0.b("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return AbstractC3187kg0.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException("negative size: " + i9);
    }
}
