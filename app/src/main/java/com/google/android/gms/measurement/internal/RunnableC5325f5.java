package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.f5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5325f5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ ComponentName f30947o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC5311d5 f30948s;

    RunnableC5325f5(ServiceConnectionC5311d5 serviceConnectionC5311d5, ComponentName componentName) {
        this.f30947o = componentName;
        this.f30948s = serviceConnectionC5311d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F4.I(this.f30948s.f30910c, this.f30947o);
    }
}
