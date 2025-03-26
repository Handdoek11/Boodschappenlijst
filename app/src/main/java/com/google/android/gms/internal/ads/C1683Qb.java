package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Qb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1683Qb implements Application.ActivityLifecycleCallbacks {

    /* renamed from: A, reason: collision with root package name */
    private long f18498A;

    /* renamed from: o, reason: collision with root package name */
    private Activity f18499o;

    /* renamed from: s, reason: collision with root package name */
    private Context f18500s;

    /* renamed from: y, reason: collision with root package name */
    private Runnable f18506y;

    /* renamed from: t, reason: collision with root package name */
    private final Object f18501t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f18502u = true;

    /* renamed from: v, reason: collision with root package name */
    private boolean f18503v = false;

    /* renamed from: w, reason: collision with root package name */
    private final List f18504w = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    private final List f18505x = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    private boolean f18507z = false;

    C1683Qb() {
    }

    private final void k(Activity activity) {
        synchronized (this.f18501t) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f18499o = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Activity a() {
        return this.f18499o;
    }

    public final Context b() {
        return this.f18500s;
    }

    public final void f(InterfaceC1718Rb interfaceC1718Rb) {
        synchronized (this.f18501t) {
            this.f18504w.add(interfaceC1718Rb);
        }
    }

    public final void g(Application application, Context context) {
        if (this.f18507z) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            k((Activity) context);
        }
        this.f18500s = application;
        this.f18498A = ((Long) D2.A.c().a(AbstractC3184kf.f23858c1)).longValue();
        this.f18507z = true;
    }

    public final void h(InterfaceC1718Rb interfaceC1718Rb) {
        synchronized (this.f18501t) {
            this.f18504w.remove(interfaceC1718Rb);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f18501t) {
            try {
                Activity activity2 = this.f18499o;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f18499o = null;
                }
                Iterator it = this.f18505x.iterator();
                while (it.hasNext()) {
                    androidx.appcompat.app.E.a(it.next());
                    try {
                        throw null;
                    } catch (Exception e8) {
                        C2.v.s().x(e8, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        H2.p.e("", e8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        k(activity);
        synchronized (this.f18501t) {
            Iterator it = this.f18505x.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.E.a(it.next());
                try {
                    throw null;
                } catch (Exception e8) {
                    C2.v.s().x(e8, "AppActivityTracker.ActivityListener.onActivityPaused");
                    H2.p.e("", e8);
                }
            }
        }
        this.f18503v = true;
        Runnable runnable = this.f18506y;
        if (runnable != null) {
            G2.D0.f2566l.removeCallbacks(runnable);
        }
        HandlerC1968Yd0 handlerC1968Yd0 = G2.D0.f2566l;
        RunnableC1648Pb runnableC1648Pb = new RunnableC1648Pb(this);
        this.f18506y = runnableC1648Pb;
        handlerC1968Yd0.postDelayed(runnableC1648Pb, this.f18498A);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        k(activity);
        this.f18503v = false;
        boolean z7 = this.f18502u;
        this.f18502u = true;
        Runnable runnable = this.f18506y;
        if (runnable != null) {
            G2.D0.f2566l.removeCallbacks(runnable);
        }
        synchronized (this.f18501t) {
            Iterator it = this.f18505x.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.E.a(it.next());
                try {
                    throw null;
                } catch (Exception e8) {
                    C2.v.s().x(e8, "AppActivityTracker.ActivityListener.onActivityResumed");
                    H2.p.e("", e8);
                }
            }
            if (z7) {
                H2.p.b("App is still foreground.");
            } else {
                Iterator it2 = this.f18504w.iterator();
                while (it2.hasNext()) {
                    try {
                        ((InterfaceC1718Rb) it2.next()).B(true);
                    } catch (Exception e9) {
                        H2.p.e("", e9);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
