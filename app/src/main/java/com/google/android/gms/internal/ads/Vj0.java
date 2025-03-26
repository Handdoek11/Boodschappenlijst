package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class Vj0 extends AbstractC3189kh0 implements Future {
    protected Vj0() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return h().get();
    }

    protected abstract Future h();

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return h().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return h().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return h().get(j8, timeUnit);
    }
}
