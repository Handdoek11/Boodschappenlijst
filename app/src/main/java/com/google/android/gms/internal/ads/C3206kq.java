package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.kq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3206kq extends AbstractC3612ob implements InterfaceC3424mq {
    C3206kq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3424mq
    public final InterfaceC3097jq p0(InterfaceC5852a interfaceC5852a, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        InterfaceC3097jq c2881hq;
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.f(w02, interfaceC1242Dl);
        w02.writeInt(244410000);
        Parcel D02 = D0(2, w02);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c2881hq = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c2881hq = queryLocalInterface instanceof InterfaceC3097jq ? (InterfaceC3097jq) queryLocalInterface : new C2881hq(readStrongBinder);
        }
        D02.recycle();
        return c2881hq;
    }
}
