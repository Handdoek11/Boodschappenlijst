package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Io, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1425Io extends AbstractBinderC3721pb implements InterfaceC1460Jo {
    public AbstractBinderC1425Io() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String a8 = a();
            parcel2.writeNoException();
            parcel2.writeString(a8);
        } else {
            if (i8 != 2) {
                return false;
            }
            int zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeInt(zzb);
        }
        return true;
    }
}
