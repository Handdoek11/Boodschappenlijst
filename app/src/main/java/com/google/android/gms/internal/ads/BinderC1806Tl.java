package com.google.android.gms.internal.ads;

import D2.InterfaceC0489b1;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Tl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1806Tl extends D2.X0 {

    /* renamed from: o, reason: collision with root package name */
    private final Object f19170o = new Object();

    /* renamed from: s, reason: collision with root package name */
    private volatile InterfaceC0489b1 f19171s;

    @Override // D2.Y0
    public final void N6(InterfaceC0489b1 interfaceC0489b1) {
        synchronized (this.f19170o) {
            this.f19171s = interfaceC0489b1;
        }
    }

    @Override // D2.Y0
    public final float b() {
        throw new RemoteException();
    }

    @Override // D2.Y0
    public final float c() {
        throw new RemoteException();
    }

    @Override // D2.Y0
    public final int e() {
        throw new RemoteException();
    }

    @Override // D2.Y0
    public final InterfaceC0489b1 f() {
        InterfaceC0489b1 interfaceC0489b1;
        synchronized (this.f19170o) {
            interfaceC0489b1 = this.f19171s;
        }
        return interfaceC0489b1;
    }

    @Override // D2.Y0
    public final float g() {
        throw new RemoteException();
    }

    @Override // D2.Y0
    public final void i() {
        throw new RemoteException();
    }

    @Override // D2.Y0
    public final void j() {
        throw new RemoteException();
    }

    @Override // D2.Y0
    public final void k0(boolean z7) {
        throw new RemoteException();
    }

    @Override // D2.Y0
    public final void l() {
        throw new RemoteException();
    }

    @Override // D2.Y0
    public final boolean o() {
        throw new RemoteException();
    }

    @Override // D2.Y0
    public final boolean p() {
        throw new RemoteException();
    }

    @Override // D2.Y0
    public final boolean q() {
        throw new RemoteException();
    }
}
