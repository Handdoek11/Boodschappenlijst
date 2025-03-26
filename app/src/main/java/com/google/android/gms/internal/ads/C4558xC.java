package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.xC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4558xC extends AbstractC2714gF implements InterfaceC3469nC {

    /* renamed from: s, reason: collision with root package name */
    private final ScheduledExecutorService f27768s;

    /* renamed from: t, reason: collision with root package name */
    private ScheduledFuture f27769t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f27770u;

    public C4558xC(C4449wC c4449wC, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f27770u = false;
        this.f27768s = scheduledExecutorService;
        super.f1(c4449wC, executor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3469nC
    public final void T(final zzdgb zzdgbVar) {
        if (this.f27770u) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f27769t;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.sC
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((InterfaceC3469nC) obj).T(zzdgbVar);
            }
        });
    }

    public final synchronized void b() {
        ScheduledFuture scheduledFuture = this.f27769t;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void c() {
        this.f27769t = this.f27768s.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.rC
            @Override // java.lang.Runnable
            public final void run() {
                this.f26138o.m1();
            }
        }, ((Integer) D2.A.c().a(AbstractC3184kf.Ca)).intValue(), TimeUnit.MILLISECONDS);
    }

    final /* synthetic */ void m1() {
        synchronized (this) {
            H2.p.d("Timeout waiting for show call succeed to be called.");
            T(new zzdgb("Timeout for show call succeed."));
            this.f27770u = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3469nC
    public final void o(final D2.W0 w02) {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.oC
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((InterfaceC3469nC) obj).o(w02);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3469nC
    public final void zzb() {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.pC
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((InterfaceC3469nC) obj).zzb();
            }
        });
    }
}
