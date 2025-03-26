package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.oD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3581oD0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3799qD0 f25138a;

    /* synthetic */ C3581oD0(C3799qD0 c3799qD0, AbstractC3690pD0 abstractC3690pD0) {
        this.f25138a = c3799qD0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        C3799qD0 c3799qD0 = this.f25138a;
        c3799qD0.j(C3254lD0.d(context, intent, c3799qD0.f25878h, c3799qD0.f25877g));
    }
}
