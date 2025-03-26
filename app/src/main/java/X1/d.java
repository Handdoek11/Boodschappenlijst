package X1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5897a;

    public d(Context context) {
        this.f5897a = context;
    }

    private ApplicationInfo a() {
        return this.f5897a.getPackageManager().getApplicationInfo(this.f5897a.getPackageName(), 128);
    }

    private static b c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e8) {
                d(cls, e8);
            } catch (InstantiationException e9) {
                d(cls, e9);
            } catch (NoSuchMethodException e10) {
                d(cls, e10);
            } catch (InvocationTargetException e11) {
                d(cls, e11);
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
        } catch (ClassNotFoundException e12) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e12);
        }
    }

    private static void d(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public List b() {
        ApplicationInfo a8;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            a8 = a();
        } catch (PackageManager.NameNotFoundException e8) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e8);
            }
        }
        if (a8 != null && a8.metaData != null) {
            if (Log.isLoggable("ManifestParser", 2)) {
                Log.v("ManifestParser", "Got app info metadata: " + a8.metaData);
            }
            for (String str : a8.metaData.keySet()) {
                if ("GlideModule".equals(a8.metaData.get(str))) {
                    c(str);
                    arrayList.add(null);
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Loaded Glide module: " + str);
                    }
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
            }
            return arrayList;
        }
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Got null app info metadata");
        }
        return arrayList;
    }
}
