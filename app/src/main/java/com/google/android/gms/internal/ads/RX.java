package com.google.android.gms.internal.ads;

import android.content.Context;
import o0.AbstractC6278a;

/* loaded from: classes.dex */
public final class RX implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18661a;

    RX(Context context) {
        this.f18661a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return AbstractC2326ck0.h(new SX(AbstractC6278a.a(this.f18661a, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
