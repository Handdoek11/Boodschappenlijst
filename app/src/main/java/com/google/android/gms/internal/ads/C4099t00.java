package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.t00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4099t00 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f26783a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f26784b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f26785c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f26786d;

    public C4099t00(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f26783a = interfaceC4203ty0;
        this.f26784b = interfaceC4203ty02;
        this.f26785c = interfaceC4203ty03;
        this.f26786d = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        X10 zzb = ((Z10) this.f26783a).zzb();
        C4153tZ c4153tZ = (C4153tZ) this.f26784b.zzb();
        List list = (List) this.f26785c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f26786d.zzb();
        if (list.contains("35")) {
            return new C3883r10(c4153tZ, ((Integer) D2.A.c().a(AbstractC3184kf.Xb)).intValue(), scheduledExecutorService);
        }
        return new C3883r10(zzb, ((Integer) D2.A.c().a(AbstractC3184kf.Xb)).intValue(), scheduledExecutorService);
    }
}
