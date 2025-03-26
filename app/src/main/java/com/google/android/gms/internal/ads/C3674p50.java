package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;

/* renamed from: com.google.android.gms.internal.ads.p50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3674p50 implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ IX f25341a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RunnableC3464n90 f25342b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC2160b90 f25343c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC4241uH f25344d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3783q50 f25345e;

    C3674p50(C3783q50 c3783q50, IX ix, RunnableC3464n90 runnableC3464n90, InterfaceC2160b90 interfaceC2160b90, AbstractC4241uH abstractC4241uH) {
        this.f25341a = ix;
        this.f25342b = runnableC3464n90;
        this.f25343c = interfaceC2160b90;
        this.f25344d = abstractC4241uH;
        this.f25345e = c3783q50;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        RunnableC3464n90 runnableC3464n90;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23684G5)).booleanValue()) {
            AbstractC0608p0.l("Interstitial ad failed to load", th);
        }
        final D2.W0 a8 = this.f25344d.a().a(th);
        synchronized (this.f25345e) {
            try {
                this.f25345e.f25743i = null;
                this.f25344d.b().r0(a8);
                if (((Boolean) D2.A.c().a(AbstractC3184kf.c8)).booleanValue()) {
                    this.f25345e.f25736b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.l50
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f24272o.f25345e.f25738d.r0(a8);
                        }
                    });
                    this.f25345e.f25736b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.m50
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f24452o.f25345e.f25739e.r0(a8);
                        }
                    });
                }
                AbstractC2917i70.b(a8.f1162o, th, "InterstitialAdLoader.onFailure");
                this.f25341a.zza();
                if (!((Boolean) AbstractC2534eg.f21867c.e()).booleanValue() || (runnableC3464n90 = this.f25342b) == null) {
                    RunnableC3791q90 runnableC3791q90 = this.f25345e.f25741g;
                    InterfaceC2160b90 interfaceC2160b90 = this.f25343c;
                    interfaceC2160b90.o(a8);
                    interfaceC2160b90.c(th);
                    interfaceC2160b90.I0(false);
                    runnableC3791q90.b(interfaceC2160b90.k());
                } else {
                    runnableC3464n90.c(a8);
                    InterfaceC2160b90 interfaceC2160b902 = this.f25343c;
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
        PG pg = (PG) obj;
        synchronized (this.f25345e) {
            try {
                this.f25345e.f25743i = null;
                AbstractC2207bf abstractC2207bf = AbstractC3184kf.c8;
                if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
                    C4126tE e8 = pg.e();
                    e8.a(this.f25345e.f25738d);
                    e8.d(this.f25345e.f25739e);
                }
                this.f25341a.c(pg);
                if (((Boolean) D2.A.c().a(abstractC2207bf)).booleanValue()) {
                    this.f25345e.f25736b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.n50
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f24875o.f25345e.f25738d.s();
                        }
                    });
                    this.f25345e.f25736b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.o50
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f25104o.f25345e.f25739e.s();
                        }
                    });
                }
                if (!((Boolean) AbstractC2534eg.f21867c.e()).booleanValue() || (runnableC3464n90 = this.f25342b) == null) {
                    RunnableC3791q90 runnableC3791q90 = this.f25345e.f25741g;
                    InterfaceC2160b90 interfaceC2160b90 = this.f25343c;
                    interfaceC2160b90.a(pg.g().f14101b);
                    interfaceC2160b90.Z(pg.c().g());
                    interfaceC2160b90.I0(true);
                    runnableC3791q90.b(interfaceC2160b90.k());
                } else {
                    runnableC3464n90.g(pg.g().f14101b);
                    runnableC3464n90.e(pg.c().g());
                    InterfaceC2160b90 interfaceC2160b902 = this.f25343c;
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
