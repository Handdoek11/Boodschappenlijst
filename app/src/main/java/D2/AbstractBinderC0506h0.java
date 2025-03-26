package D2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* renamed from: D2.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0506h0 extends AbstractBinderC3721pb implements InterfaceC0509i0 {
    public AbstractBinderC0506h0() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static InterfaceC0509i0 t7(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof InterfaceC0509i0 ? (InterfaceC0509i0) queryLocalInterface : new C0503g0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        AbstractC3830qb.c(parcel);
        B0(readString, readString2);
        parcel2.writeNoException();
        return true;
    }
}
