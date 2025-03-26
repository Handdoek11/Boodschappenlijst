package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.jp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3095jp extends AbstractBinderC3721pb implements InterfaceC3204kp {
    public AbstractBinderC3095jp() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            g();
        } else if (i8 == 2) {
            int readInt = parcel.readInt();
            AbstractC3830qb.c(parcel);
            D(readInt);
        } else {
            if (i8 != 3) {
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
