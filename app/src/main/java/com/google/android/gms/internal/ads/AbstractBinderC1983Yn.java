package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Yn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1983Yn extends AbstractBinderC3721pb implements InterfaceC2018Zn {
    public AbstractBinderC1983Yn() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
