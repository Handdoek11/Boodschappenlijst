package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import i3.BinderC5853b;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.cU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2299cU implements CT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21194a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2138az f21195b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f21196c;

    public C2299cU(Context context, AbstractC2138az abstractC2138az, Executor executor) {
        this.f21194a = context;
        this.f21195b = abstractC2138az;
        this.f21196c = executor;
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final void a(C60 c60, C3785q60 c3785q60, C4801zT c4801zT) {
        D2.c2 c2Var;
        D2.c2 c2Var2 = c60.f14100a.f28044a.f16767e;
        if (c2Var2.f1219E) {
            c2Var = new D2.c2(this.f21194a, w2.z.d(c2Var2.f1225v, c2Var2.f1222s));
        } else {
            c2Var = (((Boolean) D2.A.c().a(AbstractC3184kf.J7)).booleanValue() && c3785q60.f25791g0) ? new D2.c2(this.f21194a, w2.z.e(c2Var2.f1225v, c2Var2.f1222s)) : R60.a(this.f21194a, c3785q60.f25818u);
        }
        D2.c2 c2Var3 = c2Var;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.J7)).booleanValue() && c3785q60.f25791g0) {
            Object obj = c4801zT.f28627b;
            ((C3024j70) obj).s(this.f21194a, c2Var3, c60.f14100a.f28044a.f16766d, c3785q60.f25820v.toString(), G2.U.m(c3785q60.f25814s), (InterfaceC1457Jl) c4801zT.f28628c);
            return;
        }
        Object obj2 = c4801zT.f28627b;
        ((C3024j70) obj2).r(this.f21194a, c2Var3, c60.f14100a.f28044a.f16766d, c3785q60.f25820v.toString(), G2.U.m(c3785q60.f25814s), (InterfaceC1457Jl) c4801zT.f28628c);
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final /* bridge */ /* synthetic */ Object b(C60 c60, final C3785q60 c3785q60, C4801zT c4801zT) {
        final View f8;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.J7)).booleanValue() && c3785q60.f25791g0) {
            InterfaceC1561Ml h8 = ((C3024j70) c4801zT.f28627b).h();
            if (h8 == null) {
                H2.p.d("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfcq(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                f8 = (View) BinderC5853b.J0(h8.b());
                boolean c8 = h8.c();
                if (f8 == null) {
                    throw new zzfcq(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (c8) {
                    try {
                        f8 = (View) AbstractC2326ck0.n(AbstractC2326ck0.h(null), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.ZT
                            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                            public final com.google.common.util.concurrent.d a(Object obj) {
                                return this.f20481a.c(f8, c3785q60, obj);
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
            f8 = ((C3024j70) c4801zT.f28627b).f();
        }
        AbstractC2138az abstractC2138az = this.f21195b;
        C2161bA c2161bA = new C2161bA(c60, c3785q60, c4801zT.f28626a);
        final C3024j70 c3024j70 = (C3024j70) c4801zT.f28627b;
        Objects.requireNonNull(c3024j70);
        AbstractC4529wy a8 = abstractC2138az.a(c2161bA, new C1219Cy(f8, null, new InterfaceC1436Iz() { // from class: com.google.android.gms.internal.ads.bU
            @Override // com.google.android.gms.internal.ads.InterfaceC1436Iz
            public final D2.Y0 zza() {
                return c3024j70.g();
            }
        }, (C3893r60) c3785q60.f25818u.get(0)));
        a8.i().m1(f8);
        a8.c().f1(new C2786gx((C3024j70) c4801zT.f28627b), this.f21196c);
        ((BinderC4148tU) c4801zT.f28628c).u7(a8.g());
        return a8.h();
    }

    final /* synthetic */ com.google.common.util.concurrent.d c(View view, C3785q60 c3785q60, Object obj) {
        return AbstractC2326ck0.h(ViewTreeObserverOnScrollChangedListenerC4531wz.a(this.f21194a, view, c3785q60));
    }
}
