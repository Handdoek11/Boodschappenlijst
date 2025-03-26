package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.Sg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1763Sg extends AbstractC3612ob implements InterfaceC1833Ug {
    C1763Sg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1833Ug
    public final InterfaceC5852a f() {
        Parcel D02 = D0(4, w0());
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(D02.readStrongBinder());
        D02.recycle();
        return D03;
    }
}
