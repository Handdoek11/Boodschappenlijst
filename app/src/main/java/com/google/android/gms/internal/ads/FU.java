package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class FU implements CT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15164a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4241uH f15165b;

    /* renamed from: c, reason: collision with root package name */
    private final H2.a f15166c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f15167d;

    public FU(Context context, H2.a aVar, AbstractC4241uH abstractC4241uH, Executor executor) {
        this.f15164a = context;
        this.f15166c = aVar;
        this.f15165b = abstractC4241uH;
        this.f15167d = executor;
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final void a(C60 c60, C3785q60 c3785q60, C4801zT c4801zT) {
        C3024j70 c3024j70 = (C3024j70) c4801zT.f28627b;
        L60 l60 = c60.f14100a.f28044a;
        String jSONObject = c3785q60.f25820v.toString();
        String m8 = G2.U.m(c3785q60.f25814s);
        c3024j70.t(this.f15164a, l60.f16766d, jSONObject, m8, (InterfaceC1457Jl) c4801zT.f28628c);
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final /* bridge */ /* synthetic */ Object b(C60 c60, C3785q60 c3785q60, final C4801zT c4801zT) {
        QG c8 = this.f15165b.c(new C2161bA(c60, c3785q60, c4801zT.f28626a), new TG(new CH() { // from class: com.google.android.gms.internal.ads.EU
            @Override // com.google.android.gms.internal.ads.CH
            public final void a(boolean z7, Context context, C4558xC c4558xC) {
                this.f14739a.c(c4801zT, z7, context, c4558xC);
            }
        }, null));
        c8.c().f1(new C2786gx((C3024j70) c4801zT.f28627b), this.f15167d);
        ((BinderC4148tU) c4801zT.f28628c).u7(c8.g());
        return c8.i();
    }

    final /* synthetic */ void c(C4801zT c4801zT, boolean z7, Context context, C4558xC c4558xC) {
        try {
            ((C3024j70) c4801zT.f28627b).A(z7);
            if (this.f15166c.f2916t < ((Integer) D2.A.c().a(AbstractC3184kf.f23775S0)).intValue()) {
                ((C3024j70) c4801zT.f28627b).C();
            } else {
                ((C3024j70) c4801zT.f28627b).D(context);
            }
        } catch (zzfcq e8) {
            H2.p.f("Cannot show interstitial.");
            throw new zzdgb(e8.getCause());
        }
    }
}
