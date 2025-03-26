package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.yy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4748yy0 extends BroadcastReceiver implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final Handler f28247o;

    public RunnableC4748yy0(Ay0 ay0, Handler handler, InterfaceC4857zy0 interfaceC4857zy0) {
        this.f28247o = handler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f28247o.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
