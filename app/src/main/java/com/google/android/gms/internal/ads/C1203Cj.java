package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Cj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1203Cj extends AbstractC3612ob implements IInterface {
    C1203Cj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void q2(C4499wj c4499wj, InterfaceC1167Bj interfaceC1167Bj) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, c4499wj);
        AbstractC3830qb.f(w02, interfaceC1167Bj);
        p2(2, w02);
    }
}
