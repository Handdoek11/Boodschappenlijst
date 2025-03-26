package f3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import o0.AbstractC6278a;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final int f35874a = Process.myUid();

    /* renamed from: b, reason: collision with root package name */
    private static final Method f35875b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f35876c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f35877d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f35878e;

    /* renamed from: f, reason: collision with root package name */
    private static final Method f35879f;

    /* renamed from: g, reason: collision with root package name */
    private static final Method f35880g;

    /* renamed from: h, reason: collision with root package name */
    private static final Method f35881h;

    /* renamed from: i, reason: collision with root package name */
    private static final Method f35882i;

    /* renamed from: j, reason: collision with root package name */
    private static Boolean f35883j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f35875b = method;
        if (m.c()) {
            try {
                method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused2) {
            }
        } else {
            method2 = null;
        }
        f35876c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f35877d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        f35878e = method4;
        if (m.c()) {
            try {
                method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused5) {
            }
        } else {
            method5 = null;
        }
        f35879f = method5;
        if (m.j()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e8) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e8);
            }
        } else {
            method6 = null;
        }
        f35880g = method6;
        if (m.j()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e9) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e9);
            }
        } else {
            method7 = null;
        }
        f35881h = method7;
        if (m.j()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
        } else {
            method8 = null;
        }
        f35882i = method8;
        f35883j = null;
    }

    public static void a(WorkSource workSource, int i8, String str) {
        Method method = f35876c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i8), str);
                return;
            } catch (Exception e8) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e8);
                return;
            }
        }
        Method method2 = f35875b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i8));
            } catch (Exception e9) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e9);
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo c8 = h3.e.a(context).c(str, 0);
                if (c8 == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i8 = c8.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i8, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static synchronized boolean c(Context context) {
        synchronized (s.class) {
            Boolean bool = f35883j;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (context == null) {
                return false;
            }
            boolean z7 = AbstractC6278a.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
            f35883j = Boolean.valueOf(z7);
            return z7;
        }
    }
}
