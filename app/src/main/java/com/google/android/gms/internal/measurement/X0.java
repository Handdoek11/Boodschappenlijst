package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class X0 extends AbstractBinderC4870b0 implements U0 {
    public X0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC4870b0
    protected final boolean w0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC4861a0.a(parcel, Bundle.CREATOR);
            long readLong = parcel.readLong();
            AbstractC4861a0.f(parcel);
            J4(readString, readString2, bundle, readLong);
            parcel2.writeNoException();
        } else {
            if (i8 != 2) {
                return false;
            }
            int zza = zza();
            parcel2.writeNoException();
            parcel2.writeInt(zza);
        }
        return true;
    }
}
