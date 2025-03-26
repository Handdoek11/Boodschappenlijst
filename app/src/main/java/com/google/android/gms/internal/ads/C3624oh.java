package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.oh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3624oh extends AbstractC3612ob implements InterfaceC3842qh {
    C3624oh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final boolean X(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        Parcel D02 = D0(17, w02);
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final InterfaceC5852a e() {
        Parcel D02 = D0(9, w0());
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(D02.readStrongBinder());
        D02.recycle();
        return D03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final String f() {
        Parcel D02 = D0(4, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3842qh
    public final boolean g0(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        Parcel D02 = D0(10, w02);
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }
}
