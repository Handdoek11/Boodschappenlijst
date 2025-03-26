package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
abstract class Nj0 extends AbstractRunnableC3195kk0 {

    /* renamed from: t, reason: collision with root package name */
    private final Executor f17579t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ Oj0 f17580u;

    Nj0(Oj0 oj0, Executor executor) {
        this.f17580u = oj0;
        executor.getClass();
        this.f17579t = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3195kk0
    final void d(Throwable th) {
        this.f17580u.f17941G = null;
        if (th instanceof ExecutionException) {
            this.f17580u.h(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.f17580u.cancel(false);
        } else {
            this.f17580u.h(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3195kk0
    final void e(Object obj) {
        this.f17580u.f17941G = null;
        h(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3195kk0
    final boolean f() {
        return this.f17580u.isDone();
    }

    abstract void h(Object obj);

    final void i() {
        try {
            this.f17579t.execute(this);
        } catch (RejectedExecutionException e8) {
            this.f17580u.h(e8);
        }
    }
}
