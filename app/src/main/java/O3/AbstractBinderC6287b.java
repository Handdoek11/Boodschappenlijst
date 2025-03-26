package o3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC6287b extends Binder implements IInterface {
    protected AbstractBinderC6287b(String str) {
        attachInterface(this, str);
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

    protected boolean w0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
