package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class EB implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f14674a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f14675b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f14676c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f14677d;

    public EB(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04, InterfaceC4203ty0 interfaceC4203ty05) {
        this.f14674a = interfaceC4203ty0;
        this.f14675b = interfaceC4203ty02;
        this.f14676c = interfaceC4203ty03;
        this.f14677d = interfaceC4203ty05;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new DB((CC) this.f14674a.zzb(), ((C2269cA) this.f14675b).a(), (ScheduledExecutorService) this.f14676c.zzb(), C3244l80.b(), ((C2378dA) this.f14677d).a());
    }
}
