package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1089a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: v, reason: collision with root package name */
    private static final ComponentCallbacks2C1089a f13283v = new ComponentCallbacks2C1089a();

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f13284o = new AtomicBoolean();

    /* renamed from: s, reason: collision with root package name */
    private final AtomicBoolean f13285s = new AtomicBoolean();

    /* renamed from: t, reason: collision with root package name */
    private final ArrayList f13286t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    private boolean f13287u = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0228a {
        void a(boolean z7);
    }

    private ComponentCallbacks2C1089a() {
    }

    public static ComponentCallbacks2C1089a b() {
        return f13283v;
    }

    public static void c(Application application) {
        ComponentCallbacks2C1089a componentCallbacks2C1089a = f13283v;
        synchronized (componentCallbacks2C1089a) {
            try {
                if (!componentCallbacks2C1089a.f13287u) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C1089a);
                    application.registerComponentCallbacks(componentCallbacks2C1089a);
                    componentCallbacks2C1089a.f13287u = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(boolean z7) {
        synchronized (f13283v) {
            try {
                Iterator it = this.f13286t.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0228a) it.next()).a(z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(InterfaceC0228a interfaceC0228a) {
        synchronized (f13283v) {
            this.f13286t.add(interfaceC0228a);
        }
    }

    public boolean d() {
        return this.f13284o.get();
    }

    public boolean e(boolean z7) {
        if (!this.f13285s.get()) {
            if (!f3.m.b()) {
                return z7;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f13285s.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f13284o.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f13285s;
        boolean compareAndSet = this.f13284o.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f13285s;
        boolean compareAndSet = this.f13284o.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i8) {
        if (i8 == 20 && this.f13284o.compareAndSet(false, true)) {
            this.f13285s.set(true);
            f(true);
        }
    }
}
