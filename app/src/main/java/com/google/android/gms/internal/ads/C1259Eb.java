package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Eb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1259Eb implements InterfaceC1474Kb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f14752a;

    C1259Eb(C1509Lb c1509Lb, Activity activity) {
        this.f14752a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1474Kb
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f14752a);
    }
}
