package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import i1.AbstractC5848b;
import i1.InterfaceC5847a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l1.AbstractC6167a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f11422d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f11423e = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Context f11426c;

    /* renamed from: b, reason: collision with root package name */
    final Set f11425b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    final Map f11424a = new HashMap();

    a(Context context) {
        this.f11426c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object obj;
        if (AbstractC6167a.d()) {
            try {
                AbstractC6167a.a(cls.getSimpleName());
            } catch (Throwable th) {
                AbstractC6167a.b();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f11424a.containsKey(cls)) {
            obj = this.f11424a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC5847a interfaceC5847a = (InterfaceC5847a) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a8 = interfaceC5847a.a();
                if (!a8.isEmpty()) {
                    for (Class cls2 : a8) {
                        if (!this.f11424a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                obj = interfaceC5847a.b(this.f11426c);
                set.remove(cls);
                this.f11424a.put(cls, obj);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        AbstractC6167a.b();
        return obj;
    }

    public static a e(Context context) {
        if (f11422d == null) {
            synchronized (f11423e) {
                try {
                    if (f11422d == null) {
                        f11422d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f11422d;
    }

    void a() {
        try {
            try {
                AbstractC6167a.a("Startup");
                b(this.f11426c.getPackageManager().getProviderInfo(new ComponentName(this.f11426c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e8) {
                throw new StartupException(e8);
            }
        } finally {
            AbstractC6167a.b();
        }
    }

    void b(Bundle bundle) {
        String string = this.f11426c.getString(AbstractC5848b.f36316a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC5847a.class.isAssignableFrom(cls)) {
                            this.f11425b.add(cls);
                        }
                    }
                }
                Iterator it = this.f11425b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e8) {
                throw new StartupException(e8);
            }
        }
    }

    Object c(Class cls) {
        Object obj;
        synchronized (f11423e) {
            try {
                obj = this.f11424a.get(cls);
                if (obj == null) {
                    obj = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f11425b.contains(cls);
    }
}
