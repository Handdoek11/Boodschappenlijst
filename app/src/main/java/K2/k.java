package k2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class k implements e {

    /* renamed from: a, reason: collision with root package name */
    private final a f38511a;

    /* renamed from: b, reason: collision with root package name */
    private final i f38512b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f38513c;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f38514a;

        /* renamed from: b, reason: collision with root package name */
        private Map f38515b = null;

        a(Context context) {
            this.f38514a = context;
        }

        private Map a(Context context) {
            Bundle d8 = d(context);
            if (d8 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d8.keySet()) {
                Object obj = d8.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map c() {
            if (this.f38515b == null) {
                this.f38515b = a(this.f38514a);
            }
            return this.f38515b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        InterfaceC6098d b(String str) {
            String str2 = (String) c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC6098d) Class.forName(str2).asSubclass(InterfaceC6098d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e8) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e8);
                return null;
            } catch (IllegalAccessException e9) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e9);
                return null;
            } catch (InstantiationException e10) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e12);
                return null;
            }
        }
    }

    k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    @Override // k2.e
    public synchronized m e(String str) {
        if (this.f38513c.containsKey(str)) {
            return (m) this.f38513c.get(str);
        }
        InterfaceC6098d b8 = this.f38511a.b(str);
        if (b8 == null) {
            return null;
        }
        m create = b8.create(this.f38512b.a(str));
        this.f38513c.put(str, create);
        return create;
    }

    k(a aVar, i iVar) {
        this.f38513c = new HashMap();
        this.f38511a = aVar;
        this.f38512b = iVar;
    }
}
