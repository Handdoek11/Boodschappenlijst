package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import w3.InterfaceC6890f;

/* renamed from: com.google.android.gms.measurement.internal.a5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5290a5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f30813o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f30814s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ String f30815t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ String f30816u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ M5 f30817v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ boolean f30818w;

    /* renamed from: x, reason: collision with root package name */
    private final /* synthetic */ F4 f30819x;

    RunnableC5290a5(F4 f42, AtomicReference atomicReference, String str, String str2, String str3, M5 m52, boolean z7) {
        this.f30813o = atomicReference;
        this.f30814s = str;
        this.f30815t = str2;
        this.f30816u = str3;
        this.f30817v = m52;
        this.f30818w = z7;
        this.f30819x = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6890f interfaceC6890f;
        synchronized (this.f30813o) {
            try {
                try {
                    interfaceC6890f = this.f30819x.f30363d;
                } catch (RemoteException e8) {
                    this.f30819x.h().E().d("(legacy) Failed to get user properties; remote exception", C5378n2.t(this.f30814s), this.f30815t, e8);
                    this.f30813o.set(Collections.emptyList());
                }
                if (interfaceC6890f == null) {
                    this.f30819x.h().E().d("(legacy) Failed to get user properties; not connected to service", C5378n2.t(this.f30814s), this.f30815t, this.f30816u);
                    this.f30813o.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f30814s)) {
                    Z2.r.l(this.f30817v);
                    this.f30813o.set(interfaceC6890f.y5(this.f30815t, this.f30816u, this.f30818w, this.f30817v));
                } else {
                    this.f30813o.set(interfaceC6890f.D1(this.f30814s, this.f30815t, this.f30816u, this.f30818w));
                }
                this.f30819x.k0();
                this.f30813o.notify();
            } finally {
                this.f30813o.notify();
            }
        }
    }
}
