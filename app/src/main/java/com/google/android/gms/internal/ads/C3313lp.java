package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.lp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3313lp extends AbstractC3612ob implements IInterface {
    C3313lp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void q2(InterfaceC2118ap interfaceC2118ap, String str, String str2) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC2118ap);
        w02.writeString(str);
        w02.writeString(str2);
        J0(2, w02);
    }
}
