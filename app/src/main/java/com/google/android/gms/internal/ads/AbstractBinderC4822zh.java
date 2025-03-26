package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.zh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4822zh extends AbstractBinderC3721pb implements InterfaceC1163Bh {
    public AbstractBinderC4822zh() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static InterfaceC1163Bh t7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return queryLocalInterface instanceof InterfaceC1163Bh ? (InterfaceC1163Bh) queryLocalInterface : new C4713yh(iBinder);
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
        String readString = parcel.readString();
        AbstractC3830qb.c(parcel);
        Z3(c3624oh, readString);
        parcel2.writeNoException();
        return true;
    }
}
