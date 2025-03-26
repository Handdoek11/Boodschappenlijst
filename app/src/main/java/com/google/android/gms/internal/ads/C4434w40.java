package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;

/* renamed from: com.google.android.gms.internal.ads.w40, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4434w40 implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RunnableC3464n90 f27436a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2160b90 f27437b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2138az f27438c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4652y40 f27439d;

    C4434w40(C4652y40 c4652y40, RunnableC3464n90 runnableC3464n90, InterfaceC2160b90 interfaceC2160b90, AbstractC2138az abstractC2138az) {
        this.f27436a = runnableC3464n90;
        this.f27437b = interfaceC2160b90;
        this.f27438c = abstractC2138az;
        this.f27439d = c4652y40;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        RunnableC3464n90 runnableC3464n90;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23684G5)).booleanValue()) {
            AbstractC0608p0.l("Banner ad failed to load", th);
        }
        synchronized (this.f27439d) {
            try {
                D2.W0 a8 = this.f27438c.d().a(th);
                this.f27439d.f28034n = a8;
                this.f27438c.e().r0(a8);
                AbstractC2917i70.b(a8.f1162o, th, "BannerAdLoader.onFailure");
                C4652y40 c4652y40 = this.f27439d;
                if (c4652y40.f28033m) {
                    c4652y40.s();
                    C4652y40 c4652y402 = this.f27439d;
                    c4652y402.f28028h.m1(c4652y402.f28030j.a());
                }
                if (!((Boolean) AbstractC2534eg.f21867c.e()).booleanValue() || (runnableC3464n90 = this.f27436a) == null) {
                    RunnableC3791q90 runnableC3791q90 = this.f27439d.f28029i;
                    InterfaceC2160b90 interfaceC2160b90 = this.f27437b;
                    interfaceC2160b90.o(a8);
                    interfaceC2160b90.c(th);
                    interfaceC2160b90.I0(false);
                    runnableC3791q90.b(interfaceC2160b90.k());
                } else {
                    runnableC3464n90.c(a8);
                    InterfaceC2160b90 interfaceC2160b902 = this.f27437b;
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
        AbstractC4420vy abstractC4420vy = (AbstractC4420vy) obj;
        synchronized (this.f27439d) {
            try {
                C4652y40 c4652y40 = this.f27439d;
                if (c4652y40.f28033m) {
                    c4652y40.p();
                }
                if (!((Boolean) AbstractC2534eg.f21867c.e()).booleanValue() || (runnableC3464n90 = this.f27436a) == null) {
                    RunnableC3791q90 runnableC3791q90 = this.f27439d.f28029i;
                    InterfaceC2160b90 interfaceC2160b90 = this.f27437b;
                    interfaceC2160b90.a(abstractC4420vy.g().f14101b);
                    interfaceC2160b90.Z(abstractC4420vy.c().g());
                    interfaceC2160b90.I0(true);
                    runnableC3791q90.b(interfaceC2160b90.k());
                } else {
                    runnableC3464n90.g(abstractC4420vy.g().f14101b);
                    runnableC3464n90.e(abstractC4420vy.c().g());
                    InterfaceC2160b90 interfaceC2160b902 = this.f27437b;
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
