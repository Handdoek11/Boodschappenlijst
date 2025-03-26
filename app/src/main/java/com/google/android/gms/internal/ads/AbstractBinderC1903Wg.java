package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.Wg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1903Wg extends AbstractBinderC3721pb implements InterfaceC1938Xg {
    public AbstractBinderC1903Wg() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static InterfaceC1938Xg t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof InterfaceC1938Xg ? (InterfaceC1938Xg) queryLocalInterface : new C1868Vg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            InterfaceC5852a c8 = c();
            parcel2.writeNoException();
            AbstractC3830qb.f(parcel2, c8);
        } else if (i8 == 2) {
            Uri b8 = b();
            parcel2.writeNoException();
            AbstractC3830qb.e(parcel2, b8);
        } else if (i8 == 3) {
            double zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(zzb);
        } else if (i8 == 4) {
            int d8 = d();
            parcel2.writeNoException();
            parcel2.writeInt(d8);
        } else {
            if (i8 != 5) {
                return false;
            }
            int a8 = a();
            parcel2.writeNoException();
            parcel2.writeInt(a8);
        }
        return true;
    }
}
