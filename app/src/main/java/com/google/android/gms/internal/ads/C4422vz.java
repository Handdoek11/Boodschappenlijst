package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.vz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4422vz implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f27410a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f27411b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f27412c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f27413d;

    public C4422vz(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f27410a = interfaceC4203ty0;
        this.f27411b = interfaceC4203ty02;
        this.f27412c = interfaceC4203ty03;
        this.f27413d = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3878qz(((TA) this.f27410a).zzb(), ((C4313uz) this.f27411b).a(), ((C4204tz) this.f27412c).a(), (Executor) this.f27413d.zzb());
    }
}
