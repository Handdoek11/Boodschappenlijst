package com.google.android.gms.internal.ads;

import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.gh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2754gh extends AbstractBinderC3721pb implements InterfaceC2863hh {
    public AbstractBinderC2754gh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
            AbstractC3830qb.c(parcel);
            t3(D02);
        } else if (i8 == 2) {
            d();
        } else {
            if (i8 != 3) {
                return false;
            }
            InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
            AbstractC3830qb.c(parcel);
            N0(D03);
        }
        parcel2.writeNoException();
        return true;
    }
}
