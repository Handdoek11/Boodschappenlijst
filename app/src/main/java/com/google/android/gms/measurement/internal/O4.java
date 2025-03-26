package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
final class O4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ M5 f30635o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F4 f30636s;

    O4(F4 f42, M5 m52) {
        this.f30635o = m52;
        this.f30636s = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6890f interfaceC6890f = this.f30636s.f30363d;
        if (interfaceC6890f == null) {
            this.f30636s.h().E().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Z2.r.l(this.f30635o);
            interfaceC6890f.X0(this.f30635o);
            this.f30636s.o().H();
            this.f30636s.R(interfaceC6890f, null, this.f30635o);
            this.f30636s.k0();
        } catch (RemoteException e8) {
            this.f30636s.h().E().b("Failed to send app launch to the service", e8);
        }
    }
}
