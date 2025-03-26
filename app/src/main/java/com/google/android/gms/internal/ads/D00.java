package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class D00 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f14347a;

    public D00(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        this.f14347a = interfaceExecutorServiceC3522nk0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f14347a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.C00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new E00(C2.v.w().b(), C2.v.w().m());
            }
        });
    }
}
