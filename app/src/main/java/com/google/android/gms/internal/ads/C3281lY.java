package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.lY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3281lY implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f24339a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f24340b;

    public C3281lY(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03) {
        this.f24339a = interfaceC4203ty0;
        this.f24340b = interfaceC4203ty03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3063jY((com.google.common.util.concurrent.d) this.f24339a.zzb(), C3244l80.b(), (ScheduledExecutorService) this.f24340b.zzb());
    }
}
