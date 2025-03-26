package Z2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;
import o3.AbstractBinderC6287b;

/* loaded from: classes.dex */
public abstract class x0 extends AbstractBinderC6287b implements U {
    public x0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static U D0(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof U ? (U) queryLocalInterface : new w0(iBinder);
    }

    @Override // o3.AbstractBinderC6287b
    protected final boolean w0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            InterfaceC5852a d8 = d();
            parcel2.writeNoException();
            o3.c.d(parcel2, d8);
        } else {
            if (i8 != 2) {
                return false;
            }
            int a8 = a();
            parcel2.writeNoException();
            parcel2.writeInt(a8);
        }
        return true;
    }
}
