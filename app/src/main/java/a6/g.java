package A6;

import A6.e;
import I6.p;
import J6.r;
import J6.s;

/* loaded from: classes2.dex */
public interface g {

    public static final class a {

        /* renamed from: A6.g$a$a, reason: collision with other inner class name */
        static final class C0002a extends s implements p {

            /* renamed from: o, reason: collision with root package name */
            public static final C0002a f249o = new C0002a();

            C0002a() {
                super(2);
            }

            @Override // I6.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g invoke(g gVar, b bVar) {
                A6.c cVar;
                r.e(gVar, "acc");
                r.e(bVar, "element");
                g f8 = gVar.f(bVar.getKey());
                h hVar = h.f250o;
                if (f8 == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.f247a;
                e eVar = (e) f8.d(bVar2);
                if (eVar == null) {
                    cVar = new A6.c(f8, bVar);
                } else {
                    g f9 = f8.f(bVar2);
                    if (f9 == hVar) {
                        return new A6.c(bVar, eVar);
                    }
                    cVar = new A6.c(new A6.c(f9, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            r.e(gVar2, "context");
            return gVar2 == h.f250o ? gVar : (g) gVar2.e(gVar, C0002a.f249o);
        }
    }

    public interface b extends g {

        public static final class a {
            public static Object a(b bVar, Object obj, p pVar) {
                r.e(pVar, "operation");
                return pVar.invoke(obj, bVar);
            }

            public static b b(b bVar, c cVar) {
                r.e(cVar, "key");
                if (!r.a(bVar.getKey(), cVar)) {
                    return null;
                }
                r.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static g c(b bVar, c cVar) {
                r.e(cVar, "key");
                return r.a(bVar.getKey(), cVar) ? h.f250o : bVar;
            }

            public static g d(b bVar, g gVar) {
                r.e(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        @Override // A6.g
        b d(c cVar);

        @Override // A6.g
        Object e(Object obj, p pVar);

        @Override // A6.g
        g f(c cVar);

        c getKey();
    }

    public interface c {
    }

    b d(c cVar);

    Object e(Object obj, p pVar);

    g f(c cVar);

    g u(g gVar);
}
