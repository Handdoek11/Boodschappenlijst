package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
final class U4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ M5 f30727o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F4 f30728s;

    U4(F4 f42, M5 m52) {
        this.f30727o = m52;
        this.f30728s = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6890f interfaceC6890f = this.f30728s.f30363d;
        if (interfaceC6890f == null) {
            this.f30728s.h().E().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Z2.r.l(this.f30727o);
            interfaceC6890f.U6(this.f30727o);
            this.f30728s.k0();
        } catch (RemoteException e8) {
            this.f30728s.h().E().b("Failed to send measurementEnabled to the service", e8);
        }
    }
}
