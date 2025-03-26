package D2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1206Cl;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import com.google.android.gms.internal.ads.InterfaceC2443dp;
import com.google.android.gms.internal.ads.InterfaceC4049sc;
import java.util.ArrayList;

/* renamed from: D2.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0494d0 extends AbstractBinderC3721pb implements InterfaceC0497e0 {
    public AbstractBinderC0494d0() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC0491c0 c0488b0;
        switch (i8) {
            case 1:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(I1.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c0488b0 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    c0488b0 = queryLocalInterface instanceof InterfaceC0491c0 ? (InterfaceC0491c0) queryLocalInterface : new C0488b0(readStrongBinder);
                }
                AbstractC3830qb.c(parcel);
                e6(createTypedArrayList, c0488b0);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                AbstractC3830qb.c(parcel);
                boolean W7 = W(readString);
                parcel2.writeNoException();
                parcel2.writeInt(W7 ? 1 : 0);
                return true;
            case 3:
                String readString2 = parcel.readString();
                AbstractC3830qb.c(parcel);
                InterfaceC2443dp Q7 = Q(readString2);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, Q7);
                return true;
            case 4:
                String readString3 = parcel.readString();
                AbstractC3830qb.c(parcel);
                boolean E02 = E0(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(E02 ? 1 : 0);
                return true;
            case 5:
                String readString4 = parcel.readString();
                AbstractC3830qb.c(parcel);
                InterfaceC4049sc n8 = n(readString4);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, n8);
                return true;
            case 6:
                String readString5 = parcel.readString();
                AbstractC3830qb.c(parcel);
                boolean j22 = j2(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(j22 ? 1 : 0);
                return true;
            case 7:
                String readString6 = parcel.readString();
                AbstractC3830qb.c(parcel);
                V E7 = E(readString6);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, E7);
                return true;
            case 8:
                InterfaceC1242Dl t7 = AbstractBinderC1206Cl.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                i7(t7);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
