package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.y40, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4652y40 implements JX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28021a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f28022b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4630xu f28023c;

    /* renamed from: d, reason: collision with root package name */
    private final C4042sX f28024d;

    /* renamed from: e, reason: collision with root package name */
    private final C4478wX f28025e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewGroup f28026f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC1303Ff f28027g;

    /* renamed from: h, reason: collision with root package name */
    private final ED f28028h;

    /* renamed from: i, reason: collision with root package name */
    private final RunnableC3791q90 f28029i;

    /* renamed from: j, reason: collision with root package name */
    private final NE f28030j;

    /* renamed from: k, reason: collision with root package name */
    private final J60 f28031k;

    /* renamed from: l, reason: collision with root package name */
    private com.google.common.util.concurrent.d f28032l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f28033m;

    /* renamed from: n, reason: collision with root package name */
    private D2.W0 f28034n;

    /* renamed from: o, reason: collision with root package name */
    private IX f28035o;

    public C4652y40(Context context, Executor executor, D2.c2 c2Var, AbstractC4630xu abstractC4630xu, C4042sX c4042sX, C4478wX c4478wX, J60 j60, NE ne) {
        this.f28021a = context;
        this.f28022b = executor;
        this.f28023c = abstractC4630xu;
        this.f28024d = c4042sX;
        this.f28025e = c4478wX;
        this.f28031k = j60;
        this.f28028h = abstractC4630xu.m();
        this.f28029i = abstractC4630xu.F();
        this.f28026f = new FrameLayout(context);
        this.f28030j = ne;
        j60.O(c2Var);
        this.f28033m = true;
        this.f28034n = null;
        this.f28035o = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        this.f28032l = null;
        final D2.W0 w02 = this.f28034n;
        this.f28034n = null;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.a8)).booleanValue() && w02 != null) {
            this.f28022b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.t40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26821o.i(w02);
                }
            });
        }
        IX ix = this.f28035o;
        if (ix != null) {
            ix.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.JX
    public final boolean a(D2.X1 x12, String str, HX hx, IX ix) {
        AbstractC2138az i8;
        if (str == null) {
            H2.p.d("Ad unit ID should not be null for banner ad.");
            this.f28022b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.v40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27179o.j();
                }
            });
            return false;
        }
        if (!zza()) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.O8)).booleanValue() && x12.f1191w) {
                this.f28023c.s().p(true);
            }
            Bundle a8 = AbstractC3923rN.a(new Pair(EnumC3706pN.PUBLIC_API_CALL.a(), Long.valueOf(x12.f1185Q)), new Pair(EnumC3706pN.DYNAMITE_ENTER.a(), Long.valueOf(C2.v.c().a())));
            J60 j60 = this.f28031k;
            j60.P(str);
            j60.h(x12);
            j60.a(a8);
            Context context = this.f28021a;
            L60 j8 = j60.j();
            InterfaceC2160b90 b8 = AbstractC2051a90.b(context, AbstractC3355m90.f(j8), 3, x12);
            RunnableC3464n90 runnableC3464n90 = null;
            if (!((Boolean) AbstractC3948rg.f26208d.e()).booleanValue() || !this.f28031k.D().f1216B) {
                if (((Boolean) D2.A.c().a(AbstractC3184kf.a8)).booleanValue()) {
                    InterfaceC2029Zy l8 = this.f28023c.l();
                    QB qb = new QB();
                    qb.f(this.f28021a);
                    qb.k(j8);
                    l8.k(qb.l());
                    C2823hF c2823hF = new C2823hF();
                    c2823hF.m(this.f28024d, this.f28022b);
                    c2823hF.n(this.f28024d, this.f28022b);
                    l8.n(c2823hF.q());
                    l8.m(new C4804zW(this.f28027g));
                    l8.f(new LH(SI.f18855h, null));
                    l8.j(new C1220Cz(this.f28028h, this.f28030j));
                    l8.h(new C4093sy(this.f28026f));
                    i8 = l8.i();
                } else {
                    InterfaceC2029Zy l9 = this.f28023c.l();
                    QB qb2 = new QB();
                    qb2.f(this.f28021a);
                    qb2.k(j8);
                    l9.k(qb2.l());
                    C2823hF c2823hF2 = new C2823hF();
                    c2823hF2.m(this.f28024d, this.f28022b);
                    c2823hF2.d(this.f28024d, this.f28022b);
                    c2823hF2.d(this.f28025e, this.f28022b);
                    c2823hF2.o(this.f28024d, this.f28022b);
                    c2823hF2.g(this.f28024d, this.f28022b);
                    c2823hF2.h(this.f28024d, this.f28022b);
                    c2823hF2.i(this.f28024d, this.f28022b);
                    c2823hF2.e(this.f28024d, this.f28022b);
                    c2823hF2.n(this.f28024d, this.f28022b);
                    c2823hF2.l(this.f28024d, this.f28022b);
                    l9.n(c2823hF2.q());
                    l9.m(new C4804zW(this.f28027g));
                    l9.f(new LH(SI.f18855h, null));
                    l9.j(new C1220Cz(this.f28028h, this.f28030j));
                    l9.h(new C4093sy(this.f28026f));
                    i8 = l9.i();
                }
                if (((Boolean) AbstractC2534eg.f21867c.e()).booleanValue()) {
                    runnableC3464n90 = i8.f();
                    runnableC3464n90.i(3);
                    runnableC3464n90.b(x12.f1175G);
                    runnableC3464n90.f(x12.f1172D);
                }
                this.f28035o = ix;
                C3792qA d8 = i8.d();
                com.google.common.util.concurrent.d h8 = d8.h(d8.i());
                this.f28032l = h8;
                AbstractC2326ck0.r(h8, new C4434w40(this, runnableC3464n90, b8, i8), this.f28022b);
                return true;
            }
            C4042sX c4042sX = this.f28024d;
            if (c4042sX != null) {
                c4042sX.r0(AbstractC3351m70.d(7, null, null));
            }
        } else if (!this.f28031k.s()) {
            this.f28033m = true;
        }
        return false;
    }

    public final ViewGroup b() {
        return this.f28026f;
    }

    public final J60 e() {
        return this.f28031k;
    }

    final /* synthetic */ void i(D2.W0 w02) {
        this.f28024d.r0(w02);
    }

    final /* synthetic */ void j() {
        this.f28024d.r0(AbstractC3351m70.d(6, null, null));
    }

    public final void k() {
        this.f28028h.m1(this.f28030j.a());
    }

    public final void l() {
        this.f28028h.p1(this.f28030j.b());
    }

    public final void m(D2.E e8) {
        this.f28025e.a(e8);
    }

    public final void n(InterfaceC4669yD interfaceC4669yD) {
        this.f28028h.f1(interfaceC4669yD, this.f28022b);
    }

    public final void o(InterfaceC1303Ff interfaceC1303Ff) {
        this.f28027g = interfaceC1303Ff;
    }

    public final void p() {
        synchronized (this) {
            try {
                com.google.common.util.concurrent.d dVar = this.f28032l;
                if (dVar != null && dVar.isDone()) {
                    try {
                        AbstractC4420vy abstractC4420vy = (AbstractC4420vy) this.f28032l.get();
                        this.f28032l = null;
                        this.f28026f.removeAllViews();
                        if (abstractC4420vy.k() != null) {
                            ViewParent parent = abstractC4420vy.k().getParent();
                            if (parent instanceof ViewGroup) {
                                H2.p.g("Banner view provided from " + (abstractC4420vy.c() != null ? abstractC4420vy.c().g() : "") + " already has a parent view. Removing its old parent.");
                                ((ViewGroup) parent).removeView(abstractC4420vy.k());
                            }
                        }
                        AbstractC2207bf abstractC2207bf = AbstractC3184kf.a8;
                        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
                            C4126tE e8 = abstractC4420vy.e();
                            e8.a(this.f28024d);
                            e8.c(this.f28025e);
                        }
                        this.f28026f.addView(abstractC4420vy.k());
                        IX ix = this.f28035o;
                        if (ix != null) {
                            ix.c(abstractC4420vy);
                        }
                        if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
                            Executor executor = this.f28022b;
                            final C4042sX c4042sX = this.f28024d;
                            Objects.requireNonNull(c4042sX);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.u40
                                @Override // java.lang.Runnable
                                public final void run() {
                                    c4042sX.s();
                                }
                            });
                        }
                        if (abstractC4420vy.i() >= 0) {
                            this.f28033m = false;
                            this.f28028h.m1(abstractC4420vy.i());
                            this.f28028h.p1(abstractC4420vy.j());
                        } else {
                            this.f28033m = true;
                            this.f28028h.m1(abstractC4420vy.j());
                        }
                    } catch (InterruptedException e9) {
                        e = e9;
                        s();
                        AbstractC0608p0.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f28033m = true;
                        this.f28028h.zza();
                    } catch (ExecutionException e10) {
                        e = e10;
                        s();
                        AbstractC0608p0.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f28033m = true;
                        this.f28028h.zza();
                    }
                } else if (this.f28032l != null) {
                    AbstractC0608p0.k("Show timer went off but there is an ongoing ad request.");
                    this.f28033m = true;
                } else {
                    AbstractC0608p0.k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f28033m = true;
                    this.f28028h.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean r() {
        Object parent = this.f28026f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        C2.v.t();
        return G2.D0.w(view, view.getContext());
    }

    @Override // com.google.android.gms.internal.ads.JX
    public final boolean zza() {
        com.google.common.util.concurrent.d dVar = this.f28032l;
        return (dVar == null || dVar.isDone()) ? false : true;
    }
}
