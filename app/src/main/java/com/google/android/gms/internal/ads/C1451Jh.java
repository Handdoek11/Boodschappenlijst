package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Jh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1451Jh extends AbstractC3612ob implements InterfaceC1521Lh {
    C1451Jh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1521Lh
    public final void i4(InterfaceC1800Th interfaceC1800Th) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC1800Th);
        J0(1, w02);
    }
}
