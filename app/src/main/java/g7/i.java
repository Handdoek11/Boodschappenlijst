package g7;

import I6.p;
import J6.r;
import J6.s;
import java.util.List;
import k7.AbstractC6143o;
import k7.D0;
import k7.InterfaceC6144o0;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final D0 f36106a = AbstractC6143o.a(c.f36112o);

    /* renamed from: b, reason: collision with root package name */
    private static final D0 f36107b = AbstractC6143o.a(d.f36113o);

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC6144o0 f36108c = AbstractC6143o.b(a.f36110o);

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC6144o0 f36109d = AbstractC6143o.b(b.f36111o);

    static final class a extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final a f36110o = new a();

        a() {
            super(2);
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g7.b invoke(Q6.b bVar, List list) {
            r.e(bVar, "clazz");
            r.e(list, "types");
            List f8 = j.f(n7.c.a(), list, true);
            r.b(f8);
            return j.a(bVar, list, f8);
        }
    }

    static final class b extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final b f36111o = new b();

        b() {
            super(2);
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g7.b invoke(Q6.b bVar, List list) {
            g7.b t7;
            r.e(bVar, "clazz");
            r.e(list, "types");
            List f8 = j.f(n7.c.a(), list, true);
            r.b(f8);
            g7.b a8 = j.a(bVar, list, f8);
            if (a8 == null || (t7 = h7.a.t(a8)) == null) {
                return null;
            }
            return t7;
        }
    }

    static final class c extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final c f36112o = new c();

        c() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g7.b invoke(Q6.b bVar) {
            r.e(bVar, "it");
            return j.d(bVar);
        }
    }

    static final class d extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final d f36113o = new d();

        d() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g7.b invoke(Q6.b bVar) {
            g7.b t7;
            r.e(bVar, "it");
            g7.b d8 = j.d(bVar);
            if (d8 == null || (t7 = h7.a.t(d8)) == null) {
                return null;
            }
            return t7;
        }
    }

    public static final g7.b a(Q6.b bVar, boolean z7) {
        r.e(bVar, "clazz");
        if (z7) {
            return f36107b.a(bVar);
        }
        g7.b a8 = f36106a.a(bVar);
        if (a8 != null) {
            return a8;
        }
        return null;
    }

    public static final Object b(Q6.b bVar, List list, boolean z7) {
        r.e(bVar, "clazz");
        r.e(list, "types");
        return !z7 ? f36108c.a(bVar, list) : f36109d.a(bVar, list);
    }
}
