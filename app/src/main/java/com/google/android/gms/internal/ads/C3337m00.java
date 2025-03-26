package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.m00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3337m00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f24408a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f24409b;

    public C3337m00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f24408a = interfaceC4203ty0;
        this.f24409b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3883r10(((Z00) this.f24408a).zzb(), ((Integer) D2.A.c().a(AbstractC3184kf.dc)).intValue(), (ScheduledExecutorService) this.f24409b.zzb());
    }
}
