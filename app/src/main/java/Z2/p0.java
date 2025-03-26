package Z2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class p0 implements ServiceConnection, t0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f6393a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f6394b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6395c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f6396d;

    /* renamed from: e, reason: collision with root package name */
    private final n0 f6397e;

    /* renamed from: f, reason: collision with root package name */
    private ComponentName f6398f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ s0 f6399g;

    public p0(s0 s0Var, n0 n0Var) {
        this.f6399g = s0Var;
        this.f6397e = n0Var;
    }

    public final int a() {
        return this.f6394b;
    }

    public final ComponentName b() {
        return this.f6398f;
    }

    public final IBinder c() {
        return this.f6396d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f6393a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.f6394b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (f3.m.m()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            s0 s0Var = this.f6399g;
            boolean d8 = s0Var.f6409j.d(s0Var.f6406g, str, this.f6397e.b(s0Var.f6406g), this, 4225, executor);
            this.f6395c = d8;
            if (d8) {
                this.f6399g.f6407h.sendMessageDelayed(this.f6399g.f6407h.obtainMessage(1, this.f6397e), this.f6399g.f6411l);
            } else {
                this.f6394b = 2;
                try {
                    s0 s0Var2 = this.f6399g;
                    s0Var2.f6409j.c(s0Var2.f6406g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f6393a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f6399g.f6407h.removeMessages(1, this.f6397e);
        s0 s0Var = this.f6399g;
        s0Var.f6409j.c(s0Var.f6406g, this);
        this.f6395c = false;
        this.f6394b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f6393a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f6393a.isEmpty();
    }

    public final boolean j() {
        return this.f6395c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f6399g.f6405f) {
            try {
                this.f6399g.f6407h.removeMessages(1, this.f6397e);
                this.f6396d = iBinder;
                this.f6398f = componentName;
                Iterator it = this.f6393a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f6394b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6399g.f6405f) {
            try {
                this.f6399g.f6407h.removeMessages(1, this.f6397e);
                this.f6396d = null;
                this.f6398f = componentName;
                Iterator it = this.f6393a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f6394b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
