package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import i3.BinderC5853b;

/* loaded from: classes.dex */
public final class YU implements CT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20265a;

    /* renamed from: b, reason: collision with root package name */
    private final QH f20266b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1771Sl f20267c;

    /* renamed from: d, reason: collision with root package name */
    private final H2.a f20268d;

    public YU(Context context, QH qh, H2.a aVar) {
        this.f20265a = context;
        this.f20266b = qh;
        this.f20268d = aVar;
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final void a(C60 c60, C3785q60 c3785q60, C4801zT c4801zT) {
        try {
            ((InterfaceC1171Bm) c4801zT.f28627b).G0(c3785q60.f25777Z);
            XU xu = null;
            if (this.f20268d.f2916t < ((Integer) D2.A.c().a(AbstractC3184kf.f23752P1)).intValue()) {
                ((InterfaceC1171Bm) c4801zT.f28627b).N1(c3785q60.f25772U, c3785q60.f25820v.toString(), c60.f14100a.f28044a.f16766d, BinderC5853b.p2(this.f20265a), new WU(this, c4801zT, xu), (InterfaceC1457Jl) c4801zT.f28628c);
            } else {
                ((InterfaceC1171Bm) c4801zT.f28627b).g5(c3785q60.f25772U, c3785q60.f25820v.toString(), c60.f14100a.f28044a.f16766d, BinderC5853b.p2(this.f20265a), new WU(this, c4801zT, xu), (InterfaceC1457Jl) c4801zT.f28628c, c60.f14100a.f28044a.f16771i);
            }
        } catch (RemoteException e8) {
            throw new zzfcq(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final /* bridge */ /* synthetic */ Object b(C60 c60, C3785q60 c3785q60, C4801zT c4801zT) {
        if (!c60.f14100a.f28044a.f16769g.contains(Integer.toString(6))) {
            throw new zzegu(2, "Unified must be used for RTB.");
        }
        HI g02 = HI.g0(this.f20267c);
        L60 l60 = c60.f14100a.f28044a;
        if (!l60.f16769g.contains(Integer.toString(g02.P()))) {
            throw new zzegu(1, "No corresponding native ad listener");
        }
        JI d8 = this.f20266b.d(new C2161bA(c60, c3785q60, c4801zT.f28626a), new TI(g02), new OJ(null, null, this.f20267c));
        ((BinderC4148tU) c4801zT.f28628c).u7(d8.f());
        return d8.h();
    }
}
