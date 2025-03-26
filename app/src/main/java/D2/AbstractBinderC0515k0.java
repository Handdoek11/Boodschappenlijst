package D2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1206Cl;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractBinderC3846qj;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import com.google.android.gms.internal.ads.InterfaceC1564Mo;
import com.google.android.gms.internal.ads.InterfaceC2319ch;
import com.google.android.gms.internal.ads.InterfaceC2443dp;
import com.google.android.gms.internal.ads.InterfaceC2863hh;
import com.google.android.gms.internal.ads.InterfaceC3097jq;
import com.google.android.gms.internal.ads.InterfaceC3418mn;
import com.google.android.gms.internal.ads.InterfaceC3954rj;
import com.google.android.gms.internal.ads.InterfaceC4172tj;
import com.google.android.gms.internal.ads.InterfaceC4289un;
import i3.InterfaceC5852a;

/* renamed from: D2.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0515k0 extends AbstractBinderC3721pb implements InterfaceC0518l0 {
    public AbstractBinderC0515k0() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                c2 c2Var = (c2) AbstractC3830qb.a(parcel, c2.CREATOR);
                String readString = parcel.readString();
                InterfaceC1242Dl t7 = AbstractBinderC1206Cl.t7(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                AbstractC3830qb.c(parcel);
                V F32 = F3(D02, c2Var, readString, t7, readInt);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, F32);
                return true;
            case 2:
                InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                c2 c2Var2 = (c2) AbstractC3830qb.a(parcel, c2.CREATOR);
                String readString2 = parcel.readString();
                InterfaceC1242Dl t72 = AbstractBinderC1206Cl.t7(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                AbstractC3830qb.c(parcel);
                V A42 = A4(D03, c2Var2, readString2, t72, readInt2);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, A42);
                return true;
            case 3:
                InterfaceC5852a D04 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                InterfaceC1242Dl t73 = AbstractBinderC1206Cl.t7(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                AbstractC3830qb.c(parcel);
                Q z22 = z2(D04, readString3, t73, readInt3);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, z22);
                return true;
            case 4:
                InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, null);
                return true;
            case 5:
                InterfaceC5852a D05 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC5852a D06 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                InterfaceC2319ch b62 = b6(D05, D06);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, b62);
                return true;
            case 6:
                InterfaceC5852a D07 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC1242Dl t74 = AbstractBinderC1206Cl.t7(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                AbstractC3830qb.c(parcel);
                InterfaceC1564Mo M02 = M0(D07, t74, readInt4);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, M02);
                return true;
            case 7:
                InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, null);
                return true;
            case 8:
                InterfaceC5852a D08 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                InterfaceC4289un v02 = v0(D08);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, v02);
                return true;
            case 9:
                InterfaceC5852a D09 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                AbstractC3830qb.c(parcel);
                InterfaceC0547v0 N32 = N3(D09, readInt5);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, N32);
                return true;
            case 10:
                InterfaceC5852a D010 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                c2 c2Var3 = (c2) AbstractC3830qb.a(parcel, c2.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                AbstractC3830qb.c(parcel);
                V V52 = V5(D010, c2Var3, readString4, readInt6);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, V52);
                return true;
            case 11:
                InterfaceC5852a D011 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC5852a D012 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC5852a D013 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                InterfaceC2863hh L62 = L6(D011, D012, D013);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, L62);
                return true;
            case 12:
                InterfaceC5852a D014 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                InterfaceC1242Dl t75 = AbstractBinderC1206Cl.t7(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                AbstractC3830qb.c(parcel);
                InterfaceC2443dp O62 = O6(D014, readString5, t75, readInt7);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, O62);
                return true;
            case 13:
                InterfaceC5852a D015 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                c2 c2Var4 = (c2) AbstractC3830qb.a(parcel, c2.CREATOR);
                String readString6 = parcel.readString();
                InterfaceC1242Dl t76 = AbstractBinderC1206Cl.t7(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                AbstractC3830qb.c(parcel);
                V F22 = F2(D015, c2Var4, readString6, t76, readInt8);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, F22);
                return true;
            case 14:
                InterfaceC5852a D016 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC1242Dl t77 = AbstractBinderC1206Cl.t7(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                AbstractC3830qb.c(parcel);
                InterfaceC3097jq L52 = L5(D016, t77, readInt9);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, L52);
                return true;
            case 15:
                InterfaceC5852a D017 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC1242Dl t78 = AbstractBinderC1206Cl.t7(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                AbstractC3830qb.c(parcel);
                InterfaceC3418mn K22 = K2(D017, t78, readInt10);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, K22);
                return true;
            case 16:
                InterfaceC5852a D018 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC1242Dl t79 = AbstractBinderC1206Cl.t7(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                InterfaceC3954rj t710 = AbstractBinderC3846qj.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                InterfaceC4172tj W12 = W1(D018, t79, readInt11, t710);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, W12);
                return true;
            case 17:
                InterfaceC5852a D019 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC1242Dl t711 = AbstractBinderC1206Cl.t7(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                AbstractC3830qb.c(parcel);
                Q0 d62 = d6(D019, t711, readInt12);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, d62);
                return true;
            case 18:
                InterfaceC5852a D020 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                InterfaceC1242Dl t712 = AbstractBinderC1206Cl.t7(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                AbstractC3830qb.c(parcel);
                InterfaceC0497e0 h12 = h1(D020, t712, readInt13);
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, h12);
                return true;
            default:
                return false;
        }
    }
}
