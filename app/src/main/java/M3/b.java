package m3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class b extends Binder implements IInterface {
    protected b(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i8, parcel, parcel2, i9)) {
            return true;
        }
        return p2(i8, parcel, parcel2, i9);
    }

    protected abstract boolean p2(int i8, Parcel parcel, Parcel parcel2, int i9);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
