package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Fl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1314Fl extends AbstractBinderC3721pb implements InterfaceC1350Gl {
    public AbstractBinderC1314Fl() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC1457Jl interfaceC1457Jl = null;
        switch (i8) {
            case 1:
                InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                D2.c2 c2Var = (D2.c2) AbstractC3830qb.a(parcel, D2.c2.CREATOR);
                D2.X1 x12 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC1457Jl = queryLocalInterface instanceof InterfaceC1457Jl ? (InterfaceC1457Jl) queryLocalInterface : new C1386Hl(readStrongBinder);
                }
                InterfaceC1457Jl interfaceC1457Jl2 = interfaceC1457Jl;
                AbstractC3830qb.c(parcel);
                d2(D02, c2Var, x12, readString, interfaceC1457Jl2);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC5852a l8 = l();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, l8);
                return true;
            case 3:
                InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                D2.X1 x13 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC1457Jl = queryLocalInterface2 instanceof InterfaceC1457Jl ? (InterfaceC1457Jl) queryLocalInterface2 : new C1386Hl(readStrongBinder2);
                }
                AbstractC3830qb.c(parcel);
                n5(D03, x13, readString2, interfaceC1457Jl);
                parcel2.writeNoException();
                return true;
            case 4:
                F();
                parcel2.writeNoException();
                return true;
            case 5:
                o();
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC5852a D04 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                D2.c2 c2Var2 = (D2.c2) AbstractC3830qb.a(parcel, D2.c2.CREATOR);
                D2.X1 x14 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC1457Jl = queryLocalInterface3 instanceof InterfaceC1457Jl ? (InterfaceC1457Jl) queryLocalInterface3 : new C1386Hl(readStrongBinder3);
                }
                InterfaceC1457Jl interfaceC1457Jl3 = interfaceC1457Jl;
                AbstractC3830qb.c(parcel);
                I2(D04, c2Var2, x14, readString3, readString4, interfaceC1457Jl3);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC5852a D05 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                D2.X1 x15 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC1457Jl = queryLocalInterface4 instanceof InterfaceC1457Jl ? (InterfaceC1457Jl) queryLocalInterface4 : new C1386Hl(readStrongBinder4);
                }
                InterfaceC1457Jl interfaceC1457Jl4 = interfaceC1457Jl;
                AbstractC3830qb.c(parcel);
                Y3(D05, x15, readString5, readString6, interfaceC1457Jl4);
                parcel2.writeNoException();
                return true;
            case 8:
                q0();
                parcel2.writeNoException();
                return true;
            case 9:
                M();
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC5852a D06 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                D2.X1 x16 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                String readString7 = parcel.readString();
                InterfaceC1879Vo t7 = AbstractBinderC1844Uo.t7(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                AbstractC3830qb.c(parcel);
                k6(D06, x16, readString7, t7, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                D2.X1 x17 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                String readString9 = parcel.readString();
                AbstractC3830qb.c(parcel);
                b5(x17, readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                O();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean L7 = L();
                parcel2.writeNoException();
                int i10 = AbstractC3830qb.f25953b;
                parcel2.writeInt(L7 ? 1 : 0);
                return true;
            case 14:
                InterfaceC5852a D07 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                D2.X1 x18 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC1457Jl = queryLocalInterface5 instanceof InterfaceC1457Jl ? (InterfaceC1457Jl) queryLocalInterface5 : new C1386Hl(readStrongBinder5);
                }
                InterfaceC1457Jl interfaceC1457Jl5 = interfaceC1457Jl;
                C1553Mg c1553Mg = (C1553Mg) AbstractC3830qb.a(parcel, C1553Mg.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                AbstractC3830qb.c(parcel);
                x2(D07, x18, readString10, readString11, interfaceC1457Jl5, c1553Mg, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, null);
                return true;
            case 17:
                Bundle b8 = b();
                parcel2.writeNoException();
                AbstractC3830qb.e(parcel2, b8);
                return true;
            case 18:
                Bundle c8 = c();
                parcel2.writeNoException();
                AbstractC3830qb.e(parcel2, c8);
                return true;
            case 19:
                Bundle g8 = g();
                parcel2.writeNoException();
                AbstractC3830qb.e(parcel2, g8);
                return true;
            case 20:
                D2.X1 x19 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                AbstractC3830qb.c(parcel);
                w2(x19, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case C1445Je.zzm /* 21 */:
                InterfaceC5852a D08 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                m4(D08);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i11 = AbstractC3830qb.f25953b;
                parcel2.writeInt(0);
                return true;
            case 23:
                InterfaceC5852a D09 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC1879Vo t72 = AbstractBinderC1844Uo.t7(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                AbstractC3830qb.c(parcel);
                W0(D09, t72, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                InterfaceC3842qh f8 = f();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, f8);
                return true;
            case 25:
                boolean g9 = AbstractC3830qb.g(parcel);
                AbstractC3830qb.c(parcel);
                y0(g9);
                parcel2.writeNoException();
                return true;
            case 26:
                D2.Y0 e8 = e();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, e8);
                return true;
            case 27:
                InterfaceC1771Sl i12 = i();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, i12);
                return true;
            case 28:
                InterfaceC5852a D010 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                D2.X1 x110 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC1457Jl = queryLocalInterface6 instanceof InterfaceC1457Jl ? (InterfaceC1457Jl) queryLocalInterface6 : new C1386Hl(readStrongBinder6);
                }
                AbstractC3830qb.c(parcel);
                m2(D010, x110, readString14, interfaceC1457Jl);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                InterfaceC5852a D011 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                r5(D011);
                parcel2.writeNoException();
                return true;
            case 31:
                InterfaceC5852a D012 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC1594Nj t73 = AbstractBinderC1559Mj.t7(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(C1804Tj.CREATOR);
                AbstractC3830qb.c(parcel);
                E1(D012, t73, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                InterfaceC5852a D013 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                D2.X1 x111 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC1457Jl = queryLocalInterface7 instanceof InterfaceC1457Jl ? (InterfaceC1457Jl) queryLocalInterface7 : new C1386Hl(readStrongBinder7);
                }
                AbstractC3830qb.c(parcel);
                e7(D013, x111, readString15, interfaceC1457Jl);
                parcel2.writeNoException();
                return true;
            case 33:
                C1667Pm j8 = j();
                parcel2.writeNoException();
                AbstractC3830qb.e(parcel2, j8);
                return true;
            case 34:
                C1667Pm k8 = k();
                parcel2.writeNoException();
                AbstractC3830qb.e(parcel2, k8);
                return true;
            case 35:
                InterfaceC5852a D014 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                D2.c2 c2Var3 = (D2.c2) AbstractC3830qb.a(parcel, D2.c2.CREATOR);
                D2.X1 x112 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC1457Jl = queryLocalInterface8 instanceof InterfaceC1457Jl ? (InterfaceC1457Jl) queryLocalInterface8 : new C1386Hl(readStrongBinder8);
                }
                InterfaceC1457Jl interfaceC1457Jl6 = interfaceC1457Jl;
                AbstractC3830qb.c(parcel);
                h5(D014, c2Var3, x112, readString16, readString17, interfaceC1457Jl6);
                parcel2.writeNoException();
                return true;
            case 36:
                InterfaceC1561Ml h8 = h();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, h8);
                return true;
            case 37:
                InterfaceC5852a D015 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                Q2(D015);
                parcel2.writeNoException();
                return true;
            case 38:
                InterfaceC5852a D016 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                D2.X1 x113 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC1457Jl = queryLocalInterface9 instanceof InterfaceC1457Jl ? (InterfaceC1457Jl) queryLocalInterface9 : new C1386Hl(readStrongBinder9);
                }
                AbstractC3830qb.c(parcel);
                e2(D016, x113, readString18, interfaceC1457Jl);
                parcel2.writeNoException();
                return true;
            case 39:
                InterfaceC5852a D017 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                d1(D017);
                parcel2.writeNoException();
                return true;
        }
    }
}
