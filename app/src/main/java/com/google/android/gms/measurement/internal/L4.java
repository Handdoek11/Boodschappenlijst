package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
final class L4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f30580o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ M5 f30581s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ F4 f30582t;

    L4(F4 f42, AtomicReference atomicReference, M5 m52) {
        this.f30580o = atomicReference;
        this.f30581s = m52;
        this.f30582t = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f30580o) {
            try {
                try {
                } catch (RemoteException e8) {
                    this.f30582t.h().E().b("Failed to get app instance id", e8);
                }
                if (!this.f30582t.f().K().z()) {
                    this.f30582t.h().K().a("Analytics storage consent denied; will not get app instance id");
                    this.f30582t.p().Y0(null);
                    this.f30582t.f().f31290i.b(null);
                    this.f30580o.set(null);
                    return;
                }
                InterfaceC6890f interfaceC6890f = this.f30582t.f30363d;
                if (interfaceC6890f == null) {
                    this.f30582t.h().E().a("Failed to get app instance id");
                    return;
                }
                Z2.r.l(this.f30581s);
                this.f30580o.set(interfaceC6890f.A2(this.f30581s));
                String str = (String) this.f30580o.get();
                if (str != null) {
                    this.f30582t.p().Y0(str);
                    this.f30582t.f().f31290i.b(str);
                }
                this.f30582t.k0();
                this.f30580o.notify();
            } finally {
                this.f30580o.notify();
            }
        }
    }
}
