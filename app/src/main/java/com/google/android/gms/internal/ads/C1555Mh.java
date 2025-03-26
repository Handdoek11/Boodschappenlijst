package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.Mh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1555Mh extends AbstractC3612ob implements InterfaceC1625Oh {
    C1555Mh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1625Oh
    public final boolean zze(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        Parcel D02 = D0(2, w02);
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }
}
