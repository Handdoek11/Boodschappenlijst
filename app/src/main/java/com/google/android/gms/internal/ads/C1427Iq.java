package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Iq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1427Iq extends AbstractC4391vj0 {

    /* renamed from: o, reason: collision with root package name */
    private final Executor f16006o;

    /* synthetic */ C1427Iq(Executor executor, AbstractC1462Jq abstractC1462Jq) {
        this.f16006o = executor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f16006o.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
