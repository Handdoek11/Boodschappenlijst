package R4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import x6.C6916E;

/* loaded from: classes2.dex */
public final class H implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o, reason: collision with root package name */
    public static final H f4807o = new H();

    /* renamed from: s, reason: collision with root package name */
    private static boolean f4808s;

    /* renamed from: t, reason: collision with root package name */
    private static D f4809t;

    private H() {
    }

    public final void a(D d8) {
        f4809t = d8;
        if (d8 == null || !f4808s) {
            return;
        }
        f4808s = false;
        d8.k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        J6.r.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        J6.r.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        J6.r.e(activity, "activity");
        D d8 = f4809t;
        if (d8 != null) {
            d8.h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C6916E c6916e;
        J6.r.e(activity, "activity");
        D d8 = f4809t;
        if (d8 != null) {
            d8.k();
            c6916e = C6916E.f44463a;
        } else {
            c6916e = null;
        }
        if (c6916e == null) {
            f4808s = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        J6.r.e(activity, "activity");
        J6.r.e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        J6.r.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        J6.r.e(activity, "activity");
    }
}
