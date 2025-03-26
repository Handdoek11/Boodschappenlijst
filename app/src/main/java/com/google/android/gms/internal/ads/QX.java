package com.google.android.gms.internal.ads;

import D2.InterfaceC0509i0;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class QX implements JX {

    /* renamed from: a, reason: collision with root package name */
    private final J60 f18483a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4630xu f18484b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f18485c;

    /* renamed from: d, reason: collision with root package name */
    private final GX f18486d;

    /* renamed from: e, reason: collision with root package name */
    private final RunnableC3791q90 f18487e;

    /* renamed from: f, reason: collision with root package name */
    private C2052aA f18488f;

    public QX(AbstractC4630xu abstractC4630xu, Context context, GX gx, J60 j60) {
        this.f18484b = abstractC4630xu;
        this.f18485c = context;
        this.f18486d = gx;
        this.f18483a = j60;
        this.f18487e = abstractC4630xu.F();
        j60.R(gx.d());
    }

    @Override // com.google.android.gms.internal.ads.JX
    public final boolean a(D2.X1 x12, String str, HX hx, IX ix) {
        RunnableC3464n90 runnableC3464n90;
        C2.v.t();
        if (G2.D0.i(this.f18485c) && x12.f1178J == null) {
            H2.p.d("Failed to load the ad because app ID is missing.");
            this.f18484b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.LX
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16843o.e();
                }
            });
            return false;
        }
        if (str == null) {
            H2.p.d("Ad unit ID should not be null for NativeAdLoader.");
            this.f18484b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.MX
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17368o.f();
                }
            });
            return false;
        }
        AbstractC2917i70.a(this.f18485c, x12.f1191w);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.O8)).booleanValue() && x12.f1191w) {
            this.f18484b.s().p(true);
        }
        int i8 = ((KX) hx).f16596a;
        long a8 = C2.v.c().a();
        String a9 = EnumC3706pN.PUBLIC_API_CALL.a();
        Long valueOf = Long.valueOf(a8);
        Bundle a10 = AbstractC3923rN.a(new Pair(a9, valueOf), new Pair(EnumC3706pN.DYNAMITE_ENTER.a(), valueOf));
        J60 j60 = this.f18483a;
        j60.h(x12);
        j60.a(a10);
        j60.c(i8);
        Context context = this.f18485c;
        L60 j8 = j60.j();
        InterfaceC2160b90 b8 = AbstractC2051a90.b(context, AbstractC3355m90.f(j8), 8, x12);
        InterfaceC0509i0 interfaceC0509i0 = j8.f16776n;
        if (interfaceC0509i0 != null) {
            this.f18486d.d().C(interfaceC0509i0);
        }
        PH o8 = this.f18484b.o();
        QB qb = new QB();
        qb.f(this.f18485c);
        qb.k(j8);
        o8.p(qb.l());
        C2823hF c2823hF = new C2823hF();
        c2823hF.n(this.f18486d.d(), this.f18484b.d());
        o8.r(c2823hF.q());
        o8.f(this.f18486d.c());
        o8.h(new C4093sy(null));
        QH g8 = o8.g();
        if (((Boolean) AbstractC2534eg.f21867c.e()).booleanValue()) {
            RunnableC3464n90 e8 = g8.e();
            e8.i(8);
            e8.b(x12.f1175G);
            e8.f(x12.f1172D);
            runnableC3464n90 = e8;
        } else {
            runnableC3464n90 = null;
        }
        this.f18484b.E().c(1);
        AbstractC4630xu abstractC4630xu = this.f18484b;
        InterfaceExecutorServiceC3522nk0 b9 = C3244l80.b();
        ScheduledExecutorService e9 = abstractC4630xu.e();
        C3792qA a11 = g8.a();
        C2052aA c2052aA = new C2052aA(b9, e9, a11.h(a11.i()));
        this.f18488f = c2052aA;
        c2052aA.e(new PX(this, ix, runnableC3464n90, b8, g8));
        return true;
    }

    final /* synthetic */ void e() {
        this.f18486d.a().r0(AbstractC3351m70.d(4, null, null));
    }

    final /* synthetic */ void f() {
        this.f18486d.a().r0(AbstractC3351m70.d(6, null, null));
    }

    @Override // com.google.android.gms.internal.ads.JX
    public final boolean zza() {
        C2052aA c2052aA = this.f18488f;
        return c2052aA != null && c2052aA.f();
    }
}
