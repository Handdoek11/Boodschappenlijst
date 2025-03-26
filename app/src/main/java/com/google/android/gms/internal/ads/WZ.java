package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class WZ implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f19814a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f19815b;

    public WZ(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f19814a = interfaceC4203ty0;
        this.f19815b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3883r10(((C3717pY) this.f19814a).zzb(), ((Integer) D2.A.c().a(AbstractC3184kf.kc)).intValue(), (ScheduledExecutorService) this.f19815b.zzb());
    }
}
