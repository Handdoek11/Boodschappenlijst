package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.o00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3555o00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f25069a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f25070b;

    public C3555o00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f25069a = interfaceC4203ty0;
        this.f25070b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3883r10(((C2687g10) this.f25069a).zzb(), ((Integer) D2.A.c().a(AbstractC3184kf.sc)).intValue(), (ScheduledExecutorService) this.f25070b.zzb());
    }
}
