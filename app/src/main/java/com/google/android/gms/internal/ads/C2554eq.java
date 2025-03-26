package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.eq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2554eq extends AbstractC3612ob implements InterfaceC2772gq {
    C2554eq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2772gq
    public final void a2(String str, String str2, Bundle bundle) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC3830qb.d(w02, bundle);
        J0(3, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2772gq
    public final void v(String str) {
        Parcel w02 = w0();
        w02.writeString(str);
        J0(2, w02);
    }
}
