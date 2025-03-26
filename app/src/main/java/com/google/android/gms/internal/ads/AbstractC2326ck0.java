package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ck0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2326ck0 extends AbstractC2543ek0 {
    public static C2109ak0 a(Iterable iterable) {
        return new C2109ak0(false, AbstractC4169th0.s(iterable), null);
    }

    public static C2109ak0 b(Iterable iterable) {
        return new C2109ak0(true, AbstractC4169th0.s(iterable), null);
    }

    public static C2109ak0 c(com.google.common.util.concurrent.d... dVarArr) {
        return new C2109ak0(true, AbstractC4169th0.v(dVarArr), null);
    }

    public static com.google.common.util.concurrent.d d(Iterable iterable) {
        return new Jj0(AbstractC4169th0.s(iterable), true);
    }

    public static com.google.common.util.concurrent.d e(com.google.common.util.concurrent.d dVar, Class cls, InterfaceC1376Hf0 interfaceC1376Hf0, Executor executor) {
        C2324cj0 c2324cj0 = new C2324cj0(dVar, cls, interfaceC1376Hf0);
        dVar.f(c2324cj0, AbstractC4284uk0.d(executor, c2324cj0));
        return c2324cj0;
    }

    public static com.google.common.util.concurrent.d f(com.google.common.util.concurrent.d dVar, Class cls, InterfaceC1420Ij0 interfaceC1420Ij0, Executor executor) {
        C2216bj0 c2216bj0 = new C2216bj0(dVar, cls, interfaceC1420Ij0);
        dVar.f(c2216bj0, AbstractC4284uk0.d(executor, c2216bj0));
        return c2216bj0;
    }

    public static com.google.common.util.concurrent.d g(Throwable th) {
        th.getClass();
        return new C2652fk0(th);
    }

    public static com.google.common.util.concurrent.d h(Object obj) {
        return obj == null ? C2761gk0.f22433s : new C2761gk0(obj);
    }

    public static com.google.common.util.concurrent.d i() {
        return C2761gk0.f22433s;
    }

    public static com.google.common.util.concurrent.d j(Callable callable, Executor executor) {
        Ek0 ek0 = new Ek0(callable);
        executor.execute(ek0);
        return ek0;
    }

    public static com.google.common.util.concurrent.d k(InterfaceC1384Hj0 interfaceC1384Hj0, Executor executor) {
        Ek0 ek0 = new Ek0(interfaceC1384Hj0);
        executor.execute(ek0);
        return ek0;
    }

    public static com.google.common.util.concurrent.d l(com.google.common.util.concurrent.d... dVarArr) {
        return new Jj0(AbstractC4169th0.v(dVarArr), false);
    }

    public static com.google.common.util.concurrent.d m(com.google.common.util.concurrent.d dVar, InterfaceC1376Hf0 interfaceC1376Hf0, Executor executor) {
        C4609xj0 c4609xj0 = new C4609xj0(dVar, interfaceC1376Hf0);
        dVar.f(c4609xj0, AbstractC4284uk0.d(executor, c4609xj0));
        return c4609xj0;
    }

    public static com.google.common.util.concurrent.d n(com.google.common.util.concurrent.d dVar, InterfaceC1420Ij0 interfaceC1420Ij0, Executor executor) {
        int i8 = AbstractRunnableC4718yj0.f28177A;
        executor.getClass();
        C4500wj0 c4500wj0 = new C4500wj0(dVar, interfaceC1420Ij0);
        dVar.f(c4500wj0, AbstractC4284uk0.d(executor, c4500wj0));
        return c4500wj0;
    }

    public static com.google.common.util.concurrent.d o(com.google.common.util.concurrent.d dVar, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return dVar.isDone() ? dVar : Bk0.F(dVar, j8, timeUnit, scheduledExecutorService);
    }

    public static Object p(Future future) {
        if (future.isDone()) {
            return Fk0.a(future);
        }
        throw new IllegalStateException(AbstractC3187kg0.b("Future was expected to be done: %s", future));
    }

    public static Object q(Future future) {
        try {
            return Fk0.a(future);
        } catch (ExecutionException e8) {
            if (e8.getCause() instanceof Error) {
                throw new Qj0((Error) e8.getCause());
            }
            throw new zzgdj(e8.getCause());
        }
    }

    public static void r(com.google.common.util.concurrent.d dVar, Yj0 yj0, Executor executor) {
        yj0.getClass();
        dVar.f(new Zj0(dVar, yj0), executor);
    }
}
