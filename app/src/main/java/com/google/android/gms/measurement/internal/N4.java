package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
final class N4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ M5 f30625o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F4 f30626s;

    N4(F4 f42, M5 m52) {
        this.f30625o = m52;
        this.f30626s = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6890f interfaceC6890f = this.f30626s.f30363d;
        if (interfaceC6890f == null) {
            this.f30626s.h().E().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Z2.r.l(this.f30625o);
            interfaceC6890f.L1(this.f30625o);
        } catch (RemoteException e8) {
            this.f30626s.h().E().b("Failed to reset data on the service: remote exception", e8);
        }
        this.f30626s.k0();
    }
}
