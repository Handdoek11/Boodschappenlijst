package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Il, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1422Il extends AbstractBinderC3721pb implements InterfaceC1457Jl {
    public AbstractBinderC1422Il() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static InterfaceC1457Jl t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof InterfaceC1457Jl ? (InterfaceC1457Jl) queryLocalInterface : new C1386Hl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                b();
                break;
            case 2:
                c();
                break;
            case 3:
                int readInt = parcel.readInt();
                AbstractC3830qb.c(parcel);
                z(readInt);
                break;
            case 4:
                l();
                break;
            case 5:
                p();
                break;
            case 6:
                o();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof AbstractC1596Nl) {
                        androidx.appcompat.app.E.a(queryLocalInterface);
                    }
                }
                AbstractC3830qb.c(parcel);
                break;
            case 8:
                k();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC3830qb.c(parcel);
                v5(readString, readString2);
                break;
            case 10:
                AbstractBinderC3733ph.t7(parcel.readStrongBinder());
                parcel.readString();
                AbstractC3830qb.c(parcel);
                break;
            case 11:
                u();
                break;
            case 12:
                parcel.readString();
                AbstractC3830qb.c(parcel);
                break;
            case 13:
                V();
                break;
            case 14:
                C1914Wo c1914Wo = (C1914Wo) AbstractC3830qb.a(parcel, C1914Wo.CREATOR);
                AbstractC3830qb.c(parcel);
                T4(c1914Wo);
                break;
            case 15:
                w();
                break;
            case 16:
                InterfaceC2118ap t7 = AbstractBinderC2019Zo.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                c2(t7);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                AbstractC3830qb.c(parcel);
                p5(readInt2);
                break;
            case 18:
                x();
                break;
            case 19:
                AbstractC3830qb.c(parcel);
                break;
            case 20:
                B();
                break;
            case C1445Je.zzm /* 21 */:
                String readString3 = parcel.readString();
                AbstractC3830qb.c(parcel);
                W(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                AbstractC3830qb.c(parcel);
                s1(readInt3, readString4);
                break;
            case 23:
                D2.W0 w02 = (D2.W0) AbstractC3830qb.a(parcel, D2.W0.CREATOR);
                AbstractC3830qb.c(parcel);
                i6(w02);
                break;
            case 24:
                D2.W0 w03 = (D2.W0) AbstractC3830qb.a(parcel, D2.W0.CREATOR);
                AbstractC3830qb.c(parcel);
                s3(w03);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
