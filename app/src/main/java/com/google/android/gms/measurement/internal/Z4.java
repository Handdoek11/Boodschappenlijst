package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
final class Z4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ boolean f30801o = true;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ M5 f30802s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ boolean f30803t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ C5312e f30804u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ C5312e f30805v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ F4 f30806w;

    Z4(F4 f42, boolean z7, M5 m52, boolean z8, C5312e c5312e, C5312e c5312e2) {
        this.f30802s = m52;
        this.f30803t = z8;
        this.f30804u = c5312e;
        this.f30805v = c5312e2;
        this.f30806w = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6890f interfaceC6890f = this.f30806w.f30363d;
        if (interfaceC6890f == null) {
            this.f30806w.h().E().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f30801o) {
            Z2.r.l(this.f30802s);
            this.f30806w.R(interfaceC6890f, this.f30803t ? null : this.f30804u, this.f30802s);
        } else {
            try {
                if (TextUtils.isEmpty(this.f30805v.f30921o)) {
                    Z2.r.l(this.f30802s);
                    interfaceC6890f.U2(this.f30804u, this.f30802s);
                } else {
                    interfaceC6890f.P3(this.f30804u);
                }
            } catch (RemoteException e8) {
                this.f30806w.h().E().b("Failed to send conditional user property to the service", e8);
            }
        }
        this.f30806w.k0();
    }
}
