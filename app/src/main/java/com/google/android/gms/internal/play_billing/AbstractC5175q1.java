package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.play_billing.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5175q1 extends AbstractC5186s1 {
    public static InterfaceFutureC5225z1 a(Object obj) {
        return new C5192t1(obj);
    }

    public static InterfaceFutureC5225z1 b(InterfaceFutureC5225z1 interfaceFutureC5225z1, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return interfaceFutureC5225z1.isDone() ? interfaceFutureC5225z1 : L1.C(interfaceFutureC5225z1, 28500L, timeUnit, scheduledExecutorService);
    }

    public static void c(InterfaceFutureC5225z1 interfaceFutureC5225z1, InterfaceC5163o1 interfaceC5163o1, Executor executor) {
        interfaceFutureC5225z1.g(new RunnableC5169p1(interfaceFutureC5225z1, interfaceC5163o1), executor);
    }
}
