package kotlin.coroutines.jvm.internal;

import J6.r;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f38753a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final a f38754b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    private static a f38755c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f38756a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f38757b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f38758c;

        public a(Method method, Method method2, Method method3) {
            this.f38756a = method;
            this.f38757b = method2;
            this.f38758c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f38755c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f38754b;
            f38755c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a aVar) {
        r.e(aVar, "continuation");
        a aVar2 = f38755c;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        if (aVar2 == f38754b) {
            return null;
        }
        Method method = aVar2.f38756a;
        Object invoke = method != null ? method.invoke(aVar.getClass(), null) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f38757b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f38758c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
