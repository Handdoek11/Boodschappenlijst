package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import q.C6407k;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final C6407k f10105a = new C6407k();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) {
        C6407k c6407k = f10105a;
        C6407k c6407k2 = (C6407k) c6407k.get(classLoader);
        if (c6407k2 == null) {
            c6407k2 = new C6407k();
            c6407k.put(classLoader, c6407k2);
        }
        Class cls = (Class) c6407k2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c6407k2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e8) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e8);
        } catch (ClassNotFoundException e9) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e9);
        }
    }

    public abstract Fragment a(ClassLoader classLoader, String str);
}
