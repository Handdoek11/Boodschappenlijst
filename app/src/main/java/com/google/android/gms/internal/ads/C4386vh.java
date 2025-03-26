package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.vh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4386vh extends AbstractC3612ob implements InterfaceC4604xh {
    C4386vh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4604xh
    public final void H6(InterfaceC3515nh interfaceC3515nh) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC3515nh);
        J0(1, w02);
    }
}
