package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
final class V4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ E f30736o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f30737s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.T0 f30738t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ F4 f30739u;

    V4(F4 f42, E e8, String str, com.google.android.gms.internal.measurement.T0 t02) {
        this.f30736o = e8;
        this.f30737s = str;
        this.f30738t = t02;
        this.f30739u = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC6890f interfaceC6890f = this.f30739u.f30363d;
            if (interfaceC6890f == null) {
                this.f30739u.h().E().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] a62 = interfaceC6890f.a6(this.f30736o, this.f30737s);
            this.f30739u.k0();
            this.f30739u.g().T(this.f30738t, a62);
        } catch (RemoteException e8) {
            this.f30739u.h().E().b("Failed to send event to the service to bundle", e8);
        } finally {
            this.f30739u.g().T(this.f30738t, null);
        }
    }
}
