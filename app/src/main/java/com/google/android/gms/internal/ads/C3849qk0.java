package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.qk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3849qk0 extends AbstractC4391vj0 {

    /* renamed from: o, reason: collision with root package name */
    private final ExecutorService f25987o;

    C3849qk0(ExecutorService executorService) {
        executorService.getClass();
        this.f25987o = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j8, TimeUnit timeUnit) {
        return this.f25987o.awaitTermination(j8, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f25987o.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f25987o.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f25987o.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f25987o.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f25987o.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.f25987o;
        return super.toString() + "[" + String.valueOf(executorService) + "]";
    }
}
