package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import w3.InterfaceC6890f;

/* loaded from: classes2.dex */
final class W4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ boolean f30751o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ M5 f30752s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ boolean f30753t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ E f30754u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ String f30755v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ F4 f30756w;

    W4(F4 f42, boolean z7, M5 m52, boolean z8, E e8, String str) {
        this.f30751o = z7;
        this.f30752s = m52;
        this.f30753t = z8;
        this.f30754u = e8;
        this.f30755v = str;
        this.f30756w = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j8;
        long j9;
        long j10;
        InterfaceC6890f interfaceC6890f = this.f30756w.f30363d;
        if (interfaceC6890f == null) {
            this.f30756w.h().E().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f30751o) {
            Z2.r.l(this.f30752s);
            this.f30756w.R(interfaceC6890f, this.f30753t ? null : this.f30754u, this.f30752s);
        } else {
            boolean r8 = this.f30756w.a().r(G.f30381F0);
            try {
                if (TextUtils.isEmpty(this.f30755v)) {
                    Z2.r.l(this.f30752s);
                    if (r8) {
                        j10 = this.f30756w.f31239a.zzb().a();
                        try {
                            j8 = this.f30756w.f31239a.zzb().b();
                        } catch (RemoteException e8) {
                            e = e8;
                            j8 = 0;
                            j9 = j10;
                            this.f30756w.h().E().b("Failed to send event to the service", e);
                            if (r8) {
                                C5364l2.a(this.f30756w.f31239a).b(36301, 13, j9, this.f30756w.f31239a.zzb().a(), (int) (this.f30756w.f31239a.zzb().b() - j8));
                            }
                            this.f30756w.k0();
                        }
                    } else {
                        j10 = 0;
                        j8 = 0;
                    }
                    try {
                        interfaceC6890f.d7(this.f30754u, this.f30752s);
                        if (r8) {
                            this.f30756w.h().I().a("Logging telemetry for logEvent");
                            C5364l2.a(this.f30756w.f31239a).b(36301, 0, j10, this.f30756w.f31239a.zzb().a(), (int) (this.f30756w.f31239a.zzb().b() - j8));
                        }
                    } catch (RemoteException e9) {
                        e = e9;
                        j9 = j10;
                        this.f30756w.h().E().b("Failed to send event to the service", e);
                        if (r8 && j9 != 0) {
                            C5364l2.a(this.f30756w.f31239a).b(36301, 13, j9, this.f30756w.f31239a.zzb().a(), (int) (this.f30756w.f31239a.zzb().b() - j8));
                        }
                        this.f30756w.k0();
                    }
                } else {
                    interfaceC6890f.z4(this.f30754u, this.f30755v, this.f30756w.h().M());
                }
            } catch (RemoteException e10) {
                e = e10;
                j8 = 0;
                j9 = 0;
            }
        }
        this.f30756w.k0();
    }
}
