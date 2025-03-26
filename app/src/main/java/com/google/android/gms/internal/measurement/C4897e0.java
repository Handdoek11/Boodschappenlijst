package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4897e0 extends Y implements InterfaceC4888d0 {
    C4897e0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4888d0
    public final Bundle R(Bundle bundle) {
        Parcel w02 = w0();
        AbstractC4861a0.d(w02, bundle);
        Parcel D02 = D0(1, w02);
        Bundle bundle2 = (Bundle) AbstractC4861a0.a(D02, Bundle.CREATOR);
        D02.recycle();
        return bundle2;
    }
}
