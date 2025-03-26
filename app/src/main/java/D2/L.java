package D2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* loaded from: classes.dex */
public final class L extends AbstractC3612ob implements N {
    L(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // D2.N
    public final void K6(X1 x12) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, x12);
        J0(1, w02);
    }
}
