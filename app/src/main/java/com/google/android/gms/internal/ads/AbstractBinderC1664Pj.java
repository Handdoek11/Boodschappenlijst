package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Pj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1664Pj extends AbstractBinderC3721pb implements InterfaceC1699Qj {
    public AbstractBinderC1664Pj() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static InterfaceC1699Qj t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof InterfaceC1699Qj ? (InterfaceC1699Qj) queryLocalInterface : new C1629Oj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(C1455Jj.CREATOR);
        AbstractC3830qb.c(parcel);
        u5(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
