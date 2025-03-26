package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Df, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1231Df extends AbstractC3612ob implements InterfaceC1303Ff {
    C1231Df(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1303Ff
    public final void e1(InterfaceC1195Cf interfaceC1195Cf) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC1195Cf);
        J0(1, w02);
    }
}
