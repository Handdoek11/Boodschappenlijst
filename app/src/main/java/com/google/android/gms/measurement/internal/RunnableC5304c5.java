package com.google.android.gms.measurement.internal;

import w3.InterfaceC6890f;

/* renamed from: com.google.android.gms.measurement.internal.c5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5304c5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ InterfaceC6890f f30897o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC5311d5 f30898s;

    RunnableC5304c5(ServiceConnectionC5311d5 serviceConnectionC5311d5, InterfaceC6890f interfaceC6890f) {
        this.f30897o = interfaceC6890f;
        this.f30898s = serviceConnectionC5311d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30898s) {
            try {
                this.f30898s.f30908a = false;
                if (!this.f30898s.f30910c.e0()) {
                    this.f30898s.f30910c.h().I().a("Connected to service");
                    this.f30898s.f30910c.Q(this.f30897o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
