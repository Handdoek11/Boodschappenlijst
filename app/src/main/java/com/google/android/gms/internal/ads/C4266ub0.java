package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ub0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4266ub0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o, reason: collision with root package name */
    private boolean f27081o;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f27082s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC4157tb0 f27083t;

    private final void a(boolean z7) {
        if (this.f27082s != z7) {
            this.f27082s = z7;
            if (this.f27081o) {
                b(z7);
                InterfaceC4157tb0 interfaceC4157tb0 = this.f27083t;
                if (interfaceC4157tb0 != null) {
                    interfaceC4157tb0.a(z7);
                }
            }
        }
    }

    private final boolean h() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || c();
    }

    protected void b(boolean z7) {
    }

    protected boolean c() {
        return false;
    }

    public final void d(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void e(InterfaceC4157tb0 interfaceC4157tb0) {
        this.f27083t = interfaceC4157tb0;
    }

    public final void f() {
        this.f27081o = true;
        boolean h8 = h();
        this.f27082s = h8;
        b(h8);
    }

    public final void g() {
        this.f27081o = false;
        this.f27083t = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(h());
    }
}
