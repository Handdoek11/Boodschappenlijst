package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.c00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2250c00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f21043a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f21044b;

    public C2250c00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f21043a = interfaceC4203ty0;
        this.f21044b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3883r10((C4153tZ) this.f21043a.zzb(), ((Integer) D2.A.c().a(AbstractC3184kf.hc)).intValue(), (ScheduledExecutorService) this.f21044b.zzb());
    }
}
