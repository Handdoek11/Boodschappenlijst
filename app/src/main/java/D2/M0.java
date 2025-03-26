package D2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* loaded from: classes.dex */
public abstract class M0 extends AbstractBinderC3721pb implements N0 {
    public M0() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static N0 t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof N0 ? (N0) queryLocalInterface : new L0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            e2 e2Var = (e2) AbstractC3830qb.a(parcel, e2.CREATOR);
            AbstractC3830qb.c(parcel);
            O2(e2Var);
            parcel2.writeNoException();
        } else {
            if (i8 != 2) {
                return false;
            }
            boolean c8 = c();
            parcel2.writeNoException();
            int i10 = AbstractC3830qb.f25953b;
            parcel2.writeInt(c8 ? 1 : 0);
        }
        return true;
    }
}
