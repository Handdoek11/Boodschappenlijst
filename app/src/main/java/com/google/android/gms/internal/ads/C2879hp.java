package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.hp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2879hp extends AbstractC3612ob implements IInterface {
    C2879hp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder q2(InterfaceC5852a interfaceC5852a, String str, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        w02.writeString(str);
        AbstractC3830qb.f(w02, interfaceC1242Dl);
        w02.writeInt(244410000);
        Parcel D02 = D0(1, w02);
        IBinder readStrongBinder = D02.readStrongBinder();
        D02.recycle();
        return readStrongBinder;
    }
}
