package D2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import i3.InterfaceC5852a;

/* loaded from: classes.dex */
public final class S extends AbstractC3612ob implements IInterface {
    S(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder q2(InterfaceC5852a interfaceC5852a, String str, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        w02.writeString(str);
        AbstractC3830qb.f(w02, interfaceC1242Dl);
        w02.writeInt(244410000);
        Parcel D02 = D0(1, w02);
        IBinder readStrongBinder = D02.readStrongBinder();
        D02.recycle();
        return readStrongBinder;
    }
}
