package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Fb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1295Fb implements InterfaceC1474Kb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f15178a;

    C1295Fb(C1509Lb c1509Lb, Activity activity) {
        this.f15178a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1474Kb
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f15178a);
    }
}
