package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.iq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2989iq extends AbstractBinderC3721pb implements InterfaceC3097jq {
    public AbstractBinderC2989iq() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static InterfaceC3097jq t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof InterfaceC3097jq ? (InterfaceC3097jq) queryLocalInterface : new C2881hq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC2772gq interfaceC2772gq = null;
        switch (i8) {
            case 1:
                InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                C3533nq c3533nq = (C3533nq) AbstractC3830qb.a(parcel, C3533nq.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    interfaceC2772gq = queryLocalInterface instanceof InterfaceC2772gq ? (InterfaceC2772gq) queryLocalInterface : new C2554eq(readStrongBinder);
                }
                AbstractC3830qb.c(parcel);
                u2(D02, c3533nq, interfaceC2772gq);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                a0(D03);
                parcel2.writeNoException();
                return true;
            case 3:
                InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, null);
                return true;
            case 4:
                InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC5852a D04 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC1459Jn t7 = AbstractBinderC1424In.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                b1(createTypedArrayList, D04, t7);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC5852a D05 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC1459Jn t72 = AbstractBinderC1424In.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                x3(createTypedArrayList2, D05, t72);
                parcel2.writeNoException();
                return true;
            case 7:
                C1598Nn c1598Nn = (C1598Nn) AbstractC3830qb.a(parcel, C1598Nn.CREATOR);
                AbstractC3830qb.c(parcel);
                c1(c1598Nn);
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC5852a D06 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                U(D06);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC5852a D07 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC1459Jn t73 = AbstractBinderC1424In.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                s5(createTypedArrayList3, D07, t73);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC5852a D08 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC1459Jn t74 = AbstractBinderC1424In.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                E4(createTypedArrayList4, D08, t74);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC5852a D09 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC5852a D010 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                String readString = parcel.readString();
                InterfaceC5852a D011 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                InterfaceC5852a R62 = R6(D09, D010, readString, D011);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, R62);
                return true;
            default:
                return false;
        }
    }
}
