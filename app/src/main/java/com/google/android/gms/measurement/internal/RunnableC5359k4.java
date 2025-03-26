package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.k4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5359k4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f31050o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F3 f31051s;

    RunnableC5359k4(F3 f32, AtomicReference atomicReference) {
        this.f31050o = atomicReference;
        this.f31051s = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f31050o) {
            try {
                try {
                    this.f31050o.set(Double.valueOf(this.f31051s.a().m(this.f31051s.n().D(), G.f30404R)));
                } finally {
                    this.f31050o.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
