package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Sa0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC1752Sa0 extends AbstractBinderC3095jp {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C4611xk0 f18926o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ InterfaceC2443dp f18927s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ C1787Ta0 f18928t;

    BinderC1752Sa0(C1787Ta0 c1787Ta0, C4611xk0 c4611xk0, InterfaceC2443dp interfaceC2443dp) {
        this.f18926o = c4611xk0;
        this.f18927s = interfaceC2443dp;
        this.f18928t = c1787Ta0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3204kp
    public final void D(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3204kp
    public final void g() {
        AbstractC3175ka0.a(this.f18927s, this.f18926o);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3204kp
    public final void y(D2.W0 w02) {
        H2.p.g("Failed to load rewarded ad with error: " + w02.B0().toString() + ", adUnitId: " + this.f18928t.f18211e.f1147o);
        this.f18928t.a(w02);
    }
}
