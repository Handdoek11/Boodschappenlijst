package com.google.android.gms.internal.ads;

import D2.InterfaceC0485a0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.Lo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1530Lo extends AbstractBinderC3721pb implements InterfaceC1564Mo {
    public AbstractBinderC1530Lo() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            C1739Ro c1739Ro = (C1739Ro) AbstractC3830qb.a(parcel, C1739Ro.CREATOR);
            AbstractC3830qb.c(parcel);
            U4(c1739Ro);
            parcel2.writeNoException();
        } else if (i8 != 2) {
            InterfaceC1704Qo interfaceC1704Qo = null;
            C1495Ko c1495Ko = null;
            if (i8 == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    interfaceC1704Qo = queryLocalInterface instanceof InterfaceC1704Qo ? (InterfaceC1704Qo) queryLocalInterface : new C1634Oo(readStrongBinder);
                }
                AbstractC3830qb.c(parcel);
                Y6(interfaceC1704Qo);
                parcel2.writeNoException();
            } else if (i8 != 34) {
                switch (i8) {
                    case 5:
                        boolean s8 = s();
                        parcel2.writeNoException();
                        int i10 = AbstractC3830qb.f25953b;
                        parcel2.writeInt(s8 ? 1 : 0);
                        break;
                    case 6:
                        e();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        h();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        b();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                        AbstractC3830qb.c(parcel);
                        j0(D02);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                        AbstractC3830qb.c(parcel);
                        a0(D03);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        InterfaceC5852a D04 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                        AbstractC3830qb.c(parcel);
                        u0(D04);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String d8 = d();
                        parcel2.writeNoException();
                        parcel2.writeString(d8);
                        break;
                    case 13:
                        String readString = parcel.readString();
                        AbstractC3830qb.c(parcel);
                        s0(readString);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        InterfaceC0485a0 t7 = D2.Z.t7(parcel.readStrongBinder());
                        AbstractC3830qb.c(parcel);
                        B4(t7);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle zzb = zzb();
                        parcel2.writeNoException();
                        AbstractC3830qb.e(parcel2, zzb);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            c1495Ko = queryLocalInterface2 instanceof C1495Ko ? (C1495Ko) queryLocalInterface2 : new C1495Ko(readStrongBinder2);
                        }
                        AbstractC3830qb.c(parcel);
                        G2(c1495Ko);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        AbstractC3830qb.c(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        InterfaceC5852a D05 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                        AbstractC3830qb.c(parcel);
                        X(D05);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String readString2 = parcel.readString();
                        AbstractC3830qb.c(parcel);
                        r0(readString2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean t8 = t();
                        parcel2.writeNoException();
                        int i11 = AbstractC3830qb.f25953b;
                        parcel2.writeInt(t8 ? 1 : 0);
                        break;
                    case C1445Je.zzm /* 21 */:
                        D2.U0 a8 = a();
                        parcel2.writeNoException();
                        AbstractC3830qb.f(parcel2, a8);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean g8 = AbstractC3830qb.g(parcel);
                AbstractC3830qb.c(parcel);
                N(g8);
                parcel2.writeNoException();
            }
        } else {
            q();
            parcel2.writeNoException();
        }
        return true;
    }
}
