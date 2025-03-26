package D2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;

/* loaded from: classes.dex */
public abstract class C0 extends AbstractBinderC3721pb implements D0 {
    public C0() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static D0 t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof D0 ? (D0) queryLocalInterface : new B0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String b8 = b();
            parcel2.writeNoException();
            parcel2.writeString(b8);
        } else {
            if (i8 != 2) {
                return false;
            }
            String c8 = c();
            parcel2.writeNoException();
            parcel2.writeString(c8);
        }
        return true;
    }
}
