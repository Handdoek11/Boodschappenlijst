package com.google.android.gms.internal.ads;

import G2.HandlerC0610q0;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Hq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ExecutorC1391Hq implements Executor {

    /* renamed from: o, reason: collision with root package name */
    private final Handler f15790o = new HandlerC0610q0(Looper.getMainLooper());

    ExecutorC1391Hq() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.f15790o.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            C2.v.t();
            G2.D0.n(C2.v.s().e(), th);
            throw th;
        }
    }
}
