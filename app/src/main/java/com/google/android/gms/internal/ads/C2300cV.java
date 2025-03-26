package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.cV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2300cV {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f21197a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f21198b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1645Oz f21199c;

    /* renamed from: d, reason: collision with root package name */
    private final C4040sV f21200d;

    /* renamed from: e, reason: collision with root package name */
    private final C2306ca0 f21201e;

    /* renamed from: f, reason: collision with root package name */
    private final C4611xk0 f21202f = C4611xk0.D();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f21203g = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private C2409dV f21204h;

    /* renamed from: i, reason: collision with root package name */
    private C60 f21205i;

    C2300cV(Executor executor, ScheduledExecutorService scheduledExecutorService, InterfaceC1645Oz interfaceC1645Oz, C4040sV c4040sV, C2306ca0 c2306ca0) {
        this.f21197a = executor;
        this.f21198b = scheduledExecutorService;
        this.f21199c = interfaceC1645Oz;
        this.f21200d = c4040sV;
        this.f21201e = c2306ca0;
    }

    private final synchronized com.google.common.util.concurrent.d d(C3785q60 c3785q60) {
        Iterator it = c3785q60.f25778a.iterator();
        while (it.hasNext()) {
            InterfaceC4474wT g8 = this.f21199c.g(c3785q60.f25780b, (String) it.next());
            if (g8 != null && g8.a(this.f21205i, c3785q60)) {
                return AbstractC2326ck0.o(g8.b(this.f21205i, c3785q60), c3785q60.f25769R, TimeUnit.MILLISECONDS, this.f21198b);
            }
        }
        return AbstractC2326ck0.g(new zzdvy(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(C3785q60 c3785q60) {
        com.google.common.util.concurrent.d d8 = d(c3785q60);
        this.f21200d.f(this.f21205i, c3785q60, d8, this.f21201e);
        AbstractC2326ck0.r(d8, new C2083aV(this, c3785q60), this.f21197a);
    }

    public final synchronized com.google.common.util.concurrent.d b(C60 c60) {
        try {
            if (!this.f21203g.getAndSet(true)) {
                if (c60.f14101b.f13519a.isEmpty()) {
                    this.f21202f.h(new zzegu(3, C4694yV.d(c60)));
                } else {
                    this.f21205i = c60;
                    this.f21204h = new C2409dV(c60, this.f21200d, this.f21202f);
                    this.f21200d.k(c60.f14101b.f13519a);
                    C3785q60 a8 = this.f21204h.a();
                    while (a8 != null) {
                        e(a8);
                        a8 = this.f21204h.a();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f21202f;
    }
}
