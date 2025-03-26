package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.j40, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3018j40 implements InterfaceC3360mC, InterfaceC3144kD, InterfaceC2152b50, F2.z, InterfaceC4560xD, AC, InterfaceC3912rG {

    /* renamed from: o, reason: collision with root package name */
    private final C4222u70 f23168o;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference f23169s = new AtomicReference();

    /* renamed from: t, reason: collision with root package name */
    private final AtomicReference f23170t = new AtomicReference();

    /* renamed from: u, reason: collision with root package name */
    private final AtomicReference f23171u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    private final AtomicReference f23172v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReference f23173w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicReference f23174x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    private C3018j40 f23175y = null;

    public C3018j40(C4222u70 c4222u70) {
        this.f23168o = c4222u70;
    }

    public static C3018j40 a(C3018j40 c3018j40) {
        C3018j40 c3018j402 = new C3018j40(c3018j40.f23168o);
        c3018j402.f23175y = c3018j40;
        return c3018j402;
    }

    @Override // F2.z
    public final void D0() {
    }

    @Override // F2.z
    public final void I3() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3912rG
    public final void K0() {
        C3018j40 c3018j40 = this.f23175y;
        if (c3018j40 != null) {
            c3018j40.K0();
        } else {
            R40.a(this.f23171u, new Q40() { // from class: com.google.android.gms.internal.ads.a40
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((InterfaceC4812zc) obj).zzb();
                }
            });
        }
    }

    @Override // F2.z
    public final void W4(final int i8) {
        C3018j40 c3018j40 = this.f23175y;
        if (c3018j40 != null) {
            c3018j40.W4(i8);
        } else {
            R40.a(this.f23173w, new Q40() { // from class: com.google.android.gms.internal.ads.d40
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((F2.z) obj).W4(i8);
                }
            });
        }
    }

    public final void c() {
        C3018j40 c3018j40 = this.f23175y;
        if (c3018j40 != null) {
            c3018j40.c();
            return;
        }
        this.f23168o.a();
        R40.a(this.f23170t, new Q40() { // from class: com.google.android.gms.internal.ads.b40
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                androidx.appcompat.app.E.a(obj);
                throw null;
            }
        });
        R40.a(this.f23171u, new Q40() { // from class: com.google.android.gms.internal.ads.c40
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC4812zc) obj).a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2152b50
    public final void e(InterfaceC2152b50 interfaceC2152b50) {
        this.f23175y = (C3018j40) interfaceC2152b50;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3144kD
    public final void g() {
        C3018j40 c3018j40 = this.f23175y;
        if (c3018j40 != null) {
            c3018j40.g();
        } else {
            R40.a(this.f23172v, new Q40() { // from class: com.google.android.gms.internal.ads.g40
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((InterfaceC3144kD) obj).g();
                }
            });
        }
    }

    public final void i(final InterfaceC4049sc interfaceC4049sc) {
        C3018j40 c3018j40 = this.f23175y;
        if (c3018j40 != null) {
            c3018j40.i(interfaceC4049sc);
        } else {
            R40.a(this.f23169s, new Q40() { // from class: com.google.android.gms.internal.ads.Z30
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((InterfaceC4376vc) obj).P0(interfaceC4049sc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.AC
    public final void m(final D2.W0 w02) {
        C3018j40 c3018j40 = this.f23175y;
        if (c3018j40 != null) {
            c3018j40.m(w02);
        } else {
            R40.a(this.f23171u, new Q40() { // from class: com.google.android.gms.internal.ads.Y30
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((InterfaceC4812zc) obj).m0(w02);
                }
            });
        }
    }

    public final void n(F2.z zVar) {
        this.f23173w.set(zVar);
    }

    public final void o(D2.N0 n02) {
        this.f23174x.set(n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4560xD
    public final void p(final D2.e2 e2Var) {
        C3018j40 c3018j40 = this.f23175y;
        if (c3018j40 != null) {
            c3018j40.p(e2Var);
        } else {
            R40.a(this.f23174x, new Q40() { // from class: com.google.android.gms.internal.ads.T30
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((D2.N0) obj).O2(e2Var);
                }
            });
        }
    }

    @Override // F2.z
    public final void q2() {
        C3018j40 c3018j40 = this.f23175y;
        if (c3018j40 != null) {
            c3018j40.q2();
        } else {
            R40.a(this.f23173w, new Q40() { // from class: com.google.android.gms.internal.ads.X30
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((F2.z) obj).q2();
                }
            });
        }
    }

    public final void r(InterfaceC4376vc interfaceC4376vc) {
        this.f23169s.set(interfaceC4376vc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360mC
    public final void r0(final D2.W0 w02) {
        C3018j40 c3018j40 = this.f23175y;
        if (c3018j40 != null) {
            c3018j40.r0(w02);
        } else {
            R40.a(this.f23169s, new Q40() { // from class: com.google.android.gms.internal.ads.e40
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((InterfaceC4376vc) obj).L3(w02);
                }
            });
            R40.a(this.f23169s, new Q40() { // from class: com.google.android.gms.internal.ads.f40
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((InterfaceC4376vc) obj).A(w02.f1162o);
                }
            });
        }
    }

    @Override // F2.z
    public final void r3() {
        C3018j40 c3018j40 = this.f23175y;
        if (c3018j40 != null) {
            c3018j40.r3();
            return;
        }
        R40.a(this.f23173w, new Q40() { // from class: com.google.android.gms.internal.ads.i40
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((F2.z) obj).r3();
            }
        });
        R40.a(this.f23171u, new Q40() { // from class: com.google.android.gms.internal.ads.U30
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC4812zc) obj).c();
            }
        });
        R40.a(this.f23171u, new Q40() { // from class: com.google.android.gms.internal.ads.V30
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((InterfaceC4812zc) obj).b();
            }
        });
    }

    public final void t(InterfaceC4812zc interfaceC4812zc) {
        this.f23171u.set(interfaceC4812zc);
    }

    @Override // F2.z
    public final void w0() {
        C3018j40 c3018j40 = this.f23175y;
        if (c3018j40 != null) {
            c3018j40.w0();
        } else {
            R40.a(this.f23173w, new Q40() { // from class: com.google.android.gms.internal.ads.h40
                @Override // com.google.android.gms.internal.ads.Q40
                public final void a(Object obj) {
                    ((F2.z) obj).w0();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3912rG
    public final void x() {
    }
}
