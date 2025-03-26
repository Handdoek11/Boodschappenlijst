package U6;

import A6.g;

/* loaded from: classes2.dex */
public abstract class H {

    static final class a extends J6.s implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        public static final a f5399o = new a();

        a() {
            super(2);
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final A6.g invoke(A6.g gVar, g.b bVar) {
            return gVar.u(bVar);
        }
    }

    static final class b extends J6.s implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ J6.G f5400o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f5401s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(J6.G g8, boolean z7) {
            super(2);
            this.f5400o = g8;
            this.f5401s = z7;
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final A6.g invoke(A6.g gVar, g.b bVar) {
            return gVar.u(bVar);
        }
    }

    static final class c extends J6.s implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        public static final c f5402o = new c();

        c() {
            super(2);
        }

        public final Boolean b(boolean z7, g.b bVar) {
            return Boolean.valueOf(z7);
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Boolean) obj).booleanValue(), (g.b) obj2);
        }
    }

    private static final A6.g a(A6.g gVar, A6.g gVar2, boolean z7) {
        boolean c8 = c(gVar);
        boolean c9 = c(gVar2);
        if (!c8 && !c9) {
            return gVar.u(gVar2);
        }
        J6.G g8 = new J6.G();
        g8.f3547o = gVar2;
        A6.h hVar = A6.h.f250o;
        A6.g gVar3 = (A6.g) gVar.e(hVar, new b(g8, z7));
        if (c9) {
            g8.f3547o = ((A6.g) g8.f3547o).e(hVar, a.f5399o);
        }
        return gVar3.u((A6.g) g8.f3547o);
    }

    public static final String b(A6.g gVar) {
        return null;
    }

    private static final boolean c(A6.g gVar) {
        return ((Boolean) gVar.e(Boolean.FALSE, c.f5402o)).booleanValue();
    }

    public static final A6.g d(A6.g gVar, A6.g gVar2) {
        return !c(gVar2) ? gVar.u(gVar2) : a(gVar, gVar2, false);
    }

    public static final A6.g e(M m8, A6.g gVar) {
        A6.g a8 = a(m8.getCoroutineContext(), gVar, true);
        return (a8 == C0706b0.a() || a8.d(A6.e.f247a) != null) ? a8 : a8.u(C0706b0.a());
    }

    public static final U0 f(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof Y) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof U0) {
                return (U0) eVar;
            }
        }
        return null;
    }

    public static final U0 g(A6.d dVar, A6.g gVar, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e) || gVar.d(V0.f5428o) == null) {
            return null;
        }
        U0 f8 = f((kotlin.coroutines.jvm.internal.e) dVar);
        if (f8 != null) {
            f8.a1(gVar, obj);
        }
        return f8;
    }
}
