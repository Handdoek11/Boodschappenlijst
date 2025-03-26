package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3467nB implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f24899a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f24900b;

    public C3467nB(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f24899a = interfaceC4203ty0;
        this.f24900b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3041jG((C4671yE) this.f24899a.zzb(), (Executor) this.f24900b.zzb());
    }
}
