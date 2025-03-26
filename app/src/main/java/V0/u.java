package v0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private static long f44071a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f44072b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f44073c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f44074d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f44075e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f44071a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f44072b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f44073c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f44074d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f44075e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e8) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e8);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
