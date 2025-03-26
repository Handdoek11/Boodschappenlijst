package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class Tj0 extends Sj0 {

    /* renamed from: y, reason: collision with root package name */
    private final com.google.common.util.concurrent.d f19169y;

    Tj0(com.google.common.util.concurrent.d dVar) {
        dVar.getClass();
        this.f19169y = dVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0, java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        return this.f19169y.cancel(z7);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0, com.google.common.util.concurrent.d
    public final void f(Runnable runnable, Executor executor) {
        this.f19169y.f(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0, java.util.concurrent.Future
    public final Object get() {
        return this.f19169y.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19169y.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f19169y.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    public final String toString() {
        return this.f19169y.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0, java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return this.f19169y.get(j8, timeUnit);
    }
}
