package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.s00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3990s00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f26530a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f26531b;

    public C3990s00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f26530a = interfaceC4203ty0;
        this.f26531b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3883r10(((V10) this.f26530a).zzb(), ((Integer) D2.A.c().a(AbstractC3184kf.Yb)).intValue(), (ScheduledExecutorService) this.f26531b.zzb());
    }
}
