package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.rc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3940rc extends AbstractBinderC3721pb implements InterfaceC4049sc {
    public AbstractBinderC3940rc() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC4812zc c4594xc;
        switch (i8) {
            case 2:
                D2.V b8 = b();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, b8);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof InterfaceC4485wc) {
                    }
                }
                AbstractC3830qb.c(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    c4594xc = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    c4594xc = queryLocalInterface2 instanceof InterfaceC4812zc ? (InterfaceC4812zc) queryLocalInterface2 : new C4594xc(readStrongBinder2);
                }
                AbstractC3830qb.c(parcel);
                q5(D02, c4594xc);
                parcel2.writeNoException();
                return true;
            case 5:
                D2.U0 c8 = c();
                parcel2.writeNoException();
                AbstractC3830qb.f(parcel2, c8);
                return true;
            case 6:
                boolean g8 = AbstractC3830qb.g(parcel);
                AbstractC3830qb.c(parcel);
                I0(g8);
                parcel2.writeNoException();
                return true;
            case 7:
                D2.N0 t7 = D2.M0.t7(parcel.readStrongBinder());
                AbstractC3830qb.c(parcel);
                l5(t7);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
