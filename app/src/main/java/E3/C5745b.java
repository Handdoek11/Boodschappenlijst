package e3;

import Z2.r;
import Z2.t0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import f3.m;
import h3.e;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* renamed from: e3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5745b {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f35323b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile C5745b f35324c;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f35325a = new ConcurrentHashMap();

    private C5745b() {
    }

    public static C5745b b() {
        if (f35324c == null) {
            synchronized (f35323b) {
                try {
                    if (f35324c == null) {
                        f35324c = new C5745b();
                    }
                } finally {
                }
            }
        }
        C5745b c5745b = f35324c;
        r.l(c5745b);
        return c5745b;
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i8, boolean z7, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((e.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!g(serviceConnection)) {
            return h(context, intent, serviceConnection, i8, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f35325a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean h8 = h(context, intent, serviceConnection, i8, executor);
            if (h8) {
                return h8;
            }
            return false;
        } finally {
            this.f35325a.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof t0);
    }

    private static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i8, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!m.k() || executor == null) ? context.bindService(intent, serviceConnection, i8) : context.bindService(intent, i8, executor, serviceConnection);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i8) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i8, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!g(serviceConnection) || !this.f35325a.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) this.f35325a.get(serviceConnection));
        } finally {
            this.f35325a.remove(serviceConnection);
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i8, Executor executor) {
        return f(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
