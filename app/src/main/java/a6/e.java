package A6;

import A6.g;
import J6.r;

/* loaded from: classes2.dex */
public interface e extends g.b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f247a = b.f248o;

    public static final class a {
        public static g.b a(e eVar, g.c cVar) {
            r.e(cVar, "key");
            if (!(cVar instanceof A6.b)) {
                if (e.f247a != cVar) {
                    return null;
                }
                r.c(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
            A6.b bVar = (A6.b) cVar;
            if (!bVar.a(eVar.getKey())) {
                return null;
            }
            g.b b8 = bVar.b(eVar);
            if (b8 instanceof g.b) {
                return b8;
            }
            return null;
        }

        public static g b(e eVar, g.c cVar) {
            r.e(cVar, "key");
            if (!(cVar instanceof A6.b)) {
                return e.f247a == cVar ? h.f250o : eVar;
            }
            A6.b bVar = (A6.b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f250o;
        }
    }

    public static final class b implements g.c {

        /* renamed from: o, reason: collision with root package name */
        static final /* synthetic */ b f248o = new b();

        private b() {
        }
    }

    d X(d dVar);

    void z(d dVar);
}
