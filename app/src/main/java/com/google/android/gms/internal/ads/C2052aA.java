package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.aA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2052aA {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f20644a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f20645b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.d f20646c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f20647d = true;

    public C2052aA(Executor executor, ScheduledExecutorService scheduledExecutorService, com.google.common.util.concurrent.d dVar) {
        this.f20644a = executor;
        this.f20645b = scheduledExecutorService;
        this.f20646c = dVar;
    }

    static /* bridge */ /* synthetic */ void b(final C2052aA c2052aA, List list, final Yj0 yj0) {
        if (list == null || list.isEmpty()) {
            c2052aA.f20644a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Vz
                @Override // java.lang.Runnable
                public final void run() {
                    yj0.a(new zzdvy(3));
                }
            });
            return;
        }
        com.google.common.util.concurrent.d h8 = AbstractC2326ck0.h(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final com.google.common.util.concurrent.d dVar = (com.google.common.util.concurrent.d) it.next();
            h8 = AbstractC2326ck0.n(AbstractC2326ck0.f(h8, Throwable.class, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.Wz
                @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                public final com.google.common.util.concurrent.d a(Object obj) {
                    yj0.a((Throwable) obj);
                    return AbstractC2326ck0.h(null);
                }
            }, c2052aA.f20644a), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.Xz
                @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                public final com.google.common.util.concurrent.d a(Object obj) {
                    return this.f20165a.a(yj0, dVar, (AbstractC1506Kz) obj);
                }
            }, c2052aA.f20644a);
        }
        AbstractC2326ck0.r(h8, new C2030Zz(c2052aA, yj0), c2052aA.f20644a);
    }

    final /* synthetic */ com.google.common.util.concurrent.d a(Yj0 yj0, com.google.common.util.concurrent.d dVar, AbstractC1506Kz abstractC1506Kz) {
        if (abstractC1506Kz != null) {
            yj0.c(abstractC1506Kz);
        }
        return AbstractC2326ck0.o(dVar, ((Long) AbstractC4711yg.f28163a.e()).longValue(), TimeUnit.MILLISECONDS, this.f20645b);
    }

    final /* synthetic */ void d() {
        this.f20647d = false;
    }

    public final void e(Yj0 yj0) {
        AbstractC2326ck0.r(this.f20646c, new C1995Yz(this, yj0), this.f20644a);
    }

    public final boolean f() {
        return this.f20647d;
    }
}
