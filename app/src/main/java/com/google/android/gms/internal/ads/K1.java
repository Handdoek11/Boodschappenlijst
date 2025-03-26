package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class K1 extends D0 {

    /* renamed from: b, reason: collision with root package name */
    private final long f16497b;

    public K1(InterfaceC3989s0 interfaceC3989s0, long j8) {
        super(interfaceC3989s0);
        AbstractC3796qC.d(interfaceC3989s0.c() >= j8);
        this.f16497b = j8;
    }

    @Override // com.google.android.gms.internal.ads.D0, com.google.android.gms.internal.ads.InterfaceC3989s0
    public final long b() {
        return super.b() - this.f16497b;
    }

    @Override // com.google.android.gms.internal.ads.D0, com.google.android.gms.internal.ads.InterfaceC3989s0
    public final long c() {
        return super.c() - this.f16497b;
    }

    @Override // com.google.android.gms.internal.ads.D0, com.google.android.gms.internal.ads.InterfaceC3989s0
    public final long d() {
        return super.d() - this.f16497b;
    }
}
