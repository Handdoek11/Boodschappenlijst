package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.pj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3737pj extends AbstractC3612ob implements InterfaceC3954rj {
    C3737pj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3954rj
    public final void v(String str) {
        Parcel w02 = w0();
        w02.writeString(str);
        J0(1, w02);
    }
}
