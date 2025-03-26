package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Db, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1223Db implements InterfaceC1474Kb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f14520a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f14521b;

    C1223Db(C1509Lb c1509Lb, Activity activity, Bundle bundle) {
        this.f14520a = activity;
        this.f14521b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1474Kb
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f14520a, this.f14521b);
    }
}
