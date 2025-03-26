package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.sn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4071sn extends AbstractC3612ob implements InterfaceC4289un {
    C4071sn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void B() {
        J0(9, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void C4(Bundle bundle) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, bundle);
        J0(1, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final boolean S() {
        Parcel D02 = D0(11, w0());
        boolean g8 = AbstractC3830qb.g(D02);
        D02.recycle();
        return g8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void a0(InterfaceC5852a interfaceC5852a) {
        Parcel w02 = w0();
        AbstractC3830qb.f(w02, interfaceC5852a);
        J0(13, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void f() {
        J0(10, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void k() {
        J0(8, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void l3(int i8, String[] strArr, int[] iArr) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        w02.writeStringArray(strArr);
        w02.writeIntArray(iArr);
        J0(15, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void o() {
        J0(5, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void q() {
        J0(2, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void r() {
        J0(4, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void t() {
        J0(3, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void u() {
        J0(14, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void x() {
        J0(7, w0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void x0(Bundle bundle) {
        Parcel w02 = w0();
        AbstractC3830qb.d(w02, bundle);
        Parcel D02 = D0(6, w02);
        if (D02.readInt() != 0) {
            bundle.readFromParcel(D02);
        }
        D02.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289un
    public final void y2(int i8, int i9, Intent intent) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        w02.writeInt(i9);
        AbstractC3830qb.d(w02, intent);
        J0(12, w02);
    }
}
