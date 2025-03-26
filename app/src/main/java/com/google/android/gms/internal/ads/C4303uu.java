package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.uu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4303uu extends AbstractC3612ob implements InterfaceC4521wu {
    C4303uu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4521wu
    public final void P4(InterfaceC5852a interfaceC5852a, InterfaceC4194tu interfaceC4194tu) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.f(w02, interfaceC4194tu);
        J0(2, w02);
    }
}
