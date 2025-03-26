package com.google.android.gms.internal.ads;

import A3.AbstractC0379m;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class W20 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final C1175Bq f19698a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f19699b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f19700c;

    W20(String str, C1153Bc c1153Bc, C1175Bq c1175Bq, ScheduledExecutorService scheduledExecutorService, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        this.f19698a = c1175Bq;
        this.f19699b = scheduledExecutorService;
        this.f19700c = interfaceExecutorServiceC3522nk0;
    }

    final /* synthetic */ X20 a(Exception exc) {
        this.f19698a.x(exc, "AppSetIdInfoGmscoreSignal");
        return new X20(null, -1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23817X2)).booleanValue()) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23860c3)).booleanValue()) {
                com.google.common.util.concurrent.d n8 = AbstractC2326ck0.n(AbstractC3401me0.a(AbstractC0379m.e(null), null), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.T20
                    @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                    public final com.google.common.util.concurrent.d a(Object obj) {
                        S2.c cVar = (S2.c) obj;
                        return cVar == null ? AbstractC2326ck0.h(new X20(null, -1)) : AbstractC2326ck0.h(new X20(cVar.a(), cVar.b()));
                    }
                }, this.f19700c);
                if (((Boolean) AbstractC1936Xf.f20107a.e()).booleanValue()) {
                    n8 = AbstractC2326ck0.o(n8, ((Long) AbstractC1936Xf.f20108b.e()).longValue(), TimeUnit.MILLISECONDS, this.f19699b);
                }
                return AbstractC2326ck0.e(n8, Exception.class, new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.V20
                    @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
                    public final Object apply(Object obj) {
                        return this.f19517a.a((Exception) obj);
                    }
                }, this.f19700c);
            }
        }
        return AbstractC2326ck0.h(new X20(null, -1));
    }
}
