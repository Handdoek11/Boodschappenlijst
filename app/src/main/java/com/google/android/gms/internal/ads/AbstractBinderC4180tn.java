package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.tn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4180tn extends AbstractBinderC3721pb implements InterfaceC4289un {
    public AbstractBinderC4180tn() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static InterfaceC4289un t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof InterfaceC4289un ? (InterfaceC4289un) queryLocalInterface : new C4071sn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                Bundle bundle = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
                AbstractC3830qb.c(parcel);
                C4(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                t();
                parcel2.writeNoException();
                return true;
            case 4:
                r();
                parcel2.writeNoException();
                return true;
            case 5:
                o();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
                AbstractC3830qb.c(parcel);
                x0(bundle2);
                parcel2.writeNoException();
                AbstractC3830qb.e(parcel2, bundle2);
                return true;
            case 7:
                x();
                parcel2.writeNoException();
                return true;
            case 8:
                k();
                parcel2.writeNoException();
                return true;
            case 9:
                B();
                parcel2.writeNoException();
                return true;
            case 10:
                f();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean S7 = S();
                parcel2.writeNoException();
                int i10 = AbstractC3830qb.f25953b;
                parcel2.writeInt(S7 ? 1 : 0);
                return true;
            case 12:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                Intent intent = (Intent) AbstractC3830qb.a(parcel, Intent.CREATOR);
                AbstractC3830qb.c(parcel);
                y2(readInt, readInt2, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                a0(D02);
                parcel2.writeNoException();
                return true;
            case 14:
                u();
                parcel2.writeNoException();
                return true;
            case 15:
                int readInt3 = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                AbstractC3830qb.c(parcel);
                l3(readInt3, createStringArray, createIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
