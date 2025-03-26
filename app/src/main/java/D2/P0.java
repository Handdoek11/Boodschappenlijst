package D2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import i3.InterfaceC5852a;

/* loaded from: classes.dex */
public abstract class P0 extends AbstractBinderC3721pb implements Q0 {
    public P0() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        String readString = parcel.readString();
        InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
        AbstractC3830qb.c(parcel);
        h7(readString, D02, D03);
        parcel2.writeNoException();
        return true;
    }
}
