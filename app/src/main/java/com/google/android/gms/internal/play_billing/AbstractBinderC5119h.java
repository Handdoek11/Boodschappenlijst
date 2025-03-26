package com.google.android.gms.internal.play_billing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.play_billing.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5119h extends Binder implements IInterface {
    protected AbstractBinderC5119h(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i8, parcel, parcel2, i9)) {
            return true;
        }
        return w0(i8, parcel, parcel2, i9);
    }

    protected abstract boolean w0(int i8, Parcel parcel, Parcel parcel2, int i9);
}
