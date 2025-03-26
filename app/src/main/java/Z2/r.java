package Z2;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class r {
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

    public static void c(boolean z7, String str, Object... objArr) {
        if (!z7) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void e(String str) {
        if (!f3.u.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    public static String g(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    public static void h() {
        i("Must not be called on GoogleApiHandler thread.");
    }

    public static void i(String str) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException(str);
            }
        }
    }

    public static void j() {
        k("Must not be called on the main application thread");
    }

    public static void k(String str) {
        if (f3.u.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static Object l(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static Object m(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static int n(int i8) {
        if (i8 != 0) {
            return i8;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static long o(long j8) {
        if (j8 != 0) {
            return j8;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    public static void p(boolean z7) {
        if (!z7) {
            throw new IllegalStateException();
        }
    }

    public static void q(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
