package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class E1 implements InterfaceC3880r0 {

    /* renamed from: a, reason: collision with root package name */
    private final UQ f14620a = new UQ(4);

    /* renamed from: b, reason: collision with root package name */
    private final T0 f14621b = new T0(-1, -1, "image/heif");

    private final boolean b(InterfaceC3989s0 interfaceC3989s0, int i8) {
        this.f14620a.i(4);
        ((C2684g0) interfaceC3989s0).G(this.f14620a.n(), 0, 4, false);
        return this.f14620a.K() == ((long) i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ InterfaceC3880r0 a() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ List d() {
        return AbstractC4169th0.w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void f(long j8, long j9) {
        this.f14621b.f(j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final int g(InterfaceC3989s0 interfaceC3989s0, O0 o02) {
        return this.f14621b.g(interfaceC3989s0, o02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        ((C2684g0) interfaceC3989s0).g(4, false);
        return b(interfaceC3989s0, 1718909296) && b(interfaceC3989s0, 1751476579);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        this.f14621b.i(interfaceC4207u0);
    }
}
