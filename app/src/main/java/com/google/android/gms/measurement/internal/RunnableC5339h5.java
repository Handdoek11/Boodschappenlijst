package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.h5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5339h5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC5311d5 f30983o;

    RunnableC5339h5(ServiceConnectionC5311d5 serviceConnectionC5311d5) {
        this.f30983o = serviceConnectionC5311d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F4.I(this.f30983o.f30910c, new ComponentName(this.f30983o.f30910c.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
