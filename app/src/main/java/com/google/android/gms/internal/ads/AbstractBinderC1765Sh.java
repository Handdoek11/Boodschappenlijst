package com.google.android.gms.internal.ads;

import D2.AbstractBinderC0559z0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Sh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1765Sh extends AbstractBinderC3721pb implements InterfaceC1800Th {
    public AbstractBinderC1765Sh() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC1695Qh c1660Ph;
        switch (i8) {
            case 2:
                String q8 = q();
                parcel2.writeNoException();
                parcel2.writeString(q8);
                return true;
            case 3:
                List x7 = x();
                parcel2.writeNoException();
                parcel2.writeList(x7);
                return true;
            case 4:
                String o8 = o();
                parcel2.writeNoException();
                parcel2.writeString(o8);
                return true;
            case 5:
                InterfaceC1938Xg i10 = i();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, i10);
                return true;
            case 6:
                String p8 = p();
                parcel2.writeNoException();
                parcel2.writeString(p8);
                return true;
            case 7:
                String l8 = l();
                parcel2.writeNoException();
                parcel2.writeString(l8);
                return true;
            case 8:
                double b8 = b();
                parcel2.writeNoException();
                parcel2.writeDouble(b8);
                return true;
            case 9:
                String t7 = t();
                parcel2.writeNoException();
                parcel2.writeString(t7);
                return true;
            case 10:
                String s8 = s();
                parcel2.writeNoException();
                parcel2.writeString(s8);
                return true;
            case 11:
                D2.Y0 e8 = e();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, e8);
                return true;
            case 12:
                String r8 = r();
                parcel2.writeNoException();
                parcel2.writeString(r8);
                return true;
            case 13:
                B();
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC1693Qg f8 = f();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, f8);
                return true;
            case 15:
                Bundle bundle = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
                AbstractC3830qb.c(parcel);
                V6(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
                AbstractC3830qb.c(parcel);
                boolean G42 = G4(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(G42 ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
                AbstractC3830qb.c(parcel);
                o2(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                InterfaceC5852a k8 = k();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, k8);
                return true;
            case 19:
                InterfaceC5852a j8 = j();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, j8);
                return true;
            case 20:
                Bundle c8 = c();
                parcel2.writeNoException();
                AbstractC3830qb.e(parcel2, c8);
                return true;
            case C1445Je.zzm /* 21 */:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c1660Ph = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    c1660Ph = queryLocalInterface instanceof InterfaceC1695Qh ? (InterfaceC1695Qh) queryLocalInterface : new C1660Ph(readStrongBinder);
                }
                AbstractC3830qb.c(parcel);
                q3(c1660Ph);
                parcel2.writeNoException();
                return true;
            case 22:
                w();
                parcel2.writeNoException();
                return true;
            case 23:
                List u7 = u();
                parcel2.writeNoException();
                parcel2.writeList(u7);
                return true;
            case 24:
                boolean F7 = F();
                parcel2.writeNoException();
                int i11 = AbstractC3830qb.f25953b;
                parcel2.writeInt(F7 ? 1 : 0);
                return true;
            case 25:
                D2.D0 t72 = D2.C0.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                U5(t72);
                parcel2.writeNoException();
                return true;
            case 26:
                D2.A0 t73 = AbstractBinderC0559z0.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                K3(t73);
                parcel2.writeNoException();
                return true;
            case 27:
                P();
                parcel2.writeNoException();
                return true;
            case 28:
                f0();
                parcel2.writeNoException();
                return true;
            case 29:
                InterfaceC1833Ug h8 = h();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, h8);
                return true;
            case 30:
                boolean S7 = S();
                parcel2.writeNoException();
                int i12 = AbstractC3830qb.f25953b;
                parcel2.writeInt(S7 ? 1 : 0);
                return true;
            case 31:
                D2.U0 g8 = g();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, g8);
                return true;
            case 32:
                D2.N0 t74 = D2.M0.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                D5(t74);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
                AbstractC3830qb.c(parcel);
                m3(bundle4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
