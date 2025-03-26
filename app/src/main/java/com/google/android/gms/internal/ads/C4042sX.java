package com.google.android.gms.internal.ads;

import D2.InterfaceC0484a;
import D2.InterfaceC0509i0;
import D2.InterfaceC0530p0;
import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import x2.InterfaceC6905d;

/* renamed from: com.google.android.gms.internal.ads.sX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4042sX implements InterfaceC6905d, JD, ZC, InterfaceC3360mC, EC, InterfaceC0484a, InterfaceC3033jC, InterfaceC4560xD, AC, InterfaceC3912rG {

    /* renamed from: z, reason: collision with root package name */
    final HN f26695z;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicReference f26687o = new AtomicReference();

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference f26688s = new AtomicReference();

    /* renamed from: t, reason: collision with root package name */
    private final AtomicReference f26689t = new AtomicReference();

    /* renamed from: u, reason: collision with root package name */
    private final AtomicReference f26690u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    private final AtomicReference f26691v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f26692w = new AtomicBoolean(true);

    /* renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f26693x = new AtomicBoolean(false);

    /* renamed from: y, reason: collision with root package name */
    private final AtomicBoolean f26694y = new AtomicBoolean(false);

    /* renamed from: A, reason: collision with root package name */
    final BlockingQueue f26686A = new ArrayBlockingQueue(((Integer) D2.A.c().a(AbstractC3184kf.L8)).intValue());

    public C4042sX(HN hn) {
        this.f26695z = hn;
    }

    private final void N() {
        if (this.f26693x.get() && this.f26694y.get()) {
            for (final Pair pair : this.f26686A) {
                R40.a(this.f26688s, new Q40() { // from class: com.google.android.gms.internal.ads.cX
                    @Override // com.google.android.gms.internal.ads.Q40
                    public final void a(Object obj) {
                        Pair pair2 = pair;
                        ((InterfaceC0509i0) obj).B0((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.f26686A.clear();
            this.f26692w.set(false);
        }
    }

    public final void C(InterfaceC0509i0 interfaceC0509i0) {
        this.f26688s.set(interfaceC0509i0);
        this.f26693x.set(true);
        N();
    }

    public final void E(InterfaceC0530p0 interfaceC0530p0) {
        this.f26691v.set(interfaceC0530p0);
    }

    @Override // D2.InterfaceC0484a
    public final void I0() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Fa)).booleanValue()) {
            return;
        }
        R40.a(this.f26687o, new C3825qX());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3912rG
    public final void K0() {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Fa)).booleanValue()) {
            R40.a(this.f26687o, new C3825qX());
        }
        R40.a(this.f26691v, new Q40() { // from class: com.google.android.gms.internal.ads.bX
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC0530p0) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void Q(C4618xo c4618xo) {
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final void T0(C60 c60) {
        this.f26692w.set(true);
        this.f26694y.set(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void a() {
        R40.a(this.f26687o, new Q40() { // from class: com.google.android.gms.internal.ads.nX
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((D2.H) obj).h();
            }
        });
        R40.a(this.f26691v, new Q40() { // from class: com.google.android.gms.internal.ads.oX
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC0530p0) obj).c();
            }
        });
        R40.a(this.f26691v, new Q40() { // from class: com.google.android.gms.internal.ads.pX
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC0530p0) obj).b();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void c() {
    }

    public final synchronized D2.H e() {
        return (D2.H) this.f26687o.get();
    }

    public final synchronized InterfaceC0509i0 g() {
        return (InterfaceC0509i0) this.f26688s.get();
    }

    public final void i(D2.H h8) {
        this.f26687o.set(h8);
    }

    @Override // com.google.android.gms.internal.ads.AC
    public final void m(final D2.W0 w02) {
        R40.a(this.f26691v, new Q40() { // from class: com.google.android.gms.internal.ads.jX
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC0530p0) obj).m0(w02);
            }
        });
    }

    @Override // x2.InterfaceC6905d
    public final synchronized void n(final String str, final String str2) {
        if (!this.f26692w.get()) {
            R40.a(this.f26688s, new Q40() { // from class: com.google.android.gms.internal.ads.kX
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((InterfaceC0509i0) obj).B0(str, str2);
                }
            });
            return;
        }
        if (!this.f26686A.offer(new Pair(str, str2))) {
            H2.p.b("The queue for app events is full, dropping the new event.");
            HN hn = this.f26695z;
            if (hn != null) {
                GN a8 = hn.a();
                a8.b("action", "dae_action");
                a8.b("dae_name", str);
                a8.b("dae_data", str2);
                a8.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void o(InterfaceC1460Jo interfaceC1460Jo, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4560xD
    public final void p(final D2.e2 e2Var) {
        R40.a(this.f26689t, new Q40() { // from class: com.google.android.gms.internal.ads.rX
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((D2.N0) obj).O2(e2Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void r() {
        R40.a(this.f26687o, new Q40() { // from class: com.google.android.gms.internal.ads.YW
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((D2.H) obj).g();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360mC
    public final void r0(final D2.W0 w02) {
        R40.a(this.f26687o, new Q40() { // from class: com.google.android.gms.internal.ads.dX
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((D2.H) obj).y(w02);
            }
        });
        R40.a(this.f26687o, new Q40() { // from class: com.google.android.gms.internal.ads.fX
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((D2.H) obj).D(w02.f1162o);
            }
        });
        R40.a(this.f26690u, new Q40() { // from class: com.google.android.gms.internal.ads.gX
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((D2.K) obj).h0(w02);
            }
        });
        this.f26692w.set(false);
        this.f26686A.clear();
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final synchronized void s() {
        R40.a(this.f26687o, new Q40() { // from class: com.google.android.gms.internal.ads.hX
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((D2.H) obj).f();
            }
        });
        R40.a(this.f26690u, new Q40() { // from class: com.google.android.gms.internal.ads.iX
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((D2.K) obj).a();
            }
        });
        this.f26694y.set(true);
        N();
    }

    public final void t(D2.K k8) {
        this.f26690u.set(k8);
    }

    public final void w(D2.N0 n02) {
        this.f26689t.set(n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3912rG
    public final void x() {
        R40.a(this.f26687o, new Q40() { // from class: com.google.android.gms.internal.ads.mX
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((D2.H) obj).i();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void zza() {
        R40.a(this.f26687o, new Q40() { // from class: com.google.android.gms.internal.ads.ZW
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((D2.H) obj).d();
            }
        });
        R40.a(this.f26691v, new Q40() { // from class: com.google.android.gms.internal.ads.aX
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC0530p0) obj).a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void zzb() {
        R40.a(this.f26687o, new Q40() { // from class: com.google.android.gms.internal.ads.lX
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((D2.H) obj).e();
            }
        });
    }
}
