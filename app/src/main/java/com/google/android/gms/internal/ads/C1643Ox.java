package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import f3.InterfaceC5781e;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ox, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1643Ox implements InterfaceC4701yb, FC, F2.z, EC {

    /* renamed from: o, reason: collision with root package name */
    private final C1469Jx f18076o;

    /* renamed from: s, reason: collision with root package name */
    private final C1504Kx f18077s;

    /* renamed from: u, reason: collision with root package name */
    private final C3850ql f18079u;

    /* renamed from: v, reason: collision with root package name */
    private final Executor f18080v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC5781e f18081w;

    /* renamed from: t, reason: collision with root package name */
    private final Set f18078t = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f18082x = new AtomicBoolean(false);

    /* renamed from: y, reason: collision with root package name */
    private final C1608Nx f18083y = new C1608Nx();

    /* renamed from: z, reason: collision with root package name */
    private boolean f18084z = false;

    /* renamed from: A, reason: collision with root package name */
    private WeakReference f18075A = new WeakReference(this);

    public C1643Ox(C3523nl c3523nl, C1504Kx c1504Kx, Executor executor, C1469Jx c1469Jx, InterfaceC5781e interfaceC5781e) {
        this.f18076o = c1469Jx;
        InterfaceC1980Yk interfaceC1980Yk = AbstractC2219bl.f20925b;
        this.f18079u = c3523nl.a("google.afma.activeView.handleUpdate", interfaceC1980Yk, interfaceC1980Yk);
        this.f18077s = c1504Kx;
        this.f18080v = executor;
        this.f18081w = interfaceC5781e;
    }

    private final void g() {
        Iterator it = this.f18078t.iterator();
        while (it.hasNext()) {
            this.f18076o.f((InterfaceC4410vt) it.next());
        }
        this.f18076o.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4701yb
    public final synchronized void A0(C4592xb c4592xb) {
        C1608Nx c1608Nx = this.f18083y;
        c1608Nx.f17787a = c4592xb.f27883j;
        c1608Nx.f17792f = c4592xb;
        a();
    }

    @Override // F2.z
    public final synchronized void D0() {
        this.f18083y.f17788b = true;
        a();
    }

    @Override // F2.z
    public final synchronized void I3() {
        this.f18083y.f17788b = false;
        a();
    }

    @Override // F2.z
    public final void W4(int i8) {
    }

    public final synchronized void a() {
        try {
            if (this.f18075A.get() == null) {
                d();
                return;
            }
            if (this.f18084z || !this.f18082x.get()) {
                return;
            }
            try {
                this.f18083y.f17790d = this.f18081w.b();
                final JSONObject c8 = this.f18077s.c(this.f18083y);
                for (final InterfaceC4410vt interfaceC4410vt : this.f18078t) {
                    this.f18080v.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Mx
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC4410vt.m1("AFMA_updateActiveView", c8);
                        }
                    });
                }
                AbstractC1601Nq.b(this.f18079u.c(c8), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e8) {
                AbstractC0608p0.l("Failed to call ActiveViewJS", e8);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(InterfaceC4410vt interfaceC4410vt) {
        this.f18078t.add(interfaceC4410vt);
        this.f18076o.d(interfaceC4410vt);
    }

    public final void c(Object obj) {
        this.f18075A = new WeakReference(obj);
    }

    public final synchronized void d() {
        g();
        this.f18084z = true;
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final synchronized void e(Context context) {
        this.f18083y.f17791e = "u";
        a();
        g();
        this.f18084z = true;
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final synchronized void i(Context context) {
        this.f18083y.f17788b = true;
        a();
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final synchronized void p(Context context) {
        this.f18083y.f17788b = false;
        a();
    }

    @Override // F2.z
    public final void q2() {
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final synchronized void r() {
        if (this.f18082x.compareAndSet(false, true)) {
            this.f18076o.c(this);
            a();
        }
    }

    @Override // F2.z
    public final void r3() {
    }

    @Override // F2.z
    public final void w0() {
    }
}
