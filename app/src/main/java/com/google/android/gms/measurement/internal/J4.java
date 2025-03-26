package com.google.android.gms.measurement.internal;

import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
final class J4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ M5 f30562o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ boolean f30563s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ Y5 f30564t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ F4 f30565u;

    J4(F4 f42, M5 m52, boolean z7, Y5 y52) {
        this.f30562o = m52;
        this.f30563s = z7;
        this.f30564t = y52;
        this.f30565u = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6890f interfaceC6890f = this.f30565u.f30363d;
        if (interfaceC6890f == null) {
            this.f30565u.h().E().a("Discarding data. Failed to set user property");
            return;
        }
        Z2.r.l(this.f30562o);
        this.f30565u.R(interfaceC6890f, this.f30563s ? null : this.f30564t, this.f30562o);
        this.f30565u.k0();
    }
}
