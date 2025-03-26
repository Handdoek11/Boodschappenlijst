package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Vy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1889Vy implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f19683a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f19684b;

    public C1889Vy(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f19683a = interfaceC4203ty0;
        this.f19684b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3883r10(((C2848hZ) this.f19683a).zzb(), ((Integer) D2.A.c().a(AbstractC3184kf.tc)).intValue(), (ScheduledExecutorService) this.f19684b.zzb());
    }
}
