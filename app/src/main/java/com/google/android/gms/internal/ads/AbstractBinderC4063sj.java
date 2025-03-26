package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.sj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4063sj extends AbstractBinderC3721pb implements InterfaceC4172tj {
    public AbstractBinderC4063sj() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String readString = parcel.readString();
            AbstractC3830qb.c(parcel);
            E(readString);
        } else {
            if (i8 != 2) {
                return false;
            }
            b();
        }
        parcel2.writeNoException();
        return true;
    }
}
