package com.google.android.gms.internal.ads;

import D2.InterfaceC0489b1;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class GI extends D2.X0 {

    /* renamed from: o, reason: collision with root package name */
    private final Object f15349o = new Object();

    /* renamed from: s, reason: collision with root package name */
    private final D2.Y0 f15350s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC1771Sl f15351t;

    public GI(D2.Y0 y02, InterfaceC1771Sl interfaceC1771Sl) {
        this.f15350s = y02;
        this.f15351t = interfaceC1771Sl;
    }

    @Override // D2.Y0
    public final void N6(InterfaceC0489b1 interfaceC0489b1) {
        synchronized (this.f15349o) {
            try {
                D2.Y0 y02 = this.f15350s;
                if (y02 != null) {
                    y02.N6(interfaceC0489b1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D2.Y0
    public final float b() {
        throw new RemoteException();
    }

    @Override // D2.Y0
    public final float c() {
        InterfaceC1771Sl interfaceC1771Sl = this.f15351t;
        if (interfaceC1771Sl != null) {
            return interfaceC1771Sl.g();
        }
        return 0.0f;
    }

    @Override // D2.Y0
    public final int e() {
        throw new RemoteException();
    }

    @Override // D2.Y0
    public final InterfaceC0489b1 f() {
        synchronized (this.f15349o) {
            try {
                D2.Y0 y02 = this.f15350s;
                if (y02 == null) {
                    return null;
                }
                return y02.f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D2.Y0
    public final float g() {
        InterfaceC1771Sl interfaceC1771Sl = this.f15351t;
        if (interfaceC1771Sl != null) {
            return interfaceC1771Sl.e();
        }
        return 0.0f;
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
