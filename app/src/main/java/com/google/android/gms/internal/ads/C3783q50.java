package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.q50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3783q50 implements JX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25735a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f25736b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4630xu f25737c;

    /* renamed from: d, reason: collision with root package name */
    private final C4042sX f25738d;

    /* renamed from: e, reason: collision with root package name */
    private final S50 f25739e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC1303Ff f25740f;

    /* renamed from: g, reason: collision with root package name */
    private final RunnableC3791q90 f25741g;

    /* renamed from: h, reason: collision with root package name */
    private final J60 f25742h;

    /* renamed from: i, reason: collision with root package name */
    private com.google.common.util.concurrent.d f25743i;

    public C3783q50(Context context, Executor executor, AbstractC4630xu abstractC4630xu, C4042sX c4042sX, S50 s50, J60 j60) {
        this.f25735a = context;
        this.f25736b = executor;
        this.f25737c = abstractC4630xu;
        this.f25738d = c4042sX;
        this.f25742h = j60;
        this.f25739e = s50;
        this.f25741g = abstractC4630xu.F();
    }

    @Override // com.google.android.gms.internal.ads.JX
    public final boolean a(D2.X1 x12, String str, HX hx, IX ix) {
        AbstractC4241uH e8;
        RunnableC3464n90 runnableC3464n90;
        if (str == null) {
            H2.p.d("Ad unit ID should not be null for interstitial ad.");
            this.f25736b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.k50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23509o.g();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.O8)).booleanValue() && x12.f1191w) {
            this.f25737c.s().p(true);
        }
        D2.c2 c2Var = ((C3020j50) hx).f23179a;
        Bundle a8 = AbstractC3923rN.a(new Pair(EnumC3706pN.PUBLIC_API_CALL.a(), Long.valueOf(x12.f1185Q)), new Pair(EnumC3706pN.DYNAMITE_ENTER.a(), Long.valueOf(C2.v.c().a())));
        J60 j60 = this.f25742h;
        j60.P(str);
        j60.O(c2Var);
        j60.h(x12);
        j60.a(a8);
        Context context = this.f25735a;
        L60 j8 = j60.j();
        InterfaceC2160b90 b8 = AbstractC2051a90.b(context, AbstractC3355m90.f(j8), 4, x12);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.c8)).booleanValue()) {
            InterfaceC4132tH n8 = this.f25737c.n();
            QB qb = new QB();
            qb.f(this.f25735a);
            qb.k(j8);
            n8.s(qb.l());
            C2823hF c2823hF = new C2823hF();
            c2823hF.m(this.f25738d, this.f25736b);
            c2823hF.n(this.f25738d, this.f25736b);
            n8.t(c2823hF.q());
            n8.o(new C4804zW(this.f25740f));
            e8 = n8.e();
        } else {
            C2823hF c2823hF2 = new C2823hF();
            S50 s50 = this.f25739e;
            if (s50 != null) {
                c2823hF2.h(s50, this.f25736b);
                c2823hF2.i(this.f25739e, this.f25736b);
                c2823hF2.e(this.f25739e, this.f25736b);
            }
            InterfaceC4132tH n9 = this.f25737c.n();
            QB qb2 = new QB();
            qb2.f(this.f25735a);
            qb2.k(j8);
            n9.s(qb2.l());
            c2823hF2.m(this.f25738d, this.f25736b);
            c2823hF2.h(this.f25738d, this.f25736b);
            c2823hF2.i(this.f25738d, this.f25736b);
            c2823hF2.e(this.f25738d, this.f25736b);
            c2823hF2.d(this.f25738d, this.f25736b);
            c2823hF2.o(this.f25738d, this.f25736b);
            c2823hF2.n(this.f25738d, this.f25736b);
            c2823hF2.l(this.f25738d, this.f25736b);
            c2823hF2.f(this.f25738d, this.f25736b);
            n9.t(c2823hF2.q());
            n9.o(new C4804zW(this.f25740f));
            e8 = n9.e();
        }
        AbstractC4241uH abstractC4241uH = e8;
        if (((Boolean) AbstractC2534eg.f21867c.e()).booleanValue()) {
            RunnableC3464n90 d8 = abstractC4241uH.d();
            d8.i(4);
            d8.b(x12.f1175G);
            d8.f(x12.f1172D);
            runnableC3464n90 = d8;
        } else {
            runnableC3464n90 = null;
        }
        C3792qA a9 = abstractC4241uH.a();
        com.google.common.util.concurrent.d h8 = a9.h(a9.i());
        this.f25743i = h8;
        AbstractC2326ck0.r(h8, new C3674p50(this, ix, runnableC3464n90, b8, abstractC4241uH), this.f25736b);
        return true;
    }

    final /* synthetic */ void g() {
        this.f25738d.r0(AbstractC3351m70.d(6, null, null));
    }

    public final void h(InterfaceC1303Ff interfaceC1303Ff) {
        this.f25740f = interfaceC1303Ff;
    }

    @Override // com.google.android.gms.internal.ads.JX
    public final boolean zza() {
        com.google.common.util.concurrent.d dVar = this.f25743i;
        return (dVar == null || dVar.isDone()) ? false : true;
    }
}
