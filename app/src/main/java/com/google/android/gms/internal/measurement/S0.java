package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class S0 extends AbstractBinderC4870b0 implements T0 {
    public S0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC4870b0
    protected final boolean w0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC4861a0.a(parcel, Bundle.CREATOR);
        AbstractC4861a0.f(parcel);
        R(bundle);
        parcel2.writeNoException();
        return true;
    }
}
