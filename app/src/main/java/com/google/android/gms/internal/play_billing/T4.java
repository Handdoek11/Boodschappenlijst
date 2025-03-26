package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class T4 implements InterfaceFutureC5225z1 {

    /* renamed from: o, reason: collision with root package name */
    final WeakReference f29835o;

    /* renamed from: s, reason: collision with root package name */
    private final P4 f29836s = new S4(this);

    T4(Q4 q42) {
        this.f29835o = new WeakReference(q42);
    }

    final boolean a(Object obj) {
        return this.f29836s.c(obj);
    }

    final boolean b(Throwable th) {
        V2 v22 = new V2(th);
        F1 f12 = P4.f29800w;
        P4 p42 = this.f29836s;
        if (!f12.d(p42, null, v22)) {
            return false;
        }
        P4.b(p42);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        Q4 q42 = (Q4) this.f29835o.get();
        boolean cancel = this.f29836s.cancel(z7);
        if (!cancel || q42 == null) {
            return cancel;
        }
        q42.a();
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC5225z1
    public final void g(Runnable runnable, Executor executor) {
        this.f29836s.g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f29836s.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f29836s.f29802o instanceof C5110f2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f29836s.isDone();
    }

    public final String toString() {
        return this.f29836s.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return this.f29836s.get(j8, timeUnit);
    }
}
