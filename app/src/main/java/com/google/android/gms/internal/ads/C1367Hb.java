package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Hb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1367Hb implements InterfaceC1474Kb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f15754a;

    C1367Hb(C1509Lb c1509Lb, Activity activity) {
        this.f15754a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1474Kb
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f15754a);
    }
}
