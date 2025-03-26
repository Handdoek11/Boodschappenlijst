package com.google.android.gms.internal.ads;

import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.ud0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4270ud0 extends AbstractBinderC3721pb implements InterfaceC4379vd0 {
    public AbstractBinderC4270ud0() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 2:
                InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                parcel.readString();
                AbstractC3830qb.c(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                AbstractC3830qb.c(parcel);
                break;
            case 5:
                parcel.createByteArray();
                AbstractC3830qb.c(parcel);
                break;
            case 6:
                parcel.readInt();
                AbstractC3830qb.c(parcel);
                break;
            case 7:
                parcel.readInt();
                AbstractC3830qb.c(parcel);
                break;
            case 8:
                InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                AbstractC3830qb.c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
