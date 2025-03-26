package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class Y3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f30781o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F3 f30782s;

    Y3(F3 f32, AtomicReference atomicReference) {
        this.f30781o = atomicReference;
        this.f30782s = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30781o) {
            try {
                try {
                    this.f30781o.set(this.f30782s.a().E(this.f30782s.n().D()));
                } finally {
                    this.f30781o.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
