package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.cp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2335cp extends AbstractBinderC3721pb implements InterfaceC2443dp {
    public AbstractBinderC2335cp() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static InterfaceC2443dp t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof InterfaceC2443dp ? (InterfaceC2443dp) queryLocalInterface : new C2227bp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC3204kp interfaceC3204kp = null;
        InterfaceC3204kp interfaceC3204kp2 = null;
        C3313lp c3313lp = null;
        InterfaceC2770gp interfaceC2770gp = null;
        switch (i8) {
            case 1:
                D2.X1 x12 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    interfaceC3204kp = queryLocalInterface instanceof InterfaceC3204kp ? (InterfaceC3204kp) queryLocalInterface : new C2987ip(readStrongBinder);
                }
                AbstractC3830qb.c(parcel);
                n2(x12, interfaceC3204kp);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    interfaceC2770gp = queryLocalInterface2 instanceof InterfaceC2770gp ? (InterfaceC2770gp) queryLocalInterface2 : new C2552ep(readStrongBinder2);
                }
                AbstractC3830qb.c(parcel);
                G3(interfaceC2770gp);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean o8 = o();
                parcel2.writeNoException();
                int i10 = AbstractC3830qb.f25953b;
                parcel2.writeInt(o8 ? 1 : 0);
                return true;
            case 4:
                String b8 = b();
                parcel2.writeNoException();
                parcel2.writeString(b8);
                return true;
            case 5:
                InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                t5(D02);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    c3313lp = queryLocalInterface3 instanceof C3313lp ? (C3313lp) queryLocalInterface3 : new C3313lp(readStrongBinder3);
                }
                AbstractC3830qb.c(parcel);
                Z2(c3313lp);
                parcel2.writeNoException();
                return true;
            case 7:
                C4075sp c4075sp = (C4075sp) AbstractC3830qb.a(parcel, C4075sp.CREATOR);
                AbstractC3830qb.c(parcel);
                E3(c4075sp);
                parcel2.writeNoException();
                return true;
            case 8:
                D2.K0 t7 = D2.J0.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                o7(t7);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                AbstractC3830qb.e(parcel2, zzb);
                return true;
            case 10:
                InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                boolean g8 = AbstractC3830qb.g(parcel);
                AbstractC3830qb.c(parcel);
                f2(D03, g8);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC2118ap d8 = d();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, d8);
                return true;
            case 12:
                D2.U0 a8 = a();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, a8);
                return true;
            case 13:
                D2.N0 t72 = D2.M0.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                M3(t72);
                parcel2.writeNoException();
                return true;
            case 14:
                D2.X1 x13 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    interfaceC3204kp2 = queryLocalInterface4 instanceof InterfaceC3204kp ? (InterfaceC3204kp) queryLocalInterface4 : new C2987ip(readStrongBinder4);
                }
                AbstractC3830qb.c(parcel);
                k3(x13, interfaceC3204kp2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean g9 = AbstractC3830qb.g(parcel);
                AbstractC3830qb.c(parcel);
                x4(g9);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
