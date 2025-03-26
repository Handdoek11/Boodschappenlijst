package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ol, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1631Ol extends AbstractC3612ob implements IInterface {
    C1631Ol(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final InterfaceC1938Xg I3() {
        Parcel D02 = D0(5, w0());
        InterfaceC1938Xg t7 = AbstractBinderC1903Wg.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    public final InterfaceC5852a W4() {
        Parcel D02 = D0(18, w0());
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(D02.readStrongBinder());
        D02.recycle();
        return D03;
    }

    public final double b() {
        Parcel D02 = D0(7, w0());
        double readDouble = D02.readDouble();
        D02.recycle();
        return readDouble;
    }

    public final Bundle c() {
        Parcel D02 = D0(15, w0());
        Bundle bundle = (Bundle) AbstractC3830qb.a(D02, Bundle.CREATOR);
        D02.recycle();
        return bundle;
    }

    public final InterfaceC5852a j() {
        Parcel D02 = D0(21, w0());
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(D02.readStrongBinder());
        D02.recycle();
        return D03;
    }

    public final String k() {
        Parcel D02 = D0(4, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    public final String l() {
        Parcel D02 = D0(6, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    public final String o() {
        Parcel D02 = D0(2, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    public final String p() {
        Parcel D02 = D0(9, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    public final String q() {
        Parcel D02 = D0(8, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    public final D2.Y0 q2() {
        Parcel D02 = D0(17, w0());
        D2.Y0 t7 = D2.X0.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    public final InterfaceC1693Qg r3() {
        Parcel D02 = D0(19, w0());
        InterfaceC1693Qg t7 = AbstractBinderC1658Pg.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    public final InterfaceC5852a s7() {
        Parcel D02 = D0(20, w0());
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(D02.readStrongBinder());
        D02.recycle();
        return D03;
    }

    public final void t() {
        J0(10, w0());
    }

    public final List t7() {
        Parcel D02 = D0(3, w0());
        ArrayList b8 = AbstractC3830qb.b(D02);
        D02.recycle();
        return b8;
    }

    public final void u4(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(16, w02);
    }

    public final void u7(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(11, w02);
    }

    public final void v7(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(12, w02);
    }

    public final void w7(InterfaceC5852a interfaceC5852a, InterfaceC5852a interfaceC5852a2, InterfaceC5852a interfaceC5852a3) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.f(w02, interfaceC5852a2);
        AbstractC3830qb.f(w02, interfaceC5852a3);
        J0(22, w02);
    }

    public final boolean x7() {
        Parcel D02 = D0(14, w0());
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }

    public final boolean y7() {
        Parcel D02 = D0(13, w0());
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }
}
