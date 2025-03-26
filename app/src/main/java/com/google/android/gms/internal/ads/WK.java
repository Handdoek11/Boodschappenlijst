package com.google.android.gms.internal.ads;

import android.os.Bundle;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.List;

/* loaded from: classes.dex */
public final class WK extends AbstractBinderC3406mh {

    /* renamed from: o, reason: collision with root package name */
    private final String f19777o;

    /* renamed from: s, reason: collision with root package name */
    private final CI f19778s;

    /* renamed from: t, reason: collision with root package name */
    private final HI f19779t;

    public WK(String str, CI ci, HI hi) {
        this.f19777o = str;
        this.f19778s = ci;
        this.f19779t = hi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3515nh
    public final boolean T(Bundle bundle) {
        return this.f19778s.I(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3515nh
    public final D2.Y0 a() {
        return this.f19779t.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3515nh
    public final InterfaceC1938Xg b() {
        return this.f19779t.b0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3515nh
    public final InterfaceC5852a c() {
        return this.f19779t.i0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3515nh
    public final InterfaceC1693Qg d() {
        return this.f19779t.Y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3515nh
    public final String e() {
        return this.f19779t.k0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3515nh
    public final String f() {
        return this.f19779t.l0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3515nh
    public final InterfaceC5852a g() {
        return BinderC5853b.p2(this.f19778s);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3515nh
    public final String h() {
        return this.f19779t.m0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3515nh
    public final String i() {
        return this.f19779t.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3515nh
    public final void i0(Bundle bundle) {
        this.f19778s.v(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3515nh
    public final void i2(Bundle bundle) {
        this.f19778s.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3515nh
    public final String j() {
        return this.f19777o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3515nh
    public final List k() {
        return this.f19779t.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3515nh
    public final void l() {
        this.f19778s.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3515nh
    public final Bundle zzb() {
        return this.f19779t.Q();
    }
}
