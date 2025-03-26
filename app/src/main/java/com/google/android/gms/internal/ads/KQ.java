package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class KQ extends AbstractBinderC3638oo {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ MQ f16586o;

    protected KQ(MQ mq) {
        this.f16586o = mq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3747po
    public final void T6(G2.C c8) {
        this.f16586o.f17347a.d(c8.A0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3747po
    public final void f4(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        MQ mq = this.f16586o;
        mq.f17347a.c(new C2296cR(autoCloseInputStream, mq.f17351e));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3747po
    public final void y6(ParcelFileDescriptor parcelFileDescriptor, C4618xo c4618xo) {
        this.f16586o.f17347a.c(new C2296cR(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c4618xo));
    }
}
