package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4870b0 extends Binder implements IInterface {
    protected AbstractBinderC4870b0(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
        boolean z7;
        if (i8 > 16777215) {
            z7 = super.onTransact(i8, parcel, parcel2, i9);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z7 = false;
        }
        if (z7) {
            return true;
        }
        return w0(i8, parcel, parcel2, i9);
    }

    protected abstract boolean w0(int i8, Parcel parcel, Parcel parcel2, int i9);
}
