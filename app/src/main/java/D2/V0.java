package D2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* loaded from: classes.dex */
public final class V0 extends AbstractC3612ob implements Y0 {
    V0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // D2.Y0
    public final void N6(InterfaceC0489b1 interfaceC0489b1) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC0489b1);
        J0(8, w02);
    }

    @Override // D2.Y0
    public final float b() {
        throw null;
    }

    @Override // D2.Y0
    public final float c() {
        throw null;
    }

    @Override // D2.Y0
    public final InterfaceC0489b1 f() {
        InterfaceC0489b1 z02;
        Parcel D02 = D0(11, w0());
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            z02 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            z02 = queryLocalInterface instanceof InterfaceC0489b1 ? (InterfaceC0489b1) queryLocalInterface : new Z0(readStrongBinder);
        }
        D02.recycle();
        return z02;
    }

    @Override // D2.Y0
    public final float g() {
        throw null;
    }
}
