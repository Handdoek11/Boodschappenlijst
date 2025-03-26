package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ko, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1495Ko extends AbstractC3612ob implements IInterface {
    C1495Ko(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void q2(InterfaceC1460Jo interfaceC1460Jo, String str, String str2) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC1460Jo);
        w02.writeString(str);
        w02.writeString(str2);
        J0(2, w02);
    }
}
