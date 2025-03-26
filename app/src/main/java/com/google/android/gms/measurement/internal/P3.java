package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class P3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f30650o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F3 f30651s;

    P3(F3 f32, AtomicReference atomicReference) {
        this.f30650o = atomicReference;
        this.f30651s = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30650o) {
            try {
                try {
                    this.f30650o.set(Boolean.valueOf(this.f30651s.a().K(this.f30651s.n().D())));
                } finally {
                    this.f30650o.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
