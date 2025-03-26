package J6;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x6.InterfaceC6925g;

/* loaded from: classes2.dex */
public abstract class L {
    public static Collection a(Object obj) {
        if ((obj instanceof K6.a) && !(obj instanceof K6.b)) {
            n(obj, "kotlin.collections.MutableCollection");
        }
        return e(obj);
    }

    public static List b(Object obj) {
        if ((obj instanceof K6.a) && !(obj instanceof K6.c)) {
            n(obj, "kotlin.collections.MutableList");
        }
        return f(obj);
    }

    public static Map c(Object obj) {
        if ((obj instanceof K6.a) && !(obj instanceof K6.d)) {
            n(obj, "kotlin.collections.MutableMap");
        }
        return g(obj);
    }

    public static Object d(Object obj, int i8) {
        if (obj != null && !i(obj, i8)) {
            n(obj, "kotlin.jvm.functions.Function" + i8);
        }
        return obj;
    }

    public static Collection e(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e8) {
            throw m(e8);
        }
    }

    public static List f(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e8) {
            throw m(e8);
        }
    }

    public static Map g(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e8) {
            throw m(e8);
        }
    }

    public static int h(Object obj) {
        if (obj instanceof InterfaceC0653m) {
            return ((InterfaceC0653m) obj).getArity();
        }
        if (obj instanceof I6.a) {
            return 0;
        }
        if (obj instanceof I6.l) {
            return 1;
        }
        if (obj instanceof I6.p) {
            return 2;
        }
        if (obj instanceof I6.q) {
            return 3;
        }
        if (obj instanceof I6.r) {
            return 4;
        }
        if (obj instanceof I6.s) {
            return 5;
        }
        if (obj instanceof I6.t) {
            return 6;
        }
        if (obj instanceof I6.u) {
            return 7;
        }
        if (obj instanceof I6.v) {
            return 8;
        }
        if (obj instanceof I6.w) {
            return 9;
        }
        if (obj instanceof I6.b) {
            return 10;
        }
        if (obj instanceof I6.c) {
            return 11;
        }
        if (obj instanceof I6.e) {
            return 13;
        }
        if (obj instanceof I6.f) {
            return 14;
        }
        if (obj instanceof I6.g) {
            return 15;
        }
        if (obj instanceof I6.h) {
            return 16;
        }
        if (obj instanceof I6.i) {
            return 17;
        }
        if (obj instanceof I6.j) {
            return 18;
        }
        if (obj instanceof I6.k) {
            return 19;
        }
        if (obj instanceof I6.m) {
            return 20;
        }
        return obj instanceof I6.n ? 21 : -1;
    }

    public static boolean i(Object obj, int i8) {
        return (obj instanceof InterfaceC6925g) && h(obj) == i8;
    }

    public static boolean j(Object obj) {
        return (obj instanceof List) && (!(obj instanceof K6.a) || (obj instanceof K6.c));
    }

    public static boolean k(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof K6.a) || (obj instanceof K6.e));
    }

    private static Throwable l(Throwable th) {
        return r.j(th, L.class.getName());
    }

    public static ClassCastException m(ClassCastException classCastException) {
        throw ((ClassCastException) l(classCastException));
    }

    public static void n(Object obj, String str) {
        o((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void o(String str) {
        throw m(new ClassCastException(str));
    }
}
