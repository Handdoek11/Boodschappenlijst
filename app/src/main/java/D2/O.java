package D2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import com.google.android.gms.internal.ads.C1553Mg;
import com.google.android.gms.internal.ads.InterfaceC1163Bh;
import com.google.android.gms.internal.ads.InterfaceC1271Eh;
import com.google.android.gms.internal.ads.InterfaceC1521Lh;

/* loaded from: classes.dex */
public final class O extends AbstractC3612ob implements Q {
    O(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // D2.Q
    public final void B5(C1553Mg c1553Mg) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, c1553Mg);
        J0(6, w02);
    }

    @Override // D2.Q
    public final void M6(InterfaceC1521Lh interfaceC1521Lh) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC1521Lh);
        J0(10, w02);
    }

    @Override // D2.Q
    public final void O3(String str, InterfaceC1271Eh interfaceC1271Eh, InterfaceC1163Bh interfaceC1163Bh) {
        Parcel w02 = w0();
        w02.writeString(str);
        AbstractC3830qb.f(w02, interfaceC1271Eh);
        AbstractC3830qb.f(w02, interfaceC1163Bh);
        J0(5, w02);
    }

    @Override // D2.Q
    public final void X1(H h8) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, h8);
        J0(2, w02);
    }

    @Override // D2.Q
    public final N b() {
        N l8;
        Parcel D02 = D0(1, w0());
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            l8 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            l8 = queryLocalInterface instanceof N ? (N) queryLocalInterface : new L(readStrongBinder);
        }
        D02.recycle();
        return l8;
    }
}
