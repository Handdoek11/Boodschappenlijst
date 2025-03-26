package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;
import o3.AbstractC6286a;

/* loaded from: classes.dex */
public final class m extends AbstractC6286a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final InterfaceC5852a I3(InterfaceC5852a interfaceC5852a, String str, int i8) {
        Parcel D02 = D0();
        o3.c.d(D02, interfaceC5852a);
        D02.writeString(str);
        D02.writeInt(i8);
        Parcel w02 = w0(4, D02);
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(w02.readStrongBinder());
        w02.recycle();
        return D03;
    }

    public final int J0(InterfaceC5852a interfaceC5852a, String str, boolean z7) {
        Parcel D02 = D0();
        o3.c.d(D02, interfaceC5852a);
        D02.writeString(str);
        D02.writeInt(z7 ? 1 : 0);
        Parcel w02 = w0(3, D02);
        int readInt = w02.readInt();
        w02.recycle();
        return readInt;
    }

    public final InterfaceC5852a W4(InterfaceC5852a interfaceC5852a, String str, boolean z7, long j8) {
        Parcel D02 = D0();
        o3.c.d(D02, interfaceC5852a);
        D02.writeString(str);
        D02.writeInt(z7 ? 1 : 0);
        D02.writeLong(j8);
        Parcel w02 = w0(7, D02);
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(w02.readStrongBinder());
        w02.recycle();
        return D03;
    }

    public final int b() {
        Parcel w02 = w0(6, D0());
        int readInt = w02.readInt();
        w02.recycle();
        return readInt;
    }

    public final int p2(InterfaceC5852a interfaceC5852a, String str, boolean z7) {
        Parcel D02 = D0();
        o3.c.d(D02, interfaceC5852a);
        D02.writeString(str);
        D02.writeInt(z7 ? 1 : 0);
        Parcel w02 = w0(5, D02);
        int readInt = w02.readInt();
        w02.recycle();
        return readInt;
    }

    public final InterfaceC5852a q2(InterfaceC5852a interfaceC5852a, String str, int i8) {
        Parcel D02 = D0();
        o3.c.d(D02, interfaceC5852a);
        D02.writeString(str);
        D02.writeInt(i8);
        Parcel w02 = w0(2, D02);
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(w02.readStrongBinder());
        w02.recycle();
        return D03;
    }

    public final InterfaceC5852a r3(InterfaceC5852a interfaceC5852a, String str, int i8, InterfaceC5852a interfaceC5852a2) {
        Parcel D02 = D0();
        o3.c.d(D02, interfaceC5852a);
        D02.writeString(str);
        D02.writeInt(i8);
        o3.c.d(D02, interfaceC5852a2);
        Parcel w02 = w0(8, D02);
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(w02.readStrongBinder());
        w02.recycle();
        return D03;
    }
}
