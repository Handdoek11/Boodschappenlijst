package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.w00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4426w00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f27418a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f27419b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f27420c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f27421d;

    public C4426w00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f27418a = interfaceC4203ty0;
        this.f27419b = interfaceC4203ty02;
        this.f27420c = interfaceC4203ty03;
        this.f27421d = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        A20 zzb = ((B20) this.f27418a).zzb();
        C4153tZ c4153tZ = (C4153tZ) this.f27419b.zzb();
        List list = (List) this.f27420c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f27421d.zzb();
        if (list.contains("39")) {
            return new C3883r10(c4153tZ, ((Integer) D2.A.c().a(AbstractC3184kf.Ub)).intValue(), scheduledExecutorService);
        }
        return new C3883r10(zzb, ((Integer) D2.A.c().a(AbstractC3184kf.Ub)).intValue(), scheduledExecutorService);
    }
}
