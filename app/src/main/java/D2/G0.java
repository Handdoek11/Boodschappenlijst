package D2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* loaded from: classes.dex */
public abstract class G0 extends AbstractBinderC3721pb implements H0 {
    public G0() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        W0 w02 = (W0) AbstractC3830qb.a(parcel, W0.CREATOR);
        AbstractC3830qb.c(parcel);
        A5(w02);
        parcel2.writeNoException();
        return true;
    }
}
