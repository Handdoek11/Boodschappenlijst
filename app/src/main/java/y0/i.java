package y0;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class i {
    public static void a(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int c(int i8, int i9, int i10, String str) {
        if (i8 < i9) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i9), Integer.valueOf(i10)));
        }
        if (i8 <= i10) {
            return i8;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i9), Integer.valueOf(i10)));
    }

    public static int d(int i8) {
        if (i8 >= 0) {
            return i8;
        }
        throw new IllegalArgumentException();
    }

    public static int e(int i8, String str) {
        if (i8 >= 0) {
            return i8;
        }
        throw new IllegalArgumentException(str);
    }

    public static int f(int i8, int i9) {
        if ((i8 & i9) == i8) {
            return i8;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i8) + ", but only 0x" + Integer.toHexString(i9) + " are allowed");
    }

    public static Object g(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object h(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void i(boolean z7, String str) {
        if (!z7) {
            throw new IllegalStateException(str);
        }
    }
}
