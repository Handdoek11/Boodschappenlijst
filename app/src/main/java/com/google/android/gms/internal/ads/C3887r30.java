package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.r30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3887r30 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f26060a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f26061b;

    public C3887r30(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03) {
        this.f26060a = interfaceC4203ty02;
        this.f26061b = interfaceC4203ty03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3670p30(C4416vw.a(), (ScheduledExecutorService) this.f26060a.zzb(), ((C1323Fu) this.f26061b).a());
    }
}
