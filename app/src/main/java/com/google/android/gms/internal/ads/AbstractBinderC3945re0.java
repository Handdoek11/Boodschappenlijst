package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.re0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3945re0 extends AbstractBinderC3721pb implements InterfaceC4054se0 {
    public AbstractBinderC3945re0() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC3830qb.a(parcel, Bundle.CREATOR);
        AbstractC3830qb.c(parcel);
        Y4(bundle);
        return true;
    }
}
