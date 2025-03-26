package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class X00 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f19935a;

    /* renamed from: b, reason: collision with root package name */
    private final C3490nP f19936b;

    X00(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, C3490nP c3490nP) {
        this.f19935a = interfaceExecutorServiceC3522nk0;
        this.f19936b = c3490nP;
    }

    final /* synthetic */ Y00 a() {
        C3490nP c3490nP = this.f19936b;
        String d8 = c3490nP.d();
        boolean s8 = c3490nP.s();
        boolean l8 = C2.v.w().l();
        C3490nP c3490nP2 = this.f19936b;
        return new Y00(d8, s8, l8, c3490nP2.q(), c3490nP2.t());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f19935a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.W00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f19692o.a();
            }
        });
    }
}
