package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;

/* renamed from: com.google.android.gms.internal.ads.gl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2762gl implements InterfaceC1881Vq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1811Tq f22436a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1491Kk f22437b;

    C2762gl(C2979il c2979il, C1811Tq c1811Tq, C1491Kk c1491Kk) {
        this.f22436a = c1811Tq;
        this.f22437b = c1491Kk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1881Vq
    public final void zza() {
        AbstractC0608p0.k("callJs > getEngine: Promise rejected");
        this.f22436a.d(new zzbnv("Unable to obtain a JavascriptEngine."));
        this.f22437b.h();
    }
}
