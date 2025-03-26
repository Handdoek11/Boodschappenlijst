package com.google.android.gms.internal.ads;

import M2.AbstractC0656c;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.dY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2412dY implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f21582a;

    /* renamed from: b, reason: collision with root package name */
    private final L60 f21583b;

    C2412dY(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, L60 l60, Z60 z60) {
        this.f21582a = interfaceExecutorServiceC3522nk0;
        this.f21583b = l60;
    }

    final /* synthetic */ C2520eY a() {
        String str = null;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23773R6)).booleanValue() && "requester_type_2".equals(AbstractC0656c.c(this.f21583b.f16766d))) {
            str = Z60.a();
        }
        return new C2520eY(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f21582a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.cY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f21220o.a();
            }
        });
    }
}
