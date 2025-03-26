package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.qo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3856qo extends AbstractC3612ob implements IInterface {
    C3856qo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void T6(G2.C c8) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, c8);
        J0(2, w02);
    }

    public final void q2(String str, C2768go c2768go) {
        Parcel w02 = w0();
        w02.writeString(str);
        AbstractC3830qb.d(w02, c2768go);
        J0(1, w02);
    }
}
