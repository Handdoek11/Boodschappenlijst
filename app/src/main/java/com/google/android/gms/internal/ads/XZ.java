package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class XZ implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f20068a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f20069b;

    public XZ(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f20068a = interfaceC4203ty0;
        this.f20069b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3883r10(((AY) this.f20068a).zzb(), ((Integer) D2.A.c().a(AbstractC3184kf.mc)).intValue(), (ScheduledExecutorService) this.f20069b.zzb());
    }
}
