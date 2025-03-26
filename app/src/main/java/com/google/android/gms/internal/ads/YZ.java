package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class YZ implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f20278a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f20279b;

    public YZ(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f20278a = interfaceC4203ty0;
        this.f20279b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3883r10(((EY) this.f20278a).zzb(), ((Integer) D2.A.c().a(AbstractC3184kf.uc)).intValue(), (ScheduledExecutorService) this.f20279b.zzb());
    }
}
