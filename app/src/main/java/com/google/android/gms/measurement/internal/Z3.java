package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class Z3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ long f30799o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F3 f30800s;

    Z3(F3 f32, long j8) {
        this.f30799o = j8;
        this.f30800s = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30800s.K0(this.f30799o);
        this.f30800s.r().M(new AtomicReference());
    }
}
