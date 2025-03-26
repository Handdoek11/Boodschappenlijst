package com.google.android.gms.internal.ads;

import G2.AbstractC0585e;
import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.g20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2689g20 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f22211a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f22212b;

    C2689g20(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, Context context) {
        this.f22211a = interfaceExecutorServiceC3522nk0;
        this.f22212b = context;
    }

    final /* synthetic */ C2580f20 a() {
        return new C2580f20(AbstractC0585e.b(this.f22212b, (String) D2.A.c().a(AbstractC3184kf.f23820X5)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f22211a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.e20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f21714o.a();
            }
        });
    }
}
