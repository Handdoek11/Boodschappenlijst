package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class Z50 implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ IX f20409a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RunnableC3464n90 f20410b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC2160b90 f20411c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2045a60 f20412d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2371d60 f20413e;

    Z50(C2371d60 c2371d60, IX ix, RunnableC3464n90 runnableC3464n90, InterfaceC2160b90 interfaceC2160b90, C2045a60 c2045a60) {
        this.f20409a = ix;
        this.f20410b = runnableC3464n90;
        this.f20411c = interfaceC2160b90;
        this.f20412d = c2045a60;
        this.f20413e = c2371d60;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        RunnableC3464n90 runnableC3464n90;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23684G5)).booleanValue()) {
            AbstractC0608p0.l("Rewarded ad failed to load", th);
        }
        NL nl = (NL) this.f20413e.f21425e.d();
        final D2.W0 b8 = nl == null ? AbstractC3351m70.b(th, null) : nl.zzb().a(th);
        synchronized (this.f20413e) {
            try {
                if (nl != null) {
                    nl.b().r0(b8);
                    this.f20413e.f21422b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.X50
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f19977o.f20413e.f21424d.r0(b8);
                        }
                    });
                } else {
                    this.f20413e.f21424d.r0(b8);
                    this.f20413e.j(this.f20412d).e().zzb().c().e();
                }
                AbstractC2917i70.b(b8.f1162o, th, "RewardedAdLoader.onFailure");
                this.f20409a.zza();
                if (!((Boolean) AbstractC2534eg.f21867c.e()).booleanValue() || (runnableC3464n90 = this.f20410b) == null) {
                    RunnableC3791q90 runnableC3791q90 = this.f20413e.f21427g;
                    InterfaceC2160b90 interfaceC2160b90 = this.f20411c;
                    interfaceC2160b90.o(b8);
                    interfaceC2160b90.c(th);
                    interfaceC2160b90.I0(false);
                    runnableC3791q90.b(interfaceC2160b90.k());
                } else {
                    runnableC3464n90.c(b8);
                    InterfaceC2160b90 interfaceC2160b902 = this.f20411c;
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
        IL il = (IL) obj;
        synchronized (this.f20413e) {
            try {
                il.e().d(this.f20413e.f21424d);
                this.f20409a.c(il);
                C2371d60 c2371d60 = this.f20413e;
                Executor executor = c2371d60.f21422b;
                final S50 s50 = c2371d60.f21424d;
                Objects.requireNonNull(s50);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Y50
                    @Override // java.lang.Runnable
                    public final void run() {
                        s50.s();
                    }
                });
                this.f20413e.f21424d.i();
                if (!((Boolean) AbstractC2534eg.f21867c.e()).booleanValue() || (runnableC3464n90 = this.f20410b) == null) {
                    RunnableC3791q90 runnableC3791q90 = this.f20413e.f21427g;
                    InterfaceC2160b90 interfaceC2160b90 = this.f20411c;
                    interfaceC2160b90.a(il.g().f14101b);
                    interfaceC2160b90.Z(il.c().g());
                    interfaceC2160b90.I0(true);
                    runnableC3791q90.b(interfaceC2160b90.k());
                } else {
                    runnableC3464n90.g(il.g().f14101b);
                    runnableC3464n90.e(il.c().g());
                    InterfaceC2160b90 interfaceC2160b902 = this.f20411c;
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
