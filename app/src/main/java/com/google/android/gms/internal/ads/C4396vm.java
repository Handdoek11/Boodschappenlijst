package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.vm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4396vm extends AbstractC3612ob implements InterfaceC4723ym {
    C4396vm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4723ym
    public final void y(D2.W0 w02) {
        Parcel w03 = w0();
        AbstractC3830qb.d(w03, w02);
        J0(4, w03);
    }
}
