package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3991s1 implements InterfaceC3880r0 {

    /* renamed from: a, reason: collision with root package name */
    private final UQ f26532a = new UQ(4);

    /* renamed from: b, reason: collision with root package name */
    private final T0 f26533b = new T0(-1, -1, "image/avif");

    private final boolean b(InterfaceC3989s0 interfaceC3989s0, int i8) {
        this.f26532a.i(4);
        ((C2684g0) interfaceC3989s0).G(this.f26532a.n(), 0, 4, false);
        return this.f26532a.K() == ((long) i8);
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
        this.f26533b.f(j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final int g(InterfaceC3989s0 interfaceC3989s0, O0 o02) {
        return this.f26533b.g(interfaceC3989s0, o02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        ((C2684g0) interfaceC3989s0).g(4, false);
        return b(interfaceC3989s0, 1718909296) && b(interfaceC3989s0, 1635150182);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        this.f26533b.i(interfaceC4207u0);
    }
}
