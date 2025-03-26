package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.k00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3119k00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f23482a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f23483b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f23484c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f23485d;

    public C3119k00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f23482a = interfaceC4203ty0;
        this.f23483b = interfaceC4203ty02;
        this.f23484c = interfaceC4203ty03;
        this.f23485d = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        T00 zzb = ((V00) this.f23482a).zzb();
        C4153tZ c4153tZ = (C4153tZ) this.f23483b.zzb();
        List list = (List) this.f23484c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f23485d.zzb();
        if (list.contains("60")) {
            return new C3883r10(c4153tZ, ((Integer) D2.A.c().a(AbstractC3184kf.Ic)).intValue(), scheduledExecutorService);
        }
        return new C3883r10(zzb, ((Integer) D2.A.c().a(AbstractC3184kf.Ic)).intValue(), scheduledExecutorService);
    }
}
