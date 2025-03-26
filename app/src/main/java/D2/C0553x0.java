package D2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import i3.InterfaceC5852a;

/* renamed from: D2.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0553x0 extends AbstractC3612ob implements IInterface {
    C0553x0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public final IBinder q2(InterfaceC5852a interfaceC5852a, int i8) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        w02.writeInt(244410000);
        Parcel D02 = D0(1, w02);
        IBinder readStrongBinder = D02.readStrongBinder();
        D02.recycle();
        return readStrongBinder;
    }
}
