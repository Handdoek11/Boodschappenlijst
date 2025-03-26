package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ph, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3733ph extends AbstractBinderC3721pb implements InterfaceC3842qh {
    public AbstractBinderC3733ph() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static InterfaceC3842qh t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof InterfaceC3842qh ? (InterfaceC3842qh) queryLocalInterface : new C3624oh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                String readString = parcel.readString();
                AbstractC3830qb.c(parcel);
                String E02 = E0(readString);
                parcel2.writeNoException();
                parcel2.writeString(E02);
                return true;
            case 2:
                String readString2 = parcel.readString();
                AbstractC3830qb.c(parcel);
                InterfaceC1938Xg Q7 = Q(readString2);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, Q7);
                return true;
            case 3:
                List<String> i10 = i();
                parcel2.writeNoException();
                parcel2.writeStringList(i10);
                return true;
            case 4:
                String f8 = f();
                parcel2.writeNoException();
                parcel2.writeString(f8);
                return true;
            case 5:
                String readString3 = parcel.readString();
                AbstractC3830qb.c(parcel);
                o0(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                o();
                parcel2.writeNoException();
                return true;
            case 7:
                D2.Y0 b8 = b();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, b8);
                return true;
            case 8:
                j();
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC5852a e8 = e();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, e8);
                return true;
            case 10:
                InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                boolean g02 = g0(D02);
                parcel2.writeNoException();
                parcel2.writeInt(g02 ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, null);
                return true;
            case 12:
                boolean q8 = q();
                parcel2.writeNoException();
                int i11 = AbstractC3830qb.f25953b;
                parcel2.writeInt(q8 ? 1 : 0);
                return true;
            case 13:
                boolean t7 = t();
                parcel2.writeNoException();
                int i12 = AbstractC3830qb.f25953b;
                parcel2.writeInt(t7 ? 1 : 0);
                return true;
            case 14:
                InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                q6(D03);
                parcel2.writeNoException();
                return true;
            case 15:
                k();
                parcel2.writeNoException();
                return true;
            case 16:
                InterfaceC1833Ug c8 = c();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, c8);
                return true;
            case 17:
                InterfaceC5852a D04 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                boolean X7 = X(D04);
                parcel2.writeNoException();
                parcel2.writeInt(X7 ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
