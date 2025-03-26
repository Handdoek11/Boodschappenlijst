package D2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* loaded from: classes.dex */
public final class I extends AbstractC3612ob implements K {
    I(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // D2.K
    public final void a() {
        J0(1, w0());
    }

    @Override // D2.K
    public final void h0(W0 w02) {
        Parcel w03 = w0();
        AbstractC3830qb.d(w03, w02);
        J0(2, w03);
    }
}
