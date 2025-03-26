package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class Mj0 extends Nj0 {

    /* renamed from: v, reason: collision with root package name */
    private final Callable f17397v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ Oj0 f17398w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Mj0(Oj0 oj0, Callable callable, Executor executor) {
        super(oj0, executor);
        this.f17398w = oj0;
        this.f17397v = callable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3195kk0
    final Object a() {
        return this.f17397v.call();
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3195kk0
    final String b() {
        return this.f17397v.toString();
    }

    @Override // com.google.android.gms.internal.ads.Nj0
    final void h(Object obj) {
        this.f17398w.e(obj);
    }
}
