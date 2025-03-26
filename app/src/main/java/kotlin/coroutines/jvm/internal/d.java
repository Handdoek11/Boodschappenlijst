package kotlin.coroutines.jvm.internal;

import A6.g;
import J6.r;

/* loaded from: classes2.dex */
public abstract class d extends a {
    private final A6.g _context;
    private transient A6.d intercepted;

    public d(A6.d dVar, A6.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // A6.d
    public A6.g getContext() {
        A6.g gVar = this._context;
        r.b(gVar);
        return gVar;
    }

    public final A6.d intercepted() {
        A6.d dVar = this.intercepted;
        if (dVar == null) {
            A6.e eVar = (A6.e) getContext().d(A6.e.f247a);
            if (eVar == null || (dVar = eVar.X(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        A6.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b d8 = getContext().d(A6.e.f247a);
            r.b(d8);
            ((A6.e) d8).z(dVar);
        }
        this.intercepted = c.f38752o;
    }

    public d(A6.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
