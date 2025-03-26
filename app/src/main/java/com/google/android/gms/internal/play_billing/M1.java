package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class M1 extends AbstractRunnableC5215x1 {

    /* renamed from: t, reason: collision with root package name */
    private final Callable f29786t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ N1 f29787u;

    M1(N1 n12, Callable callable) {
        this.f29787u = n12;
        callable.getClass();
        this.f29786t = callable;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractRunnableC5215x1
    final Object a() {
        return this.f29786t.call();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractRunnableC5215x1
    final String b() {
        return this.f29786t.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractRunnableC5215x1
    final void c(Throwable th) {
        this.f29787u.p(th);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractRunnableC5215x1
    final void d(Object obj) {
        this.f29787u.o(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractRunnableC5215x1
    final boolean f() {
        return this.f29787u.isDone();
    }
}
