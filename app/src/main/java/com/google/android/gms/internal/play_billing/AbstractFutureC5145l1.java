package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.play_billing.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractFutureC5145l1 extends X implements Future {
    protected AbstractFutureC5145l1() {
    }

    protected abstract Future c();

    @Override // java.util.concurrent.Future
    public final Object get() {
        return c().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return c().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return c().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return c().get(j8, timeUnit);
    }
}
