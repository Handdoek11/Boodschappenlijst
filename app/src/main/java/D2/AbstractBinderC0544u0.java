package D2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1206Cl;
import com.google.android.gms.internal.ads.AbstractBinderC1664Pj;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import com.google.android.gms.internal.ads.InterfaceC1699Qj;
import i3.InterfaceC5852a;
import java.util.List;

/* renamed from: D2.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0544u0 extends AbstractBinderC3721pb implements InterfaceC0547v0 {
    public AbstractBinderC0544u0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        H0 f02;
        switch (i8) {
            case 1:
                i();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                AbstractC3830qb.c(parcel);
                t0(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                AbstractC3830qb.c(parcel);
                E5(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean g8 = AbstractC3830qb.g(parcel);
                AbstractC3830qb.c(parcel);
                l7(g8);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                AbstractC3830qb.c(parcel);
                A6(D02, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                U0(readString3, D03);
                parcel2.writeNoException();
                return true;
            case 7:
                float b8 = b();
                parcel2.writeNoException();
                parcel2.writeFloat(b8);
                return true;
            case 8:
                boolean u7 = u();
                parcel2.writeNoException();
                int i10 = AbstractC3830qb.f25953b;
                parcel2.writeInt(u7 ? 1 : 0);
                return true;
            case 9:
                String c8 = c();
                parcel2.writeNoException();
                parcel2.writeString(c8);
                return true;
            case 10:
                String readString4 = parcel.readString();
                AbstractC3830qb.c(parcel);
                b0(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC1242Dl t7 = AbstractBinderC1206Cl.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                Z0(t7);
                parcel2.writeNoException();
                return true;
            case 12:
                InterfaceC1699Qj t72 = AbstractBinderC1664Pj.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                X2(t72);
                parcel2.writeNoException();
                return true;
            case 13:
                List g9 = g();
                parcel2.writeNoException();
                parcel2.writeTypedList(g9);
                return true;
            case 14:
                K1 k12 = (K1) AbstractC3830qb.a(parcel, K1.CREATOR);
                AbstractC3830qb.c(parcel);
                b4(k12);
                parcel2.writeNoException();
                return true;
            case 15:
                f();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    f02 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    f02 = queryLocalInterface instanceof H0 ? (H0) queryLocalInterface : new F0(readStrongBinder);
                }
                AbstractC3830qb.c(parcel);
                p6(f02);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean g10 = AbstractC3830qb.g(parcel);
                AbstractC3830qb.c(parcel);
                k0(g10);
                parcel2.writeNoException();
                return true;
            case 18:
                String readString5 = parcel.readString();
                AbstractC3830qb.c(parcel);
                Q0(readString5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
