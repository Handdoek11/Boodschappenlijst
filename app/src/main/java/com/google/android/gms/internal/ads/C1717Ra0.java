package com.google.android.gms.internal.ads;

import f3.InterfaceC5781e;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Ra0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1717Ra0 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f18672a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f18673b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f18674c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f18675d;

    public C1717Ra0(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04) {
        this.f18672a = interfaceC4203ty0;
        this.f18673b = interfaceC4203ty02;
        this.f18674c = interfaceC4203ty03;
        this.f18675d = interfaceC4203ty04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C1682Qa0(((C1323Fu) this.f18672a).a(), ((C1815Tu) this.f18673b).a(), (ScheduledExecutorService) this.f18674c.zzb(), (InterfaceC5781e) this.f18675d.zzb());
    }
}
