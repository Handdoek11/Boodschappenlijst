package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Wy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1924Wy implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f19924a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f19925b;

    public C1924Wy(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f19924a = interfaceC4203ty0;
        this.f19925b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3883r10(((S00) this.f19924a).zzb(), ((Integer) D2.A.c().a(AbstractC3184kf.pc)).intValue(), (ScheduledExecutorService) this.f19925b.zzb());
    }
}
