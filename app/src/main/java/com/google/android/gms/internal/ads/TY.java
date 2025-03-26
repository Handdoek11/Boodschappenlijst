package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class TY implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f19148a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f19149b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f19150c;

    public TY(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f19148a = interfaceC4203ty0;
        this.f19149b = interfaceC4203ty02;
        this.f19150c = interfaceC4203ty03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new RY(((C1323Fu) this.f19148a).a(), (C1175Bq) this.f19149b.zzb(), (ScheduledExecutorService) this.f19150c.zzb(), C3244l80.b());
    }
}
