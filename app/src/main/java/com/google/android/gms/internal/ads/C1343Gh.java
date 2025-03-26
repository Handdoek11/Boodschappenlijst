package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.Gh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1343Gh extends AbstractC3612ob implements InterfaceC1415Ih {
    C1343Gh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1415Ih
    public final void F5(D2.V v7, InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, v7);
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(1, w02);
    }
}
