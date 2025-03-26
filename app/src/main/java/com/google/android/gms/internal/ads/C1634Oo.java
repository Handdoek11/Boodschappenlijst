package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Oo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1634Oo extends AbstractC3612ob implements InterfaceC1704Qo {
    C1634Oo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1704Qo
    public final void J2(InterfaceC1460Jo interfaceC1460Jo) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC1460Jo);
        J0(5, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1704Qo
    public final void c() {
        J0(4, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1704Qo
    public final void e() {
        J0(6, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1704Qo
    public final void f() {
        J0(1, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1704Qo
    public final void h() {
        J0(2, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1704Qo
    public final void i() {
        J0(8, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1704Qo
    public final void j() {
        J0(3, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1704Qo
    public final void z(int i8) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        J0(7, w02);
    }
}
