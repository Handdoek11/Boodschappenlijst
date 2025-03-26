package com.google.android.gms.internal.ads;

import f3.InterfaceC5781e;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.tZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4153tZ implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f26899a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f26900b = new AtomicReference(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5781e f26901c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f26902d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3014j20 f26903e;

    /* renamed from: f, reason: collision with root package name */
    private final long f26904f;

    /* renamed from: g, reason: collision with root package name */
    private final HN f26905g;

    public C4153tZ(InterfaceC3014j20 interfaceC3014j20, long j8, InterfaceC5781e interfaceC5781e, Executor executor, HN hn) {
        this.f26901c = interfaceC5781e;
        this.f26903e = interfaceC3014j20;
        this.f26904f = j8;
        this.f26902d = executor;
        this.f26905g = hn;
    }

    final /* synthetic */ void b() {
        this.f26899a.set(new C4044sZ(this.f26903e.zzb(), this.f26904f, this.f26901c));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return this.f26903e.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        C4044sZ c4044sZ;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Gb)).booleanValue()) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.Fb)).booleanValue() && !((Boolean) this.f26900b.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = AbstractC1497Kq.f16647d;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.qZ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4153tZ c4153tZ = this.f25939o;
                        c4153tZ.f26902d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.rZ
                            @Override // java.lang.Runnable
                            public final void run() {
                                c4153tZ.b();
                            }
                        });
                    }
                };
                long j8 = this.f26904f;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j8, j8, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    c4044sZ = (C4044sZ) this.f26899a.get();
                    if (c4044sZ == null) {
                        C4044sZ c4044sZ2 = new C4044sZ(this.f26903e.zzb(), this.f26904f, this.f26901c);
                        this.f26899a.set(c4044sZ2);
                        return c4044sZ2.f26697a;
                    }
                    if (!((Boolean) this.f26900b.get()).booleanValue() && c4044sZ.a()) {
                        com.google.common.util.concurrent.d dVar = c4044sZ.f26697a;
                        InterfaceC3014j20 interfaceC3014j20 = this.f26903e;
                        C4044sZ c4044sZ3 = new C4044sZ(interfaceC3014j20.zzb(), this.f26904f, this.f26901c);
                        this.f26899a.set(c4044sZ3);
                        if (((Boolean) D2.A.c().a(AbstractC3184kf.Hb)).booleanValue()) {
                            if (((Boolean) D2.A.c().a(AbstractC3184kf.Ib)).booleanValue()) {
                                GN a8 = this.f26905g.a();
                                a8.b("action", "scs");
                                a8.b("sid", String.valueOf(this.f26903e.zza()));
                                a8.g();
                            }
                            return dVar;
                        }
                        c4044sZ = c4044sZ3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            c4044sZ = (C4044sZ) this.f26899a.get();
            if (c4044sZ == null || c4044sZ.a()) {
                InterfaceC3014j20 interfaceC3014j202 = this.f26903e;
                C4044sZ c4044sZ4 = new C4044sZ(interfaceC3014j202.zzb(), this.f26904f, this.f26901c);
                this.f26899a.set(c4044sZ4);
                c4044sZ = c4044sZ4;
            }
        }
        return c4044sZ.f26697a;
    }
}
