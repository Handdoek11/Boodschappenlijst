package com.google.android.gms.internal.ads;

import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.Bf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1159Bf extends AbstractBinderC3721pb implements InterfaceC1195Cf {
    public AbstractBinderC1159Bf() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
        } else if (i8 == 2) {
            String a8 = a();
            parcel2.writeNoException();
            parcel2.writeString(a8);
        } else if (i8 == 3) {
            InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
            AbstractC3830qb.c(parcel);
            l0(D02);
            parcel2.writeNoException();
        } else if (i8 == 4) {
            b();
            parcel2.writeNoException();
        } else {
            if (i8 != 5) {
                return false;
            }
            c();
            parcel2.writeNoException();
        }
        return true;
    }
}
