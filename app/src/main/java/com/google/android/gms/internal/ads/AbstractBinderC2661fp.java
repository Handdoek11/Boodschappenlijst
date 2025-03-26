package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.fp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2661fp extends AbstractBinderC3721pb implements InterfaceC2770gp {
    public AbstractBinderC2661fp() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC2118ap c1984Yo;
        switch (i8) {
            case 1:
                h();
                break;
            case 2:
                g();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c1984Yo = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c1984Yo = queryLocalInterface instanceof InterfaceC2118ap ? (InterfaceC2118ap) queryLocalInterface : new C1984Yo(readStrongBinder);
                }
                AbstractC3830qb.c(parcel);
                g2(c1984Yo);
                break;
            case 4:
                int readInt = parcel.readInt();
                AbstractC3830qb.c(parcel);
                G(readInt);
                break;
            case 5:
                D2.W0 w02 = (D2.W0) AbstractC3830qb.a(parcel, D2.W0.CREATOR);
                AbstractC3830qb.c(parcel);
                y1(w02);
                break;
            case 6:
                c();
                break;
            case 7:
                b();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
