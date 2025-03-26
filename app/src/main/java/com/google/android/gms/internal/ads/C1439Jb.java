package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1439Jb implements InterfaceC1474Kb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f16271a;

    C1439Jb(C1509Lb c1509Lb, Activity activity) {
        this.f16271a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1474Kb
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f16271a);
    }
}
