package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;

/* loaded from: classes.dex */
final class V40 implements InterfaceC1376Hf0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2043a50 f19524a;

    V40(C2043a50 c2043a50) {
        this.f19524a = c2043a50;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        H2.p.e("", (zzdyh) obj);
        AbstractC0608p0.k("Failed to get a cache key, reverting to legacy flow.");
        C2043a50 c2043a50 = this.f19524a;
        c2043a50.f20631d = new X40(null, c2043a50.e(), null);
        return this.f19524a.f20631d;
    }
}
