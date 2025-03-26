package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import i3.InterfaceC5852a;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.su, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4085su extends AbstractBinderC3721pb implements InterfaceC4194tu {
    public AbstractBinderC4085su() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                Bundle bundle = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
                AbstractC3830qb.c(parcel);
                i0(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
                AbstractC3830qb.c(parcel);
                Bundle j32 = j3(bundle2);
                parcel2.writeNoException();
                AbstractC3830qb.e(parcel2, j32);
                return true;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle3 = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
                AbstractC3830qb.c(parcel);
                i5(readString, readString2, bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                w4(readString3, readString4, D02);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean g8 = AbstractC3830qb.g(parcel);
                AbstractC3830qb.c(parcel);
                Map l62 = l6(readString5, readString6, g8);
                parcel2.writeNoException();
                parcel2.writeMap(l62);
                return true;
            case 6:
                String readString7 = parcel.readString();
                AbstractC3830qb.c(parcel);
                int v7 = v(readString7);
                parcel2.writeNoException();
                parcel2.writeInt(v7);
                return true;
            case 7:
                Bundle bundle4 = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
                AbstractC3830qb.c(parcel);
                T(bundle4);
                parcel2.writeNoException();
                return true;
            case 8:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                Bundle bundle5 = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
                AbstractC3830qb.c(parcel);
                F6(readString8, readString9, bundle5);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                AbstractC3830qb.c(parcel);
                List M42 = M4(readString10, readString11);
                parcel2.writeNoException();
                parcel2.writeList(M42);
                return true;
            case 10:
                String c8 = c();
                parcel2.writeNoException();
                parcel2.writeString(c8);
                return true;
            case 11:
                String f8 = f();
                parcel2.writeNoException();
                parcel2.writeString(f8);
                return true;
            case 12:
                long a8 = a();
                parcel2.writeNoException();
                parcel2.writeLong(a8);
                return true;
            case 13:
                String readString12 = parcel.readString();
                AbstractC3830qb.c(parcel);
                W(readString12);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString13 = parcel.readString();
                AbstractC3830qb.c(parcel);
                o0(readString13);
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                AbstractC3830qb.c(parcel);
                p7(D03, readString14, readString15);
                parcel2.writeNoException();
                return true;
            case 16:
                String e8 = e();
                parcel2.writeNoException();
                parcel2.writeString(e8);
                return true;
            case 17:
                String g9 = g();
                parcel2.writeNoException();
                parcel2.writeString(g9);
                return true;
            case 18:
                String b8 = b();
                parcel2.writeNoException();
                parcel2.writeString(b8);
                return true;
            case 19:
                Bundle bundle6 = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
                AbstractC3830qb.c(parcel);
                A0(bundle6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
