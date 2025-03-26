package J6;

import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;

/* loaded from: classes2.dex */
public abstract class r {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj == null) {
            l();
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            m(str);
        }
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) i(new NullPointerException(str + " must not be null")));
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            n(str);
        }
    }

    public static int f(int i8, int i9) {
        if (i8 < i9) {
            return -1;
        }
        return i8 == i9 ? 0 : 1;
    }

    public static int g(long j8, long j9) {
        if (j8 < j9) {
            return -1;
        }
        return j8 == j9 ? 0 : 1;
    }

    private static String h(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = r.class.getName();
        int i8 = 0;
        while (!stackTrace[i8].getClassName().equals(name)) {
            i8++;
        }
        while (stackTrace[i8].getClassName().equals(name)) {
            i8++;
        }
        StackTraceElement stackTraceElement = stackTrace[i8];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    private static Throwable i(Throwable th) {
        return j(th, r.class.getName());
    }

    static Throwable j(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i8 = -1;
        for (int i9 = 0; i9 < length; i9++) {
            if (str.equals(stackTrace[i9].getClassName())) {
                i8 = i9;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i8 + 1, length));
        return th;
    }

    public static String k(String str, Object obj) {
        return str + obj;
    }

    public static void l() {
        throw ((NullPointerException) i(new NullPointerException()));
    }

    public static void m(String str) {
        throw ((NullPointerException) i(new NullPointerException(str)));
    }

    private static void n(String str) {
        throw ((NullPointerException) i(new NullPointerException(h(str))));
    }

    public static void o(String str) {
        throw ((UninitializedPropertyAccessException) i(new UninitializedPropertyAccessException(str)));
    }

    public static void p(String str) {
        o("lateinit property " + str + " has not been initialized");
    }
}
