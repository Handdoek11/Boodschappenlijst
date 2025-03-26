package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class E40 implements InterfaceC2477e50 {

    /* renamed from: a, reason: collision with root package name */
    private OB f14635a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f14636b = AbstractC4284uk0.c();

    @Override // com.google.android.gms.internal.ads.InterfaceC2477e50
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.d a(C2586f50 c2586f50, InterfaceC2369d50 interfaceC2369d50, Object obj) {
        return c(c2586f50, interfaceC2369d50, null);
    }

    public final OB b() {
        return this.f14635a;
    }

    public final com.google.common.util.concurrent.d c(C2586f50 c2586f50, InterfaceC2369d50 interfaceC2369d50, OB ob) {
        NB a8 = interfaceC2369d50.a(c2586f50.f21931b);
        a8.l(new C2913i50(true));
        OB ob2 = (OB) a8.e();
        this.f14635a = ob2;
        final C3792qA zzb = ob2.zzb();
        final I70 i70 = new I70();
        return (Sj0) AbstractC2326ck0.m((Sj0) AbstractC2326ck0.n(Sj0.D(zzb.i()), new InterfaceC1420Ij0(this) { // from class: com.google.android.gms.internal.ads.C40
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                C60 c60 = (C60) obj;
                i70.f15871b = c60;
                Iterator it = c60.f14101b.f13519a.iterator();
                boolean z7 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((C3785q60) it.next()).f25778a.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z7 = true;
                        }
                    } else if (z7) {
                        return zzb.h(AbstractC2326ck0.h(c60));
                    }
                }
                return AbstractC2326ck0.h(null);
            }
        }, this.f14636b), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.D40
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                I70 i702 = i70;
                i702.f15872c = (AbstractC1506Kz) obj;
                return i702;
            }
        }, this.f14636b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2477e50
    public final /* synthetic */ Object d() {
        return this.f14635a;
    }
}
