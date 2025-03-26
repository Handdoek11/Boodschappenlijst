package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class W0 extends Y implements U0 {
    W0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.U0
    public final void J4(String str, String str2, Bundle bundle, long j8) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC4861a0.d(w02, bundle);
        w02.writeLong(j8);
        J0(1, w02);
    }

    @Override // com.google.android.gms.internal.measurement.U0
    public final int zza() {
        Parcel D02 = D0(2, w0());
        int readInt = D02.readInt();
        D02.recycle();
        return readInt;
    }
}
