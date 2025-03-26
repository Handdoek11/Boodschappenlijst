package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.fC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2599fC implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f21964a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f21965b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f21966c;

    public C2599fC(C2490eC c2490eC, InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f21964a = interfaceC4203ty0;
        this.f21965b = interfaceC4203ty02;
        this.f21966c = interfaceC4203ty03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.f21964a.zzb();
        H2.a a8 = ((C1815Tu) this.f21965b).a();
        C3785q60 a9 = ((C2269cA) this.f21966c).a();
        C1282Ep c1282Ep = new C1282Ep();
        C1318Fp c1318Fp = a9.f25752A;
        if (c1318Fp == null) {
            return null;
        }
        C4220u60 c4220u60 = a9.f25814s;
        return new C1246Dp(context, a8, c1318Fp, c4220u60 == null ? null : c4220u60.f26997b, c1282Ep);
    }
}
