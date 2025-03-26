package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.c4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5303c4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ Bundle f30895o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F3 f30896s;

    RunnableC5303c4(F3 f32, Bundle bundle) {
        this.f30895o = bundle;
        this.f30896s = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F3.O0(this.f30896s, this.f30895o);
    }
}
