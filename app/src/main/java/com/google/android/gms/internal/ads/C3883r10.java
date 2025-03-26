package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.r10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3883r10 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3014j20 f26052a;

    /* renamed from: b, reason: collision with root package name */
    private final long f26053b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f26054c;

    public C3883r10(InterfaceC3014j20 interfaceC3014j20, long j8, ScheduledExecutorService scheduledExecutorService) {
        this.f26052a = interfaceC3014j20;
        this.f26053b = j8;
        this.f26054c = scheduledExecutorService;
    }

    final /* synthetic */ com.google.common.util.concurrent.d a(Throwable th) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23985q2)).booleanValue()) {
            InterfaceC3014j20 interfaceC3014j20 = this.f26052a;
            C2.v.s().x(th, "OptionalSignalTimeout:" + interfaceC3014j20.zza());
        }
        return AbstractC2326ck0.h(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return this.f26052a.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        com.google.common.util.concurrent.d zzb = this.f26052a.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23994r2)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j8 = this.f26053b;
        if (j8 > 0) {
            zzb = AbstractC2326ck0.o(zzb, j8, timeUnit, this.f26054c);
        }
        return AbstractC2326ck0.f(zzb, Throwable.class, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.q10
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f25701a.a((Throwable) obj);
            }
        }, AbstractC1497Kq.f16650g);
    }
}
