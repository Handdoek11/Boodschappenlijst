package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2254c20 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21047a;

    C2254c20(C2913i50 c2913i50) {
        this.f21047a = c2913i50 != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return AbstractC2326ck0.h(new C2037a20(this.f21047a, null));
    }
}
