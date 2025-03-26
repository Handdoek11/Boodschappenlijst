package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4703yc extends AbstractBinderC3721pb implements InterfaceC4812zc {
    public AbstractBinderC4703yc() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            c();
        } else if (i8 == 2) {
            a();
        } else if (i8 == 3) {
            D2.W0 w02 = (D2.W0) AbstractC3830qb.a(parcel, D2.W0.CREATOR);
            AbstractC3830qb.c(parcel);
            m0(w02);
        } else if (i8 == 4) {
            b();
        } else {
            if (i8 != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
