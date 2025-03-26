package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Dh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1235Dh extends AbstractBinderC3721pb implements InterfaceC1271Eh {
    public AbstractBinderC1235Dh() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static InterfaceC1271Eh t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return queryLocalInterface instanceof InterfaceC1271Eh ? (InterfaceC1271Eh) queryLocalInterface : new C1199Ch(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC3842qh c3624oh;
        if (i8 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c3624oh = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            c3624oh = queryLocalInterface instanceof InterfaceC3842qh ? (InterfaceC3842qh) queryLocalInterface : new C3624oh(readStrongBinder);
        }
        AbstractC3830qb.c(parcel);
        g4(c3624oh);
        parcel2.writeNoException();
        return true;
    }
}
