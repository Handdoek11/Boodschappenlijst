package D2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* loaded from: classes.dex */
public abstract class M extends AbstractBinderC3721pb implements N {
    public M() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            X1 x12 = (X1) AbstractC3830qb.a(parcel, X1.CREATOR);
            AbstractC3830qb.c(parcel);
            K6(x12);
            parcel2.writeNoException();
        } else if (i8 == 2) {
            String b8 = b();
            parcel2.writeNoException();
            parcel2.writeString(b8);
        } else if (i8 == 3) {
            boolean f8 = f();
            parcel2.writeNoException();
            int i10 = AbstractC3830qb.f25953b;
            parcel2.writeInt(f8 ? 1 : 0);
        } else if (i8 == 4) {
            String c8 = c();
            parcel2.writeNoException();
            parcel2.writeString(c8);
        } else {
            if (i8 != 5) {
                return false;
            }
            X1 x13 = (X1) AbstractC3830qb.a(parcel, X1.CREATOR);
            int readInt = parcel.readInt();
            AbstractC3830qb.c(parcel);
            m7(x13, readInt);
            parcel2.writeNoException();
        }
        return true;
    }
}
