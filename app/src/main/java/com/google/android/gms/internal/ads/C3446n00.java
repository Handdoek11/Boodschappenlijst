package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.n00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3446n00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f24852a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f24853b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f24854c;

    public C3446n00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f24852a = interfaceC4203ty02;
        this.f24853b = interfaceC4203ty03;
        this.f24854c = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C2144b10 a8 = C2361d10.a();
        C4153tZ c4153tZ = (C4153tZ) this.f24852a.zzb();
        List list = (List) this.f24853b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f24854c.zzb();
        if (list.contains("24")) {
            return new C3883r10(c4153tZ, ((Integer) D2.A.c().a(AbstractC3184kf.cc)).intValue(), scheduledExecutorService);
        }
        return new C3883r10(a8, ((Integer) D2.A.c().a(AbstractC3184kf.cc)).intValue(), scheduledExecutorService);
    }
}
