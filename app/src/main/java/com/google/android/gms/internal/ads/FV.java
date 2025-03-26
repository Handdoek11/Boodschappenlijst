package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class FV implements CT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15168a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f15169b;

    /* renamed from: c, reason: collision with root package name */
    private final NL f15170c;

    public FV(Context context, Executor executor, NL nl) {
        this.f15168a = context;
        this.f15169b = executor;
        this.f15170c = nl;
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final void a(C60 c60, C3785q60 c3785q60, C4801zT c4801zT) {
        try {
            L60 l60 = c60.f14100a.f28044a;
            if (l60.f16777o.f27749a == 3) {
                ((C3024j70) c4801zT.f28627b).w(this.f15168a, l60.f16766d, c3785q60.f25820v.toString(), (InterfaceC1457Jl) c4801zT.f28628c);
            } else {
                ((C3024j70) c4801zT.f28627b).v(this.f15168a, l60.f16766d, c3785q60.f25820v.toString(), (InterfaceC1457Jl) c4801zT.f28628c);
            }
        } catch (Exception e8) {
            H2.p.h("Fail to load ad from adapter ".concat(String.valueOf(c4801zT.f28626a)), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final /* bridge */ /* synthetic */ Object b(C60 c60, C3785q60 c3785q60, final C4801zT c4801zT) {
        JL d8 = this.f15170c.d(new C2161bA(c60, c3785q60, c4801zT.f28626a), new KL(new CH() { // from class: com.google.android.gms.internal.ads.EV
            @Override // com.google.android.gms.internal.ads.CH
            public final void a(boolean z7, Context context, C4558xC c4558xC) {
                C4801zT c4801zT2 = c4801zT;
                try {
                    ((C3024j70) c4801zT2.f28627b).A(z7);
                    ((C3024j70) c4801zT2.f28627b).E(context);
                } catch (zzfcq e8) {
                    throw new zzdgb(e8.getCause());
                }
            }
        }));
        d8.c().f1(new C2786gx((C3024j70) c4801zT.f28627b), this.f15169b);
        ((BinderC4148tU) c4801zT.f28628c).u7(d8.n());
        return d8.k();
    }
}
