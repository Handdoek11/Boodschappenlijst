package A6;

import A6.g;
import I6.p;
import J6.r;
import J6.s;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class c implements g, Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final g f244o;

    /* renamed from: s, reason: collision with root package name */
    private final g.b f245s;

    static final class a extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final a f246o = new a();

        a() {
            super(2);
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, g.b bVar) {
            r.e(str, "acc");
            r.e(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(g gVar, g.b bVar) {
        r.e(gVar, "left");
        r.e(bVar, "element");
        this.f244o = gVar;
        this.f245s = bVar;
    }

    private final boolean a(g.b bVar) {
        return r.a(d(bVar.getKey()), bVar);
    }

    private final boolean b(c cVar) {
        while (a(cVar.f245s)) {
            g gVar = cVar.f244o;
            if (!(gVar instanceof c)) {
                r.c(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return a((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    private final int c() {
        int i8 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f244o;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i8;
            }
            i8++;
        }
    }

    @Override // A6.g
    public g.b d(g.c cVar) {
        r.e(cVar, "key");
        c cVar2 = this;
        while (true) {
            g.b d8 = cVar2.f245s.d(cVar);
            if (d8 != null) {
                return d8;
            }
            g gVar = cVar2.f244o;
            if (!(gVar instanceof c)) {
                return gVar.d(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    @Override // A6.g
    public Object e(Object obj, p pVar) {
        r.e(pVar, "operation");
        return pVar.invoke(this.f244o.e(obj, pVar), this.f245s);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.c() != c() || !cVar.b(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // A6.g
    public g f(g.c cVar) {
        r.e(cVar, "key");
        if (this.f245s.d(cVar) != null) {
            return this.f244o;
        }
        g f8 = this.f244o.f(cVar);
        return f8 == this.f244o ? this : f8 == h.f250o ? this.f245s : new c(f8, this.f245s);
    }

    public int hashCode() {
        return this.f244o.hashCode() + this.f245s.hashCode();
    }

    public String toString() {
        return '[' + ((String) e("", a.f246o)) + ']';
    }

    @Override // A6.g
    public g u(g gVar) {
        return g.a.a(this, gVar);
    }
}
