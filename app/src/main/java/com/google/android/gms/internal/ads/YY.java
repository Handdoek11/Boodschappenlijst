package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class YY implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f20276a;

    /* renamed from: b, reason: collision with root package name */
    private final H2.a f20277b;

    YY(H2.a aVar, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        this.f20277b = aVar;
        this.f20276a = interfaceExecutorServiceC3522nk0;
    }

    final /* synthetic */ ZY a() {
        return ZY.b(this.f20277b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f20276a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.XY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20067o.a();
            }
        });
    }
}
