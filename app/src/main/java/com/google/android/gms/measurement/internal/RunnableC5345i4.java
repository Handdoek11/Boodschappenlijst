package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.i4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5345i4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f30993o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F3 f30994s;

    RunnableC5345i4(F3 f32, AtomicReference atomicReference) {
        this.f30993o = atomicReference;
        this.f30994s = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30993o) {
            try {
                try {
                    this.f30993o.set(Long.valueOf(this.f30994s.a().y(this.f30994s.n().D(), G.f30400P)));
                } finally {
                    this.f30993o.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
