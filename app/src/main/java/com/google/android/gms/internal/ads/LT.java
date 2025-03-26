package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class LT implements CT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16837a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3113jy f16838b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f16839c;

    LT(Context context, AbstractC3113jy abstractC3113jy, Executor executor) {
        this.f16837a = context;
        this.f16838b = abstractC3113jy;
        this.f16839c = executor;
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final void a(C60 c60, C3785q60 c3785q60, C4801zT c4801zT) {
        C3024j70 c3024j70 = (C3024j70) c4801zT.f28627b;
        L60 l60 = c60.f14100a.f28044a;
        String jSONObject = c3785q60.f25820v.toString();
        c3024j70.q(this.f16837a, l60.f16766d, jSONObject, (InterfaceC1457Jl) c4801zT.f28628c);
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final /* bridge */ /* synthetic */ Object b(C60 c60, C3785q60 c3785q60, final C4801zT c4801zT) {
        AbstractC2679fy b8 = this.f16838b.b(new C2161bA(c60, c3785q60, c4801zT.f28626a), new TG(new CH() { // from class: com.google.android.gms.internal.ads.KT
            @Override // com.google.android.gms.internal.ads.CH
            public final void a(boolean z7, Context context, C4558xC c4558xC) {
                C4801zT c4801zT2 = c4801zT;
                try {
                    ((C3024j70) c4801zT2.f28627b).A(z7);
                    ((C3024j70) c4801zT2.f28627b).B(context);
                } catch (zzfcq e8) {
                    throw new zzdgb(e8.getCause());
                }
            }
        }, null), new C2788gy(c3785q60.f25779a0));
        b8.c().f1(new C2786gx((C3024j70) c4801zT.f28627b), this.f16839c);
        ((BinderC4148tU) c4801zT.f28628c).u7(b8.g());
        return b8.h();
    }
}
