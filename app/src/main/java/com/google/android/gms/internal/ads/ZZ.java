package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class ZZ implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f20494a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f20495b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f20496c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f20497d;

    public ZZ(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f20494a = interfaceC4203ty0;
        this.f20495b = interfaceC4203ty02;
        this.f20496c = interfaceC4203ty03;
        this.f20497d = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        LY zzb = ((NY) this.f20494a).zzb();
        C4153tZ c4153tZ = (C4153tZ) this.f20495b.zzb();
        List list = (List) this.f20496c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f20497d.zzb();
        if (list.contains("10")) {
            return new C3883r10(c4153tZ, ((Integer) D2.A.c().a(AbstractC3184kf.ac)).intValue(), scheduledExecutorService);
        }
        return new C3883r10(zzb, ((Integer) D2.A.c().a(AbstractC3184kf.ac)).intValue(), scheduledExecutorService);
    }
}
