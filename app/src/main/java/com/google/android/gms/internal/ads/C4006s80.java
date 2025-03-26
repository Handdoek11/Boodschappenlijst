package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.s80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4006s80 implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f26577a;

    public C4006s80(InterfaceC4203ty0 interfaceC4203ty0) {
        this.f26577a = interfaceC4203ty0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        ThreadFactory threadFactory = (ThreadFactory) this.f26577a.zzb();
        AbstractC1933Xd0.a();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
        AbstractC3332ly0.b(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
