package D2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import java.util.List;

/* loaded from: classes.dex */
public abstract class T0 extends AbstractBinderC3721pb implements U0 {
    public T0() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static U0 t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof U0 ? (U0) queryLocalInterface : new S0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                String g8 = g();
                parcel2.writeNoException();
                parcel2.writeString(g8);
                return true;
            case 2:
                String f8 = f();
                parcel2.writeNoException();
                parcel2.writeString(f8);
                return true;
            case 3:
                List h8 = h();
                parcel2.writeNoException();
                parcel2.writeTypedList(h8);
                return true;
            case 4:
                g2 c8 = c();
                parcel2.writeNoException();
                AbstractC3830qb.e(parcel2, c8);
                return true;
            case 5:
                Bundle b8 = b();
                parcel2.writeNoException();
                AbstractC3830qb.e(parcel2, b8);
                return true;
            case 6:
                String e8 = e();
                parcel2.writeNoException();
                parcel2.writeString(e8);
                return true;
            default:
                return false;
        }
    }
}
