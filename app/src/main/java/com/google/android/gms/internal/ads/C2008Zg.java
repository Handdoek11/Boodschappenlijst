package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.Zg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2008Zg extends AbstractC3612ob implements InterfaceC2319ch {
    C2008Zg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final void D4(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(3, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final void F1(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(6, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final void L2(String str, InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        w02.writeString(str);
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(1, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final void b7(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(9, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final void l0(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(7, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final void m1(InterfaceC1833Ug interfaceC1833Ug) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC1833Ug);
        J0(8, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final void u1(InterfaceC5852a interfaceC5852a, int i8) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        w02.writeInt(i8);
        J0(5, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2319ch
    public final InterfaceC5852a v(String str) {
        Parcel w02 = w0();
        w02.writeString(str);
        Parcel D02 = D0(2, w02);
        InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(D02.readStrongBinder());
        D02.recycle();
        return D03;
    }
}
