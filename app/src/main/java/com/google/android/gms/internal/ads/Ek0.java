package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes.dex */
final class Ek0 extends Rj0 implements RunnableFuture {

    /* renamed from: y, reason: collision with root package name */
    private volatile AbstractRunnableC3195kk0 f14769y;

    Ek0(InterfaceC1384Hj0 interfaceC1384Hj0) {
        this.f14769y = new Ck0(this, interfaceC1384Hj0);
    }

    static Ek0 E(Runnable runnable, Object obj) {
        return new Ek0(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    protected final String c() {
        AbstractRunnableC3195kk0 abstractRunnableC3195kk0 = this.f14769y;
        if (abstractRunnableC3195kk0 == null) {
            return super.c();
        }
        return "task=[" + abstractRunnableC3195kk0.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3738pj0
    protected final void d() {
        AbstractRunnableC3195kk0 abstractRunnableC3195kk0;
        if (w() && (abstractRunnableC3195kk0 = this.f14769y) != null) {
            abstractRunnableC3195kk0.g();
        }
        this.f14769y = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        AbstractRunnableC3195kk0 abstractRunnableC3195kk0 = this.f14769y;
        if (abstractRunnableC3195kk0 != null) {
            abstractRunnableC3195kk0.run();
        }
        this.f14769y = null;
    }

    Ek0(Callable callable) {
        this.f14769y = new Dk0(this, callable);
    }
}
