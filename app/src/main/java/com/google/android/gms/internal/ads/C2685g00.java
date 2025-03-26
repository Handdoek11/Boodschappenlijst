package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.g00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2685g00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f22189a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f22190b;

    public C2685g00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f22189a = interfaceC4203ty0;
        this.f22190b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3883r10(((B00) this.f22189a).zzb(), ((Integer) D2.A.c().a(AbstractC3184kf.fc)).intValue(), (ScheduledExecutorService) this.f22190b.zzb());
    }
}
