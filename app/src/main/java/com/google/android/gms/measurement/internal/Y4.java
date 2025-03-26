package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
final class Y4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f30783o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f30784s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ String f30785t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ String f30786u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ M5 f30787v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ F4 f30788w;

    Y4(F4 f42, AtomicReference atomicReference, String str, String str2, String str3, M5 m52) {
        this.f30783o = atomicReference;
        this.f30784s = str;
        this.f30785t = str2;
        this.f30786u = str3;
        this.f30787v = m52;
        this.f30788w = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6890f interfaceC6890f;
        synchronized (this.f30783o) {
            try {
                try {
                    interfaceC6890f = this.f30788w.f30363d;
                } catch (RemoteException e8) {
                    this.f30788w.h().E().d("(legacy) Failed to get conditional properties; remote exception", C5378n2.t(this.f30784s), this.f30785t, e8);
                    this.f30783o.set(Collections.emptyList());
                }
                if (interfaceC6890f == null) {
                    this.f30788w.h().E().d("(legacy) Failed to get conditional properties; not connected to service", C5378n2.t(this.f30784s), this.f30785t, this.f30786u);
                    this.f30783o.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f30784s)) {
                    Z2.r.l(this.f30787v);
                    this.f30783o.set(interfaceC6890f.L0(this.f30785t, this.f30786u, this.f30787v));
                } else {
                    this.f30783o.set(interfaceC6890f.C3(this.f30784s, this.f30785t, this.f30786u));
                }
                this.f30788w.k0();
                this.f30783o.notify();
            } finally {
                this.f30783o.notify();
            }
        }
    }
}
