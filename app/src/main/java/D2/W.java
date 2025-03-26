package D2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import i3.InterfaceC5852a;

/* loaded from: classes.dex */
public final class W extends AbstractC3612ob implements IInterface {
    W(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder q2(InterfaceC5852a interfaceC5852a, c2 c2Var, String str, InterfaceC1242Dl interfaceC1242Dl, int i8, int i9) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.d(w02, c2Var);
        w02.writeString(str);
        AbstractC3830qb.f(w02, interfaceC1242Dl);
        w02.writeInt(244410000);
        w02.writeInt(i9);
        Parcel D02 = D0(2, w02);
        IBinder readStrongBinder = D02.readStrongBinder();
        D02.recycle();
        return readStrongBinder;
    }
}
