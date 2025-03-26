package J6;

import java.util.Collections;

/* loaded from: classes2.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    private static final I f3548a;

    /* renamed from: b, reason: collision with root package name */
    private static final Q6.b[] f3549b;

    static {
        I i8 = null;
        try {
            i8 = (I) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (i8 == null) {
            i8 = new I();
        }
        f3548a = i8;
        f3549b = new Q6.b[0];
    }

    public static Q6.e a(n nVar) {
        return f3548a.a(nVar);
    }

    public static Q6.b b(Class cls) {
        return f3548a.b(cls);
    }

    public static Q6.d c(Class cls) {
        return f3548a.c(cls, "");
    }

    public static Q6.f d(u uVar) {
        return f3548a.d(uVar);
    }

    public static Q6.g e(y yVar) {
        return f3548a.e(yVar);
    }

    public static Q6.i f(A a8) {
        return f3548a.f(a8);
    }

    public static String g(InterfaceC0653m interfaceC0653m) {
        return f3548a.g(interfaceC0653m);
    }

    public static String h(s sVar) {
        return f3548a.h(sVar);
    }

    public static Q6.k i(Class cls) {
        return f3548a.i(b(cls), Collections.emptyList(), false);
    }
}
