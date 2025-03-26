package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class UU implements CT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19382a;

    /* renamed from: b, reason: collision with root package name */
    private final QH f19383b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f19384c;

    public UU(Context context, QH qh, Executor executor) {
        this.f19382a = context;
        this.f19383b = qh;
        this.f19384c = executor;
    }

    private static final boolean c(C60 c60, int i8) {
        return c60.f14100a.f28044a.f16769g.contains(Integer.toString(i8));
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final void a(C60 c60, C3785q60 c3785q60, C4801zT c4801zT) {
        C3024j70 c3024j70 = (C3024j70) c4801zT.f28627b;
        L60 l60 = c60.f14100a.f28044a;
        String jSONObject = c3785q60.f25820v.toString();
        String m8 = G2.U.m(c3785q60.f25814s);
        InterfaceC1457Jl interfaceC1457Jl = (InterfaceC1457Jl) c4801zT.f28628c;
        L60 l602 = c60.f14100a.f28044a;
        c3024j70.u(this.f19382a, l60.f16766d, jSONObject, m8, interfaceC1457Jl, l602.f16771i, l602.f16769g);
    }

    @Override // com.google.android.gms.internal.ads.CT
    public final /* bridge */ /* synthetic */ Object b(C60 c60, C3785q60 c3785q60, C4801zT c4801zT) {
        HI I7;
        C1631Ol d8 = ((C3024j70) c4801zT.f28627b).d();
        C1666Pl e8 = ((C3024j70) c4801zT.f28627b).e();
        InterfaceC1771Sl i8 = ((C3024j70) c4801zT.f28627b).i();
        if (i8 != null && c(c60, 6)) {
            I7 = HI.g0(i8);
        } else if (d8 != null && c(c60, 6)) {
            I7 = HI.J(d8);
        } else if (d8 != null && c(c60, 2)) {
            I7 = HI.H(d8);
        } else if (e8 != null && c(c60, 6)) {
            I7 = HI.K(e8);
        } else {
            if (e8 == null || !c(c60, 1)) {
                throw new zzegu(1, "No native ad mappers");
            }
            I7 = HI.I(e8);
        }
        if (I7 != null) {
            L60 l60 = c60.f14100a.f28044a;
            if (l60.f16769g.contains(Integer.toString(I7.P()))) {
                JI d9 = this.f19383b.d(new C2161bA(c60, c3785q60, c4801zT.f28626a), new TI(I7), new OJ(e8, d8, i8));
                ((BinderC4148tU) c4801zT.f28628c).u7(d9.g());
                d9.c().f1(new C2786gx((C3024j70) c4801zT.f28627b), this.f19384c);
                return d9.h();
            }
        }
        throw new zzegu(1, "No corresponding native ad listener");
    }
}
