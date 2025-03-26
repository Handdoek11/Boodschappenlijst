package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2324cj0 extends AbstractRunnableC2433dj0 {
    C2324cj0(com.google.common.util.concurrent.d dVar, Class cls, InterfaceC1376Hf0 interfaceC1376Hf0) {
        super(dVar, cls, interfaceC1376Hf0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC2433dj0
    final /* synthetic */ Object E(Object obj, Throwable th) {
        return ((InterfaceC1376Hf0) obj).apply(th);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC2433dj0
    final void F(Object obj) {
        e(obj);
    }
}
