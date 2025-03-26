package A6;

import A6.g;
import I6.p;
import J6.r;

/* loaded from: classes2.dex */
public abstract class a implements g.b {

    /* renamed from: o, reason: collision with root package name */
    private final g.c f241o;

    public a(g.c cVar) {
        r.e(cVar, "key");
        this.f241o = cVar;
    }

    @Override // A6.g.b, A6.g
    public g.b d(g.c cVar) {
        return g.b.a.b(this, cVar);
    }

    @Override // A6.g.b, A6.g
    public Object e(Object obj, p pVar) {
        return g.b.a.a(this, obj, pVar);
    }

    @Override // A6.g.b, A6.g
    public g f(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // A6.g.b
    public g.c getKey() {
        return this.f241o;
    }

    @Override // A6.g
    public g u(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
