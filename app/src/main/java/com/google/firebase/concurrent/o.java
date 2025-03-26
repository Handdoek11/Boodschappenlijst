package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class o implements ScheduledExecutorService {

    /* renamed from: o, reason: collision with root package name */
    private final ExecutorService f32772o;

    /* renamed from: s, reason: collision with root package name */
    private final ScheduledExecutorService f32773s;

    o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f32772o = executorService;
        this.f32773s = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e8) {
            bVar.a(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(final Runnable runnable, final p.b bVar) {
        this.f32772o.execute(new Runnable() { // from class: com.google.firebase.concurrent.m
            @Override // java.lang.Runnable
            public final void run() {
                o.o(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture q(final Runnable runnable, long j8, TimeUnit timeUnit, final p.b bVar) {
        return this.f32773s.schedule(new Runnable() { // from class: com.google.firebase.concurrent.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f32759o.p(runnable, bVar);
            }
        }, j8, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e8) {
            bVar.a(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Future s(final Callable callable, final p.b bVar) {
        return this.f32772o.submit(new Runnable() { // from class: com.google.firebase.concurrent.n
            @Override // java.lang.Runnable
            public final void run() {
                o.r(callable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture t(final Callable callable, long j8, TimeUnit timeUnit, final p.b bVar) {
        return this.f32773s.schedule(new Callable() { // from class: com.google.firebase.concurrent.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f32762o.s(callable, bVar);
            }
        }, j8, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e8) {
            bVar.a(e8);
            throw e8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(final Runnable runnable, final p.b bVar) {
        this.f32772o.execute(new Runnable() { // from class: com.google.firebase.concurrent.d
            @Override // java.lang.Runnable
            public final void run() {
                o.u(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture w(final Runnable runnable, long j8, long j9, TimeUnit timeUnit, final p.b bVar) {
        return this.f32773s.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f32756o.v(runnable, bVar);
            }
        }, j8, j9, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(final Runnable runnable, final p.b bVar) {
        this.f32772o.execute(new Runnable() { // from class: com.google.firebase.concurrent.e
            @Override // java.lang.Runnable
            public final void run() {
                o.z(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture y(final Runnable runnable, long j8, long j9, TimeUnit timeUnit, final p.b bVar) {
        return this.f32773s.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f32765o.x(runnable, bVar);
            }
        }, j8, j9, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e8) {
            bVar.a(e8);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j8, TimeUnit timeUnit) {
        return this.f32772o.awaitTermination(j8, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f32772o.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f32772o.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f32772o.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f32772o.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f32772o.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j8, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.c
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                return this.f32734a.q(runnable, j8, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j8, final long j9, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.f
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                return this.f32742a.w(runnable, j8, j9, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j8, final long j9, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                return this.f32747a.y(runnable, j8, j9, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f32772o.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j8, TimeUnit timeUnit) {
        return this.f32772o.invokeAll(collection, j8, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j8, TimeUnit timeUnit) {
        return this.f32772o.invokeAny(collection, j8, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j8, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                return this.f32752a.t(callable, j8, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f32772o.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f32772o.submit(runnable);
    }
}
