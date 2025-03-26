package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class S50 implements P2.a, ZC, InterfaceC3360mC, InterfaceC3033jC, AC, InterfaceC4560xD, InterfaceC2152b50, InterfaceC3912rG {

    /* renamed from: o, reason: collision with root package name */
    private final C4222u70 f18822o;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference f18823s = new AtomicReference();

    /* renamed from: t, reason: collision with root package name */
    private final AtomicReference f18824t = new AtomicReference();

    /* renamed from: u, reason: collision with root package name */
    private final AtomicReference f18825u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    private final AtomicReference f18826v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReference f18827w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicReference f18828x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    private final AtomicReference f18829y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    private S50 f18830z = null;

    public S50(C4222u70 c4222u70) {
        this.f18822o = c4222u70;
    }

    public final void C(C1495Ko c1495Ko) {
        this.f18828x.set(c1495Ko);
    }

    public final void E(C3313lp c3313lp) {
        this.f18827w.set(c3313lp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3912rG
    public final void K0() {
        S50 s50 = this.f18830z;
        if (s50 != null) {
            s50.K0();
        } else {
            R40.a(this.f18825u, new Q40() { // from class: com.google.android.gms.internal.ads.H50
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((InterfaceC2770gp) obj).b();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void a() {
        S50 s50 = this.f18830z;
        if (s50 != null) {
            s50.a();
            return;
        }
        R40.a(this.f18825u, new Q40() { // from class: com.google.android.gms.internal.ads.y50
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC2770gp) obj).h();
            }
        });
        R40.a(this.f18826v, new Q40() { // from class: com.google.android.gms.internal.ads.B50
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC1704Qo) obj).h();
            }
        });
        R40.a(this.f18825u, new Q40() { // from class: com.google.android.gms.internal.ads.C50
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC2770gp) obj).c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void b() {
        S50 s50 = this.f18830z;
        if (s50 != null) {
            s50.b();
        } else {
            R40.a(this.f18826v, new Q40() { // from class: com.google.android.gms.internal.ads.K50
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((InterfaceC1704Qo) obj).i();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void c() {
        S50 s50 = this.f18830z;
        if (s50 != null) {
            s50.c();
        } else {
            R40.a(this.f18826v, new Q40() { // from class: com.google.android.gms.internal.ads.u50
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((InterfaceC1704Qo) obj).j();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2152b50
    public final void e(InterfaceC2152b50 interfaceC2152b50) {
        this.f18830z = (S50) interfaceC2152b50;
    }

    public final void g(P2.a aVar) {
        this.f18823s.set(aVar);
    }

    @Override // P2.a
    public final void i() {
        S50 s50 = this.f18830z;
        if (s50 != null) {
            s50.i();
        } else {
            R40.a(this.f18823s, new Q40() { // from class: com.google.android.gms.internal.ads.G50
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((P2.a) obj).i();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.AC
    public final void m(final D2.W0 w02) {
        S50 s50 = this.f18830z;
        if (s50 != null) {
            s50.m(w02);
        } else {
            R40.a(this.f18825u, new Q40() { // from class: com.google.android.gms.internal.ads.I50
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((InterfaceC2770gp) obj).y1(w02);
                }
            });
            R40.a(this.f18825u, new Q40() { // from class: com.google.android.gms.internal.ads.J50
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((InterfaceC2770gp) obj).G(w02.f1162o);
                }
            });
        }
    }

    public final void n(D2.N0 n02) {
        this.f18829y.set(n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void o(final InterfaceC1460Jo interfaceC1460Jo, final String str, final String str2) {
        S50 s50 = this.f18830z;
        if (s50 != null) {
            s50.o(interfaceC1460Jo, str, str2);
            return;
        }
        R40.a(this.f18825u, new Q40() { // from class: com.google.android.gms.internal.ads.R50
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                InterfaceC1460Jo interfaceC1460Jo2 = interfaceC1460Jo;
                ((InterfaceC2770gp) obj).g2(new BinderC4293up(interfaceC1460Jo2.a(), interfaceC1460Jo2.zzb()));
            }
        });
        R40.a(this.f18827w, new Q40() { // from class: com.google.android.gms.internal.ads.v50
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                InterfaceC1460Jo interfaceC1460Jo2 = interfaceC1460Jo;
                ((C3313lp) obj).q2(new BinderC4293up(interfaceC1460Jo2.a(), interfaceC1460Jo2.zzb()), str, str2);
            }
        });
        R40.a(this.f18826v, new Q40() { // from class: com.google.android.gms.internal.ads.w50
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC1704Qo) obj).J2(interfaceC1460Jo);
            }
        });
        R40.a(this.f18828x, new Q40() { // from class: com.google.android.gms.internal.ads.x50
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((C1495Ko) obj).q2(interfaceC1460Jo, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4560xD
    public final void p(final D2.e2 e2Var) {
        S50 s50 = this.f18830z;
        if (s50 != null) {
            s50.p(e2Var);
        } else {
            R40.a(this.f18829y, new Q40() { // from class: com.google.android.gms.internal.ads.D50
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((D2.N0) obj).O2(e2Var);
                }
            });
        }
    }

    public final void r(InterfaceC2770gp interfaceC2770gp) {
        this.f18825u.set(interfaceC2770gp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360mC
    public final void r0(final D2.W0 w02) {
        S50 s50 = this.f18830z;
        if (s50 != null) {
            s50.r0(w02);
            return;
        }
        final int i8 = w02.f1162o;
        R40.a(this.f18824t, new Q40() { // from class: com.google.android.gms.internal.ads.L50
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC3204kp) obj).y(w02);
            }
        });
        R40.a(this.f18824t, new Q40() { // from class: com.google.android.gms.internal.ads.M50
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC3204kp) obj).D(i8);
            }
        });
        R40.a(this.f18826v, new Q40() { // from class: com.google.android.gms.internal.ads.N50
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC1704Qo) obj).z(i8);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final void s() {
        S50 s50 = this.f18830z;
        if (s50 != null) {
            s50.s();
        } else {
            R40.a(this.f18824t, new Q40() { // from class: com.google.android.gms.internal.ads.E50
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((InterfaceC3204kp) obj).g();
                }
            });
            R40.a(this.f18826v, new Q40() { // from class: com.google.android.gms.internal.ads.F50
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((InterfaceC1704Qo) obj).f();
                }
            });
        }
    }

    public final void t(InterfaceC3204kp interfaceC3204kp) {
        this.f18824t.set(interfaceC3204kp);
    }

    public final void w(InterfaceC1704Qo interfaceC1704Qo) {
        this.f18826v.set(interfaceC1704Qo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3912rG
    public final void x() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void zza() {
        S50 s50 = this.f18830z;
        if (s50 != null) {
            s50.zza();
            return;
        }
        this.f18822o.a();
        R40.a(this.f18825u, new Q40() { // from class: com.google.android.gms.internal.ads.O50
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC2770gp) obj).g();
            }
        });
        R40.a(this.f18826v, new Q40() { // from class: com.google.android.gms.internal.ads.P50
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC1704Qo) obj).c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3033jC
    public final void zzb() {
        S50 s50 = this.f18830z;
        if (s50 != null) {
            s50.zzb();
        } else {
            R40.a(this.f18826v, new Q40() { // from class: com.google.android.gms.internal.ads.Q50
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((InterfaceC1704Qo) obj).e();
                }
            });
        }
    }
}
