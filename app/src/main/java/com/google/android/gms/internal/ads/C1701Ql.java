package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ql, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1701Ql extends AbstractC3612ob implements InterfaceC1771Sl {
    C1701Ql(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final void B() {
        J0(19, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final void U1(InterfaceC5852a interfaceC5852a, InterfaceC5852a interfaceC5852a2, InterfaceC5852a interfaceC5852a3) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.f(w02, interfaceC5852a2);
        AbstractC3830qb.f(w02, interfaceC5852a3);
        J0(21, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final void Y1(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(22, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final double b() {
        Parcel D02 = D0(8, w0());
        double readDouble = D02.readDouble();
        D02.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final float c() {
        Parcel D02 = D0(23, w0());
        float readFloat = D02.readFloat();
        D02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final boolean c0() {
        Parcel D02 = D0(17, w0());
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final float e() {
        Parcel D02 = D0(24, w0());
        float readFloat = D02.readFloat();
        D02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final Bundle f() {
        Parcel D02 = D0(16, w0());
        Bundle bundle = (Bundle) AbstractC3830qb.a(D02, Bundle.CREATOR);
        D02.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final boolean f0() {
        Parcel D02 = D0(18, w0());
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final float g() {
        Parcel D02 = D0(25, w0());
        float readFloat = D02.readFloat();
        D02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final D2.Y0 h() {
        Parcel D02 = D0(11, w0());
        D2.Y0 t7 = D2.X0.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final InterfaceC1693Qg i() {
        Parcel D02 = D0(12, w0());
        InterfaceC1693Qg t7 = AbstractBinderC1658Pg.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final InterfaceC1938Xg j() {
        Parcel D02 = D0(5, w0());
        InterfaceC1938Xg t7 = AbstractBinderC1903Wg.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final InterfaceC5852a k() {
        Parcel D02 = D0(13, w0());
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(D02.readStrongBinder());
        D02.recycle();
        return D03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final InterfaceC5852a l() {
        Parcel D02 = D0(14, w0());
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(D02.readStrongBinder());
        D02.recycle();
        return D03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final InterfaceC5852a o() {
        Parcel D02 = D0(15, w0());
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(D02.readStrongBinder());
        D02.recycle();
        return D03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final String p() {
        Parcel D02 = D0(7, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final String q() {
        Parcel D02 = D0(4, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final String r() {
        Parcel D02 = D0(6, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final String s() {
        Parcel D02 = D0(2, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final String t() {
        Parcel D02 = D0(10, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final List u() {
        Parcel D02 = D0(3, w0());
        ArrayList b8 = AbstractC3830qb.b(D02);
        D02.recycle();
        return b8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final void u4(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(20, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Sl
    public final String x() {
        Parcel D02 = D0(9, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }
}
