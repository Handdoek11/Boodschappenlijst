package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.a00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2033a00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f20615a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f20616b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f20617c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f20618d;

    public C2033a00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f20615a = interfaceC4203ty0;
        this.f20616b = interfaceC4203ty02;
        this.f20617c = interfaceC4203ty03;
        this.f20618d = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        YY zzb = ((C2087aZ) this.f20615a).zzb();
        C4153tZ c4153tZ = (C4153tZ) this.f20616b.zzb();
        List list = (List) this.f20617c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f20618d.zzb();
        if (list.contains("54")) {
            return new C3883r10(c4153tZ, ((Integer) D2.A.c().a(AbstractC3184kf.jc)).intValue(), scheduledExecutorService);
        }
        return new C3883r10(zzb, ((Integer) D2.A.c().a(AbstractC3184kf.jc)).intValue(), scheduledExecutorService);
    }
}
