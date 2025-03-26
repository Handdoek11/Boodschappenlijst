package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.b00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2142b00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f20798a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f20799b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f20800c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f20801d;

    public C2142b00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f20798a = interfaceC4203ty0;
        this.f20799b = interfaceC4203ty02;
        this.f20800c = interfaceC4203ty03;
        this.f20801d = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C2304cZ zzb = ((C2521eZ) this.f20798a).zzb();
        C4153tZ c4153tZ = (C4153tZ) this.f20799b.zzb();
        List list = (List) this.f20800c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f20801d.zzb();
        if (list.contains("13")) {
            return new C3883r10(c4153tZ, ((Integer) D2.A.c().a(AbstractC3184kf.ic)).intValue(), scheduledExecutorService);
        }
        return new C3883r10(zzb, ((Integer) D2.A.c().a(AbstractC3184kf.ic)).intValue(), scheduledExecutorService);
    }
}
