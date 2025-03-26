package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.vZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4371vZ implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f27279a;

    C4371vZ(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        this.f27279a = interfaceExecutorServiceC3522nk0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f27279a.p0(new Callable(this) { // from class: com.google.android.gms.internal.ads.uZ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C4480wZ(C2.v.c().a() - C2.v.s().j().g().a());
            }
        });
    }
}
