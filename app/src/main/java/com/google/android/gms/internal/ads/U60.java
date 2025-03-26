package com.google.android.gms.internal.ads;

import D2.C0555y;

/* loaded from: classes.dex */
final class U60 implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4410vt f19305a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3874qx f19306b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2959ia0 f19307c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ JS f19308d;

    U60(InterfaceC4410vt interfaceC4410vt, C3874qx c3874qx, C2959ia0 c2959ia0, JS js) {
        this.f19305a = interfaceC4410vt;
        this.f19306b = c3874qx;
        this.f19307c = c2959ia0;
        this.f19308d = js;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        String str = (String) obj;
        C3785q60 P7 = this.f19305a.P();
        if (P7 != null && !P7.f25795i0) {
            H2.v vVar = P7.f25825x0;
            if (((Boolean) D2.A.c().a(AbstractC3184kf.U9)).booleanValue() && this.f19306b != null && C3874qx.j(str)) {
                this.f19306b.i(str, this.f19307c, C0555y.e(), vVar);
                return;
            } else {
                this.f19307c.d(str, vVar, null);
                return;
            }
        }
        C4111t60 z7 = this.f19305a.z();
        if (z7 == null) {
            C2.v.s().x(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long a8 = C2.v.c().a();
        boolean a9 = C2.v.s().a(this.f19305a.getContext());
        boolean z8 = false;
        boolean z9 = ((Boolean) D2.A.c().a(AbstractC3184kf.f23872d6)).booleanValue() && P7 != null && P7.f25770S;
        if (P7 != null && P7.f25785d0 != null) {
            z8 = true;
        }
        this.f19308d.g(new LS(a8, z7.f26832b, str, (a9 || z9 || z8) ? 2 : 1));
    }
}
