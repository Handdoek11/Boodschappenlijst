package A6;

import A6.g;
import I6.l;
import J6.r;

/* loaded from: classes2.dex */
public abstract class b implements g.c {

    /* renamed from: o, reason: collision with root package name */
    private final l f242o;

    /* renamed from: s, reason: collision with root package name */
    private final g.c f243s;

    public b(g.c cVar, l lVar) {
        r.e(cVar, "baseKey");
        r.e(lVar, "safeCast");
        this.f242o = lVar;
        this.f243s = cVar instanceof b ? ((b) cVar).f243s : cVar;
    }

    public final boolean a(g.c cVar) {
        r.e(cVar, "key");
        return cVar == this || this.f243s == cVar;
    }

    public final g.b b(g.b bVar) {
        r.e(bVar, "element");
        return (g.b) this.f242o.invoke(bVar);
    }
}
