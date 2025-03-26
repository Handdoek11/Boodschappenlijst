package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.play_billing.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5192t1 implements InterfaceFutureC5225z1 {

    /* renamed from: s, reason: collision with root package name */
    private static final C5220y1 f30008s = new C5220y1(C5192t1.class);

    /* renamed from: o, reason: collision with root package name */
    private final Object f30009o;

    C5192t1(Object obj) {
        this.f30009o = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC5225z1
    public final void g(Runnable runnable, Executor executor) {
        AbstractC5202v.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            f30008s.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e8);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f30009o;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.f30009o;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f30009o;
    }
}
