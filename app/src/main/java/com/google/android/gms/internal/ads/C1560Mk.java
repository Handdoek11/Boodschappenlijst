package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;

/* renamed from: com.google.android.gms.internal.ads.Mk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1560Mk implements InterfaceC1881Vq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1491Kk f17399a;

    C1560Mk(C1665Pk c1665Pk, C1491Kk c1491Kk) {
        this.f17399a = c1491Kk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1881Vq
    public final void zza() {
        AbstractC0608p0.k("Rejecting reference for JS Engine.");
        if (((Boolean) D2.A.c().a(AbstractC3184kf.B7)).booleanValue()) {
            this.f17399a.d(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.f17399a.c();
        }
    }
}
