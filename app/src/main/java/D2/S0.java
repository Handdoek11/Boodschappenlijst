package D2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class S0 extends AbstractC3612ob implements U0 {
    S0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // D2.U0
    public final Bundle b() {
        Parcel D02 = D0(5, w0());
        Bundle bundle = (Bundle) AbstractC3830qb.a(D02, Bundle.CREATOR);
        D02.recycle();
        return bundle;
    }

    @Override // D2.U0
    public final g2 c() {
        Parcel D02 = D0(4, w0());
        g2 g2Var = (g2) AbstractC3830qb.a(D02, g2.CREATOR);
        D02.recycle();
        return g2Var;
    }

    @Override // D2.U0
    public final String e() {
        Parcel D02 = D0(6, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // D2.U0
    public final String f() {
        Parcel D02 = D0(2, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // D2.U0
    public final String g() {
        Parcel D02 = D0(1, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // D2.U0
    public final List h() {
        Parcel D02 = D0(3, w0());
        ArrayList createTypedArrayList = D02.createTypedArrayList(g2.CREATOR);
        D02.recycle();
        return createTypedArrayList;
    }
}
