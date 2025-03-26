package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.oo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3638oo extends AbstractBinderC3721pb implements InterfaceC3747po {
    public AbstractBinderC3638oo() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC3830qb.a(parcel, ParcelFileDescriptor.CREATOR);
            AbstractC3830qb.c(parcel);
            f4(parcelFileDescriptor);
        } else if (i8 == 2) {
            G2.C c8 = (G2.C) AbstractC3830qb.a(parcel, G2.C.CREATOR);
            AbstractC3830qb.c(parcel);
            T6(c8);
        } else {
            if (i8 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) AbstractC3830qb.a(parcel, ParcelFileDescriptor.CREATOR);
            C4618xo c4618xo = (C4618xo) AbstractC3830qb.a(parcel, C4618xo.CREATOR);
            AbstractC3830qb.c(parcel);
            y6(parcelFileDescriptor2, c4618xo);
        }
        parcel2.writeNoException();
        return true;
    }
}
