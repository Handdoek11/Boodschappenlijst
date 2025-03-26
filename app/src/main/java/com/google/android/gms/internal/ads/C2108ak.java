package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ak, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2108ak extends AbstractC3612ob implements InterfaceC2325ck {
    C2108ak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2325ck
    public final void D(int i8) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        J0(2, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2325ck
    public final void c() {
        J0(1, w0());
    }
}
