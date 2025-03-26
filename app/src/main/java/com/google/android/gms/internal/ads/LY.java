package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class LY implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f16844a;

    /* renamed from: b, reason: collision with root package name */
    private final C1175Bq f16845b;

    LY(Executor executor, C1175Bq c1175Bq) {
        this.f16844a = executor;
        this.f16845b = c1175Bq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return ((Boolean) D2.A.c().a(AbstractC3184kf.f23809W2)).booleanValue() ? AbstractC2326ck0.h(new MY(null)) : AbstractC2326ck0.m(this.f16845b.l(), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.KY
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                if (true == arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new MY(arrayList);
            }
        }, this.f16844a);
    }
}
