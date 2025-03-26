package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class EA0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4773zA0 f14671a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14672b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14673c = false;

    public EA0(InterfaceC4773zA0 interfaceC4773zA0, int i8) {
        this.f14671a = interfaceC4773zA0;
        this.f14672b = i8;
    }

    private static boolean A(InterfaceC4773zA0 interfaceC4773zA0) {
        return interfaceC4773zA0.d() != 0;
    }

    private static final void a(InterfaceC4773zA0 interfaceC4773zA0) {
        if (interfaceC4773zA0.d() == 2) {
            interfaceC4773zA0.d0();
        }
    }

    public final int b() {
        return A(this.f14671a) ? 1 : 0;
    }

    public final int c() {
        return this.f14671a.zzb();
    }

    public final long d(C2053aA0 c2053aA0) {
        AbstractC3796qC.f(z(c2053aA0));
        return this.f14671a.v();
    }

    public final void e(Qy0 qy0) {
        InterfaceC4773zA0 interfaceC4773zA0 = this.f14671a;
        if (A(interfaceC4773zA0)) {
            qy0.c(interfaceC4773zA0);
            a(interfaceC4773zA0);
            interfaceC4773zA0.r();
        }
    }

    public final void f(DA0 da0, D[] dArr, InterfaceC4678yH0 interfaceC4678yH0, long j8, boolean z7, boolean z8, long j9, long j10, GG0 gg0, Qy0 qy0) {
        this.f14673c = true;
        this.f14671a.g(da0, dArr, interfaceC4678yH0, j8, z7, z8, j9, j10, gg0);
        qy0.d(this.f14671a);
    }

    public final void g() {
        if (A(this.f14671a)) {
            this.f14671a.t();
        }
    }

    public final void h(int i8, Object obj) {
        this.f14671a.x(11, obj);
    }

    public final void i() {
        this.f14671a.w();
    }

    public final void j() {
        this.f14671a.A();
        this.f14673c = false;
    }

    public final void k(long j8, long j9) {
        if (A(this.f14671a)) {
            this.f14671a.i(j8, j9);
        }
    }

    public final void l(D[] dArr, InterfaceC4678yH0 interfaceC4678yH0, long j8, long j9, GG0 gg0) {
        this.f14671a.n(dArr, interfaceC4678yH0, j8, j9, gg0);
    }

    public final void m() {
        if (this.f14673c) {
            this.f14671a.F();
            this.f14673c = false;
        }
    }

    public final void n(long j8) {
        if (A(this.f14671a)) {
            this.f14671a.l(j8);
        }
    }

    public final void o(long j8) {
        this.f14671a.R();
    }

    public final void p(float f8, float f9) {
        this.f14671a.s(f8, f9);
    }

    public final void q(AbstractC1981Yl abstractC1981Yl) {
        this.f14671a.c(abstractC1981Yl);
    }

    public final void r(Object obj) {
        if (this.f14671a.zzb() == 2) {
            this.f14671a.x(1, obj);
        }
    }

    public final void s() {
        if (this.f14671a.d() == 1) {
            this.f14671a.H();
        }
    }

    public final void t() {
        if (A(this.f14671a)) {
            a(this.f14671a);
        }
    }

    public final boolean u(C2053aA0 c2053aA0) {
        InterfaceC4678yH0 interfaceC4678yH0 = c2053aA0.f20650c[this.f14672b];
        InterfaceC4773zA0 interfaceC4773zA0 = this.f14671a;
        boolean z7 = interfaceC4678yH0 != interfaceC4773zA0.p();
        return z7 || (!z7 && interfaceC4773zA0.y()) || interfaceC4773zA0.Y() || interfaceC4773zA0.e();
    }

    public final boolean v(C2053aA0 c2053aA0) {
        InterfaceC4678yH0 interfaceC4678yH0 = c2053aA0.f20650c[this.f14672b];
        if (this.f14671a.p() != interfaceC4678yH0) {
            return false;
        }
        if (interfaceC4678yH0 == null || this.f14671a.y()) {
            return true;
        }
        c2053aA0.g();
        boolean z7 = c2053aA0.f20654g.f20831f;
        return false;
    }

    public final boolean w() {
        return this.f14671a.y();
    }

    public final boolean x() {
        return this.f14671a.z();
    }

    public final boolean y() {
        return this.f14671a.e();
    }

    public final boolean z(C2053aA0 c2053aA0) {
        InterfaceC4773zA0 interfaceC4773zA0 = null;
        if (c2053aA0 != null) {
            int i8 = this.f14672b;
            InterfaceC4678yH0[] interfaceC4678yH0Arr = c2053aA0.f20650c;
            if (interfaceC4678yH0Arr[i8] != null && this.f14671a.p() == interfaceC4678yH0Arr[i8]) {
                interfaceC4773zA0 = this.f14671a;
            }
        }
        return interfaceC4773zA0 != null;
    }
}
