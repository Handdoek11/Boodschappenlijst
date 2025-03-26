package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Pb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC1648Pb implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C1683Qb f18222o;

    RunnableC1648Pb(C1683Qb c1683Qb) {
        this.f18222o = c1683Qb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f18222o.f18501t) {
            C1683Qb c1683Qb = this.f18222o;
            if (c1683Qb.f18502u && c1683Qb.f18503v) {
                c1683Qb.f18502u = false;
                H2.p.b("App went background");
                Iterator it = this.f18222o.f18504w.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC1718Rb) it.next()).B(false);
                    } catch (Exception e8) {
                        H2.p.e("", e8);
                    }
                }
            } else {
                H2.p.b("App is still foreground");
            }
        }
    }
}
