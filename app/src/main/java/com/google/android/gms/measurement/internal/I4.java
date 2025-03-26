package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
final class I4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f30549o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f30550s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ M5 f30551t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ boolean f30552u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.T0 f30553v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ F4 f30554w;

    I4(F4 f42, String str, String str2, M5 m52, boolean z7, com.google.android.gms.internal.measurement.T0 t02) {
        this.f30549o = str;
        this.f30550s = str2;
        this.f30551t = m52;
        this.f30552u = z7;
        this.f30553v = t02;
        this.f30554w = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle();
        try {
            InterfaceC6890f interfaceC6890f = this.f30554w.f30363d;
            if (interfaceC6890f == null) {
                this.f30554w.h().E().c("Failed to get user properties; not connected to service", this.f30549o, this.f30550s);
                return;
            }
            Z2.r.l(this.f30551t);
            Bundle E7 = d6.E(interfaceC6890f.y5(this.f30549o, this.f30550s, this.f30552u, this.f30551t));
            this.f30554w.k0();
            this.f30554w.g().P(this.f30553v, E7);
        } catch (RemoteException e8) {
            this.f30554w.h().E().c("Failed to get user properties; remote exception", this.f30549o, e8);
        } finally {
            this.f30554w.g().P(this.f30553v, bundle);
        }
    }
}
