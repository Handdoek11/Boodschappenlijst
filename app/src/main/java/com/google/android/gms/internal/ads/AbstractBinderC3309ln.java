package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.ln, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3309ln extends AbstractBinderC3721pb implements InterfaceC3418mn {
    public AbstractBinderC3309ln() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static InterfaceC3418mn t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof InterfaceC3418mn ? (InterfaceC3418mn) queryLocalInterface : new C3200kn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                Intent intent = (Intent) AbstractC3830qb.a(parcel, Intent.CREATOR);
                AbstractC3830qb.c(parcel);
                K0(intent);
                break;
            case 2:
                InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC3830qb.c(parcel);
                N5(D02, readString, readString2);
                break;
            case 3:
                e();
                break;
            case 4:
                InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                H0(D03);
                break;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                InterfaceC5852a D04 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                P5(createStringArray, createIntArray, D04);
                break;
            case 6:
                InterfaceC5852a D05 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                E2.a aVar = (E2.a) AbstractC3830qb.a(parcel, E2.a.CREATOR);
                AbstractC3830qb.c(parcel);
                q7(D05, aVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
