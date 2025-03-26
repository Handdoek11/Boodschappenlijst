package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class S30 implements JX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18792a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f18793b;

    /* renamed from: c, reason: collision with root package name */
    protected final AbstractC4630xu f18794c;

    /* renamed from: d, reason: collision with root package name */
    private final C3018j40 f18795d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2477e50 f18796e;

    /* renamed from: f, reason: collision with root package name */
    private final H2.a f18797f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f18798g;

    /* renamed from: h, reason: collision with root package name */
    private final RunnableC3791q90 f18799h;

    /* renamed from: i, reason: collision with root package name */
    private final J60 f18800i;

    /* renamed from: j, reason: collision with root package name */
    private com.google.common.util.concurrent.d f18801j;

    protected S30(Context context, Executor executor, AbstractC4630xu abstractC4630xu, InterfaceC2477e50 interfaceC2477e50, C3018j40 c3018j40, J60 j60, H2.a aVar) {
        this.f18792a = context;
        this.f18793b = executor;
        this.f18794c = abstractC4630xu;
        this.f18796e = interfaceC2477e50;
        this.f18795d = c3018j40;
        this.f18800i = j60;
        this.f18797f = aVar;
        this.f18798g = new FrameLayout(context);
        this.f18799h = abstractC4630xu.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized NB l(InterfaceC2260c50 interfaceC2260c50) {
        Q30 q30 = (Q30) interfaceC2260c50;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.b8)).booleanValue()) {
            C4093sy c4093sy = new C4093sy(this.f18798g);
            QB qb = new QB();
            qb.f(this.f18792a);
            qb.k(q30.f18358a);
            SB l8 = qb.l();
            C2823hF c2823hF = new C2823hF();
            c2823hF.f(this.f18795d, this.f18793b);
            c2823hF.o(this.f18795d, this.f18793b);
            return d(c4093sy, l8, c2823hF.q());
        }
        C3018j40 a8 = C3018j40.a(this.f18795d);
        C2823hF c2823hF2 = new C2823hF();
        c2823hF2.e(a8, this.f18793b);
        c2823hF2.j(a8, this.f18793b);
        c2823hF2.k(a8, this.f18793b);
        c2823hF2.l(a8, this.f18793b);
        c2823hF2.f(a8, this.f18793b);
        c2823hF2.o(a8, this.f18793b);
        c2823hF2.p(a8);
        C4093sy c4093sy2 = new C4093sy(this.f18798g);
        QB qb2 = new QB();
        qb2.f(this.f18792a);
        qb2.k(q30.f18358a);
        return d(c4093sy2, qb2.l(), c2823hF2.q());
    }

    @Override // com.google.android.gms.internal.ads.JX
    public final synchronized boolean a(D2.X1 x12, String str, HX hx, IX ix) {
        RunnableC3464n90 runnableC3464n90;
        InterfaceC2570ey interfaceC2570ey;
        try {
            if (!x12.B0()) {
                boolean z7 = ((Boolean) AbstractC3077jg.f23298d.e()).booleanValue() && ((Boolean) D2.A.c().a(AbstractC3184kf.bb)).booleanValue();
                if (this.f18797f.f2916t < ((Integer) D2.A.c().a(AbstractC3184kf.cb)).intValue() || !z7) {
                    Z2.r.e("loadAd must be called on the main UI thread.");
                }
            }
            if (str == null) {
                H2.p.d("Ad unit ID should not be null for app open ad.");
                this.f18793b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.M30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17213o.j();
                    }
                });
                return false;
            }
            if (this.f18801j != null) {
                return false;
            }
            if (!((Boolean) AbstractC2534eg.f21867c.e()).booleanValue() || (interfaceC2570ey = (InterfaceC2570ey) this.f18796e.d()) == null) {
                runnableC3464n90 = null;
            } else {
                RunnableC3464n90 e8 = interfaceC2570ey.e();
                e8.i(7);
                e8.b(x12.f1175G);
                e8.f(x12.f1172D);
                runnableC3464n90 = e8;
            }
            AbstractC2917i70.a(this.f18792a, x12.f1191w);
            if (((Boolean) D2.A.c().a(AbstractC3184kf.O8)).booleanValue() && x12.f1191w) {
                this.f18794c.s().p(true);
            }
            Bundle a8 = AbstractC3923rN.a(new Pair(EnumC3706pN.PUBLIC_API_CALL.a(), Long.valueOf(x12.f1185Q)), new Pair(EnumC3706pN.DYNAMITE_ENTER.a(), Long.valueOf(C2.v.c().a())));
            J60 j60 = this.f18800i;
            j60.P(str);
            j60.O(D2.c2.B0());
            j60.h(x12);
            j60.a(a8);
            Context context = this.f18792a;
            L60 j8 = j60.j();
            InterfaceC2160b90 b8 = AbstractC2051a90.b(context, AbstractC3355m90.f(j8), 7, x12);
            Q30 q30 = new Q30(null);
            q30.f18358a = j8;
            com.google.common.util.concurrent.d a9 = this.f18796e.a(new C2586f50(q30, null), new InterfaceC2369d50() { // from class: com.google.android.gms.internal.ads.N30
                @Override // com.google.android.gms.internal.ads.InterfaceC2369d50
                public final NB a(InterfaceC2260c50 interfaceC2260c50) {
                    return this.f17466a.l(interfaceC2260c50);
                }
            }, null);
            this.f18801j = a9;
            AbstractC2326ck0.r(a9, new P30(this, ix, runnableC3464n90, b8, q30), this.f18793b);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    protected abstract NB d(C4093sy c4093sy, SB sb, C3039jF c3039jF);

    final /* synthetic */ void j() {
        this.f18795d.r0(AbstractC3351m70.d(6, null, null));
    }

    public final void k(D2.i2 i2Var) {
        this.f18800i.Q(i2Var);
    }

    @Override // com.google.android.gms.internal.ads.JX
    public final boolean zza() {
        com.google.common.util.concurrent.d dVar = this.f18801j;
        return (dVar == null || dVar.isDone()) ? false : true;
    }
}
