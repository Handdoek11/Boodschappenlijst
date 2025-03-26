package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class LQ extends AbstractBinderC3638oo {

    /* renamed from: o, reason: collision with root package name */
    private final C1811Tq f16831o;

    /* renamed from: s, reason: collision with root package name */
    private final C4618xo f16832s;

    LQ(C1811Tq c1811Tq, C4618xo c4618xo) {
        this.f16831o = c1811Tq;
        this.f16832s = c4618xo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3747po
    public final void T6(G2.C c8) {
        this.f16831o.d(c8.A0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3747po
    public final void f4(ParcelFileDescriptor parcelFileDescriptor) {
        this.f16831o.c(new C2296cR(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f16832s));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3747po
    public final void y6(ParcelFileDescriptor parcelFileDescriptor, C4618xo c4618xo) {
        this.f16831o.c(new C2296cR(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c4618xo));
    }
}
