package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.r00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3881r00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f26049a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f26050b;

    public C3881r00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f26049a = interfaceC4203ty0;
        this.f26050b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3883r10(((E10) this.f26049a).zzb(), ((Integer) D2.A.c().a(AbstractC3184kf.Zb)).intValue(), (ScheduledExecutorService) this.f26050b.zzb());
    }
}
