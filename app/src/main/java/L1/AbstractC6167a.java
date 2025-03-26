package l1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6167a {

    /* renamed from: a, reason: collision with root package name */
    private static long f38777a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f38778b;

    public static void a(String str) {
        AbstractC6168b.a(f(str));
    }

    public static void b() {
        AbstractC6168b.b();
    }

    private static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 29 ? AbstractC6169c.a() : e();
    }

    private static boolean e() {
        try {
            if (f38778b == null) {
                f38777a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f38778b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f38778b.invoke(null, Long.valueOf(f38777a))).booleanValue();
        } catch (Exception e8) {
            c("isTagEnabled", e8);
            return false;
        }
    }

    private static String f(String str) {
        return str.length() <= 127 ? str : str.substring(0, ModuleDescriptor.MODULE_VERSION);
    }
}
