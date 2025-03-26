package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.tm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4178tm extends AbstractBinderC3721pb implements InterfaceC4287um {
    public AbstractBinderC4178tm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            InterfaceC1771Sl t7 = AbstractBinderC1736Rl.t7(parcel.readStrongBinder());
            AbstractC3830qb.c(parcel);
            g3(t7);
        } else if (i8 == 2) {
            String readString = parcel.readString();
            AbstractC3830qb.c(parcel);
            n(readString);
        } else {
            if (i8 != 3) {
                return false;
            }
            D2.W0 w02 = (D2.W0) AbstractC3830qb.a(parcel, D2.W0.CREATOR);
            AbstractC3830qb.c(parcel);
            y(w02);
        }
        parcel2.writeNoException();
        return true;
    }
}
