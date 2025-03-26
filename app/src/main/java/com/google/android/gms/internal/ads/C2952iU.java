package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import i3.BinderC5853b;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.iU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2952iU implements CT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22977a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2138az f22978b;

    /* renamed from: c, reason: collision with root package name */
    private View f22979c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1561Ml f22980d;

    public C2952iU(Context context, AbstractC2138az abstractC2138az) {
        this.f22977a = context;
        this.f22978b = abstractC2138az;
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final void a(C60 c60, C3785q60 c3785q60, C4801zT c4801zT) {
        try {
            ((InterfaceC1171Bm) c4801zT.f28627b).G0(c3785q60.f25777Z);
            AbstractC2843hU abstractC2843hU = null;
            if (((Boolean) D2.A.c().a(AbstractC3184kf.J7)).booleanValue() && c3785q60.f25791g0) {
                ((InterfaceC1171Bm) c4801zT.f28627b).c5(c3785q60.f25772U, c3785q60.f25820v.toString(), c60.f14100a.f28044a.f16766d, BinderC5853b.p2(this.f22977a), new BinderC2734gU(this, c4801zT, abstractC2843hU), (InterfaceC1457Jl) c4801zT.f28628c, c60.f14100a.f28044a.f16767e);
            } else {
                ((InterfaceC1171Bm) c4801zT.f28627b).H5(c3785q60.f25772U, c3785q60.f25820v.toString(), c60.f14100a.f28044a.f16766d, BinderC5853b.p2(this.f22977a), new BinderC2734gU(this, c4801zT, abstractC2843hU), (InterfaceC1457Jl) c4801zT.f28628c, c60.f14100a.f28044a.f16767e);
            }
        } catch (RemoteException e8) {
            throw new zzfcq(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final /* bridge */ /* synthetic */ Object b(C60 c60, final C3785q60 c3785q60, final C4801zT c4801zT) {
        final View view;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.J7)).booleanValue() && c3785q60.f25791g0) {
            try {
                view = (View) BinderC5853b.J0(this.f22980d.b());
                boolean c8 = this.f22980d.c();
                if (view == null) {
                    throw new zzfcq(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (c8) {
                    try {
                        view = (View) AbstractC2326ck0.n(AbstractC2326ck0.h(null), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.fU
                            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                            public final com.google.common.util.concurrent.d a(Object obj) {
                                return this.f22042a.c(view, c3785q60, obj);
                            }
                        }, AbstractC1497Kq.f16649f).get();
                    } catch (InterruptedException | ExecutionException e8) {
                        throw new zzfcq(e8);
                    }
                }
            } catch (RemoteException e9) {
                throw new zzfcq(e9);
            }
        } else {
            view = this.f22979c;
        }
        AbstractC4529wy a8 = this.f22978b.a(new C2161bA(c60, c3785q60, c4801zT.f28626a), new C1219Cy(view, null, new InterfaceC1436Iz() { // from class: com.google.android.gms.internal.ads.eU
            @Override // com.google.android.gms.internal.ads.InterfaceC1436Iz
            public final D2.Y0 zza() {
                try {
                    return ((InterfaceC1171Bm) c4801zT.f28627b).b();
                } catch (RemoteException e10) {
                    throw new zzfcq(e10);
                }
            }
        }, (C3893r60) c3785q60.f25818u.get(0)));
        a8.i().m1(view);
        ((BinderC4148tU) c4801zT.f28628c).u7(a8.f());
        return a8.h();
    }

    final /* synthetic */ com.google.common.util.concurrent.d c(View view, C3785q60 c3785q60, Object obj) {
        return AbstractC2326ck0.h(ViewTreeObserverOnScrollChangedListenerC4531wz.a(this.f22977a, view, c3785q60));
    }
}
