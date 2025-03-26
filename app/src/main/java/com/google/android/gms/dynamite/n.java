package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;
import o3.AbstractC6286a;

/* loaded from: classes.dex */
public final class n extends AbstractC6286a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final InterfaceC5852a J0(InterfaceC5852a interfaceC5852a, String str, int i8, InterfaceC5852a interfaceC5852a2) {
        Parcel D02 = D0();
        o3.c.d(D02, interfaceC5852a);
        D02.writeString(str);
        D02.writeInt(i8);
        o3.c.d(D02, interfaceC5852a2);
        Parcel w02 = w0(2, D02);
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(w02.readStrongBinder());
        w02.recycle();
        return D03;
    }

    public final InterfaceC5852a p2(InterfaceC5852a interfaceC5852a, String str, int i8, InterfaceC5852a interfaceC5852a2) {
        Parcel D02 = D0();
        o3.c.d(D02, interfaceC5852a);
        D02.writeString(str);
        D02.writeInt(i8);
        o3.c.d(D02, interfaceC5852a2);
        Parcel w02 = w0(3, D02);
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(w02.readStrongBinder());
        w02.recycle();
        return D03;
    }
}
