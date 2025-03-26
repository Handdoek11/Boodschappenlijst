package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.u00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4208u00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f26986a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f26987b;

    public C4208u00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f26986a = interfaceC4203ty0;
        this.f26987b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3883r10(((C2798h20) this.f26986a).zzb(), ((Integer) D2.A.c().a(AbstractC3184kf.Wb)).intValue(), (ScheduledExecutorService) this.f26987b.zzb());
    }
}
