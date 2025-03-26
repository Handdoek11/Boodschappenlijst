package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Qf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1691Qf implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f18517a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f18518b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f18519c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f18520d;

    public C1691Qf(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f18517a = interfaceC4203ty0;
        this.f18518b = interfaceC4203ty02;
        this.f18519c = interfaceC4203ty03;
        this.f18520d = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1656Pf zzb() {
        return new C1656Pf((ScheduledExecutorService) this.f18517a.zzb(), (M2.l0) this.f18518b.zzb(), (M2.c0) this.f18519c.zzb(), (NN) this.f18520d.zzb());
    }
}
