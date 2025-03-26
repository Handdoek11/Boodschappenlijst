package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class V9 implements InterfaceC2305ca {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f19557a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f19558b;

    V9(C2414da c2414da, Activity activity, Bundle bundle) {
        this.f19557a = activity;
        this.f19558b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2305ca
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f19557a, this.f19558b);
    }
}
