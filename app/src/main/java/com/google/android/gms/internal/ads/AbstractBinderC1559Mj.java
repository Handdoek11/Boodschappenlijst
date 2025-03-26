package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Mj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1559Mj extends AbstractBinderC3721pb implements InterfaceC1594Nj {
    public AbstractBinderC1559Mj() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static InterfaceC1594Nj t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof InterfaceC1594Nj ? (InterfaceC1594Nj) queryLocalInterface : new C1525Lj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 2) {
            c();
        } else {
            if (i8 != 3) {
                return false;
            }
            String readString = parcel.readString();
            AbstractC3830qb.c(parcel);
            n(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
