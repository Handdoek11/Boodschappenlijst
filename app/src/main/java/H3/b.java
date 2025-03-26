package h3;

import android.content.Context;
import f3.m;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static Context f36215a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f36216b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        synchronized (b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f36215a;
            if (context2 != null && (bool = f36216b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f36216b = null;
            if (m.i()) {
                f36216b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f36216b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f36216b = Boolean.FALSE;
                }
            }
            f36215a = applicationContext;
            return f36216b.booleanValue();
        }
    }
}
