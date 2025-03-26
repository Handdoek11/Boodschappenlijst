package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.h4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5338h4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f30981o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F3 f30982s;

    RunnableC5338h4(F3 f32, AtomicReference atomicReference) {
        this.f30981o = atomicReference;
        this.f30982s = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30981o) {
            try {
                try {
                    this.f30981o.set(Integer.valueOf(this.f30982s.a().u(this.f30982s.n().D(), G.f30402Q)));
                } finally {
                    this.f30981o.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
