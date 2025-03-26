package D2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import i3.InterfaceC5852a;

/* loaded from: classes.dex */
public final class R0 extends AbstractC3612ob implements IInterface {
    R0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final Q0 q2(InterfaceC5852a interfaceC5852a, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        Q0 o02;
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.f(w02, interfaceC1242Dl);
        w02.writeInt(244410000);
        Parcel D02 = D0(1, w02);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            o02 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            o02 = queryLocalInterface instanceof Q0 ? (Q0) queryLocalInterface : new O0(readStrongBinder);
        }
        D02.recycle();
        return o02;
    }
}
