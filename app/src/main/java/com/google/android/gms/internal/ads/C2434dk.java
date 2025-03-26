package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.dk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2434dk extends AbstractC3612ob implements InterfaceC2651fk {
    C2434dk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2651fk
    public final void D(int i8) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        J0(2, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2651fk
    public final void y(D2.W0 w02) {
        Parcel w03 = w0();
        AbstractC3830qb.d(w03, w02);
        J0(3, w03);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2651fk
    public final void z1(InterfaceC2014Zj interfaceC2014Zj) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC2014Zj);
        J0(1, w02);
    }
}
