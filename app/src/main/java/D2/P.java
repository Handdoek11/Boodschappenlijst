package D2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1235Dh;
import com.google.android.gms.internal.ads.AbstractBinderC1379Hh;
import com.google.android.gms.internal.ads.AbstractBinderC1486Kh;
import com.google.android.gms.internal.ads.AbstractBinderC2542ek;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractBinderC4168th;
import com.google.android.gms.internal.ads.AbstractBinderC4495wh;
import com.google.android.gms.internal.ads.AbstractBinderC4822zh;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import com.google.android.gms.internal.ads.C1553Mg;
import com.google.android.gms.internal.ads.C1874Vj;
import com.google.android.gms.internal.ads.InterfaceC1163Bh;
import com.google.android.gms.internal.ads.InterfaceC1271Eh;
import com.google.android.gms.internal.ads.InterfaceC1415Ih;
import com.google.android.gms.internal.ads.InterfaceC1521Lh;
import com.google.android.gms.internal.ads.InterfaceC2651fk;
import com.google.android.gms.internal.ads.InterfaceC4277uh;
import com.google.android.gms.internal.ads.InterfaceC4604xh;
import z2.C7066a;
import z2.C7071f;

/* loaded from: classes.dex */
public abstract class P extends AbstractBinderC3721pb implements Q {
    public P() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        H h8 = null;
        C0521m0 c0521m0 = null;
        switch (i8) {
            case 1:
                N b8 = b();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, b8);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    h8 = queryLocalInterface instanceof H ? (H) queryLocalInterface : new F(readStrongBinder);
                }
                AbstractC3830qb.c(parcel);
                X1(h8);
                parcel2.writeNoException();
                return true;
            case 3:
                InterfaceC4277uh t7 = AbstractBinderC4168th.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                q1(t7);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC4604xh t72 = AbstractBinderC4495wh.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                H4(t72);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                InterfaceC1271Eh t73 = AbstractBinderC1235Dh.t7(parcel.readStrongBinder());
                InterfaceC1163Bh t74 = AbstractBinderC4822zh.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                O3(readString, t73, t74);
                parcel2.writeNoException();
                return true;
            case 6:
                C1553Mg c1553Mg = (C1553Mg) AbstractC3830qb.a(parcel, C1553Mg.CREATOR);
                AbstractC3830qb.c(parcel);
                B5(c1553Mg);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c0521m0 = queryLocalInterface2 instanceof C0521m0 ? (C0521m0) queryLocalInterface2 : new C0521m0(readStrongBinder2);
                }
                AbstractC3830qb.c(parcel);
                s2(c0521m0);
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC1415Ih t75 = AbstractBinderC1379Hh.t7(parcel.readStrongBinder());
                c2 c2Var = (c2) AbstractC3830qb.a(parcel, c2.CREATOR);
                AbstractC3830qb.c(parcel);
                Q6(t75, c2Var);
                parcel2.writeNoException();
                return true;
            case 9:
                C7071f c7071f = (C7071f) AbstractC3830qb.a(parcel, C7071f.CREATOR);
                AbstractC3830qb.c(parcel);
                o6(c7071f);
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC1521Lh t76 = AbstractBinderC1486Kh.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                M6(t76);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                C1874Vj c1874Vj = (C1874Vj) AbstractC3830qb.a(parcel, C1874Vj.CREATOR);
                AbstractC3830qb.c(parcel);
                Y2(c1874Vj);
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC2651fk t77 = AbstractBinderC2542ek.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                V2(t77);
                parcel2.writeNoException();
                return true;
            case 15:
                C7066a c7066a = (C7066a) AbstractC3830qb.a(parcel, C7066a.CREATOR);
                AbstractC3830qb.c(parcel);
                d5(c7066a);
                parcel2.writeNoException();
                return true;
        }
    }
}
