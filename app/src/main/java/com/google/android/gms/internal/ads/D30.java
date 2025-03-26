package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class D30 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final C1175Bq f14388a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14389b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14390c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f14391d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f14392e;

    D30(C1175Bq c1175Bq, boolean z7, boolean z8, C3860qq c3860qq, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f14388a = c1175Bq;
        this.f14389b = z7;
        this.f14390c = z8;
        this.f14392e = interfaceExecutorServiceC3522nk0;
        this.f14391d = scheduledExecutorService;
    }

    final /* synthetic */ E30 a(Exception exc) {
        this.f14388a.x(exc, "TrustlessTokenSignal");
        return new E30(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23765Q6)).booleanValue() && this.f14390c) {
            return AbstractC2326ck0.h(new E30(null));
        }
        if (!this.f14389b) {
            return AbstractC2326ck0.h(new E30(null));
        }
        return AbstractC2326ck0.e(AbstractC2326ck0.o(AbstractC2326ck0.m(AbstractC2326ck0.h(null), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.B30
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                return new E30((String) obj);
            }
        }, this.f14392e), ((Long) AbstractC4820zg.f28690b.e()).longValue(), TimeUnit.MILLISECONDS, this.f14391d), Exception.class, new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.C30
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                return this.f14079a.a((Exception) obj);
            }
        }, this.f14392e);
    }
}
