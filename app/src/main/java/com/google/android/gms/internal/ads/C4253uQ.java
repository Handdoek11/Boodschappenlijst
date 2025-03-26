package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.uQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4253uQ implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f27053a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f27054b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f27055c;

    public C4253uQ(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03, InterfaceC4203ty0 interfaceC4203ty04, InterfaceC4203ty0 interfaceC4203ty05) {
        this.f27053a = interfaceC4203ty0;
        this.f27054b = interfaceC4203ty04;
        this.f27055c = interfaceC4203ty05;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4035sQ zzb() {
        return new C4035sQ((ScheduledExecutorService) this.f27053a.zzb(), C3244l80.b(), C3897r80.b(), ((PQ) this.f27054b).zzb(), C2354cy0.a(AbstractC3659oy0.a(this.f27055c)));
    }
}
