package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f10326a = new p();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f10327b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Map f10328c = new HashMap();

    private p() {
    }

    private final InterfaceC0920f a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            J6.r.d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            androidx.appcompat.app.E.a(newInstance);
            return null;
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Constructor b(Class cls) {
        try {
            Package r12 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r12 != null ? r12.getName() : "";
            J6.r.d(name, "fullPackage");
            if (name.length() != 0) {
                J6.r.d(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                J6.r.d(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            J6.r.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c8 = c(canonicalName);
            if (name.length() != 0) {
                c8 = name + '.' + c8;
            }
            Class<?> cls2 = Class.forName(c8);
            J6.r.c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static final String c(String str) {
        J6.r.e(str, "className");
        return S6.h.x(str, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class cls) {
        Map map = f10327b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g8 = g(cls);
        map.put(cls, Integer.valueOf(g8));
        return g8;
    }

    private final boolean e(Class cls) {
        return cls != null && InterfaceC0926l.class.isAssignableFrom(cls);
    }

    public static final InterfaceC0925k f(Object obj) {
        J6.r.e(obj, "object");
        boolean z7 = obj instanceof InterfaceC0925k;
        boolean z8 = obj instanceof InterfaceC0918d;
        if (z7 && z8) {
            return new DefaultLifecycleObserverAdapter((InterfaceC0918d) obj, (InterfaceC0925k) obj);
        }
        if (z8) {
            return new DefaultLifecycleObserverAdapter((InterfaceC0918d) obj, null);
        }
        if (z7) {
            return (InterfaceC0925k) obj;
        }
        Class<?> cls = obj.getClass();
        p pVar = f10326a;
        if (pVar.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        Object obj2 = f10328c.get(cls);
        J6.r.b(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            pVar.a((Constructor) list.get(0), obj);
            return new SingleGeneratedAdapterObserver(null);
        }
        int size = list.size();
        InterfaceC0920f[] interfaceC0920fArr = new InterfaceC0920f[size];
        for (int i8 = 0; i8 < size; i8++) {
            f10326a.a((Constructor) list.get(i8), obj);
            interfaceC0920fArr[i8] = null;
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC0920fArr);
    }

    private final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b8 = b(cls);
        if (b8 != null) {
            f10328c.put(cls, AbstractC6987o.b(b8));
            return 2;
        }
        if (C0916b.f10296c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            J6.r.d(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f10328c.get(superclass);
            J6.r.b(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        J6.r.d(interfaces, "klass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if (e(cls2)) {
                J6.r.d(cls2, "intrface");
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f10328c.get(cls2);
                J6.r.b(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f10328c.put(cls, arrayList);
        return 2;
    }
}
