package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ip, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2987ip extends AbstractC3612ob implements InterfaceC3204kp {
    C2987ip(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3204kp
    public final void D(int i8) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        J0(2, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3204kp
    public final void g() {
        J0(1, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3204kp
    public final void y(D2.W0 w02) {
        Parcel w03 = w0();
        AbstractC3830qb.d(w03, w02);
        J0(3, w03);
    }
}
