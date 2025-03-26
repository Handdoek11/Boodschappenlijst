package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oa0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC3611oa0 extends D2.J {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C4611xk0 f25227o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ D2.V f25228s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ C3720pa0 f25229t;

    BinderC3611oa0(C3720pa0 c3720pa0, C4611xk0 c4611xk0, D2.V v7) {
        this.f25227o = c4611xk0;
        this.f25228s = v7;
        this.f25229t = c3720pa0;
    }

    @Override // D2.K
    public final void a() {
        AbstractC3175ka0.a(this.f25228s, this.f25227o);
    }

    @Override // D2.K
    public final void h0(D2.W0 w02) {
        H2.p.g("Failed to load interstitial ad with error: " + w02.B0().toString() + " for ad unit: " + this.f25229t.f18211e.f1147o);
        this.f25229t.a(w02);
    }
}
