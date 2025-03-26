package com.google.android.gms.internal.ads;

import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.nm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3525nm extends AbstractBinderC3721pb implements InterfaceC3634om {
    public AbstractBinderC3525nm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
            AbstractC3830qb.c(parcel);
            H0(D02);
        } else if (i8 == 2) {
            String readString = parcel.readString();
            AbstractC3830qb.c(parcel);
            n(readString);
        } else if (i8 == 3) {
            D2.W0 w02 = (D2.W0) AbstractC3830qb.a(parcel, D2.W0.CREATOR);
            AbstractC3830qb.c(parcel);
            y(w02);
        } else {
            if (i8 != 4) {
                return false;
            }
            InterfaceC1561Ml t7 = AbstractBinderC1527Ll.t7(parcel.readStrongBinder());
            AbstractC3830qb.c(parcel);
            M5(t7);
        }
        parcel2.writeNoException();
        return true;
    }
}
