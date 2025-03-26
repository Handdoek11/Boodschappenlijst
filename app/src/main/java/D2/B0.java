package D2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;

/* loaded from: classes.dex */
public final class B0 extends AbstractC3612ob implements D0 {
    B0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // D2.D0
    public final String b() {
        Parcel D02 = D0(1, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // D2.D0
    public final String c() {
        Parcel D02 = D0(2, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }
}
