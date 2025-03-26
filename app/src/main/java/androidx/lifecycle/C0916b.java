package androidx.lifecycle;

import androidx.lifecycle.AbstractC0922h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0916b {

    /* renamed from: c, reason: collision with root package name */
    static C0916b f10296c = new C0916b();

    /* renamed from: a, reason: collision with root package name */
    private final Map f10297a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f10298b = new HashMap();

    /* renamed from: androidx.lifecycle.b$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map f10299a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map f10300b;

        a(Map map) {
            this.f10300b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC0922h.a aVar = (AbstractC0922h.a) entry.getValue();
                List list = (List) this.f10299a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f10299a.put(aVar, list);
                }
                list.add((C0170b) entry.getKey());
            }
        }

        private static void b(List list, InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0170b) list.get(size)).a(interfaceC0927m, aVar, obj);
                }
            }
        }

        void a(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar, Object obj) {
            b((List) this.f10299a.get(aVar), interfaceC0927m, aVar, obj);
            b((List) this.f10299a.get(AbstractC0922h.a.ON_ANY), interfaceC0927m, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    static final class C0170b {

        /* renamed from: a, reason: collision with root package name */
        final int f10301a;

        /* renamed from: b, reason: collision with root package name */
        final Method f10302b;

        C0170b(int i8, Method method) {
            this.f10301a = i8;
            this.f10302b = method;
            method.setAccessible(true);
        }

        void a(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar, Object obj) {
            try {
                int i8 = this.f10301a;
                if (i8 == 0) {
                    this.f10302b.invoke(obj, null);
                } else if (i8 == 1) {
                    this.f10302b.invoke(obj, interfaceC0927m);
                } else {
                    if (i8 != 2) {
                        return;
                    }
                    this.f10302b.invoke(obj, interfaceC0927m, aVar);
                }
            } catch (IllegalAccessException e8) {
                throw new RuntimeException(e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException("Failed to call observer method", e9.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0170b)) {
                return false;
            }
            C0170b c0170b = (C0170b) obj;
            return this.f10301a == c0170b.f10301a && this.f10302b.getName().equals(c0170b.f10302b.getName());
        }

        public int hashCode() {
            return (this.f10301a * 31) + this.f10302b.getName().hashCode();
        }
    }

    C0916b() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i8;
        a c8;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c8 = c(superclass)) != null) {
            hashMap.putAll(c8.f10300b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f10300b.entrySet()) {
                e(hashMap, (C0170b) entry.getKey(), (AbstractC0922h.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z7 = false;
        for (Method method : methodArr) {
            t tVar = (t) method.getAnnotation(t.class);
            if (tVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i8 = 0;
                } else {
                    if (!InterfaceC0927m.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i8 = 1;
                }
                AbstractC0922h.a value = tVar.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC0922h.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC0922h.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i8 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new C0170b(i8, method), value, cls);
                z7 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f10297a.put(cls, aVar);
        this.f10298b.put(cls, Boolean.valueOf(z7));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e8) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e8);
        }
    }

    private void e(Map map, C0170b c0170b, AbstractC0922h.a aVar, Class cls) {
        AbstractC0922h.a aVar2 = (AbstractC0922h.a) map.get(c0170b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0170b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0170b.f10302b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class cls) {
        a aVar = (a) this.f10297a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = (Boolean) this.f10298b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b8 = b(cls);
        for (Method method : b8) {
            if (((t) method.getAnnotation(t.class)) != null) {
                a(cls, b8);
                return true;
            }
        }
        this.f10298b.put(cls, Boolean.FALSE);
        return false;
    }
}
