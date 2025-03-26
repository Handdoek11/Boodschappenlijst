package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;

/* loaded from: classes.dex */
final class P30 implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ IX f18112a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RunnableC3464n90 f18113b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC2160b90 f18114c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Q30 f18115d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ S30 f18116e;

    P30(S30 s30, IX ix, RunnableC3464n90 runnableC3464n90, InterfaceC2160b90 interfaceC2160b90, Q30 q30) {
        this.f18112a = ix;
        this.f18113b = runnableC3464n90;
        this.f18114c = interfaceC2160b90;
        this.f18115d = q30;
        this.f18116e = s30;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        RunnableC3464n90 runnableC3464n90;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23684G5)).booleanValue()) {
            AbstractC0608p0.l("App open ad failed to load", th);
        }
        InterfaceC2570ey interfaceC2570ey = (InterfaceC2570ey) this.f18116e.f18796e.d();
        final D2.W0 b8 = interfaceC2570ey == null ? AbstractC3351m70.b(th, null) : interfaceC2570ey.zzb().a(th);
        synchronized (this.f18116e) {
            try {
                this.f18116e.f18801j = null;
                if (interfaceC2570ey != null) {
                    interfaceC2570ey.a().r0(b8);
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.b8)).booleanValue()) {
                        this.f18116e.f18793b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.O30
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f17827o.f18116e.f18795d.r0(b8);
                            }
                        });
                    }
                } else {
                    this.f18116e.f18795d.r0(b8);
                    ((InterfaceC2570ey) this.f18116e.l(this.f18115d).e()).zzb().c().e();
                }
                AbstractC2917i70.b(b8.f1162o, th, "AppOpenAdLoader.onFailure");
                this.f18112a.zza();
                if (!((Boolean) AbstractC2534eg.f21867c.e()).booleanValue() || (runnableC3464n90 = this.f18113b) == null) {
                    RunnableC3791q90 runnableC3791q90 = this.f18116e.f18799h;
                    InterfaceC2160b90 interfaceC2160b90 = this.f18114c;
                    interfaceC2160b90.o(b8);
                    interfaceC2160b90.c(th);
                    interfaceC2160b90.I0(false);
                    runnableC3791q90.b(interfaceC2160b90.k());
                } else {
                    runnableC3464n90.c(b8);
                    InterfaceC2160b90 interfaceC2160b902 = this.f18114c;
                    interfaceC2160b902.c(th);
                    interfaceC2160b902.I0(false);
                    runnableC3464n90.a(interfaceC2160b902);
                    runnableC3464n90.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        RunnableC3464n90 runnableC3464n90;
        AbstractC1506Kz abstractC1506Kz = (AbstractC1506Kz) obj;
        synchronized (this.f18116e) {
            try {
                this.f18116e.f18801j = null;
                if (((Boolean) D2.A.c().a(AbstractC3184kf.b8)).booleanValue()) {
                    abstractC1506Kz.e().b(this.f18116e.f18795d);
                }
                this.f18112a.c(abstractC1506Kz);
                if (!((Boolean) AbstractC2534eg.f21867c.e()).booleanValue() || (runnableC3464n90 = this.f18113b) == null) {
                    RunnableC3791q90 runnableC3791q90 = this.f18116e.f18799h;
                    InterfaceC2160b90 interfaceC2160b90 = this.f18114c;
                    interfaceC2160b90.a(abstractC1506Kz.g().f14101b);
                    interfaceC2160b90.Z(abstractC1506Kz.c().g());
                    interfaceC2160b90.I0(true);
                    runnableC3791q90.b(interfaceC2160b90.k());
                } else {
                    runnableC3464n90.g(abstractC1506Kz.g().f14101b);
                    runnableC3464n90.e(abstractC1506Kz.c().g());
                    InterfaceC2160b90 interfaceC2160b902 = this.f18114c;
                    interfaceC2160b902.I0(true);
                    runnableC3464n90.a(interfaceC2160b902);
                    runnableC3464n90.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
