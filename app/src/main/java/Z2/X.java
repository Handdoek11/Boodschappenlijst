package Z2;

import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;
import o3.AbstractC6286a;

/* loaded from: classes.dex */
public final class X extends AbstractC6286a implements Z {
    X(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // Z2.Z
    public final com.google.android.gms.common.C A3(com.google.android.gms.common.A a8) {
        Parcel D02 = D0();
        o3.c.c(D02, a8);
        Parcel w02 = w0(6, D02);
        com.google.android.gms.common.C c8 = (com.google.android.gms.common.C) o3.c.a(w02, com.google.android.gms.common.C.CREATOR);
        w02.recycle();
        return c8;
    }

    @Override // Z2.Z
    public final boolean f() {
        Parcel w02 = w0(7, D0());
        boolean e8 = o3.c.e(w02);
        w02.recycle();
        return e8;
    }

    @Override // Z2.Z
    public final boolean f5(com.google.android.gms.common.E e8, InterfaceC5852a interfaceC5852a) {
        Parcel D02 = D0();
        o3.c.c(D02, e8);
        o3.c.d(D02, interfaceC5852a);
        Parcel w02 = w0(5, D02);
        boolean e9 = o3.c.e(w02);
        w02.recycle();
        return e9;
    }

    @Override // Z2.Z
    public final com.google.android.gms.common.C l4(com.google.android.gms.common.A a8) {
        Parcel D02 = D0();
        o3.c.c(D02, a8);
        Parcel w02 = w0(8, D02);
        com.google.android.gms.common.C c8 = (com.google.android.gms.common.C) o3.c.a(w02, com.google.android.gms.common.C.CREATOR);
        w02.recycle();
        return c8;
    }
}
