package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.io, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2985io extends AbstractC3612ob implements InterfaceC3202ko {
    C2985io(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3202ko
    public final void a4(C4618xo c4618xo, InterfaceC3747po interfaceC3747po) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, c4618xo);
        AbstractC3830qb.f(w02, interfaceC3747po);
        J0(5, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3202ko
    public final void h3(C4618xo c4618xo, InterfaceC3747po interfaceC3747po) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, c4618xo);
        AbstractC3830qb.f(w02, interfaceC3747po);
        J0(4, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3202ko
    public final void o1(C4618xo c4618xo, InterfaceC3747po interfaceC3747po) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, c4618xo);
        AbstractC3830qb.f(w02, interfaceC3747po);
        J0(6, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3202ko
    public final void r4(String str, InterfaceC3747po interfaceC3747po) {
        Parcel w02 = w0();
        w02.writeString(str);
        AbstractC3830qb.f(w02, interfaceC3747po);
        J0(7, w02);
    }
}
