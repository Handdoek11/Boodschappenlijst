package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.eV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2517eV implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f21824a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f21825b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f21826c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f21827d;

    public C2517eV(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04, InterfaceC4203ty0 interfaceC4203ty05) {
        this.f21824a = interfaceC4203ty02;
        this.f21825b = interfaceC4203ty03;
        this.f21826c = interfaceC4203ty04;
        this.f21827d = interfaceC4203ty05;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2300cV zzb() {
        return new C2300cV(C3244l80.b(), (ScheduledExecutorService) this.f21824a.zzb(), (InterfaceC1645Oz) this.f21825b.zzb(), (C4040sV) this.f21826c.zzb(), (C2306ca0) this.f21827d.zzb());
    }
}
