package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.b10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2144b10 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f20803a;

    public C2144b10(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        this.f20803a = interfaceExecutorServiceC3522nk0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f20803a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.a10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", C2.v.s().c());
                return new C2252c10(bundle);
            }
        });
    }
}
