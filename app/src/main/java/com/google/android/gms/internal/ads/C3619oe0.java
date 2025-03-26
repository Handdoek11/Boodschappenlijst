package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.oe0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3619oe0 extends AbstractC3612ob implements InterfaceC3837qe0 {
    C3619oe0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837qe0
    public final void F4(Bundle bundle, InterfaceC4054se0 interfaceC4054se0) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, bundle);
        AbstractC3830qb.f(w02, interfaceC4054se0);
        p2(2, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837qe0
    public final void O5(String str, Bundle bundle, InterfaceC4054se0 interfaceC4054se0) {
        Parcel w02 = w0();
        w02.writeString(str);
        AbstractC3830qb.d(w02, bundle);
        AbstractC3830qb.f(w02, interfaceC4054se0);
        p2(1, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837qe0
    public final void S2(Bundle bundle, InterfaceC4054se0 interfaceC4054se0) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, bundle);
        AbstractC3830qb.f(w02, interfaceC4054se0);
        p2(3, w02);
    }
}
