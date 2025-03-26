package D2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* loaded from: classes.dex */
public abstract class G extends AbstractBinderC3721pb implements H {
    public G() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                d();
                break;
            case 2:
                int readInt = parcel.readInt();
                AbstractC3830qb.c(parcel);
                D(readInt);
                break;
            case 3:
                break;
            case 4:
                f();
                break;
            case 5:
                h();
                break;
            case 6:
                a();
                break;
            case 7:
                g();
                break;
            case 8:
                W0 w02 = (W0) AbstractC3830qb.a(parcel, W0.CREATOR);
                AbstractC3830qb.c(parcel);
                y(w02);
                break;
            case 9:
                i();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
