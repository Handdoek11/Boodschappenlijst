package com.google.android.gms.internal.ads;

import f3.InterfaceC5781e;

/* loaded from: classes.dex */
public final class ZX implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5781e f20491a;

    /* renamed from: b, reason: collision with root package name */
    private final L60 f20492b;

    ZX(InterfaceC5781e interfaceC5781e, L60 l60) {
        this.f20491a = interfaceC5781e;
        this.f20492b = l60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return AbstractC2326ck0.h(new C2086aY(this.f20492b, this.f20491a.a()));
    }
}
