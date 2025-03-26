package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class U80 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f19309a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f19310b;

    public U80(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03) {
        this.f19309a = interfaceC4203ty02;
        this.f19310b = interfaceC4203ty03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new S80(C3244l80.b(), (ScheduledExecutorService) this.f19309a.zzb(), ((V80) this.f19310b).zzb());
    }
}
