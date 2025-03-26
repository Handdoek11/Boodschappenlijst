package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.no, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3529no extends AbstractC3612ob implements InterfaceC3747po {
    C3529no(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3747po
    public final void T6(G2.C c8) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, c8);
        J0(2, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3747po
    public final void f4(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, parcelFileDescriptor);
        J0(1, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3747po
    public final void y6(ParcelFileDescriptor parcelFileDescriptor, C4618xo c4618xo) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, parcelFileDescriptor);
        AbstractC3830qb.d(w02, c4618xo);
        J0(3, w02);
    }
}
