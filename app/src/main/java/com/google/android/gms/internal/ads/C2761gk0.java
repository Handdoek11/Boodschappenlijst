package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.gk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2761gk0 implements com.google.common.util.concurrent.d {

    /* renamed from: s, reason: collision with root package name */
    static final com.google.common.util.concurrent.d f22433s = new C2761gk0(null);

    /* renamed from: t, reason: collision with root package name */
    private static final C3304lk0 f22434t = new C3304lk0(C2761gk0.class);

    /* renamed from: o, reason: collision with root package name */
    private final Object f22435o;

    C2761gk0(Object obj) {
        this.f22435o = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        return false;
    }

    @Override // com.google.common.util.concurrent.d
    public final void f(Runnable runnable, Executor executor) {
        AbstractC1762Sf0.c(runnable, "Runnable was null.");
        AbstractC1762Sf0.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            f22434t.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e8);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f22435o;
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
        Object obj = this.f22435o;
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(obj) + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f22435o;
    }
}
