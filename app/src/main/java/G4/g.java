package g4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f36041a;

    /* renamed from: b, reason: collision with root package name */
    private final c f36042b;

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f36043a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f36043a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f36043a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // g4.g.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List a(Context context) {
            Bundle b8 = b(context);
            if (b8 == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b8.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b8.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class cls) {
            this.f36043a = cls;
        }
    }

    interface c {
        List a(Object obj);
    }

    g(Object obj, c cVar) {
        this.f36041a = obj;
        this.f36042b = cVar;
    }

    public static g c(Context context, Class cls) {
        return new g(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e8) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e8);
        } catch (InstantiationException e9) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e9);
        } catch (NoSuchMethodException e10) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e10);
        } catch (InvocationTargetException e11) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e11);
        }
    }

    public List b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f36042b.a(this.f36041a)) {
            arrayList.add(new H4.b() { // from class: g4.f
                @Override // H4.b
                public final Object get() {
                    return g.d(str);
                }
            });
        }
        return arrayList;
    }
}
