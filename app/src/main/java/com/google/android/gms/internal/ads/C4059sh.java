package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.sh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4059sh extends AbstractC3612ob implements InterfaceC4277uh {
    C4059sh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4277uh
    public final void C1(InterfaceC3297lh interfaceC3297lh) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC3297lh);
        J0(1, w02);
    }
}
