package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1545Mc extends AbstractC3612ob implements IInterface {
    C1545Mc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final C1369Hc I3(C1476Kc c1476Kc) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, c1476Kc);
        Parcel D02 = D0(2, w02);
        C1369Hc c1369Hc = (C1369Hc) AbstractC3830qb.a(D02, C1369Hc.CREATOR);
        D02.recycle();
        return c1369Hc;
    }

    public final long q2(C1476Kc c1476Kc) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, c1476Kc);
        Parcel D02 = D0(3, w02);
        long readLong = D02.readLong();
        D02.recycle();
        return readLong;
    }

    public final C1369Hc r3(C1476Kc c1476Kc) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, c1476Kc);
        Parcel D02 = D0(1, w02);
        C1369Hc c1369Hc = (C1369Hc) AbstractC3830qb.a(D02, C1369Hc.CREATOR);
        D02.recycle();
        return c1369Hc;
    }
}
