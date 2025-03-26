package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import android.os.RemoteException;
import i3.BinderC5853b;
import w2.EnumC6877c;

/* loaded from: classes.dex */
public final class PT implements CT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18188a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3113jy f18189b;

    PT(Context context, AbstractC3113jy abstractC3113jy) {
        this.f18188a = context;
        this.f18189b = abstractC3113jy;
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final void a(C60 c60, C3785q60 c3785q60, C4801zT c4801zT) {
        try {
            ((InterfaceC1171Bm) c4801zT.f28627b).G0(c3785q60.f25777Z);
            ((InterfaceC1171Bm) c4801zT.f28627b).o3(c3785q60.f25772U, c3785q60.f25820v.toString(), c60.f14100a.f28044a.f16766d, BinderC5853b.p2(this.f18188a), new NT(c4801zT, null), (InterfaceC1457Jl) c4801zT.f28628c);
        } catch (RemoteException e8) {
            AbstractC0608p0.l("Remote exception loading an app open RTB ad", e8);
            throw new zzfcq(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final /* bridge */ /* synthetic */ Object b(C60 c60, C3785q60 c3785q60, C4801zT c4801zT) {
        DU du = new DU(c3785q60, (InterfaceC1171Bm) c4801zT.f28627b, EnumC6877c.APP_OPEN_AD);
        AbstractC2679fy b8 = this.f18189b.b(new C2161bA(c60, c3785q60, c4801zT.f28626a), new TG(du, null), new C2788gy(c3785q60.f25779a0));
        du.b(b8.b());
        ((BinderC4148tU) c4801zT.f28628c).u7(b8.f());
        return b8.h();
    }
}
