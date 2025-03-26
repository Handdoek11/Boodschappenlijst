package k7;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;

/* renamed from: k7.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6146p0 {
    private static final Object a(Class cls) {
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final g7.b b(Q6.b bVar) {
        J6.r.e(bVar, "<this>");
        return c(bVar, new g7.b[0]);
    }

    public static final g7.b c(Q6.b bVar, g7.b... bVarArr) {
        J6.r.e(bVar, "<this>");
        J6.r.e(bVarArr, "args");
        return d(H6.a.a(bVar), (g7.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public static final g7.b d(Class cls, g7.b... bVarArr) {
        Object obj;
        Field field;
        g7.b g8;
        J6.r.e(cls, "<this>");
        J6.r.e(bVarArr, "args");
        if (cls.isEnum() && j(cls)) {
            return e(cls);
        }
        if (cls.isInterface() && (g8 = g(cls)) != null) {
            return g8;
        }
        g7.b h8 = h(cls, (g7.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (h8 != null) {
            return h8;
        }
        g7.b f8 = f(cls);
        if (f8 != null) {
            return f8;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            J6.r.d(declaredClasses, "declaredClasses");
            int length = declaredClasses.length;
            int i8 = 0;
            Class<?> cls2 = null;
            boolean z7 = false;
            while (true) {
                if (i8 < length) {
                    Class<?> cls3 = declaredClasses[i8];
                    if (J6.r.a(cls3.getSimpleName(), "$serializer")) {
                        if (z7) {
                            break;
                        }
                        z7 = true;
                        cls2 = cls3;
                    }
                    i8++;
                } else if (!z7) {
                }
            }
            cls2 = null;
            obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
        } catch (NoSuchFieldException unused) {
        }
        g7.b bVar = obj instanceof g7.b ? (g7.b) obj : null;
        if (bVar != null) {
            return bVar;
        }
        if (k(cls)) {
            return new g7.d(H6.a.c(cls));
        }
        return null;
    }

    private static final g7.b e(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        J6.r.d(canonicalName, "canonicalName");
        J6.r.c(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new G(canonicalName, (Enum[]) enumConstants);
    }

    private static final g7.b f(Class cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        J6.r.d(declaredFields, "declaredFields");
        int length = declaredFields.length;
        int i8 = 0;
        Field field = null;
        int i9 = 0;
        boolean z7 = false;
        while (true) {
            if (i9 >= length) {
                if (!z7) {
                    break;
                }
            } else {
                Field field2 = declaredFields[i9];
                if (J6.r.a(field2.getName(), "INSTANCE") && J6.r.a(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                    if (z7) {
                        break;
                    }
                    z7 = true;
                    field = field2;
                }
                i9++;
            }
        }
        field = null;
        if (field == null) {
            return null;
        }
        Object obj = field.get(null);
        Method[] methods = cls.getMethods();
        J6.r.d(methods, "methods");
        int length2 = methods.length;
        Method method = null;
        boolean z8 = false;
        while (true) {
            if (i8 >= length2) {
                if (!z8) {
                    break;
                }
            } else {
                Method method2 = methods[i8];
                if (J6.r.a(method2.getName(), "serializer")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    J6.r.d(parameterTypes, "it.parameterTypes");
                    if (parameterTypes.length == 0 && J6.r.a(method2.getReturnType(), g7.b.class)) {
                        if (z8) {
                            break;
                        }
                        method = method2;
                        z8 = true;
                    }
                }
                i8++;
            }
        }
        method = null;
        if (method == null) {
            return null;
        }
        Object invoke = method.invoke(obj, null);
        if (invoke instanceof g7.b) {
            return (g7.b) invoke;
        }
        return null;
    }

    private static final g7.b g(Class cls) {
        g7.g gVar = (g7.g) cls.getAnnotation(g7.g.class);
        if (gVar == null || J6.r.a(J6.H.b(gVar.with()), J6.H.b(g7.d.class))) {
            return new g7.d(H6.a.c(cls));
        }
        return null;
    }

    private static final g7.b h(Class cls, g7.b... bVarArr) {
        Class[] clsArr;
        Object a8 = a(cls);
        if (a8 == null) {
            return null;
        }
        try {
            if (bVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = bVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i8 = 0; i8 < length; i8++) {
                    clsArr2[i8] = g7.b.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = a8.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(a8, Arrays.copyOf(bVarArr, bVarArr.length));
            if (invoke instanceof g7.b) {
                return (g7.b) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause == null) {
                throw e8;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e8.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean i(Object obj, Q6.b bVar) {
        J6.r.e(obj, "<this>");
        J6.r.e(bVar, "kclass");
        return H6.a.b(bVar).isInstance(obj);
    }

    private static final boolean j(Class cls) {
        return cls.getAnnotation(g7.g.class) == null && cls.getAnnotation(g7.c.class) == null;
    }

    private static final boolean k(Class cls) {
        if (cls.getAnnotation(g7.c.class) != null) {
            return true;
        }
        g7.g gVar = (g7.g) cls.getAnnotation(g7.g.class);
        return gVar != null && J6.r.a(J6.H.b(gVar.with()), J6.H.b(g7.d.class));
    }

    public static final boolean l(Q6.b bVar) {
        J6.r.e(bVar, "rootClass");
        return H6.a.a(bVar).isArray();
    }

    public static final Void m(Q6.b bVar) {
        J6.r.e(bVar, "<this>");
        AbstractC6148q0.d(bVar);
        throw new KotlinNothingValueException();
    }

    public static final Object[] n(ArrayList arrayList, Q6.b bVar) {
        J6.r.e(arrayList, "<this>");
        J6.r.e(bVar, "eClass");
        Object newInstance = Array.newInstance((Class<?>) H6.a.a(bVar), arrayList.size());
        J6.r.c(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        J6.r.d(array, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return array;
    }
}
