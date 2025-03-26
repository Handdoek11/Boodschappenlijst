package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.tk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4175tk0 extends C3849qk0 implements InterfaceScheduledExecutorServiceC3631ok0 {

    /* renamed from: s, reason: collision with root package name */
    final ScheduledExecutorService f26919s;

    C4175tk0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f26919s = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final InterfaceScheduledFutureC3413mk0 schedule(Callable callable, long j8, TimeUnit timeUnit) {
        Ek0 ek0 = new Ek0(callable);
        return new C3957rk0(ek0, this.f26919s.schedule(ek0, j8, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j8, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.f26919s;
        Ek0 E7 = Ek0.E(runnable, null);
        return new C3957rk0(E7, scheduledExecutorService.schedule(E7, j8, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
        RunnableC4066sk0 runnableC4066sk0 = new RunnableC4066sk0(runnable);
        return new C3957rk0(runnableC4066sk0, this.f26919s.scheduleAtFixedRate(runnableC4066sk0, j8, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
        RunnableC4066sk0 runnableC4066sk0 = new RunnableC4066sk0(runnable);
        return new C3957rk0(runnableC4066sk0, this.f26919s.scheduleWithFixedDelay(runnableC4066sk0, j8, j9, timeUnit));
    }
}
