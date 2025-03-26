package com.google.android.gms.internal.play_billing;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class C1 extends AbstractC5121h1 {

    /* renamed from: o, reason: collision with root package name */
    private final ExecutorService f29683o;

    C1(ExecutorService executorService) {
        executorService.getClass();
        this.f29683o = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j8, TimeUnit timeUnit) {
        return this.f29683o.awaitTermination(j8, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f29683o.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f29683o.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f29683o.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f29683o.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f29683o.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.f29683o;
        return super.toString() + "[" + String.valueOf(executorService) + "]";
    }
}
