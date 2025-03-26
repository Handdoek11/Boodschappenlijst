package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.p00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3664p00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f25314a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f25315b;

    public C3664p00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f25314a = interfaceC4203ty0;
        this.f25315b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3883r10(((C3666p10) this.f25314a).zzb(), ((Integer) D2.A.c().a(AbstractC3184kf.bc)).intValue(), (ScheduledExecutorService) this.f25315b.zzb());
    }
}
