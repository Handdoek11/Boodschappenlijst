package com.google.android.gms.internal.ads;

import f3.InterfaceC5781e;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.uy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4311uy implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f27154a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f27155b;

    public C4311uy(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f27154a = interfaceC4203ty0;
        this.f27155b = interfaceC4203ty02;
    }

    public static ED b(ScheduledExecutorService scheduledExecutorService, InterfaceC5781e interfaceC5781e) {
        return new ED(scheduledExecutorService, interfaceC5781e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ED zzb() {
        return b((ScheduledExecutorService) this.f27154a.zzb(), (InterfaceC5781e) this.f27155b.zzb());
    }
}
