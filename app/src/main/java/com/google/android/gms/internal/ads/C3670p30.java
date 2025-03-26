package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.p30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3670p30 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    final ScheduledExecutorService f25328a;

    public C3670p30(C4725yn c4725yn, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f25328a = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return AbstractC2326ck0.m(AbstractC2326ck0.o(AbstractC2326ck0.h(new Bundle()), ((Long) D2.A.c().a(AbstractC3184kf.f23933k4)).longValue(), TimeUnit.MILLISECONDS, this.f25328a), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.o30
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                return new C3779q30((Bundle) obj);
            }
        }, AbstractC1497Kq.f16644a);
    }
}
