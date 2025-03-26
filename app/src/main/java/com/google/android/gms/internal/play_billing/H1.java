package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class H1 {
    public static A1 a(ExecutorService executorService) {
        if (executorService instanceof A1) {
            return (A1) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new G1((ScheduledExecutorService) executorService) : new C1(executorService);
    }

    public static B1 b(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof B1 ? (B1) scheduledExecutorService : new G1(scheduledExecutorService);
    }
}
