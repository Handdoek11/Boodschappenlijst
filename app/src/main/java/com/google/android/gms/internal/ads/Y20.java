package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class Y20 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f20192a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f20193b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f20194c;

    public Y20(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04, InterfaceC4203ty0 interfaceC4203ty05) {
        this.f20192a = interfaceC4203ty0;
        this.f20193b = interfaceC4203ty03;
        this.f20194c = interfaceC4203ty04;
    }

    public static W20 a(String str, C1153Bc c1153Bc, C1175Bq c1175Bq, ScheduledExecutorService scheduledExecutorService, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        return new W20(str, c1153Bc, c1175Bq, scheduledExecutorService, interfaceExecutorServiceC3522nk0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new W20(((C4105t30) this.f20192a).a(), C3763pw.a(), (C1175Bq) this.f20193b.zzb(), (ScheduledExecutorService) this.f20194c.zzb(), C3244l80.b());
    }
}
