package Q;

import java.util.LinkedHashMap;
import java.util.Map;
import x6.C6916E;

/* loaded from: classes.dex */
public abstract class w extends v implements O.k {

    /* renamed from: i, reason: collision with root package name */
    private final B f4652i;

    /* renamed from: k, reason: collision with root package name */
    private Map f4654k;

    /* renamed from: m, reason: collision with root package name */
    private O.m f4656m;

    /* renamed from: j, reason: collision with root package name */
    private long f4653j = c0.m.f12088b.a();

    /* renamed from: l, reason: collision with root package name */
    private final O.i f4655l = new O.i(this);

    /* renamed from: n, reason: collision with root package name */
    private final Map f4657n = new LinkedHashMap();

    public w(B b8) {
        this.f4652i = b8;
    }

    private final void X(long j8) {
        if (c0.m.e(V(), j8)) {
            return;
        }
        Z(j8);
        T().p().u();
        J(this.f4652i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(O.m mVar) {
        C6916E c6916e;
        if (mVar != null) {
            D(c0.p.a(mVar.getWidth(), mVar.getHeight()));
            c6916e = C6916E.f44463a;
        } else {
            c6916e = null;
        }
        if (c6916e == null) {
            D(c0.o.f12091a.a());
        }
        if (J6.r.a(this.f4656m, mVar) || mVar == null) {
            return;
        }
        Map map = this.f4654k;
        if (((map == null || map.isEmpty()) && mVar.a().isEmpty()) || J6.r.a(mVar.a(), this.f4654k)) {
            return;
        }
        P().a().m();
        Map map2 = this.f4654k;
        if (map2 == null) {
            map2 = new LinkedHashMap();
            this.f4654k = map2;
        }
        map2.clear();
        map2.putAll(mVar.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // O.p
    public final void C(long j8, float f8, I6.l lVar) {
        X(j8);
        if (L()) {
            return;
        }
        W();
    }

    @Override // Q.v
    public boolean H() {
        return this.f4656m != null;
    }

    public InterfaceC0680b P() {
        InterfaceC0680b r8 = this.f4652i.p0().p().r();
        J6.r.b(r8);
        return r8;
    }

    protected final Map Q() {
        return this.f4657n;
    }

    public O.e R() {
        return this.f4655l;
    }

    public final B S() {
        return this.f4652i;
    }

    public p T() {
        return this.f4652i.p0();
    }

    public final O.i U() {
        return this.f4655l;
    }

    public long V() {
        return this.f4653j;
    }

    protected abstract void W();

    public final long Y(w wVar) {
        long a8 = c0.m.f12088b.a();
        w wVar2 = this;
        while (!J6.r.a(wVar2, wVar)) {
            long V7 = wVar2.V();
            a8 = c0.n.a(c0.m.f(a8) + c0.m.f(V7), c0.m.g(a8) + c0.m.g(V7));
            B y02 = wVar2.f4652i.y0();
            J6.r.b(y02);
            wVar2 = y02.q0();
            J6.r.b(wVar2);
        }
        return a8;
    }

    public void Z(long j8) {
        this.f4653j = j8;
    }

    @Override // c0.InterfaceC0973e
    public float d() {
        return this.f4652i.d();
    }
}
