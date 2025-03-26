package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
final class P4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ M5 f30652o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.T0 f30653s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ F4 f30654t;

    P4(F4 f42, M5 m52, com.google.android.gms.internal.measurement.T0 t02) {
        this.f30652o = m52;
        this.f30653s = t02;
        this.f30654t = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!this.f30654t.f().K().z()) {
                this.f30654t.h().K().a("Analytics storage consent denied; will not get app instance id");
                this.f30654t.p().Y0(null);
                this.f30654t.f().f31290i.b(null);
                return;
            }
            InterfaceC6890f interfaceC6890f = this.f30654t.f30363d;
            if (interfaceC6890f == null) {
                this.f30654t.h().E().a("Failed to get app instance id");
                return;
            }
            Z2.r.l(this.f30652o);
            String A22 = interfaceC6890f.A2(this.f30652o);
            if (A22 != null) {
                this.f30654t.p().Y0(A22);
                this.f30654t.f().f31290i.b(A22);
            }
            this.f30654t.k0();
            this.f30654t.g().Q(this.f30653s, A22);
        } catch (RemoteException e8) {
            this.f30654t.h().E().b("Failed to get app instance id", e8);
        } finally {
            this.f30654t.g().Q(this.f30653s, null);
        }
    }
}
