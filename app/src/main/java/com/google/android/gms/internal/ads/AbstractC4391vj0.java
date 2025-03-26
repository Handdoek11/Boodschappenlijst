package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.android.gms.internal.ads.vj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4391vj0 extends AbstractExecutorService implements InterfaceExecutorServiceC3522nk0 {
    @Override // com.google.android.gms.internal.ads.InterfaceExecutorServiceC3522nk0
    public final com.google.common.util.concurrent.d k(Runnable runnable) {
        return (com.google.common.util.concurrent.d) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return Ek0.E(runnable, obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceExecutorServiceC3522nk0
    public final com.google.common.util.concurrent.d p0(Callable callable) {
        return (com.google.common.util.concurrent.d) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (com.google.common.util.concurrent.d) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new Ek0(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (com.google.common.util.concurrent.d) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (com.google.common.util.concurrent.d) super.submit(callable);
    }
}
