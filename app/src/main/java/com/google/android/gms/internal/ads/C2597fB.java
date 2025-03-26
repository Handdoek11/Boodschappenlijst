package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.fB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2597fB implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f21962a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f21963b;

    public C2597fB(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f21962a = interfaceC4203ty0;
        this.f21963b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3041jG((C4671yE) this.f21962a.zzb(), (Executor) this.f21963b.zzb());
    }
}
