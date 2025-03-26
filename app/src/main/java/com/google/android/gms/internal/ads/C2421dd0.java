package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.dd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2421dd0 extends AbstractC3612ob implements IInterface {
    C2421dd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final void I3(C1896Wc0 c1896Wc0) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, c1896Wc0);
        J0(2, w02);
    }

    public final C2204bd0 q2(C2001Zc0 c2001Zc0) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, c2001Zc0);
        Parcel D02 = D0(1, w02);
        C2204bd0 c2204bd0 = (C2204bd0) AbstractC3830qb.a(D02, C2204bd0.CREATOR);
        D02.recycle();
        return c2204bd0;
    }

    public final C3181kd0 r3(C2965id0 c2965id0) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, c2965id0);
        Parcel D02 = D0(3, w02);
        C3181kd0 c3181kd0 = (C3181kd0) AbstractC3830qb.a(D02, C3181kd0.CREATOR);
        D02.recycle();
        return c3181kd0;
    }
}
