package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.hq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2881hq extends AbstractC3612ob implements InterfaceC3097jq {
    C2881hq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3097jq
    public final void u2(InterfaceC5852a interfaceC5852a, C3533nq c3533nq, InterfaceC2772gq interfaceC2772gq) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.d(w02, c3533nq);
        AbstractC3830qb.f(w02, interfaceC2772gq);
        J0(1, w02);
    }
}
