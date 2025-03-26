package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.rU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3930rU implements InterfaceC4474wT {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2138az f26175a;

    /* renamed from: b, reason: collision with root package name */
    private final XT f26176b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f26177c;

    /* renamed from: d, reason: collision with root package name */
    private final C3251lC f26178d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f26179e;

    /* renamed from: f, reason: collision with root package name */
    private final BN f26180f;

    public C3930rU(AbstractC2138az abstractC2138az, XT xt, C3251lC c3251lC, ScheduledExecutorService scheduledExecutorService, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, BN bn) {
        this.f26175a = abstractC2138az;
        this.f26176b = xt;
        this.f26178d = c3251lC;
        this.f26179e = scheduledExecutorService;
        this.f26177c = interfaceExecutorServiceC3522nk0;
        this.f26180f = bn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final boolean a(C60 c60, C3785q60 c3785q60) {
        InterfaceC1625Oh a8 = c60.f14100a.f28044a.a();
        boolean a9 = this.f26176b.a(c60, c3785q60);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Rb)).booleanValue()) {
            this.f26180f.b().put("has_dbl", a8 != null ? "1" : "0");
            this.f26180f.b().put("crdb", true == a9 ? "1" : "0");
        }
        return a8 != null && a9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final com.google.common.util.concurrent.d b(final C60 c60, final C3785q60 c3785q60) {
        return this.f26177c.p0(new Callable() { // from class: com.google.android.gms.internal.ads.oU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f25189o.c(c60, c3785q60);
            }
        });
    }

    final /* synthetic */ AbstractC4420vy c(final C60 c60, final C3785q60 c3785q60) {
        return this.f26175a.b(new C2161bA(c60, c3785q60, null), new C4095sz(c60.f14100a.f28044a.a(), new Runnable() { // from class: com.google.android.gms.internal.ads.pU
            @Override // java.lang.Runnable
            public final void run() {
                this.f25449o.f(c60, c3785q60);
            }
        })).zza();
    }

    final /* synthetic */ void f(C60 c60, C3785q60 c3785q60) {
        AbstractC2326ck0.r(AbstractC2326ck0.o(this.f26176b.b(c60, c3785q60), c3785q60.f25769R, TimeUnit.SECONDS, this.f26179e), new C3822qU(this), this.f26177c);
    }
}
