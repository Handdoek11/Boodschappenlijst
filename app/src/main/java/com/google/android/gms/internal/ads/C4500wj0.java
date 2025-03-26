package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4500wj0 extends AbstractRunnableC4718yj0 {
    C4500wj0(com.google.common.util.concurrent.d dVar, InterfaceC1420Ij0 interfaceC1420Ij0) {
        super(dVar, interfaceC1420Ij0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC4718yj0
    final /* bridge */ /* synthetic */ Object E(Object obj, Object obj2) {
        InterfaceC1420Ij0 interfaceC1420Ij0 = (InterfaceC1420Ij0) obj;
        com.google.common.util.concurrent.d a8 = interfaceC1420Ij0.a(obj2);
        AbstractC1762Sf0.d(a8, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC1420Ij0);
        return a8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC4718yj0
    final /* synthetic */ void F(Object obj) {
        v((com.google.common.util.concurrent.d) obj);
    }
}
