package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Zo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2019Zo extends AbstractBinderC3721pb implements InterfaceC2118ap {
    public AbstractBinderC2019Zo() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static InterfaceC2118ap t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return queryLocalInterface instanceof InterfaceC2118ap ? (InterfaceC2118ap) queryLocalInterface : new C1984Yo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String c8 = c();
            parcel2.writeNoException();
            parcel2.writeString(c8);
        } else {
            if (i8 != 2) {
                return false;
            }
            int b8 = b();
            parcel2.writeNoException();
            parcel2.writeInt(b8);
        }
        return true;
    }
}
