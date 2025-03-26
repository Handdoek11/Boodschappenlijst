package com.google.android.gms.internal.ads;

import y2.AbstractC6943a;

/* renamed from: com.google.android.gms.internal.ads.lc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC3287lc extends AbstractBinderC4267uc {

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC6943a.AbstractC0349a f24349o;

    /* renamed from: s, reason: collision with root package name */
    private final String f24350s;

    public BinderC3287lc(AbstractC6943a.AbstractC0349a abstractC0349a, String str) {
        this.f24349o = abstractC0349a;
        this.f24350s = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4376vc
    public final void A(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4376vc
    public final void L3(D2.W0 w02) {
        if (this.f24349o != null) {
            this.f24349o.a(w02.B0());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4376vc
    public final void P0(InterfaceC4049sc interfaceC4049sc) {
        if (this.f24349o != null) {
            this.f24349o.b(new C3396mc(interfaceC4049sc, this.f24350s));
        }
    }
}
