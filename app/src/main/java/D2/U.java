package D2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1208Cn;
import com.google.android.gms.internal.ads.AbstractBinderC1267Ef;
import com.google.android.gms.internal.ads.AbstractBinderC1316Fn;
import com.google.android.gms.internal.ads.AbstractBinderC1669Po;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractBinderC4267uc;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import com.google.android.gms.internal.ads.C1445Je;
import com.google.android.gms.internal.ads.InterfaceC1244Dn;
import com.google.android.gms.internal.ads.InterfaceC1303Ff;
import com.google.android.gms.internal.ads.InterfaceC1352Gn;
import com.google.android.gms.internal.ads.InterfaceC1704Qo;
import com.google.android.gms.internal.ads.InterfaceC4376vc;
import i3.InterfaceC5852a;

/* loaded from: classes.dex */
public abstract class U extends AbstractBinderC3721pb implements V {
    public U() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        H h8 = null;
        InterfaceC0530p0 interfaceC0530p0 = null;
        K k8 = null;
        N0 n02 = null;
        InterfaceC0485a0 interfaceC0485a0 = null;
        C0521m0 c0521m0 = null;
        E e8 = null;
        InterfaceC0509i0 interfaceC0509i0 = null;
        switch (i8) {
            case 1:
                InterfaceC5852a l8 = l();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, l8);
                return true;
            case 2:
                B();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean e02 = e0();
                parcel2.writeNoException();
                int i10 = AbstractC3830qb.f25953b;
                parcel2.writeInt(e02 ? 1 : 0);
                return true;
            case 4:
                X1 x12 = (X1) AbstractC3830qb.a(parcel, X1.CREATOR);
                AbstractC3830qb.c(parcel);
                boolean T32 = T3(x12);
                parcel2.writeNoException();
                parcel2.writeInt(T32 ? 1 : 0);
                return true;
            case 5:
                I();
                parcel2.writeNoException();
                return true;
            case 6:
                c0();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    h8 = queryLocalInterface instanceof H ? (H) queryLocalInterface : new F(readStrongBinder);
                }
                AbstractC3830qb.c(parcel);
                J5(h8);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    interfaceC0509i0 = queryLocalInterface2 instanceof InterfaceC0509i0 ? (InterfaceC0509i0) queryLocalInterface2 : new C0503g0(readStrongBinder2);
                }
                AbstractC3830qb.c(parcel);
                h6(interfaceC0509i0);
                parcel2.writeNoException();
                return true;
            case 9:
                Y();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                f0();
                parcel2.writeNoException();
                return true;
            case 12:
                c2 g8 = g();
                parcel2.writeNoException();
                AbstractC3830qb.e(parcel2, g8);
                return true;
            case 13:
                c2 c2Var = (c2) AbstractC3830qb.a(parcel, c2.CREATOR);
                AbstractC3830qb.c(parcel);
                m5(c2Var);
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC1244Dn t7 = AbstractBinderC1208Cn.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                y3(t7);
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC1352Gn t72 = AbstractBinderC1316Fn.t7(parcel.readStrongBinder());
                String readString = parcel.readString();
                AbstractC3830qb.c(parcel);
                k2(t72, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String s8 = s();
                parcel2.writeNoException();
                parcel2.writeString(s8);
                return true;
            case 19:
                InterfaceC1303Ff t73 = AbstractBinderC1267Ef.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                e3(t73);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    e8 = queryLocalInterface3 instanceof E ? (E) queryLocalInterface3 : new C(readStrongBinder3);
                }
                AbstractC3830qb.c(parcel);
                H2(e8);
                parcel2.writeNoException();
                return true;
            case C1445Je.zzm /* 21 */:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c0521m0 = queryLocalInterface4 instanceof C0521m0 ? (C0521m0) queryLocalInterface4 : new C0521m0(readStrongBinder4);
                }
                AbstractC3830qb.c(parcel);
                a1(c0521m0);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean g9 = AbstractC3830qb.g(parcel);
                AbstractC3830qb.c(parcel);
                f7(g9);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean G62 = G6();
                parcel2.writeNoException();
                int i11 = AbstractC3830qb.f25953b;
                parcel2.writeInt(G62 ? 1 : 0);
                return true;
            case 24:
                InterfaceC1704Qo t74 = AbstractBinderC1669Po.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                l2(t74);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                AbstractC3830qb.c(parcel);
                M2(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                Y0 j8 = j();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, j8);
                return true;
            case 29:
                Q1 q12 = (Q1) AbstractC3830qb.a(parcel, Q1.CREATOR);
                AbstractC3830qb.c(parcel);
                r6(q12);
                parcel2.writeNoException();
                return true;
            case 30:
                C0492c1 c0492c1 = (C0492c1) AbstractC3830qb.a(parcel, C0492c1.CREATOR);
                AbstractC3830qb.c(parcel);
                Q5(c0492c1);
                parcel2.writeNoException();
                return true;
            case 31:
                String r8 = r();
                parcel2.writeNoException();
                parcel2.writeString(r8);
                return true;
            case 32:
                InterfaceC0509i0 h9 = h();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, h9);
                return true;
            case 33:
                H f8 = f();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, f8);
                return true;
            case 34:
                boolean g10 = AbstractC3830qb.g(parcel);
                AbstractC3830qb.c(parcel);
                I5(g10);
                parcel2.writeNoException();
                return true;
            case 35:
                String t8 = t();
                parcel2.writeNoException();
                parcel2.writeString(t8);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    interfaceC0485a0 = queryLocalInterface5 instanceof InterfaceC0485a0 ? (InterfaceC0485a0) queryLocalInterface5 : new Y(readStrongBinder5);
                }
                AbstractC3830qb.c(parcel);
                S1(interfaceC0485a0);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle d8 = d();
                parcel2.writeNoException();
                AbstractC3830qb.e(parcel2, d8);
                return true;
            case 38:
                String readString3 = parcel.readString();
                AbstractC3830qb.c(parcel);
                V0(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                i2 i2Var = (i2) AbstractC3830qb.a(parcel, i2.CREATOR);
                AbstractC3830qb.c(parcel);
                y4(i2Var);
                parcel2.writeNoException();
                return true;
            case 40:
                InterfaceC4376vc t75 = AbstractBinderC4267uc.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                B6(t75);
                parcel2.writeNoException();
                return true;
            case 41:
                U0 i12 = i();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, i12);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    n02 = queryLocalInterface6 instanceof N0 ? (N0) queryLocalInterface6 : new L0(readStrongBinder6);
                }
                AbstractC3830qb.c(parcel);
                i3(n02);
                parcel2.writeNoException();
                return true;
            case 43:
                X1 x13 = (X1) AbstractC3830qb.a(parcel, X1.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    k8 = queryLocalInterface7 instanceof K ? (K) queryLocalInterface7 : new I(readStrongBinder7);
                }
                AbstractC3830qb.c(parcel);
                R4(x13, k8);
                parcel2.writeNoException();
                return true;
            case 44:
                InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                S5(D02);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    interfaceC0530p0 = queryLocalInterface8 instanceof InterfaceC0530p0 ? (InterfaceC0530p0) queryLocalInterface8 : new C0524n0(readStrongBinder8);
                }
                AbstractC3830qb.c(parcel);
                v4(interfaceC0530p0);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean F02 = F0();
                parcel2.writeNoException();
                int i13 = AbstractC3830qb.f25953b;
                parcel2.writeInt(F02 ? 1 : 0);
                return true;
        }
    }
}
