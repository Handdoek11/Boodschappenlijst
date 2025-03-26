package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
final class X4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ M5 f30770o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F4 f30771s;

    X4(F4 f42, M5 m52) {
        this.f30770o = m52;
        this.f30771s = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6890f interfaceC6890f = this.f30771s.f30363d;
        if (interfaceC6890f == null) {
            this.f30771s.h().E().a("Failed to send consent settings to service");
            return;
        }
        try {
            Z2.r.l(this.f30770o);
            interfaceC6890f.Q1(this.f30770o);
            this.f30771s.k0();
        } catch (RemoteException e8) {
            this.f30771s.h().E().b("Failed to send consent settings to the service", e8);
        }
    }
}
