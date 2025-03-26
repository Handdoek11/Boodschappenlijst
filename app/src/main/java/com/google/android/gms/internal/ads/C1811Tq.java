package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Tq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1811Tq implements com.google.common.util.concurrent.d {

    /* renamed from: o, reason: collision with root package name */
    private final C4611xk0 f19180o = C4611xk0.D();

    private static final boolean b(boolean z7) {
        if (!z7) {
            C2.v.s().w(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z7;
    }

    public final boolean c(Object obj) {
        boolean e8 = this.f19180o.e(obj);
        b(e8);
        return e8;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z7) {
        return this.f19180o.cancel(z7);
    }

    public final boolean d(Throwable th) {
        boolean h8 = this.f19180o.h(th);
        b(h8);
        return h8;
    }

    @Override // com.google.common.util.concurrent.d
    public final void f(Runnable runnable, Executor executor) {
        this.f19180o.f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f19180o.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19180o.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f19180o.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return this.f19180o.get(j8, timeUnit);
    }
}
