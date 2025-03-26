package com.google.android.gms.internal.ads;

import android.os.Bundle;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.List;

/* loaded from: classes.dex */
public final class UK extends AbstractBinderC3188kh {

    /* renamed from: o, reason: collision with root package name */
    private final String f19356o;

    /* renamed from: s, reason: collision with root package name */
    private final CI f19357s;

    /* renamed from: t, reason: collision with root package name */
    private final HI f19358t;

    public UK(String str, CI ci, HI hi) {
        this.f19356o = str;
        this.f19357s = ci;
        this.f19358t = hi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final void A0(Bundle bundle) {
        this.f19357s.v(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final void T(Bundle bundle) {
        this.f19357s.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final Bundle a() {
        return this.f19358t.Q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final InterfaceC1693Qg b() {
        return this.f19358t.Y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final InterfaceC1938Xg c() {
        return this.f19358t.a0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final D2.Y0 d() {
        return this.f19358t.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final InterfaceC5852a e() {
        return BinderC5853b.p2(this.f19357s);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final String f() {
        return this.f19358t.l0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final InterfaceC5852a g() {
        return this.f19358t.i0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final String h() {
        return this.f19358t.m0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final String i() {
        return this.f19358t.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final String j() {
        return this.f19356o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final String k() {
        return this.f19358t.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final String l() {
        return this.f19358t.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final List o() {
        return this.f19358t.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final void p() {
        this.f19357s.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final boolean x0(Bundle bundle) {
        return this.f19357s.I(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3297lh
    public final double zzb() {
        return this.f19358t.A();
    }
}
