package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.play_billing.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5083b extends AbstractBinderC5119h implements InterfaceC5089c {
    public AbstractBinderC5083b() {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractBinderC5119h
    protected final boolean w0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC5125i.a(parcel, Bundle.CREATOR);
        AbstractC5125i.b(parcel);
        R(bundle);
        parcel2.writeNoException();
        return true;
    }
}
