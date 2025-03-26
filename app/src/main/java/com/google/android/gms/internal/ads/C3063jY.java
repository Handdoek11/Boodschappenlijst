package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.jY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3063jY implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.common.util.concurrent.d f23272a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f23273b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f23274c;

    C3063jY(com.google.common.util.concurrent.d dVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f23272a = dVar;
        this.f23273b = executor;
        this.f23274c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        com.google.common.util.concurrent.d n8 = AbstractC2326ck0.n(this.f23272a, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.gY
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return AbstractC2326ck0.h(new C3172kY((String) obj));
            }
        }, this.f23273b);
        if (((Integer) D2.A.c().a(AbstractC3184kf.qc)).intValue() > 0) {
            n8 = AbstractC2326ck0.o(n8, ((Integer) D2.A.c().a(r1)).intValue(), TimeUnit.MILLISECONDS, this.f23274c);
        }
        return AbstractC2326ck0.f(n8, Throwable.class, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.iY
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return ((Throwable) obj) instanceof TimeoutException ? AbstractC2326ck0.h(new C3172kY(Integer.toString(17))) : AbstractC2326ck0.h(new C3172kY(null));
            }
        }, this.f23273b);
    }
}
