package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Yo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1984Yo extends AbstractC3612ob implements InterfaceC2118ap {
    C1984Yo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2118ap
    public final int b() {
        Parcel D02 = D0(2, w0());
        int readInt = D02.readInt();
        D02.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2118ap
    public final String c() {
        Parcel D02 = D0(1, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }
}
