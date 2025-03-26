package U6;

import A6.g;

/* loaded from: classes2.dex */
final class V0 implements g.b, g.c {

    /* renamed from: o, reason: collision with root package name */
    public static final V0 f5428o = new V0();

    private V0() {
    }

    @Override // A6.g.b, A6.g
    public g.b d(g.c cVar) {
        return g.b.a.b(this, cVar);
    }

    @Override // A6.g.b, A6.g
    public Object e(Object obj, I6.p pVar) {
        return g.b.a.a(this, obj, pVar);
    }

    @Override // A6.g.b, A6.g
    public A6.g f(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // A6.g
    public A6.g u(A6.g gVar) {
        return g.b.a.d(this, gVar);
    }

    @Override // A6.g.b
    public g.c getKey() {
        return this;
    }
}
