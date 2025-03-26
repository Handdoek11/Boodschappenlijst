package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import y6.AbstractC6980h;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    private static final List f10223a = AbstractC6987o.g(Application.class, z.class);

    /* renamed from: b, reason: collision with root package name */
    private static final List f10224b = AbstractC6987o.b(z.class);

    public static final Constructor c(Class cls, List list) {
        J6.r.e(cls, "modelClass");
        J6.r.e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        J6.r.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            J6.r.d(parameterTypes, "constructor.parameterTypes");
            List M7 = AbstractC6980h.M(parameterTypes);
            if (J6.r.a(list, M7)) {
                J6.r.c(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == M7.size() && M7.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final G d(Class cls, Constructor constructor, Object... objArr) {
        J6.r.e(cls, "modelClass");
        J6.r.e(constructor, "constructor");
        J6.r.e(objArr, "params");
        try {
            return (G) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Failed to access " + cls, e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e10.getCause());
        }
    }
}
