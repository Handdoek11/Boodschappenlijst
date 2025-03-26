package com.google.android.gms.measurement.internal;

import w3.InterfaceC6890f;

/* renamed from: com.google.android.gms.measurement.internal.e5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5318e5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ InterfaceC6890f f30937o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC5311d5 f30938s;

    RunnableC5318e5(ServiceConnectionC5311d5 serviceConnectionC5311d5, InterfaceC6890f interfaceC6890f) {
        this.f30937o = interfaceC6890f;
        this.f30938s = serviceConnectionC5311d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30938s) {
            try {
                this.f30938s.f30908a = false;
                if (!this.f30938s.f30910c.e0()) {
                    this.f30938s.f30910c.h().D().a("Connected to remote service");
                    this.f30938s.f30910c.Q(this.f30937o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
