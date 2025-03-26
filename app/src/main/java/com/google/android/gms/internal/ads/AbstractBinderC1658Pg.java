package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Pg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1658Pg extends AbstractBinderC3721pb implements InterfaceC1693Qg {
    public AbstractBinderC1658Pg() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static InterfaceC1693Qg t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof InterfaceC1693Qg ? (InterfaceC1693Qg) queryLocalInterface : new C1623Og(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 2) {
            String g8 = g();
            parcel2.writeNoException();
            parcel2.writeString(g8);
            return true;
        }
        if (i8 != 3) {
            return false;
        }
        List e8 = e();
        parcel2.writeNoException();
        parcel2.writeList(e8);
        return true;
    }
}
