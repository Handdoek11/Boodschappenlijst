package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Cl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1206Cl extends AbstractBinderC3721pb implements InterfaceC1242Dl {
    public AbstractBinderC1206Cl() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static InterfaceC1242Dl t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof InterfaceC1242Dl ? (InterfaceC1242Dl) queryLocalInterface : new C1170Bl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String readString = parcel.readString();
            AbstractC3830qb.c(parcel);
            InterfaceC1350Gl v7 = v(readString);
            parcel2.writeNoException();
            AbstractC3830qb.f(parcel2, v7);
        } else if (i8 == 2) {
            String readString2 = parcel.readString();
            AbstractC3830qb.c(parcel);
            boolean n8 = n(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(n8 ? 1 : 0);
        } else if (i8 == 3) {
            String readString3 = parcel.readString();
            AbstractC3830qb.c(parcel);
            InterfaceC1171Bm C7 = C(readString3);
            parcel2.writeNoException();
            AbstractC3830qb.f(parcel2, C7);
        } else {
            if (i8 != 4) {
                return false;
            }
            String readString4 = parcel.readString();
            AbstractC3830qb.c(parcel);
            boolean Z7 = Z(readString4);
            parcel2.writeNoException();
            parcel2.writeInt(Z7 ? 1 : 0);
        }
        return true;
    }
}
