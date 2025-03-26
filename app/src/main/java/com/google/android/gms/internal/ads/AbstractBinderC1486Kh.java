package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Kh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1486Kh extends AbstractBinderC3721pb implements InterfaceC1521Lh {
    public AbstractBinderC1486Kh() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static InterfaceC1521Lh t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return queryLocalInterface instanceof InterfaceC1521Lh ? (InterfaceC1521Lh) queryLocalInterface : new C1451Jh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC1800Th c1730Rh;
        if (i8 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c1730Rh = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            c1730Rh = queryLocalInterface instanceof InterfaceC1800Th ? (InterfaceC1800Th) queryLocalInterface : new C1730Rh(readStrongBinder);
        }
        AbstractC3830qb.c(parcel);
        i4(c1730Rh);
        parcel2.writeNoException();
        return true;
    }
}
