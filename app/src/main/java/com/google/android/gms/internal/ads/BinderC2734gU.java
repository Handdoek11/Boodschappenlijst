package com.google.android.gms.internal.ads;

import android.view.View;
import i3.BinderC5853b;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.gU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC2734gU extends AbstractBinderC3525nm {

    /* renamed from: o, reason: collision with root package name */
    private final C4801zT f22366o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ C2952iU f22367s;

    /* synthetic */ BinderC2734gU(C2952iU c2952iU, C4801zT c4801zT, AbstractC2843hU abstractC2843hU) {
        this.f22367s = c2952iU;
        this.f22366o = c4801zT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3634om
    public final void H0(InterfaceC5852a interfaceC5852a) {
        this.f22367s.f22979c = (View) BinderC5853b.J0(interfaceC5852a);
        ((BinderC4148tU) this.f22366o.f28628c).o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3634om
    public final void M5(InterfaceC1561Ml interfaceC1561Ml) {
        this.f22367s.f22980d = interfaceC1561Ml;
        ((BinderC4148tU) this.f22366o.f28628c).o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3634om
    public final void n(String str) {
        ((BinderC4148tU) this.f22366o.f28628c).s1(0, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3634om
    public final void y(D2.W0 w02) {
        ((BinderC4148tU) this.f22366o.f28628c).i6(w02);
    }
}
