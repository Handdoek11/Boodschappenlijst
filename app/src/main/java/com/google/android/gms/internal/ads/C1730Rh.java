package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Rh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1730Rh extends AbstractC3612ob implements InterfaceC1800Th {
    C1730Rh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final double b() {
        Parcel D02 = D0(8, w0());
        double readDouble = D02.readDouble();
        D02.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final D2.Y0 e() {
        Parcel D02 = D0(11, w0());
        D2.Y0 t7 = D2.X0.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final InterfaceC1693Qg f() {
        InterfaceC1693Qg c1623Og;
        Parcel D02 = D0(14, w0());
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c1623Og = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            c1623Og = queryLocalInterface instanceof InterfaceC1693Qg ? (InterfaceC1693Qg) queryLocalInterface : new C1623Og(readStrongBinder);
        }
        D02.recycle();
        return c1623Og;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final D2.U0 g() {
        Parcel D02 = D0(31, w0());
        D2.U0 t7 = D2.T0.t7(D02.readStrongBinder());
        D02.recycle();
        return t7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final InterfaceC1938Xg i() {
        InterfaceC1938Xg c1868Vg;
        Parcel D02 = D0(5, w0());
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c1868Vg = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            c1868Vg = queryLocalInterface instanceof InterfaceC1938Xg ? (InterfaceC1938Xg) queryLocalInterface : new C1868Vg(readStrongBinder);
        }
        D02.recycle();
        return c1868Vg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final InterfaceC5852a j() {
        Parcel D02 = D0(19, w0());
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(D02.readStrongBinder());
        D02.recycle();
        return D03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final InterfaceC5852a k() {
        Parcel D02 = D0(18, w0());
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(D02.readStrongBinder());
        D02.recycle();
        return D03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final String l() {
        Parcel D02 = D0(7, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final void m3(Bundle bundle) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, bundle);
        J0(33, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final String o() {
        Parcel D02 = D0(4, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final String p() {
        Parcel D02 = D0(6, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final String q() {
        Parcel D02 = D0(2, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final String s() {
        Parcel D02 = D0(10, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final String t() {
        Parcel D02 = D0(9, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final List u() {
        Parcel D02 = D0(23, w0());
        ArrayList b8 = AbstractC3830qb.b(D02);
        D02.recycle();
        return b8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1800Th
    public final List x() {
        Parcel D02 = D0(3, w0());
        ArrayList b8 = AbstractC3830qb.b(D02);
        D02.recycle();
        return b8;
    }
}
