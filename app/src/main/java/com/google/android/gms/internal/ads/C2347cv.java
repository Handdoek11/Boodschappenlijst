package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.cv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2347cv implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f21324a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f21325b;

    public C2347cv(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f21324a = interfaceC4203ty0;
        this.f21325b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC3964ro zzb() {
        Context a8 = ((C1323Fu) this.f21324a).a();
        RunnableC3791q90 runnableC3791q90 = (RunnableC3791q90) this.f21325b.zzb();
        C2544el b8 = C2.v.j().b(a8, H2.a.A0(), runnableC3791q90);
        InterfaceC1980Yk interfaceC1980Yk = AbstractC2219bl.f20925b;
        b8.a("google.afma.request.getAdDictionary", interfaceC1980Yk, interfaceC1980Yk);
        return new C4182to(a8, C2.v.j().b(a8, H2.a.A0(), runnableC3791q90).a("google.afma.sdkConstants.getSdkConstants", interfaceC1980Yk, interfaceC1980Yk), H2.a.A0());
    }
}
