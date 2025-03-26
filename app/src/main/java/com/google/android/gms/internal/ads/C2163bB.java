package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.bB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2163bB implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f20835a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f20836b;

    public C2163bB(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f20835a = interfaceC4203ty0;
        this.f20836b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3041jG((C4671yE) this.f20835a.zzb(), (Executor) this.f20836b.zzb());
    }
}
