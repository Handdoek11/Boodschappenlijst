package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.uk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4284uk0 {
    public static InterfaceExecutorServiceC3522nk0 a(ExecutorService executorService) {
        if (executorService instanceof InterfaceExecutorServiceC3522nk0) {
            return (InterfaceExecutorServiceC3522nk0) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new C4175tk0((ScheduledExecutorService) executorService) : new C3849qk0(executorService);
    }

    public static InterfaceScheduledExecutorServiceC3631ok0 b(ScheduledExecutorService scheduledExecutorService) {
        return new C4175tk0(scheduledExecutorService);
    }

    public static Executor c() {
        return Pj0.INSTANCE;
    }

    static Executor d(Executor executor, AbstractC3738pj0 abstractC3738pj0) {
        executor.getClass();
        return executor == Pj0.INSTANCE ? executor : new ExecutorC3740pk0(executor, abstractC3738pj0);
    }
}
