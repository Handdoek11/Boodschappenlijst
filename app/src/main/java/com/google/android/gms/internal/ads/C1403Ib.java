package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Ib, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1403Ib implements InterfaceC1474Kb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f15969a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f15970b;

    C1403Ib(C1509Lb c1509Lb, Activity activity, Bundle bundle) {
        this.f15969a = activity;
        this.f15970b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1474Kb
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f15969a, this.f15970b);
    }
}
