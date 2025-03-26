package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
final class K4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f30572o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ M5 f30573s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ Bundle f30574t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ F4 f30575u;

    K4(F4 f42, AtomicReference atomicReference, M5 m52, Bundle bundle) {
        this.f30572o = atomicReference;
        this.f30573s = m52;
        this.f30574t = bundle;
        this.f30575u = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6890f interfaceC6890f;
        synchronized (this.f30572o) {
            try {
                try {
                    interfaceC6890f = this.f30575u.f30363d;
                } catch (RemoteException e8) {
                    this.f30575u.h().E().b("Failed to get trigger URIs; remote exception", e8);
                }
                if (interfaceC6890f == null) {
                    this.f30575u.h().E().a("Failed to get trigger URIs; not connected to service");
                    return;
                }
                Z2.r.l(this.f30573s);
                this.f30572o.set(interfaceC6890f.Z5(this.f30573s, this.f30574t));
                this.f30575u.k0();
                this.f30572o.notify();
            } finally {
                this.f30572o.notify();
            }
        }
    }
}
