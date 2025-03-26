package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.dh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2428dh extends AbstractC3612ob implements InterfaceC2645fh {
    C2428dh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2645fh
    public final IBinder D3(InterfaceC5852a interfaceC5852a, InterfaceC5852a interfaceC5852a2, InterfaceC5852a interfaceC5852a3, int i8) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.f(w02, interfaceC5852a2);
        AbstractC3830qb.f(w02, interfaceC5852a3);
        w02.writeInt(244410000);
        Parcel D02 = D0(1, w02);
        IBinder readStrongBinder = D02.readStrongBinder();
        D02.recycle();
        return readStrongBinder;
    }
}
