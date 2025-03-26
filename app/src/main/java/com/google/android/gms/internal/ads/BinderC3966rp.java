package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC3966rp extends AbstractBinderC3095jp {

    /* renamed from: o, reason: collision with root package name */
    private final P2.d f26218o;

    /* renamed from: s, reason: collision with root package name */
    private final P2.c f26219s;

    public BinderC3966rp(P2.d dVar, P2.c cVar) {
        this.f26218o = dVar;
        this.f26219s = cVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3204kp
    public final void D(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3204kp
    public final void g() {
        P2.d dVar = this.f26218o;
        if (dVar != null) {
            dVar.b(this.f26219s);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3204kp
    public final void y(D2.W0 w02) {
        if (this.f26218o != null) {
            this.f26218o.a(w02.B0());
        }
    }
}
