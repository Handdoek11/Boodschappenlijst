package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.kn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3200kn extends AbstractC3612ob implements InterfaceC3418mn {
    C3200kn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3418mn
    public final void H0(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(4, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3418mn
    public final void K0(Intent intent) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, intent);
        J0(1, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3418mn
    public final void P5(String[] strArr, int[] iArr, InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        w02.writeStringArray(strArr);
        w02.writeIntArray(iArr);
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(5, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3418mn
    public final void e() {
        J0(3, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3418mn
    public final void q7(InterfaceC5852a interfaceC5852a, E2.a aVar) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.d(w02, aVar);
        J0(6, w02);
    }
}
