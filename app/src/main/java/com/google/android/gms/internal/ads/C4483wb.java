package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.wb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4483wb extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewOnAttachStateChangeListenerC4810zb f27509a;

    C4483wb(ViewOnAttachStateChangeListenerC4810zb viewOnAttachStateChangeListenerC4810zb) {
        this.f27509a = viewOnAttachStateChangeListenerC4810zb;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f27509a.j(3);
    }
}
