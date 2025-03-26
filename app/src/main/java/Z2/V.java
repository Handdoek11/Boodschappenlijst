package Z2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import o3.AbstractBinderC6287b;

/* loaded from: classes.dex */
public abstract class V extends AbstractBinderC6287b implements InterfaceC0773l {
    public V() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // o3.AbstractBinderC6287b
    protected final boolean w0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) o3.c.a(parcel, Bundle.CREATOR);
            o3.c.b(parcel);
            d4(readInt, readStrongBinder, bundle);
        } else if (i8 == 2) {
            int readInt2 = parcel.readInt();
            Bundle bundle2 = (Bundle) o3.c.a(parcel, Bundle.CREATOR);
            o3.c.b(parcel);
            D2(readInt2, bundle2);
        } else {
            if (i8 != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            j0 j0Var = (j0) o3.c.a(parcel, j0.CREATOR);
            o3.c.b(parcel);
            P1(readInt3, readStrongBinder2, j0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
