package Q;

import O.p;
import c0.AbstractC0972d;

/* loaded from: classes.dex */
public abstract class v extends O.p implements O.n {

    /* renamed from: f, reason: collision with root package name */
    private boolean f4649f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4650g;

    /* renamed from: h, reason: collision with root package name */
    private final p.a f4651h = O.q.a(this);

    public abstract int F(O.a aVar);

    public final int G(O.a aVar) {
        int F7;
        if (H() && (F7 = F(aVar)) != Integer.MIN_VALUE) {
            return F7 + c0.m.g(u());
        }
        return Integer.MIN_VALUE;
    }

    public abstract boolean H();

    public final p.a I() {
        return this.f4651h;
    }

    protected final void J(B b8) {
        AbstractC0679a a8;
        B x02 = b8.x0();
        if (!J6.r.a(x02 != null ? x02.p0() : null, b8.p0())) {
            b8.l0().a().m();
            return;
        }
        InterfaceC0680b f8 = b8.l0().f();
        if (f8 == null || (a8 = f8.a()) == null) {
            return;
        }
        a8.m();
    }

    public final boolean K() {
        return this.f4650g;
    }

    public final boolean L() {
        return this.f4649f;
    }

    public final void M(boolean z7) {
        this.f4650g = z7;
    }

    @Override // c0.InterfaceC0973e
    public /* synthetic */ float l(float f8) {
        return AbstractC0972d.a(this, f8);
    }

    @Override // c0.InterfaceC0973e
    public /* synthetic */ long q(long j8) {
        return AbstractC0972d.b(this, j8);
    }
}
