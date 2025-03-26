package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Es, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1285Es extends AbstractC1141As {
    public C1285Es(InterfaceC1567Mr interfaceC1567Mr) {
        super(interfaceC1567Mr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141As
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141As
    public final boolean p(String str) {
        String j8 = H2.g.j(str);
        InterfaceC1567Mr interfaceC1567Mr = (InterfaceC1567Mr) this.f13682t.get();
        if (interfaceC1567Mr != null && j8 != null) {
            interfaceC1567Mr.W(j8, this);
        }
        H2.p.g("VideoStreamNoopCache is doing nothing.");
        c(str, j8, "noop", "Noop cache is a noop.");
        return false;
    }
}
