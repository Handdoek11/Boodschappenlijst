package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class Z9 implements InterfaceC2305ca {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f20428a;

    Z9(C2414da c2414da, Activity activity) {
        this.f20428a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2305ca
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f20428a);
    }
}
