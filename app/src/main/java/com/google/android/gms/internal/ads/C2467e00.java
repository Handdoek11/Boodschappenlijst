package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.e00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2467e00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f21712a;

    public C2467e00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f21712a = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        AbstractC4714yh0 w7;
        C4371vZ a8 = C4589xZ.a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f21712a.zzb();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23897g4)).booleanValue()) {
            w7 = AbstractC4714yh0.x(new C3883r10(a8, ((Integer) D2.A.c().a(AbstractC3184kf.f23906h4)).intValue(), scheduledExecutorService));
        } else {
            w7 = AbstractC4714yh0.w();
        }
        AbstractC3332ly0.b(w7);
        return w7;
    }
}
