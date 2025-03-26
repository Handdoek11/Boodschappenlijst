package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.nn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3527nn extends AbstractC3612ob implements InterfaceC3854qn {
    C3527nn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3854qn
    public final InterfaceC3418mn p0(InterfaceC5852a interfaceC5852a, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        InterfaceC3418mn c3200kn;
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.f(w02, interfaceC1242Dl);
        w02.writeInt(244410000);
        Parcel D02 = D0(1, w02);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c3200kn = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c3200kn = queryLocalInterface instanceof InterfaceC3418mn ? (InterfaceC3418mn) queryLocalInterface : new C3200kn(readStrongBinder);
        }
        D02.recycle();
        return c3200kn;
    }
}
