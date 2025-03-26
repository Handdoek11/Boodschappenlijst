package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.i30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2909i30 implements InterfaceC3014j20 {
    public C2909i30(C3751pq c3751pq, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        final com.google.common.util.concurrent.d h8 = AbstractC2326ck0.h(null);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23708J5)).booleanValue()) {
            h8 = AbstractC2326ck0.h(null);
        }
        final com.google.common.util.concurrent.d h9 = AbstractC2326ck0.h(null);
        return AbstractC2326ck0.c(h8, h9).a(new Callable() { // from class: com.google.android.gms.internal.ads.h30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C3016j30((String) h8.get(), (String) h9.get());
            }
        }, AbstractC1497Kq.f16644a);
    }
}
