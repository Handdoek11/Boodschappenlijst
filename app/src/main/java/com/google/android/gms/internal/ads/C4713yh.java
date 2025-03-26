package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.yh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4713yh extends AbstractC3612ob implements InterfaceC1163Bh {
    C4713yh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1163Bh
    public final void Z3(InterfaceC3842qh interfaceC3842qh, String str) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC3842qh);
        w02.writeString(str);
        J0(1, w02);
    }
}
