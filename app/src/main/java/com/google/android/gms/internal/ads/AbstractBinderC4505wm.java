package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.wm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4505wm extends AbstractBinderC3721pb implements InterfaceC4723ym {
    public AbstractBinderC4505wm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 2) {
            g();
        } else if (i8 == 3) {
            String readString = parcel.readString();
            AbstractC3830qb.c(parcel);
            n(readString);
        } else {
            if (i8 != 4) {
                return false;
            }
            D2.W0 w02 = (D2.W0) AbstractC3830qb.a(parcel, D2.W0.CREATOR);
            AbstractC3830qb.c(parcel);
            y(w02);
        }
        parcel2.writeNoException();
        return true;
    }
}
