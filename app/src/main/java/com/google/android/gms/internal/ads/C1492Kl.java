package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.Kl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1492Kl extends AbstractC3612ob implements InterfaceC1561Ml {
    C1492Kl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1561Ml
    public final InterfaceC5852a b() {
        Parcel D02 = D0(1, w0());
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(D02.readStrongBinder());
        D02.recycle();
        return D03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1561Ml
    public final boolean c() {
        Parcel D02 = D0(2, w0());
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }
}
