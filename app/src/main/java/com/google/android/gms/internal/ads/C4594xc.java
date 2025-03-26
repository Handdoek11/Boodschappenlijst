package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.xc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4594xc extends AbstractC3612ob implements InterfaceC4812zc {
    C4594xc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4812zc
    public final void a() {
        J0(2, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4812zc
    public final void b() {
        J0(4, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4812zc
    public final void c() {
        J0(1, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4812zc
    public final void m0(D2.W0 w02) {
        Parcel w03 = w0();
        AbstractC3830qb.d(w03, w02);
        J0(3, w03);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4812zc
    public final void zzb() {
        J0(5, w0());
    }
}
