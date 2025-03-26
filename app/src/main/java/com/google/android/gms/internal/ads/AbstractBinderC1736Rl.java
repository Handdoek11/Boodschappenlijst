package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Rl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1736Rl extends AbstractBinderC3721pb implements InterfaceC1771Sl {
    public AbstractBinderC1736Rl() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static InterfaceC1771Sl t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof InterfaceC1771Sl ? (InterfaceC1771Sl) queryLocalInterface : new C1701Ql(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 2:
                String s8 = s();
                parcel2.writeNoException();
                parcel2.writeString(s8);
                return true;
            case 3:
                List u7 = u();
                parcel2.writeNoException();
                parcel2.writeList(u7);
                return true;
            case 4:
                String q8 = q();
                parcel2.writeNoException();
                parcel2.writeString(q8);
                return true;
            case 5:
                InterfaceC1938Xg j8 = j();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, j8);
                return true;
            case 6:
                String r8 = r();
                parcel2.writeNoException();
                parcel2.writeString(r8);
                return true;
            case 7:
                String p8 = p();
                parcel2.writeNoException();
                parcel2.writeString(p8);
                return true;
            case 8:
                double b8 = b();
                parcel2.writeNoException();
                parcel2.writeDouble(b8);
                return true;
            case 9:
                String x7 = x();
                parcel2.writeNoException();
                parcel2.writeString(x7);
                return true;
            case 10:
                String t7 = t();
                parcel2.writeNoException();
                parcel2.writeString(t7);
                return true;
            case 11:
                D2.Y0 h8 = h();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, h8);
                return true;
            case 12:
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, null);
                return true;
            case 13:
                InterfaceC5852a k8 = k();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, k8);
                return true;
            case 14:
                InterfaceC5852a l8 = l();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, l8);
                return true;
            case 15:
                InterfaceC5852a o8 = o();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, o8);
                return true;
            case 16:
                Bundle f8 = f();
                parcel2.writeNoException();
                AbstractC3830qb.e(parcel2, f8);
                return true;
            case 17:
                boolean c02 = c0();
                parcel2.writeNoException();
                int i10 = AbstractC3830qb.f25953b;
                parcel2.writeInt(c02 ? 1 : 0);
                return true;
            case 18:
                boolean f02 = f0();
                parcel2.writeNoException();
                int i11 = AbstractC3830qb.f25953b;
                parcel2.writeInt(f02 ? 1 : 0);
                return true;
            case 19:
                B();
                parcel2.writeNoException();
                return true;
            case 20:
                InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                u4(D02);
                parcel2.writeNoException();
                return true;
            case C1445Je.zzm /* 21 */:
                InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC5852a D04 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC5852a D05 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                U1(D03, D04, D05);
                parcel2.writeNoException();
                return true;
            case 22:
                InterfaceC5852a D06 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                Y1(D06);
                parcel2.writeNoException();
                return true;
            case 23:
                float c8 = c();
                parcel2.writeNoException();
                parcel2.writeFloat(c8);
                return true;
            case 24:
                float e8 = e();
                parcel2.writeNoException();
                parcel2.writeFloat(e8);
                return true;
            case 25:
                float g8 = g();
                parcel2.writeNoException();
                parcel2.writeFloat(g8);
                return true;
            default:
                return false;
        }
    }
}
