package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ep, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2552ep extends AbstractC3612ob implements InterfaceC2770gp {
    C2552ep(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2770gp
    public final void G(int i8) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        J0(4, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2770gp
    public final void b() {
        J0(7, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2770gp
    public final void c() {
        J0(6, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2770gp
    public final void g() {
        J0(2, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2770gp
    public final void g2(InterfaceC2118ap interfaceC2118ap) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC2118ap);
        J0(3, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2770gp
    public final void h() {
        J0(1, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2770gp
    public final void y1(D2.W0 w02) {
        Parcel w03 = w0();
        AbstractC3830qb.d(w03, w02);
        J0(5, w03);
    }
}
