package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class GY implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f15399a;

    /* renamed from: b, reason: collision with root package name */
    private final L60 f15400b;

    /* renamed from: c, reason: collision with root package name */
    private final C1283Eq f15401c;

    public GY(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, L60 l60, C1283Eq c1283Eq) {
        this.f15399a = interfaceExecutorServiceC3522nk0;
        this.f15400b = l60;
        this.f15401c = c1283Eq;
    }

    final /* synthetic */ HY a() {
        return new HY(this.f15400b.f16772j, this.f15401c.l());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f15399a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.FY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15171o.a();
            }
        });
    }
}
