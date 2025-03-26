package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.eB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2488eB implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f21744a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f21745b;

    public C2488eB(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f21744a = interfaceC4203ty0;
        this.f21745b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3041jG((C4671yE) this.f21744a.zzb(), (Executor) this.f21745b.zzb());
    }
}
