package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2216bj0 extends AbstractRunnableC2433dj0 {
    C2216bj0(com.google.common.util.concurrent.d dVar, Class cls, InterfaceC1420Ij0 interfaceC1420Ij0) {
        super(dVar, cls, interfaceC1420Ij0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC2433dj0
    final /* bridge */ /* synthetic */ Object E(Object obj, Throwable th) {
        InterfaceC1420Ij0 interfaceC1420Ij0 = (InterfaceC1420Ij0) obj;
        com.google.common.util.concurrent.d a8 = interfaceC1420Ij0.a(th);
        AbstractC1762Sf0.d(a8, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC1420Ij0);
        return a8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC2433dj0
    final /* synthetic */ void F(Object obj) {
        v((com.google.common.util.concurrent.d) obj);
    }
}
