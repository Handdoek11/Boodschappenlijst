package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.pb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3721pb extends Binder implements IInterface {
    protected AbstractBinderC3721pb(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i8, parcel, parcel2, i9)) {
            return true;
        }
        return s7(i8, parcel, parcel2, i9);
    }

    protected abstract boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9);
}
