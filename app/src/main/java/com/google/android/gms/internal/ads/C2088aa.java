package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.aa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2088aa implements InterfaceC2305ca {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f20717a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f20718b;

    C2088aa(C2414da c2414da, Activity activity, Bundle bundle) {
        this.f20717a = activity;
        this.f20718b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2305ca
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f20717a, this.f20718b);
    }
}
