package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.play_billing.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
enum EnumC5127i1 implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
