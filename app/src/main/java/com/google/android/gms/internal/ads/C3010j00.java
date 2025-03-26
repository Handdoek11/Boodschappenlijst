package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.j00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3010j00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f23157a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f23158b;

    public C3010j00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f23157a = interfaceC4203ty0;
        this.f23158b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3883r10(((O00) this.f23157a).zzb(), ((Integer) D2.A.c().a(AbstractC3184kf.rc)).intValue(), (ScheduledExecutorService) this.f23158b.zzb());
    }
}
