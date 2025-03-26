package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.Bb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1152Bb0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1188Cb0 f13823a;

    C1152Bb0(C1188Cb0 c1188Cb0) {
        this.f13823a = c1188Cb0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            C1188Cb0 c1188Cb0 = this.f13823a;
            c1188Cb0.d(true, c1188Cb0.f14203c);
            this.f13823a.f14202b = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            C1188Cb0 c1188Cb02 = this.f13823a;
            c1188Cb02.d(false, c1188Cb02.f14203c);
            this.f13823a.f14202b = false;
        }
    }
}
