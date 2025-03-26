package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.da, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2414da implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o, reason: collision with root package name */
    private final Application f21595o;

    /* renamed from: s, reason: collision with root package name */
    private final WeakReference f21596s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f21597t = false;

    public C2414da(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f21596s = new WeakReference(activityLifecycleCallbacks);
        this.f21595o = application;
    }

    protected final void a(InterfaceC2305ca interfaceC2305ca) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f21596s.get();
            if (activityLifecycleCallbacks != null) {
                interfaceC2305ca.a(activityLifecycleCallbacks);
            } else {
                if (this.f21597t) {
                    return;
                }
                this.f21595o.unregisterActivityLifecycleCallbacks(this);
                this.f21597t = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new V9(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new C2197ba(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new Y9(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new X9(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new C2088aa(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new W9(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new Z9(this, activity));
    }
}
