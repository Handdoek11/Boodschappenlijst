package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.ah, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2102ah extends AbstractBinderC3721pb implements InterfaceC2319ch {
    public AbstractBinderC2102ah() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static InterfaceC2319ch t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof InterfaceC2319ch ? (InterfaceC2319ch) queryLocalInterface : new C2008Zg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC1833Ug c1763Sg;
        switch (i8) {
            case 1:
                String readString = parcel.readString();
                InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                L2(readString, D02);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                AbstractC3830qb.c(parcel);
                InterfaceC5852a v7 = v(readString2);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, v7);
                return true;
            case 3:
                InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                D4(D03);
                parcel2.writeNoException();
                return true;
            case 4:
                a();
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                parcel.readInt();
                AbstractC3830qb.c(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC5852a D04 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                F1(D04);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC5852a D05 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                l0(D05);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c1763Sg = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    c1763Sg = queryLocalInterface instanceof InterfaceC1833Ug ? (InterfaceC1833Ug) queryLocalInterface : new C1763Sg(readStrongBinder);
                }
                AbstractC3830qb.c(parcel);
                m1(c1763Sg);
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC5852a D06 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                b7(D06);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
