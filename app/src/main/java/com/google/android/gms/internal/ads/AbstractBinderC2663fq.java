package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.fq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2663fq extends AbstractBinderC3721pb implements InterfaceC2772gq {
    public AbstractBinderC2663fq() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            parcel.readString();
            parcel.readString();
            AbstractC3830qb.c(parcel);
        } else if (i8 == 2) {
            String readString = parcel.readString();
            AbstractC3830qb.c(parcel);
            v(readString);
        } else {
            if (i8 != 3) {
                return false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
            AbstractC3830qb.c(parcel);
            a2(readString2, readString3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
