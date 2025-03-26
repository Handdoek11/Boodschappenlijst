package j5;

/* loaded from: classes2.dex */
abstract class f {
    public static boolean a(int i8) {
        return e(i8) == 2;
    }

    public static boolean b(int i8) {
        return f(i8) == 2;
    }

    public static boolean c(int i8) {
        return g(i8) == 2;
    }

    public static boolean d(int i8) {
        return h(i8) == 2;
    }

    public static int e(int i8) {
        return (i8 >>> 18) & 3;
    }

    public static int f(int i8) {
        return i8 & 3;
    }

    public static int g(int i8) {
        return (i8 >>> 12) & 3;
    }

    public static int h(int i8) {
        return (i8 >>> 6) & 3;
    }
}
