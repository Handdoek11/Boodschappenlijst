package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.bk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2217bk extends AbstractBinderC3721pb implements InterfaceC2325ck {
    public AbstractBinderC2217bk() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            if (i8 != 2) {
                return false;
            }
            parcel.readInt();
            AbstractC3830qb.c(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
