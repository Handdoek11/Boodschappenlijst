package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1341Gg extends AbstractC3612ob implements IInterface {
    C1341Gg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void q2(InterfaceC2018Zn interfaceC2018Zn) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC2018Zn);
        J0(1, w02);
    }
}
