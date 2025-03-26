package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class F10 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15039a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15040b;

    F10(String str, int i8) {
        this.f15039a = str;
        this.f15040b = i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 31;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return AbstractC2326ck0.h(new G10(this.f15039a, this.f15040b));
    }
}
