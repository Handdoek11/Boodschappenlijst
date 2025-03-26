package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.ua, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4263ua extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewOnAttachStateChangeListenerC4372va f27074a;

    C4263ua(ViewOnAttachStateChangeListenerC4372va viewOnAttachStateChangeListenerC4372va) {
        this.f27074a = viewOnAttachStateChangeListenerC4372va;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f27074a.f();
    }
}
