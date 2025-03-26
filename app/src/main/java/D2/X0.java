package D2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractC3830qb;

/* loaded from: classes.dex */
public abstract class X0 extends AbstractBinderC3721pb implements Y0 {
    public X0() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static Y0 t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof Y0 ? (Y0) queryLocalInterface : new V0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC0489b1 z02;
        switch (i8) {
            case 1:
                j();
                parcel2.writeNoException();
                return true;
            case 2:
                i();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean g8 = AbstractC3830qb.g(parcel);
                AbstractC3830qb.c(parcel);
                k0(g8);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean q8 = q();
                parcel2.writeNoException();
                int i10 = AbstractC3830qb.f25953b;
                parcel2.writeInt(q8 ? 1 : 0);
                return true;
            case 5:
                int e8 = e();
                parcel2.writeNoException();
                parcel2.writeInt(e8);
                return true;
            case 6:
                float g9 = g();
                parcel2.writeNoException();
                parcel2.writeFloat(g9);
                return true;
            case 7:
                float c8 = c();
                parcel2.writeNoException();
                parcel2.writeFloat(c8);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    z02 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    z02 = queryLocalInterface instanceof InterfaceC0489b1 ? (InterfaceC0489b1) queryLocalInterface : new Z0(readStrongBinder);
                }
                AbstractC3830qb.c(parcel);
                N6(z02);
                parcel2.writeNoException();
                return true;
            case 9:
                float b8 = b();
                parcel2.writeNoException();
                parcel2.writeFloat(b8);
                return true;
            case 10:
                boolean p8 = p();
                parcel2.writeNoException();
                int i11 = AbstractC3830qb.f25953b;
                parcel2.writeInt(p8 ? 1 : 0);
                return true;
            case 11:
                InterfaceC0489b1 f8 = f();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, f8);
                return true;
            case 12:
                boolean o8 = o();
                parcel2.writeNoException();
                int i12 = AbstractC3830qb.f25953b;
                parcel2.writeInt(o8 ? 1 : 0);
                return true;
            case 13:
                l();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
