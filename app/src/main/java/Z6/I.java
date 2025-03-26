package Z6;

import A6.g;
import U6.R0;

/* loaded from: classes2.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final E f6454a = new E("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final I6.p f6455b = a.f6458o;

    /* renamed from: c, reason: collision with root package name */
    private static final I6.p f6456c = b.f6459o;

    /* renamed from: d, reason: collision with root package name */
    private static final I6.p f6457d = c.f6460o;

    static final class a extends J6.s implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        public static final a f6458o = new a();

        a() {
            super(2);
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof R0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    static final class b extends J6.s implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        public static final b f6459o = new b();

        b() {
            super(2);
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final R0 invoke(R0 r02, g.b bVar) {
            if (r02 != null) {
                return r02;
            }
            if (bVar instanceof R0) {
                return (R0) bVar;
            }
            return null;
        }
    }

    static final class c extends J6.s implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        public static final c f6460o = new c();

        c() {
            super(2);
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final M invoke(M m8, g.b bVar) {
            if (bVar instanceof R0) {
                R0 r02 = (R0) bVar;
                m8.a(r02, r02.m0(m8.f6463a));
            }
            return m8;
        }
    }

    public static final void a(A6.g gVar, Object obj) {
        if (obj == f6454a) {
            return;
        }
        if (obj instanceof M) {
            ((M) obj).b(gVar);
            return;
        }
        Object e8 = gVar.e(null, f6456c);
        J6.r.c(e8, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((R0) e8).h0(gVar, obj);
    }

    public static final Object b(A6.g gVar) {
        Object e8 = gVar.e(0, f6455b);
        J6.r.b(e8);
        return e8;
    }

    public static final Object c(A6.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f6454a;
        }
        if (obj instanceof Integer) {
            return gVar.e(new M(gVar, ((Number) obj).intValue()), f6457d);
        }
        J6.r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((R0) obj).m0(gVar);
    }
}
