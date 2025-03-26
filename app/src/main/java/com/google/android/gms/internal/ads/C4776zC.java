package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.zC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4776zC implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f28507a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f28508b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f28509c;

    public C4776zC(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f28507a = interfaceC4203ty0;
        this.f28508b = interfaceC4203ty02;
        this.f28509c = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4558xC(((C4667yC) this.f28507a).zzb(), ((C3985ry0) this.f28508b).zzb(), C3244l80.b(), (ScheduledExecutorService) this.f28509c.zzb());
    }
}
