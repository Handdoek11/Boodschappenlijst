package Z2;

import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;
import o3.AbstractC6286a;

/* loaded from: classes.dex */
public final class w0 extends AbstractC6286a implements U {
    w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // Z2.U
    public final int a() {
        Parcel w02 = w0(2, D0());
        int readInt = w02.readInt();
        w02.recycle();
        return readInt;
    }

    @Override // Z2.U
    public final InterfaceC5852a d() {
        Parcel w02 = w0(1, D0());
        InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(w02.readStrongBinder());
        w02.recycle();
        return D02;
    }
}
