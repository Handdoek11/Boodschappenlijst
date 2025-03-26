package O;

import F.d;
import J6.r;
import Q.B;
import Q.w;

/* loaded from: classes.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    private final w f4211a;

    public i(w wVar) {
        this.f4211a = wVar;
    }

    private final long b() {
        w a8 = j.a(this.f4211a);
        e R7 = a8.R();
        d.a aVar = F.d.f2214a;
        return F.d.i(m(R7, aVar.b()), a().m(a8.S(), aVar.b()));
    }

    public final B a() {
        return this.f4211a.S();
    }

    @Override // O.e
    public long c(long j8) {
        return a().c(F.d.j(j8, b()));
    }

    @Override // O.e
    public boolean g() {
        return a().g();
    }

    @Override // O.e
    public long h() {
        w wVar = this.f4211a;
        return c0.p.a(wVar.A(), wVar.v());
    }

    @Override // O.e
    public F.f i(e eVar, boolean z7) {
        return a().i(eVar, z7);
    }

    @Override // O.e
    public e k() {
        w q02;
        if (!g()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        B y02 = a().p0().C().y0();
        if (y02 == null || (q02 = y02.q0()) == null) {
            return null;
        }
        return q02.R();
    }

    @Override // O.e
    public long m(e eVar, long j8) {
        if (!(eVar instanceof i)) {
            w a8 = j.a(this.f4211a);
            return F.d.j(m(a8.U(), j8), a8.S().m0().m(eVar, F.d.f2214a.b()));
        }
        w wVar = ((i) eVar).f4211a;
        wVar.S().N0();
        w q02 = a().i0(wVar.S()).q0();
        if (q02 != null) {
            long Y7 = wVar.Y(q02);
            long a9 = c0.n.a(L6.a.a(F.d.f(j8)), L6.a.a(F.d.g(j8)));
            long a10 = c0.n.a(c0.m.f(Y7) + c0.m.f(a9), c0.m.g(Y7) + c0.m.g(a9));
            long Y8 = this.f4211a.Y(q02);
            long a11 = c0.n.a(c0.m.f(a10) - c0.m.f(Y8), c0.m.g(a10) - c0.m.g(Y8));
            return F.e.a(c0.m.f(a11), c0.m.g(a11));
        }
        w a12 = j.a(wVar);
        long Y9 = wVar.Y(a12);
        long V7 = a12.V();
        long a13 = c0.n.a(c0.m.f(Y9) + c0.m.f(V7), c0.m.g(Y9) + c0.m.g(V7));
        long a14 = c0.n.a(L6.a.a(F.d.f(j8)), L6.a.a(F.d.g(j8)));
        long a15 = c0.n.a(c0.m.f(a13) + c0.m.f(a14), c0.m.g(a13) + c0.m.g(a14));
        w wVar2 = this.f4211a;
        long Y10 = wVar2.Y(j.a(wVar2));
        long V8 = j.a(wVar2).V();
        long a16 = c0.n.a(c0.m.f(Y10) + c0.m.f(V8), c0.m.g(Y10) + c0.m.g(V8));
        long a17 = c0.n.a(c0.m.f(a15) - c0.m.f(a16), c0.m.g(a15) - c0.m.g(a16));
        B y02 = j.a(this.f4211a).S().y0();
        r.b(y02);
        B y03 = a12.S().y0();
        r.b(y03);
        return y02.m(y03, F.e.a(c0.m.f(a17), c0.m.g(a17)));
    }
}
