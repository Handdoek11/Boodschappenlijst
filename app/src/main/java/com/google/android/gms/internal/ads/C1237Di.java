package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Di, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1237Di implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4410vt f14537a;

    C1237Di(InterfaceC4410vt interfaceC4410vt) {
        this.f14537a = interfaceC4410vt;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        C2.v.s().x(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        String str = (String) obj;
        H2.v vVar = this.f14537a.P() != null ? this.f14537a.P().f25825x0 : null;
        InterfaceC4410vt interfaceC4410vt = this.f14537a;
        new G2.Y(interfaceC4410vt.getContext(), interfaceC4410vt.l().f2914o, str, null, vVar).b();
    }
}
