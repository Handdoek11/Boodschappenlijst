package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.dB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2380dB implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f21470a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f21471b;

    public C2380dB(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f21470a = interfaceC4203ty0;
        this.f21471b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3041jG((C4671yE) this.f21470a.zzb(), (Executor) this.f21471b.zzb());
    }
}
