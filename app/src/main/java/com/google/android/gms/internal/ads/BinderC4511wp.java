package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4511wp extends AbstractBinderC3095jp {

    /* renamed from: o, reason: collision with root package name */
    private final Q2.b f27554o;

    /* renamed from: s, reason: collision with root package name */
    private final C4620xp f27555s;

    public BinderC4511wp(Q2.b bVar, C4620xp c4620xp) {
        this.f27554o = bVar;
        this.f27555s = c4620xp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3204kp
    public final void D(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3204kp
    public final void g() {
        C4620xp c4620xp;
        Q2.b bVar = this.f27554o;
        if (bVar == null || (c4620xp = this.f27555s) == null) {
            return;
        }
        bVar.b(c4620xp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3204kp
    public final void y(D2.W0 w02) {
        Q2.b bVar = this.f27554o;
        if (bVar != null) {
            bVar.a(w02.B0());
        }
    }
}
