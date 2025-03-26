package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.w6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4437w6 implements InterfaceC3880r0 {

    /* renamed from: a, reason: collision with root package name */
    private final UQ f27458a = new UQ(4);

    /* renamed from: b, reason: collision with root package name */
    private final T0 f27459b = new T0(-1, -1, "image/webp");

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
        this.f27459b.f(j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final int g(InterfaceC3989s0 interfaceC3989s0, O0 o02) {
        return this.f27459b.g(interfaceC3989s0, o02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        this.f27458a.i(4);
        C2684g0 c2684g0 = (C2684g0) interfaceC3989s0;
        c2684g0.G(this.f27458a.n(), 0, 4, false);
        if (this.f27458a.K() == 1380533830) {
            c2684g0.g(4, false);
            this.f27458a.i(4);
            c2684g0.G(this.f27458a.n(), 0, 4, false);
            if (this.f27458a.K() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        this.f27459b.i(interfaceC4207u0);
    }
}
