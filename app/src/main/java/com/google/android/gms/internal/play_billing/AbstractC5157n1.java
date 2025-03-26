package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.play_billing.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5157n1 extends AbstractFutureC5145l1 implements InterfaceFutureC5225z1 {
    protected AbstractC5157n1() {
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC5225z1
    public final void g(Runnable runnable, Executor executor) {
        h().g(runnable, executor);
    }

    protected abstract InterfaceFutureC5225z1 h();
}
