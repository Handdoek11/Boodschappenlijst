package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4158tc extends AbstractC3612ob implements InterfaceC4376vc {
    C4158tc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4376vc
    public final void A(int i8) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        J0(2, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4376vc
    public final void L3(D2.W0 w02) {
        Parcel w03 = w0();
        AbstractC3830qb.d(w03, w02);
        J0(3, w03);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4376vc
    public final void P0(InterfaceC4049sc interfaceC4049sc) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC4049sc);
        J0(1, w02);
    }
}
