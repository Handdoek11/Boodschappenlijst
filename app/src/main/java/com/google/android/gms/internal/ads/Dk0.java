package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class Dk0 extends AbstractRunnableC3195kk0 {

    /* renamed from: t, reason: collision with root package name */
    private final Callable f14542t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ Ek0 f14543u;

    Dk0(Ek0 ek0, Callable callable) {
        this.f14543u = ek0;
        callable.getClass();
        this.f14542t = callable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3195kk0
    final Object a() {
        return this.f14542t.call();
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3195kk0
    final String b() {
        return this.f14542t.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3195kk0
    final void d(Throwable th) {
        this.f14543u.h(th);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3195kk0
    final void e(Object obj) {
        this.f14543u.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3195kk0
    final boolean f() {
        return this.f14543u.isDone();
    }
}
