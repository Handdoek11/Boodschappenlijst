package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5296b4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ Bundle f30841o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F3 f30842s;

    RunnableC5296b4(F3 f32, Bundle bundle) {
        this.f30841o = bundle;
        this.f30842s = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F3.S(this.f30842s, this.f30841o);
    }
}
