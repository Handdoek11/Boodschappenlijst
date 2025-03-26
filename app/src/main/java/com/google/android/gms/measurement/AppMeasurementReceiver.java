package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import w3.l;

/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends R0.a implements l.a {

    /* renamed from: t, reason: collision with root package name */
    private l f30244t;

    @Override // w3.l.a
    public final void a(Context context, Intent intent) {
        R0.a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f30244t == null) {
            this.f30244t = new l(this);
        }
        this.f30244t.a(context, intent);
    }
}
