package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.la0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC3284la0 extends AbstractBinderC4267uc {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C4611xk0 f24344o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ D2.I1 f24345s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ C3393ma0 f24346t;

    BinderC3284la0(C3393ma0 c3393ma0, C4611xk0 c4611xk0, D2.I1 i12) {
        this.f24344o = c4611xk0;
        this.f24345s = i12;
        this.f24346t = c3393ma0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4376vc
    public final void A(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4376vc
    public final void L3(D2.W0 w02) {
        H2.p.g("Failed to load app open ad with error parcel: " + w02.B0().toString() + " for ad unit: " + this.f24345s.f1147o);
        this.f24346t.a(w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4376vc
    public final void P0(InterfaceC4049sc interfaceC4049sc) {
        AbstractC3175ka0.a(interfaceC4049sc, this.f24344o);
    }
}
