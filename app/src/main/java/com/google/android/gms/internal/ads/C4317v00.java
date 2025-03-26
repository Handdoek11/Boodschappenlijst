package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.v00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4317v00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f27162a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f27163b;

    public C4317v00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f27162a = interfaceC4203ty0;
        this.f27163b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3883r10((C4153tZ) this.f27162a.zzb(), ((Integer) D2.A.c().a(AbstractC3184kf.Vb)).intValue(), (ScheduledExecutorService) this.f27163b.zzb());
    }
}
