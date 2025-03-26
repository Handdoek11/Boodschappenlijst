package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import android.os.RemoteException;
import i3.BinderC5853b;
import w2.EnumC6877c;

/* loaded from: classes.dex */
public final class JV implements CT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16263a;

    /* renamed from: b, reason: collision with root package name */
    private final NL f16264b;

    public JV(Context context, NL nl) {
        this.f16263a = context;
        this.f16264b = nl;
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final void a(C60 c60, C3785q60 c3785q60, C4801zT c4801zT) {
        try {
            ((InterfaceC1171Bm) c4801zT.f28627b).G0(c3785q60.f25777Z);
            if (c60.f14100a.f28044a.f16777o.f27749a == 3) {
                ((InterfaceC1171Bm) c4801zT.f28627b).k7(c3785q60.f25772U, c3785q60.f25820v.toString(), c60.f14100a.f28044a.f16766d, BinderC5853b.p2(this.f16263a), new HV(this, c4801zT, null), (InterfaceC1457Jl) c4801zT.f28628c);
            } else {
                ((InterfaceC1171Bm) c4801zT.f28627b).j6(c3785q60.f25772U, c3785q60.f25820v.toString(), c60.f14100a.f28044a.f16766d, BinderC5853b.p2(this.f16263a), new HV(this, c4801zT, null), (InterfaceC1457Jl) c4801zT.f28628c);
            }
        } catch (RemoteException e8) {
            AbstractC0608p0.l("Remote exception loading a rewarded RTB ad", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final /* bridge */ /* synthetic */ Object b(C60 c60, C3785q60 c3785q60, C4801zT c4801zT) {
        DU du = new DU(c3785q60, (InterfaceC1171Bm) c4801zT.f28627b, EnumC6877c.REWARDED);
        JL d8 = this.f16264b.d(new C2161bA(c60, c3785q60, c4801zT.f28626a), new KL(du));
        du.b(d8.b());
        ((BinderC4148tU) c4801zT.f28628c).u7(d8.o());
        return d8.k();
    }
}
