package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes2.dex */
final class N1 extends AbstractC5133j1 implements RunnableFuture {

    /* renamed from: y, reason: collision with root package name */
    private volatile AbstractRunnableC5215x1 f29788y;

    N1(Callable callable) {
        this.f29788y = new M1(this, callable);
    }

    static N1 B(Runnable runnable, Object obj) {
        return new N1(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5091c1
    protected final String i() {
        AbstractRunnableC5215x1 abstractRunnableC5215x1 = this.f29788y;
        if (abstractRunnableC5215x1 == null) {
            return super.i();
        }
        return "task=[" + abstractRunnableC5215x1.toString() + "]";
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5091c1
    protected final void n() {
        AbstractRunnableC5215x1 abstractRunnableC5215x1;
        if (r() && (abstractRunnableC5215x1 = this.f29788y) != null) {
            abstractRunnableC5215x1.e();
        }
        this.f29788y = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        AbstractRunnableC5215x1 abstractRunnableC5215x1 = this.f29788y;
        if (abstractRunnableC5215x1 != null) {
            abstractRunnableC5215x1.run();
        }
        this.f29788y = null;
    }
}
