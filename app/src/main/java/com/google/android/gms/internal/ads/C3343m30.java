package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.m30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3343m30 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceExecutorServiceC3522nk0 f24430a;

    /* renamed from: b, reason: collision with root package name */
    final List f24431b;

    public C3343m30(C1794Te c1794Te, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, List list) {
        this.f24430a = interfaceExecutorServiceC3522nk0;
        this.f24431b = list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f24430a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.l30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C3452n30(this.f24268o.f24431b);
            }
        });
    }
}
