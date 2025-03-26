package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.Tg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1798Tg extends AbstractBinderC3721pb implements InterfaceC1833Ug {
    public AbstractBinderC1798Tg() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        C1307Fh c1307Fh;
        switch (i8) {
            case 2:
                float b8 = b();
                parcel2.writeNoException();
                parcel2.writeFloat(b8);
                return true;
            case 3:
                InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                U(D02);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC5852a f8 = f();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, f8);
                return true;
            case 5:
                float g8 = g();
                parcel2.writeNoException();
                parcel2.writeFloat(g8);
                return true;
            case 6:
                float c8 = c();
                parcel2.writeNoException();
                parcel2.writeFloat(c8);
                return true;
            case 7:
                D2.Y0 e8 = e();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, e8);
                return true;
            case 8:
                boolean j8 = j();
                parcel2.writeNoException();
                int i10 = AbstractC3830qb.f25953b;
                parcel2.writeInt(j8 ? 1 : 0);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c1307Fh = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    c1307Fh = queryLocalInterface instanceof C1307Fh ? (C1307Fh) queryLocalInterface : new C1307Fh(readStrongBinder);
                }
                AbstractC3830qb.c(parcel);
                Q3(c1307Fh);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean i11 = i();
                parcel2.writeNoException();
                int i12 = AbstractC3830qb.f25953b;
                parcel2.writeInt(i11 ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
