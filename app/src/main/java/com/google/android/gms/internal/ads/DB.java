package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class DB implements InterfaceC3033jC, VF, JE, AC, InterfaceC4701yb {

    /* renamed from: o, reason: collision with root package name */
    private final CC f14426o;

    /* renamed from: s, reason: collision with root package name */
    private final C3785q60 f14427s;

    /* renamed from: t, reason: collision with root package name */
    private final ScheduledExecutorService f14428t;

    /* renamed from: u, reason: collision with root package name */
    private final Executor f14429u;

    /* renamed from: w, reason: collision with root package name */
    private ScheduledFuture f14431w;

    /* renamed from: y, reason: collision with root package name */
    private final String f14433y;

    /* renamed from: v, reason: collision with root package name */
    private final C4611xk0 f14430v = C4611xk0.D();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f14432x = new AtomicBoolean();

    DB(CC cc, C3785q60 c3785q60, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.f14426o = cc;
        this.f14427s = c3785q60;
        this.f14428t = scheduledExecutorService;
        this.f14429u = executor;
        this.f14433y = str;
    }

    private final boolean g() {
        return this.f14433y.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4701yb
    public final void A0(C4592xb c4592xb) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.qb)).booleanValue() && g() && c4592xb.f27883j && this.f14432x.compareAndSet(false, true) && this.f14427s.f25786e != 3) {
            AbstractC0608p0.k("Full screen 1px impression occurred");
            this.f14426o.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void a() {
        C3785q60 c3785q60 = this.f14427s;
        if (c3785q60.f25786e == 3) {
            return;
        }
        int i8 = c3785q60.f25776Y;
        if (i8 == 0 || i8 == 1) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.qb)).booleanValue() && g()) {
                return;
            }
            this.f14426o.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void c() {
    }

    final /* synthetic */ void e() {
        synchronized (this) {
            try {
                if (this.f14430v.isDone()) {
                    return;
                }
                this.f14430v.e(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.JE
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.JE
    public final synchronized void h() {
        try {
            if (this.f14430v.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f14431w;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f14430v.e(Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final void i() {
        if (this.f14427s.f25786e == 3) {
            return;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23664E1)).booleanValue()) {
            C3785q60 c3785q60 = this.f14427s;
            if (c3785q60.f25776Y == 2) {
                if (c3785q60.f25810q == 0) {
                    this.f14426o.zza();
                } else {
                    AbstractC2326ck0.r(this.f14430v, new CB(this), this.f14429u);
                    this.f14431w = this.f14428t.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.BB
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f13752o.e();
                        }
                    }, this.f14427s.f25810q, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.AC
    public final synchronized void m(D2.W0 w02) {
        try {
            if (this.f14430v.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f14431w;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f14430v.h(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void o(InterfaceC1460Jo interfaceC1460Jo, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void zzb() {
    }
}
