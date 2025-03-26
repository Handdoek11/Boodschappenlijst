package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.td0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4161td0 extends AbstractC3612ob implements InterfaceC4379vd0 {
    C4161td0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4379vd0
    public final void K(int i8) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        J0(6, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4379vd0
    public final void c() {
        J0(3, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4379vd0
    public final void n0(byte[] bArr) {
        Parcel w02 = w0();
        w02.writeByteArray(bArr);
        J0(5, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4379vd0
    public final void r2(InterfaceC5852a interfaceC5852a, String str, String str2) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        w02.writeString(str);
        w02.writeString(null);
        J0(8, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4379vd0
    public final void z(int i8) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        J0(7, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4379vd0
    public final void z0(int[] iArr) {
        Parcel w02 = w0();
        w02.writeIntArray(null);
        J0(4, w02);
    }
}
