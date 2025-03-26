package com.google.android.gms.internal.ads;

import M2.AbstractC0656c;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class L00 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f16729a;

    /* renamed from: b, reason: collision with root package name */
    private final L60 f16730b;

    L00(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, L60 l60) {
        this.f16729a = interfaceExecutorServiceC3522nk0;
        this.f16730b = l60;
    }

    final /* synthetic */ N00 a() {
        return new N00("requester_type_2".equals(AbstractC0656c.c(this.f16730b.f16766d)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f16729a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.K00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f16496o.a();
            }
        });
    }
}
