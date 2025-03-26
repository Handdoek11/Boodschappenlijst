package D6;

import J6.r;
import java.lang.reflect.Method;
import y6.AbstractC6980h;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: D6.a$a, reason: collision with other inner class name */
    private static final class C0031a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0031a f2121a = new C0031a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f2122b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f2123c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            r.b(methods);
            int length = methods.length;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                method = null;
                if (i9 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i9];
                if (r.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    r.d(parameterTypes, "getParameterTypes(...)");
                    if (r.a(AbstractC6980h.I(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i9++;
            }
            f2122b = method2;
            int length2 = methods.length;
            while (true) {
                if (i8 >= length2) {
                    break;
                }
                Method method3 = methods[i8];
                if (r.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i8++;
            }
            f2123c = method;
        }

        private C0031a() {
        }
    }

    public void a(Throwable th, Throwable th2) {
        r.e(th, "cause");
        r.e(th2, "exception");
        Method method = C0031a.f2122b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public N6.c b() {
        return new N6.b();
    }
}
