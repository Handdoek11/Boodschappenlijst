package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Uy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1854Uy implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f19488a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f19489b;

    public C1854Uy(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f19488a = interfaceC4203ty0;
        this.f19489b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3883r10(((YX) this.f19488a).zzb(), ((Integer) D2.A.c().a(AbstractC3184kf.oc)).intValue(), (ScheduledExecutorService) this.f19489b.zzb());
    }
}
