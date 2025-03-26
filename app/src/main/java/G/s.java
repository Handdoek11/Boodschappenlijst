package G;

import c0.AbstractC0972d;
import c0.InterfaceC0973e;

/* loaded from: classes.dex */
public final class s implements k {

    /* renamed from: a, reason: collision with root package name */
    private int f2496a;

    /* renamed from: e, reason: collision with root package name */
    private float f2500e;

    /* renamed from: f, reason: collision with root package name */
    private float f2501f;

    /* renamed from: g, reason: collision with root package name */
    private float f2502g;

    /* renamed from: j, reason: collision with root package name */
    private float f2505j;

    /* renamed from: k, reason: collision with root package name */
    private float f2506k;

    /* renamed from: l, reason: collision with root package name */
    private float f2507l;

    /* renamed from: p, reason: collision with root package name */
    private boolean f2511p;

    /* renamed from: b, reason: collision with root package name */
    private float f2497b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    private float f2498c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f2499d = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    private long f2503h = l.a();

    /* renamed from: i, reason: collision with root package name */
    private long f2504i = l.a();

    /* renamed from: m, reason: collision with root package name */
    private float f2508m = 8.0f;

    /* renamed from: n, reason: collision with root package name */
    private long f2509n = v.f2515a.a();

    /* renamed from: o, reason: collision with root package name */
    private u f2510o = q.a();

    /* renamed from: q, reason: collision with root package name */
    private int f2512q = i.f2472a.a();

    /* renamed from: r, reason: collision with root package name */
    private long f2513r = F.g.f2224a.a();

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC0973e f2514s = c0.g.b(1.0f, 0.0f, 2, null);

    public final void a() {
        n(1.0f);
        o(1.0f);
        b(1.0f);
        v(0.0f);
        w(0.0f);
        p(0.0f);
        c(l.a());
        t(l.a());
        j(0.0f);
        k(0.0f);
        m(0.0f);
        e(8.0f);
        u(v.f2515a.a());
        r(q.a());
        f(false);
        i(null);
        g(i.f2472a.a());
        s(F.g.f2224a.a());
        this.f2496a = 0;
    }

    public void b(float f8) {
        if (this.f2499d == f8) {
            return;
        }
        this.f2496a |= 4;
        this.f2499d = f8;
    }

    public void c(long j8) {
        if (g.e(this.f2503h, j8)) {
            return;
        }
        this.f2496a |= 64;
        this.f2503h = j8;
    }

    @Override // c0.InterfaceC0973e
    public float d() {
        return this.f2514s.d();
    }

    public void e(float f8) {
        if (this.f2508m == f8) {
            return;
        }
        this.f2496a |= 2048;
        this.f2508m = f8;
    }

    public void f(boolean z7) {
        if (this.f2511p != z7) {
            this.f2496a |= 16384;
            this.f2511p = z7;
        }
    }

    public void g(int i8) {
        if (i.c(this.f2512q, i8)) {
            return;
        }
        this.f2496a |= 32768;
        this.f2512q = i8;
    }

    public final void h(InterfaceC0973e interfaceC0973e) {
        this.f2514s = interfaceC0973e;
    }

    public void i(r rVar) {
        if (J6.r.a(null, rVar)) {
            return;
        }
        this.f2496a |= 131072;
    }

    public void j(float f8) {
        if (this.f2505j == f8) {
            return;
        }
        this.f2496a |= 256;
        this.f2505j = f8;
    }

    public void k(float f8) {
        if (this.f2506k == f8) {
            return;
        }
        this.f2496a |= 512;
        this.f2506k = f8;
    }

    @Override // c0.InterfaceC0973e
    public /* synthetic */ float l(float f8) {
        return AbstractC0972d.a(this, f8);
    }

    public void m(float f8) {
        if (this.f2507l == f8) {
            return;
        }
        this.f2496a |= 1024;
        this.f2507l = f8;
    }

    public void n(float f8) {
        if (this.f2497b == f8) {
            return;
        }
        this.f2496a |= 1;
        this.f2497b = f8;
    }

    public void o(float f8) {
        if (this.f2498c == f8) {
            return;
        }
        this.f2496a |= 2;
        this.f2498c = f8;
    }

    public void p(float f8) {
        if (this.f2502g == f8) {
            return;
        }
        this.f2496a |= 32;
        this.f2502g = f8;
    }

    @Override // c0.InterfaceC0973e
    public /* synthetic */ long q(long j8) {
        return AbstractC0972d.b(this, j8);
    }

    public void r(u uVar) {
        if (J6.r.a(this.f2510o, uVar)) {
            return;
        }
        this.f2496a |= 8192;
        this.f2510o = uVar;
    }

    public void s(long j8) {
        this.f2513r = j8;
    }

    public void t(long j8) {
        if (g.e(this.f2504i, j8)) {
            return;
        }
        this.f2496a |= 128;
        this.f2504i = j8;
    }

    public void u(long j8) {
        if (v.c(this.f2509n, j8)) {
            return;
        }
        this.f2496a |= 4096;
        this.f2509n = j8;
    }

    public void v(float f8) {
        if (this.f2500e == f8) {
            return;
        }
        this.f2496a |= 8;
        this.f2500e = f8;
    }

    public void w(float f8) {
        if (this.f2501f == f8) {
            return;
        }
        this.f2496a |= 16;
        this.f2501f = f8;
    }
}
