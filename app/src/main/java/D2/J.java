package D2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* loaded from: classes.dex */
public abstract class J extends AbstractBinderC3721pb implements K {
    public J() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            a();
        } else {
            if (i8 != 2) {
                return false;
            }
            W0 w02 = (W0) AbstractC3830qb.a(parcel, W0.CREATOR);
            AbstractC3830qb.c(parcel);
            h0(w02);
        }
        parcel2.writeNoException();
        return true;
    }
}
