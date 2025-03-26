package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Sf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1761Sf implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f18939a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f18940b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f18941c;

    public C1761Sf(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f18939a = interfaceC4203ty0;
        this.f18940b = interfaceC4203ty02;
        this.f18941c = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C1726Rf(((C1323Fu) this.f18939a).a(), (ScheduledExecutorService) this.f18940b.zzb(), C1781Sv.a(), (RunnableC3464n90) this.f18941c.zzb());
    }
}
