package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Lb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1509Lb implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o, reason: collision with root package name */
    private final Application f16851o;

    /* renamed from: s, reason: collision with root package name */
    private final WeakReference f16852s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f16853t = false;

    public C1509Lb(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f16852s = new WeakReference(activityLifecycleCallbacks);
        this.f16851o = application;
    }

    protected final void a(InterfaceC1474Kb interfaceC1474Kb) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f16852s.get();
            if (activityLifecycleCallbacks != null) {
                interfaceC1474Kb.a(activityLifecycleCallbacks);
            } else {
                if (this.f16853t) {
                    return;
                }
                this.f16851o.unregisterActivityLifecycleCallbacks(this);
                this.f16853t = true;
            }
        } catch (Exception e8) {
            H2.p.e("Error while dispatching lifecycle callback.", e8);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new C1223Db(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new C1439Jb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new C1331Gb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new C1295Fb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new C1403Ib(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new C1259Eb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new C1367Hb(this, activity));
    }
}
