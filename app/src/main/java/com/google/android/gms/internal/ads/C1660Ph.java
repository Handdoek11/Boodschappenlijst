package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ph, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1660Ph extends AbstractC3612ob implements InterfaceC1695Qh {
    C1660Ph(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695Qh
    public final void E(String str) {
        Parcel w02 = w0();
        w02.writeString(str);
        J0(1, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695Qh
    public final void b() {
        J0(2, w0());
    }
}
