package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.zZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4807zZ implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f28653a;

    /* renamed from: b, reason: collision with root package name */
    private final AM f28654b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28655c;

    /* renamed from: d, reason: collision with root package name */
    private final L60 f28656d;

    public C4807zZ(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, AM am, L60 l60, String str) {
        this.f28653a = interfaceExecutorServiceC3522nk0;
        this.f28654b = am;
        this.f28656d = l60;
        this.f28655c = str;
    }

    final /* synthetic */ AZ a() {
        AM am = this.f28654b;
        return new AZ(am.b(this.f28656d.f16768f, this.f28655c), am.a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f28653a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.yZ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f28141o.a();
            }
        });
    }
}
