package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3609oZ implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final K40 f25207a;

    C3609oZ(K40 k40) {
        this.f25207a = k40;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        K40 k40 = this.f25207a;
        if (k40 == null) {
            return AbstractC2326ck0.h(new C3500nZ(null));
        }
        String a8 = k40.a();
        return f3.q.a(a8) ? AbstractC2326ck0.h(new C3500nZ(null)) : AbstractC2326ck0.h(new C3500nZ(a8));
    }
}
