package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.ba, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2197ba implements InterfaceC2305ca {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f20890a;

    C2197ba(C2414da c2414da, Activity activity) {
        this.f20890a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2305ca
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f20890a);
    }
}
