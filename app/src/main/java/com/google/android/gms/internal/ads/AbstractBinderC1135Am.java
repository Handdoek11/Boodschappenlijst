package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.Am, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1135Am extends AbstractBinderC3721pb implements InterfaceC1171Bm {
    public AbstractBinderC1135Am() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static InterfaceC1171Bm t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof InterfaceC1171Bm ? (InterfaceC1171Bm) queryLocalInterface : new C4832zm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC1279Em interfaceC1279Em = null;
        InterfaceC3307lm c3089jm = null;
        InterfaceC4287um c4069sm = null;
        InterfaceC3634om c3416mm = null;
        InterfaceC4723ym c4396vm = null;
        InterfaceC4287um c4069sm2 = null;
        InterfaceC4723ym c4396vm2 = null;
        InterfaceC3960rm c3743pm = null;
        InterfaceC3634om c3416mm2 = null;
        if (i8 == 1) {
            InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) AbstractC3830qb.a(parcel, creator);
            Bundle bundle2 = (Bundle) AbstractC3830qb.a(parcel, creator);
            D2.c2 c2Var = (D2.c2) AbstractC3830qb.a(parcel, D2.c2.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                interfaceC1279Em = queryLocalInterface instanceof InterfaceC1279Em ? (InterfaceC1279Em) queryLocalInterface : new C1207Cm(readStrongBinder);
            }
            InterfaceC1279Em interfaceC1279Em2 = interfaceC1279Em;
            AbstractC3830qb.c(parcel);
            e4(D02, readString, bundle, bundle2, c2Var, interfaceC1279Em2);
            parcel2.writeNoException();
        } else if (i8 == 2) {
            C1667Pm c8 = c();
            parcel2.writeNoException();
            AbstractC3830qb.e(parcel2, c8);
        } else if (i8 == 3) {
            C1667Pm g8 = g();
            parcel2.writeNoException();
            AbstractC3830qb.e(parcel2, g8);
        } else if (i8 == 5) {
            D2.Y0 b8 = b();
            parcel2.writeNoException();
            AbstractC3830qb.f(parcel2, b8);
        } else if (i8 == 10) {
            InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
            AbstractC3830qb.c(parcel);
            parcel2.writeNoException();
        } else if (i8 != 11) {
            switch (i8) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    D2.X1 x12 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                    InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        c3416mm2 = queryLocalInterface2 instanceof InterfaceC3634om ? (InterfaceC3634om) queryLocalInterface2 : new C3416mm(readStrongBinder2);
                    }
                    InterfaceC3634om interfaceC3634om = c3416mm2;
                    InterfaceC1457Jl t7 = AbstractBinderC1422Il.t7(parcel.readStrongBinder());
                    D2.c2 c2Var2 = (D2.c2) AbstractC3830qb.a(parcel, D2.c2.CREATOR);
                    AbstractC3830qb.c(parcel);
                    H5(readString2, readString3, x12, D03, interfaceC3634om, t7, c2Var2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    D2.X1 x13 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                    InterfaceC5852a D04 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        c3743pm = queryLocalInterface3 instanceof InterfaceC3960rm ? (InterfaceC3960rm) queryLocalInterface3 : new C3743pm(readStrongBinder3);
                    }
                    InterfaceC3960rm interfaceC3960rm = c3743pm;
                    InterfaceC1457Jl t72 = AbstractBinderC1422Il.t7(parcel.readStrongBinder());
                    AbstractC3830qb.c(parcel);
                    W2(readString4, readString5, x13, D04, interfaceC3960rm, t72);
                    parcel2.writeNoException();
                    break;
                case 15:
                    InterfaceC5852a D05 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                    AbstractC3830qb.c(parcel);
                    boolean g02 = g0(D05);
                    parcel2.writeNoException();
                    parcel2.writeInt(g02 ? 1 : 0);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    D2.X1 x14 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                    InterfaceC5852a D06 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        c4396vm2 = queryLocalInterface4 instanceof InterfaceC4723ym ? (InterfaceC4723ym) queryLocalInterface4 : new C4396vm(readStrongBinder4);
                    }
                    InterfaceC4723ym interfaceC4723ym = c4396vm2;
                    InterfaceC1457Jl t73 = AbstractBinderC1422Il.t7(parcel.readStrongBinder());
                    AbstractC3830qb.c(parcel);
                    j6(readString6, readString7, x14, D06, interfaceC4723ym, t73);
                    parcel2.writeNoException();
                    break;
                case 17:
                    InterfaceC5852a D07 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                    AbstractC3830qb.c(parcel);
                    boolean u32 = u3(D07);
                    parcel2.writeNoException();
                    parcel2.writeInt(u32 ? 1 : 0);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    D2.X1 x15 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                    InterfaceC5852a D08 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        c4069sm2 = queryLocalInterface5 instanceof InterfaceC4287um ? (InterfaceC4287um) queryLocalInterface5 : new C4069sm(readStrongBinder5);
                    }
                    InterfaceC4287um interfaceC4287um = c4069sm2;
                    InterfaceC1457Jl t74 = AbstractBinderC1422Il.t7(parcel.readStrongBinder());
                    AbstractC3830qb.c(parcel);
                    N1(readString8, readString9, x15, D08, interfaceC4287um, t74);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    AbstractC3830qb.c(parcel);
                    G0(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    D2.X1 x16 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                    InterfaceC5852a D09 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        c4396vm = queryLocalInterface6 instanceof InterfaceC4723ym ? (InterfaceC4723ym) queryLocalInterface6 : new C4396vm(readStrongBinder6);
                    }
                    InterfaceC4723ym interfaceC4723ym2 = c4396vm;
                    InterfaceC1457Jl t75 = AbstractBinderC1422Il.t7(parcel.readStrongBinder());
                    AbstractC3830qb.c(parcel);
                    k7(readString11, readString12, x16, D09, interfaceC4723ym2, t75);
                    parcel2.writeNoException();
                    break;
                case C1445Je.zzm /* 21 */:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    D2.X1 x17 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                    InterfaceC5852a D010 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        c3416mm = queryLocalInterface7 instanceof InterfaceC3634om ? (InterfaceC3634om) queryLocalInterface7 : new C3416mm(readStrongBinder7);
                    }
                    InterfaceC3634om interfaceC3634om2 = c3416mm;
                    InterfaceC1457Jl t76 = AbstractBinderC1422Il.t7(parcel.readStrongBinder());
                    D2.c2 c2Var3 = (D2.c2) AbstractC3830qb.a(parcel, D2.c2.CREATOR);
                    AbstractC3830qb.c(parcel);
                    c5(readString13, readString14, x17, D010, interfaceC3634om2, t76, c2Var3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    D2.X1 x18 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                    InterfaceC5852a D011 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        c4069sm = queryLocalInterface8 instanceof InterfaceC4287um ? (InterfaceC4287um) queryLocalInterface8 : new C4069sm(readStrongBinder8);
                    }
                    InterfaceC4287um interfaceC4287um2 = c4069sm;
                    InterfaceC1457Jl t77 = AbstractBinderC1422Il.t7(parcel.readStrongBinder());
                    C1553Mg c1553Mg = (C1553Mg) AbstractC3830qb.a(parcel, C1553Mg.CREATOR);
                    AbstractC3830qb.c(parcel);
                    g5(readString15, readString16, x18, D011, interfaceC4287um2, t77, c1553Mg);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    D2.X1 x19 = (D2.X1) AbstractC3830qb.a(parcel, D2.X1.CREATOR);
                    InterfaceC5852a D012 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        c3089jm = queryLocalInterface9 instanceof InterfaceC3307lm ? (InterfaceC3307lm) queryLocalInterface9 : new C3089jm(readStrongBinder9);
                    }
                    InterfaceC3307lm interfaceC3307lm = c3089jm;
                    InterfaceC1457Jl t78 = AbstractBinderC1422Il.t7(parcel.readStrongBinder());
                    AbstractC3830qb.c(parcel);
                    o3(readString17, readString18, x19, D012, interfaceC3307lm, t78);
                    parcel2.writeNoException();
                    break;
                case 24:
                    InterfaceC5852a D013 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                    AbstractC3830qb.c(parcel);
                    boolean X7 = X(D013);
                    parcel2.writeNoException();
                    parcel2.writeInt(X7 ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            AbstractC3830qb.c(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
