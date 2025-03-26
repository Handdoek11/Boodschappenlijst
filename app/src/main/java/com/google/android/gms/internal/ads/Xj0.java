package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class Xj0 extends Vj0 implements com.google.common.util.concurrent.d {
    protected Xj0() {
    }

    @Override // com.google.common.util.concurrent.d
    public final void f(Runnable runnable, Executor executor) {
        i().f(runnable, executor);
    }

    protected abstract com.google.common.util.concurrent.d i();
}
