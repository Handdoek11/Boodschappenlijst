package U6;

import Z6.AbstractC0789c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: U6.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0728m0 extends AbstractC0726l0 implements W {

    /* renamed from: u, reason: collision with root package name */
    private final Executor f5468u;

    public C0728m0(Executor executor) {
        this.f5468u = executor;
        AbstractC0789c.a(B0());
    }

    private final void A0(A6.g gVar, RejectedExecutionException rejectedExecutionException) {
        AbstractC0751y0.c(gVar, AbstractC0724k0.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture C0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, A6.g gVar, long j8) {
        try {
            return scheduledExecutorService.schedule(runnable, j8, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e8) {
            A0(gVar, e8);
            return null;
        }
    }

    public Executor B0() {
        return this.f5468u;
    }

    @Override // U6.W
    public void E(long j8, InterfaceC0731o interfaceC0731o) {
        Executor B02 = B0();
        ScheduledExecutorService scheduledExecutorService = B02 instanceof ScheduledExecutorService ? (ScheduledExecutorService) B02 : null;
        ScheduledFuture C02 = scheduledExecutorService != null ? C0(scheduledExecutorService, new N0(this, interfaceC0731o), interfaceC0731o.getContext(), j8) : null;
        if (C02 != null) {
            AbstractC0751y0.f(interfaceC0731o, C02);
        } else {
            S.f5421z.E(j8, interfaceC0731o);
        }
    }

    @Override // U6.AbstractC0726l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor B02 = B0();
        ExecutorService executorService = B02 instanceof ExecutorService ? (ExecutorService) B02 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0728m0) && ((C0728m0) obj).B0() == B0();
    }

    public int hashCode() {
        return System.identityHashCode(B0());
    }

    @Override // U6.I
    public void q0(A6.g gVar, Runnable runnable) {
        try {
            Executor B02 = B0();
            AbstractC0707c.a();
            B02.execute(runnable);
        } catch (RejectedExecutionException e8) {
            AbstractC0707c.a();
            A0(gVar, e8);
            C0706b0.b().q0(gVar, runnable);
        }
    }

    @Override // U6.I
    public String toString() {
        return B0().toString();
    }
}
