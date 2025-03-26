package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class V0 extends Y implements T0 {
    V0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.T0
    public final void R(Bundle bundle) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, bundle);
        J0(1, w02);
    }
}
