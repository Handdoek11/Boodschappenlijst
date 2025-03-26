package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Aj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1131Aj extends AbstractBinderC3721pb implements InterfaceC1167Bj {
    public AbstractBinderC1131Aj() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC3830qb.a(parcel, ParcelFileDescriptor.CREATOR);
        AbstractC3830qb.c(parcel);
        S0(parcelFileDescriptor);
        return true;
    }
}
