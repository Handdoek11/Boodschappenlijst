package com.google.android.gms.internal.play_billing;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.play_billing.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5149m extends AbstractBinderC5119h implements InterfaceC5155n {
    public AbstractBinderC5149m() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractBinderC5119h
    protected final boolean w0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        AbstractC5125i.b(parcel);
        m(readInt);
        return true;
    }
}
