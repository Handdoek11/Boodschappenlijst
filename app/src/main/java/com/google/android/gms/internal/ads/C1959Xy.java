package com.google.android.gms.internal.ads;

import G2.AbstractC0583d;

/* renamed from: com.google.android.gms.internal.ads.Xy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1959Xy implements EC {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC4410vt f20162o;

    /* renamed from: s, reason: collision with root package name */
    private final HN f20163s;

    /* renamed from: t, reason: collision with root package name */
    private final C3785q60 f20164t;

    C1959Xy(InterfaceC4410vt interfaceC4410vt, HN hn, C3785q60 c3785q60) {
        this.f20162o = interfaceC4410vt;
        this.f20163s = hn;
        this.f20164t = c3785q60;
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void r() {
        InterfaceC4410vt interfaceC4410vt;
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.Lc)).booleanValue() || (interfaceC4410vt = this.f20162o) == null) {
            return;
        }
        String str = true != AbstractC0583d.a(interfaceC4410vt.M()) ? "0" : "1";
        GN a8 = this.f20163s.a();
        a8.b("action", "hcp");
        a8.b("hcp", str);
        a8.c(this.f20164t);
        a8.g();
    }
}
