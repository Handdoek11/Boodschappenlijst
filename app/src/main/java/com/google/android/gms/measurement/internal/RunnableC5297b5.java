package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.ArrayList;
import w3.InterfaceC6890f;

/* renamed from: com.google.android.gms.measurement.internal.b5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5297b5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f30843o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f30844s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ M5 f30845t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.T0 f30846u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ F4 f30847v;

    RunnableC5297b5(F4 f42, String str, String str2, M5 m52, com.google.android.gms.internal.measurement.T0 t02) {
        this.f30843o = str;
        this.f30844s = str2;
        this.f30845t = m52;
        this.f30846u = t02;
        this.f30847v = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList();
        try {
            InterfaceC6890f interfaceC6890f = this.f30847v.f30363d;
            if (interfaceC6890f == null) {
                this.f30847v.h().E().c("Failed to get conditional properties; not connected to service", this.f30843o, this.f30844s);
                return;
            }
            Z2.r.l(this.f30845t);
            ArrayList r02 = d6.r0(interfaceC6890f.L0(this.f30843o, this.f30844s, this.f30845t));
            this.f30847v.k0();
            this.f30847v.g().R(this.f30846u, r02);
        } catch (RemoteException e8) {
            this.f30847v.h().E().d("Failed to get conditional properties; remote exception", this.f30843o, this.f30844s, e8);
        } finally {
            this.f30847v.g().R(this.f30846u, arrayList);
        }
    }
}
