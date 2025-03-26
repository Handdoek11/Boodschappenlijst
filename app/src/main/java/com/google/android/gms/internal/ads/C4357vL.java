package com.google.android.gms.internal.ads;

import D2.InterfaceC0484a;
import F2.InterfaceC0572d;

/* renamed from: com.google.android.gms.internal.ads.vL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4357vL extends C2507eL implements InterfaceC3912rG {

    /* renamed from: w, reason: collision with root package name */
    private InterfaceC3912rG f27248w;

    @Override // com.google.android.gms.internal.ads.InterfaceC3912rG
    public final synchronized void K0() {
        InterfaceC3912rG interfaceC3912rG = this.f27248w;
        if (interfaceC3912rG != null) {
            interfaceC3912rG.K0();
        }
    }

    protected final synchronized void c(InterfaceC0484a interfaceC0484a, InterfaceC2538ei interfaceC2538ei, F2.z zVar, InterfaceC2756gi interfaceC2756gi, InterfaceC0572d interfaceC0572d, InterfaceC3912rG interfaceC3912rG) {
        super.a(interfaceC0484a, interfaceC2538ei, zVar, interfaceC2756gi, interfaceC0572d);
        this.f27248w = interfaceC3912rG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3912rG
    public final synchronized void x() {
        InterfaceC3912rG interfaceC3912rG = this.f27248w;
        if (interfaceC3912rG != null) {
            interfaceC3912rG.x();
        }
    }
}
