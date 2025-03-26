package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class GX {

    /* renamed from: a, reason: collision with root package name */
    private final SI f15396a;

    /* renamed from: b, reason: collision with root package name */
    private final C4042sX f15397b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3360mC f15398c;

    public GX(SI si, HN hn) {
        this.f15396a = si;
        final C4042sX c4042sX = new C4042sX(hn);
        this.f15397b = c4042sX;
        final InterfaceC2651fk g8 = si.g();
        this.f15398c = new InterfaceC3360mC() { // from class: com.google.android.gms.internal.ads.EX
            @Override // com.google.android.gms.internal.ads.InterfaceC3360mC
            public final void r0(D2.W0 w02) {
                c4042sX.r0(w02);
                InterfaceC2651fk interfaceC2651fk = g8;
                if (interfaceC2651fk != null) {
                    try {
                        interfaceC2651fk.y(w02);
                    } catch (RemoteException e8) {
                        H2.p.i("#007 Could not call remote method.", e8);
                    }
                }
                if (interfaceC2651fk != null) {
                    try {
                        interfaceC2651fk.D(w02.f1162o);
                    } catch (RemoteException e9) {
                        H2.p.i("#007 Could not call remote method.", e9);
                    }
                }
            }
        };
    }

    public final InterfaceC3360mC a() {
        return this.f15398c;
    }

    public final ZC b() {
        return this.f15397b;
    }

    public final LH c() {
        return new LH(this.f15396a, this.f15397b.e());
    }

    public final C4042sX d() {
        return this.f15397b;
    }

    public final void e(D2.H h8) {
        this.f15397b.i(h8);
    }
}
