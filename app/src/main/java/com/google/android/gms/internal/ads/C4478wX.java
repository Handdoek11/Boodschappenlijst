package com.google.android.gms.internal.ads;

import D2.InterfaceC0484a;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.wX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4478wX implements InterfaceC0484a, InterfaceC3912rG {

    /* renamed from: o, reason: collision with root package name */
    private D2.E f27504o;

    @Override // D2.InterfaceC0484a
    public final synchronized void I0() {
        D2.E e8 = this.f27504o;
        if (e8 != null) {
            try {
                e8.zzb();
            } catch (RemoteException e9) {
                H2.p.h("Remote Exception at onAdClicked.", e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3912rG
    public final synchronized void K0() {
        D2.E e8 = this.f27504o;
        if (e8 != null) {
            try {
                e8.zzb();
            } catch (RemoteException e9) {
                H2.p.h("Remote Exception at onPhysicalClick.", e9);
            }
        }
    }

    public final synchronized void a(D2.E e8) {
        this.f27504o = e8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3912rG
    public final synchronized void x() {
    }
}
