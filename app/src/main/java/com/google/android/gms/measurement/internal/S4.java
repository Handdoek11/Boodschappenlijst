package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
final class S4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ M5 f30711o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ Bundle f30712s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ F4 f30713t;

    S4(F4 f42, M5 m52, Bundle bundle) {
        this.f30711o = m52;
        this.f30712s = bundle;
        this.f30713t = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6890f interfaceC6890f = this.f30713t.f30363d;
        if (interfaceC6890f == null) {
            this.f30713t.h().E().a("Failed to send default event parameters to service");
            return;
        }
        try {
            Z2.r.l(this.f30711o);
            interfaceC6890f.O1(this.f30712s, this.f30711o);
        } catch (RemoteException e8) {
            this.f30713t.h().E().b("Failed to send default event parameters to service", e8);
        }
    }
}
