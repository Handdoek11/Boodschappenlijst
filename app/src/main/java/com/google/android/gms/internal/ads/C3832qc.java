package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.qc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3832qc extends AbstractC3612ob implements InterfaceC4049sc {
    C3832qc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4049sc
    public final D2.U0 c() {
        Parcel D02 = D0(5, w0());
        D2.U0 t7 = D2.T0.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4049sc
    public final void q5(InterfaceC5852a interfaceC5852a, InterfaceC4812zc interfaceC4812zc) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.f(w02, interfaceC4812zc);
        J0(4, w02);
    }
}
