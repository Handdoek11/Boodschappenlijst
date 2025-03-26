package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.bp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2227bp extends AbstractC3612ob implements InterfaceC2443dp {
    C2227bp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void G3(InterfaceC2770gp interfaceC2770gp) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC2770gp);
        J0(2, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final D2.U0 a() {
        Parcel D02 = D0(12, w0());
        D2.U0 t7 = D2.T0.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void k3(D2.X1 x12, InterfaceC3204kp interfaceC3204kp) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, x12);
        AbstractC3830qb.f(w02, interfaceC3204kp);
        J0(14, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void n2(D2.X1 x12, InterfaceC3204kp interfaceC3204kp) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, x12);
        AbstractC3830qb.f(w02, interfaceC3204kp);
        J0(1, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2443dp
    public final void t5(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(5, w02);
    }
}
