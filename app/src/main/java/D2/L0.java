package D2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* loaded from: classes.dex */
public final class L0 extends AbstractC3612ob implements N0 {
    L0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // D2.N0
    public final void O2(e2 e2Var) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, e2Var);
        J0(1, w02);
    }

    @Override // D2.N0
    public final boolean c() {
        Parcel D02 = D0(2, w0());
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }
}
