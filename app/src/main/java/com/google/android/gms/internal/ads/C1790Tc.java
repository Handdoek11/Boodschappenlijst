package com.google.android.gms.internal.ads;

import Z2.AbstractC0765d;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1790Tc implements AbstractC0765d.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1476Kc f19156a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1811Tq f19157b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1860Vc f19158c;

    C1790Tc(C1860Vc c1860Vc, C1476Kc c1476Kc, C1811Tq c1811Tq) {
        this.f19156a = c1476Kc;
        this.f19157b = c1811Tq;
        this.f19158c = c1860Vc;
    }

    @Override // Z2.AbstractC0765d.a
    public final void J0(Bundle bundle) {
        synchronized (this.f19158c.f19634d) {
            try {
                C1860Vc c1860Vc = this.f19158c;
                if (c1860Vc.f19632b) {
                    return;
                }
                c1860Vc.f19632b = true;
                final C1441Jc c1441Jc = this.f19158c.f19631a;
                if (c1441Jc == null) {
                    return;
                }
                InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0 = AbstractC1497Kq.f16644a;
                final C1476Kc c1476Kc = this.f19156a;
                final C1811Tq c1811Tq = this.f19157b;
                final com.google.common.util.concurrent.d k8 = interfaceExecutorServiceC3522nk0.k(new Runnable() { // from class: com.google.android.gms.internal.ads.Qc
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1790Tc c1790Tc = this.f18508o;
                        C1441Jc c1441Jc2 = c1441Jc;
                        C1811Tq c1811Tq2 = c1811Tq;
                        try {
                            C1545Mc k02 = c1441Jc2.k0();
                            boolean j02 = c1441Jc2.j0();
                            C1476Kc c1476Kc2 = c1476Kc;
                            C1369Hc I32 = j02 ? k02.I3(c1476Kc2) : k02.r3(c1476Kc2);
                            if (!I32.E0()) {
                                c1811Tq2.d(new RuntimeException("No entry contents."));
                                C1860Vc.e(c1790Tc.f19158c);
                                return;
                            }
                            C1755Sc c1755Sc = new C1755Sc(c1790Tc, I32.C0(), 1);
                            int read = c1755Sc.read();
                            if (read == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            c1755Sc.unread(read);
                            c1811Tq2.c(C1930Xc.b(c1755Sc, I32.D0(), I32.G0(), I32.A0(), I32.F0()));
                        } catch (RemoteException e8) {
                            e = e8;
                            H2.p.e("Unable to obtain a cache service instance.", e);
                            c1811Tq2.d(e);
                            C1860Vc.e(c1790Tc.f19158c);
                        } catch (IOException e9) {
                            e = e9;
                            H2.p.e("Unable to obtain a cache service instance.", e);
                            c1811Tq2.d(e);
                            C1860Vc.e(c1790Tc.f19158c);
                        }
                    }
                });
                final C1811Tq c1811Tq2 = this.f19157b;
                c1811Tq2.f(new Runnable() { // from class: com.google.android.gms.internal.ads.Rc
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (c1811Tq2.isCancelled()) {
                            k8.cancel(true);
                        }
                    }
                }, AbstractC1497Kq.f16650g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z2.AbstractC0765d.a
    public final void w0(int i8) {
    }
}
