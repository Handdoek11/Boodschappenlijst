package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;

/* loaded from: classes.dex */
final class PX implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ IX f18197a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RunnableC3464n90 f18198b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC2160b90 f18199c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ QH f18200d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ QX f18201e;

    PX(QX qx, IX ix, RunnableC3464n90 runnableC3464n90, InterfaceC2160b90 interfaceC2160b90, QH qh) {
        this.f18197a = ix;
        this.f18198b = runnableC3464n90;
        this.f18199c = interfaceC2160b90;
        this.f18200d = qh;
        this.f18201e = qx;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        RunnableC3464n90 runnableC3464n90;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23684G5)).booleanValue()) {
            AbstractC0608p0.l("Native ad failed to load", th);
        }
        final D2.W0 a8 = this.f18200d.a().a(th);
        this.f18200d.b().r0(a8);
        this.f18201e.f18484b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.OX
            @Override // java.lang.Runnable
            public final void run() {
                this.f17893o.f18201e.f18486d.a().r0(a8);
            }
        });
        AbstractC2917i70.b(a8.f1162o, th, "NativeAdLoader.onFailure");
        this.f18197a.zza();
        if (((Boolean) AbstractC2534eg.f21867c.e()).booleanValue() && (runnableC3464n90 = this.f18198b) != null) {
            runnableC3464n90.c(a8);
            InterfaceC2160b90 interfaceC2160b90 = this.f18199c;
            interfaceC2160b90.c(th);
            interfaceC2160b90.I0(false);
            runnableC3464n90.a(interfaceC2160b90);
            runnableC3464n90.h();
            return;
        }
        QX qx = this.f18201e;
        InterfaceC2160b90 interfaceC2160b902 = this.f18199c;
        RunnableC3791q90 runnableC3791q90 = qx.f18487e;
        interfaceC2160b902.o(a8);
        interfaceC2160b902.c(th);
        interfaceC2160b902.I0(false);
        runnableC3791q90.b(interfaceC2160b902.k());
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        RunnableC3464n90 runnableC3464n90;
        AbstractC1506Kz abstractC1506Kz = (AbstractC1506Kz) obj;
        synchronized (this.f18201e) {
            try {
                abstractC1506Kz.e().a(this.f18201e.f18486d.d());
                this.f18197a.c(abstractC1506Kz);
                this.f18201e.f18484b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.NX
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17551o.f18201e.f18486d.b().s();
                    }
                });
                if (!((Boolean) AbstractC2534eg.f21867c.e()).booleanValue() || (runnableC3464n90 = this.f18198b) == null) {
                    RunnableC3791q90 runnableC3791q90 = this.f18201e.f18487e;
                    InterfaceC2160b90 interfaceC2160b90 = this.f18199c;
                    interfaceC2160b90.a(abstractC1506Kz.g().f14101b);
                    interfaceC2160b90.Z(abstractC1506Kz.c().g());
                    interfaceC2160b90.I0(true);
                    runnableC3791q90.b(interfaceC2160b90.k());
                } else {
                    runnableC3464n90.g(abstractC1506Kz.g().f14101b);
                    runnableC3464n90.e(abstractC1506Kz.c().g());
                    InterfaceC2160b90 interfaceC2160b902 = this.f18199c;
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
