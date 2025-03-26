package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ch, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1199Ch extends AbstractC3612ob implements InterfaceC1271Eh {
    C1199Ch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1271Eh
    public final void g4(InterfaceC3842qh interfaceC3842qh) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC3842qh);
        J0(1, w02);
    }
}
