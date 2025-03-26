package D2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* renamed from: D2.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0486a1 extends AbstractBinderC3721pb implements InterfaceC0489b1 {
    public AbstractBinderC0486a1() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            f();
        } else if (i8 == 2) {
            e();
        } else if (i8 == 3) {
            g();
        } else if (i8 == 4) {
            b();
        } else {
            if (i8 != 5) {
                return false;
            }
            boolean g8 = AbstractC3830qb.g(parcel);
            AbstractC3830qb.c(parcel);
            C0(g8);
        }
        parcel2.writeNoException();
        return true;
    }
}
