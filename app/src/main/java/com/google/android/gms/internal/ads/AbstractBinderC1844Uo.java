package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.Uo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1844Uo extends AbstractBinderC3721pb implements InterfaceC1879Vo {
    public AbstractBinderC1844Uo() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static InterfaceC1879Vo t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof InterfaceC1879Vo ? (InterfaceC1879Vo) queryLocalInterface : new C1809To(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                R2(D02);
                break;
            case 2:
                InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                AbstractC3830qb.c(parcel);
                Y5(D03, readInt);
                break;
            case 3:
                InterfaceC5852a D04 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                j0(D04);
                break;
            case 4:
                InterfaceC5852a D05 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                U(D05);
                break;
            case 5:
                InterfaceC5852a D06 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                n7(D06);
                break;
            case 6:
                InterfaceC5852a D07 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                u0(D07);
                break;
            case 7:
                InterfaceC5852a D08 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                C1914Wo c1914Wo = (C1914Wo) AbstractC3830qb.a(parcel, C1914Wo.CREATOR);
                AbstractC3830qb.c(parcel);
                c7(D08, c1914Wo);
                break;
            case 8:
                InterfaceC5852a D09 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                zze(D09);
                break;
            case 9:
                InterfaceC5852a D010 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                AbstractC3830qb.c(parcel);
                d3(D010, readInt2);
                break;
            case 10:
                InterfaceC5852a D011 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                T5(D011);
                break;
            case 11:
                InterfaceC5852a D012 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                v0(D012);
                break;
            case 12:
                AbstractC3830qb.c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
