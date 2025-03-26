package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.Yj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1979Yj extends AbstractBinderC3721pb implements InterfaceC2014Zj {
    public AbstractBinderC1979Yj() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC2325ck c2108ak;
        if (i8 == 3) {
            D2.Y0 zzb = zzb();
            parcel2.writeNoException();
            AbstractC3830qb.f(parcel2, zzb);
            return true;
        }
        if (i8 == 4) {
            d();
            parcel2.writeNoException();
            return true;
        }
        if (i8 == 5) {
            InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c2108ak = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                c2108ak = queryLocalInterface instanceof InterfaceC2325ck ? (InterfaceC2325ck) queryLocalInterface : new C2108ak(readStrongBinder);
            }
            AbstractC3830qb.c(parcel);
            Y0(D02, c2108ak);
            parcel2.writeNoException();
            return true;
        }
        if (i8 == 6) {
            InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
            AbstractC3830qb.c(parcel);
            zze(D03);
            parcel2.writeNoException();
            return true;
        }
        if (i8 != 7) {
            return false;
        }
        InterfaceC1833Ug a8 = a();
        parcel2.writeNoException();
        AbstractC3830qb.f(parcel2, a8);
        return true;
    }
}
