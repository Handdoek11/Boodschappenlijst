package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Lj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1525Lj extends AbstractC3612ob implements InterfaceC1594Nj {
    C1525Lj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1594Nj
    public final void c() {
        J0(2, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1594Nj
    public final void n(String str) {
        Parcel w02 = w0();
        w02.writeString(str);
        J0(3, w02);
    }
}
