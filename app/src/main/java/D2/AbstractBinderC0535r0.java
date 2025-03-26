package D2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;

/* renamed from: D2.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0535r0 extends AbstractBinderC3721pb implements InterfaceC0538s0 {
    public AbstractBinderC0535r0() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static InterfaceC0538s0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof InterfaceC0538s0 ? (InterfaceC0538s0) queryLocalInterface : new C0533q0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            C0542t1 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            AbstractC3830qb.e(parcel2, liteSdkVersion);
        } else {
            if (i8 != 2) {
                return false;
            }
            InterfaceC1242Dl adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            AbstractC3830qb.f(parcel2, adapterCreator);
        }
        return true;
    }
}
