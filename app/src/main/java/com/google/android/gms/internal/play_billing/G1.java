package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class G1 extends C1 implements B1 {

    /* renamed from: s, reason: collision with root package name */
    final ScheduledExecutorService f29705s;

    G1(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f29705s = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j8, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.f29705s;
        N1 B7 = N1.B(runnable, null);
        return new D1(B7, scheduledExecutorService.schedule(B7, j8, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
        E1 e12 = new E1(runnable);
        return new D1(e12, this.f29705s.scheduleAtFixedRate(e12, j8, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
        E1 e12 = new E1(runnable);
        return new D1(e12, this.f29705s.scheduleWithFixedDelay(e12, j8, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j8, TimeUnit timeUnit) {
        N1 n12 = new N1(callable);
        return new D1(n12, this.f29705s.schedule(n12, j8, timeUnit));
    }
}
