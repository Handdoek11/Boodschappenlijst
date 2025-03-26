package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.y10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4646y10 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f27974a;

    C4646y10(Bundle bundle) {
        this.f27974a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return AbstractC2326ck0.h(new C4755z10(this.f27974a));
    }
}
