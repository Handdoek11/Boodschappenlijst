package p3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.internal.consent_sdk.zzg;

/* renamed from: p3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6371w implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o, reason: collision with root package name */
    private final Activity f40387o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ C6377z f40388s;

    public C6371w(C6377z c6377z, Activity activity) {
        this.f40388s = c6377z;
        this.f40387o = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.f40388s.f40391a.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C6377z c6377z = this.f40388s;
        if (c6377z.f40396f == null || !c6377z.f40402l) {
            return;
        }
        c6377z.f40396f.setOwnerActivity(activity);
        C6377z c6377z2 = this.f40388s;
        if (c6377z2.f40392b != null) {
            c6377z2.f40392b.a(activity);
        }
        C6371w c6371w = (C6371w) this.f40388s.f40401k.getAndSet(null);
        if (c6371w != null) {
            c6371w.b();
            C6377z c6377z3 = this.f40388s;
            C6371w c6371w2 = new C6371w(c6377z3, activity);
            c6377z3.f40391a.registerActivityLifecycleCallbacks(c6371w2);
            this.f40388s.f40401k.set(c6371w2);
        }
        C6377z c6377z4 = this.f40388s;
        if (c6377z4.f40396f != null) {
            c6377z4.f40396f.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity != this.f40387o) {
            return;
        }
        if (activity.isChangingConfigurations()) {
            C6377z c6377z = this.f40388s;
            if (c6377z.f40402l && c6377z.f40396f != null) {
                c6377z.f40396f.dismiss();
                return;
            }
        }
        this.f40388s.i(new zzg(3, "Activity is destroyed."));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
