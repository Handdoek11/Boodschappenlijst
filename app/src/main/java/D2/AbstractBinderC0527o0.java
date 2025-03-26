package D2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* renamed from: D2.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0527o0 extends AbstractBinderC3721pb implements InterfaceC0530p0 {
    public AbstractBinderC0527o0() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            W0 w02 = (W0) AbstractC3830qb.a(parcel, W0.CREATOR);
            AbstractC3830qb.c(parcel);
            m0(w02);
        } else if (i8 == 2) {
            c();
        } else if (i8 == 3) {
            a();
        } else if (i8 == 4) {
            b();
        } else {
            if (i8 != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
