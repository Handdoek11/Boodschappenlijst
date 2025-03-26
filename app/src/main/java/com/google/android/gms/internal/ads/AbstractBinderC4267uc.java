package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.uc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4267uc extends AbstractBinderC3721pb implements InterfaceC4376vc {
    public AbstractBinderC4267uc() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static InterfaceC4376vc t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof InterfaceC4376vc ? (InterfaceC4376vc) queryLocalInterface : new C4158tc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC4049sc c3832qc;
        if (i8 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c3832qc = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                c3832qc = queryLocalInterface instanceof InterfaceC4049sc ? (InterfaceC4049sc) queryLocalInterface : new C3832qc(readStrongBinder);
            }
            AbstractC3830qb.c(parcel);
            P0(c3832qc);
        } else if (i8 == 2) {
            parcel.readInt();
            AbstractC3830qb.c(parcel);
        } else {
            if (i8 != 3) {
                return false;
            }
            D2.W0 w02 = (D2.W0) AbstractC3830qb.a(parcel, D2.W0.CREATOR);
            AbstractC3830qb.c(parcel);
            L3(w02);
        }
        parcel2.writeNoException();
        return true;
    }
}
