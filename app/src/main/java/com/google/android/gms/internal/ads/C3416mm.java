package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.mm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3416mm extends AbstractC3612ob implements InterfaceC3634om {
    C3416mm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3634om
    public final void y(D2.W0 w02) {
        Parcel w03 = w0();
        AbstractC3830qb.d(w03, w02);
        J0(3, w03);
    }
}
