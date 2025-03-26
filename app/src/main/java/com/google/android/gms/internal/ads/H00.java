package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class H00 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15584a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f15585b;

    H00(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, Context context) {
        this.f15585b = interfaceExecutorServiceC3522nk0;
        this.f15584a = context;
    }

    final /* synthetic */ I00 a() {
        C2.v.t();
        return new I00(G2.D0.Y(this.f15584a));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f15585b.p0(new Callable() { // from class: com.google.android.gms.internal.ads.G00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15236o.a();
            }
        });
    }
}
