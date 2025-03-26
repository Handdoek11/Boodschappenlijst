package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
final class R4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ M5 f30670o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F4 f30671s;

    R4(F4 f42, M5 m52) {
        this.f30670o = m52;
        this.f30671s = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6890f interfaceC6890f = this.f30671s.f30363d;
        if (interfaceC6890f == null) {
            this.f30671s.h().J().a("Failed to send app backgrounded");
            return;
        }
        try {
            Z2.r.l(this.f30670o);
            interfaceC6890f.B3(this.f30670o);
            this.f30671s.k0();
        } catch (RemoteException e8) {
            this.f30671s.h().E().b("Failed to send app backgrounded to the service", e8);
        }
    }
}
