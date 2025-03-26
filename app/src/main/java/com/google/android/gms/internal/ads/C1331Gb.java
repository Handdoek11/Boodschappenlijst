package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Gb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1331Gb implements InterfaceC1474Kb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f15407a;

    C1331Gb(C1509Lb c1509Lb, Activity activity) {
        this.f15407a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1474Kb
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f15407a);
    }
}
