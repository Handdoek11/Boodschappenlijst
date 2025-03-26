package E5;

import I5.C0638l;
import I5.D;
import I5.InterfaceC0637k;
import I5.J;
import I5.K;
import I5.r;
import I5.t;
import J6.AbstractC0650j;
import J6.s;
import N5.v;
import U6.InterfaceC0745v0;
import U6.Q0;
import java.util.LinkedHashMap;
import java.util.Map;
import y5.InterfaceC6961d;

/* loaded from: classes2.dex */
public final class c implements r {

    /* renamed from: g, reason: collision with root package name */
    public static final a f2171g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final D f2172a = new D(null, null, 0, null, null, null, null, null, false, 511, null);

    /* renamed from: b, reason: collision with root package name */
    private t f2173b = t.f3376b.a();

    /* renamed from: c, reason: collision with root package name */
    private final C0638l f2174c = new C0638l(0, 1, null);

    /* renamed from: d, reason: collision with root package name */
    private Object f2175d = G5.d.f2761a;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC0745v0 f2176e = Q0.b(null, 1, null);

    /* renamed from: f, reason: collision with root package name */
    private final N5.b f2177f = N5.d.a(true);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    static final class b extends s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final b f2178o = new b();

        b() {
            super(0);
        }

        @Override // I6.a
        public final Map invoke() {
            return new LinkedHashMap();
        }
    }

    @Override // I5.r
    public C0638l a() {
        return this.f2174c;
    }

    public final d b() {
        K b8 = this.f2172a.b();
        t tVar = this.f2173b;
        InterfaceC0637k o8 = a().o();
        Object obj = this.f2175d;
        J5.b bVar = obj instanceof J5.b ? (J5.b) obj : null;
        if (bVar != null) {
            return new d(b8, tVar, o8, bVar, this.f2176e, this.f2177f);
        }
        throw new IllegalStateException(("No request transformation found: " + this.f2175d).toString());
    }

    public final N5.b c() {
        return this.f2177f;
    }

    public final Object d() {
        return this.f2175d;
    }

    public final U5.a e() {
        return (U5.a) this.f2177f.c(i.a());
    }

    public final Object f(InterfaceC6961d interfaceC6961d) {
        J6.r.e(interfaceC6961d, "key");
        Map map = (Map) this.f2177f.c(y5.e.a());
        if (map != null) {
            return map.get(interfaceC6961d);
        }
        return null;
    }

    public final InterfaceC0745v0 g() {
        return this.f2176e;
    }

    public final t h() {
        return this.f2173b;
    }

    public final D i() {
        return this.f2172a;
    }

    public final void j(Object obj) {
        J6.r.e(obj, "<set-?>");
        this.f2175d = obj;
    }

    public final void k(U5.a aVar) {
        if (aVar != null) {
            this.f2177f.f(i.a(), aVar);
        } else {
            this.f2177f.a(i.a());
        }
    }

    public final void l(InterfaceC6961d interfaceC6961d, Object obj) {
        J6.r.e(interfaceC6961d, "key");
        J6.r.e(obj, "capability");
        ((Map) this.f2177f.g(y5.e.a(), b.f2178o)).put(interfaceC6961d, obj);
    }

    public final void m(InterfaceC0745v0 interfaceC0745v0) {
        J6.r.e(interfaceC0745v0, "<set-?>");
        this.f2176e = interfaceC0745v0;
    }

    public final void n(t tVar) {
        J6.r.e(tVar, "<set-?>");
        this.f2173b = tVar;
    }

    public final c o(c cVar) {
        J6.r.e(cVar, "builder");
        this.f2173b = cVar.f2173b;
        this.f2175d = cVar.f2175d;
        k(cVar.e());
        J.f(this.f2172a, cVar.f2172a);
        D d8 = this.f2172a;
        d8.u(d8.g());
        v.c(a(), cVar.a());
        N5.e.a(this.f2177f, cVar.f2177f);
        return this;
    }

    public final c p(c cVar) {
        J6.r.e(cVar, "builder");
        this.f2176e = cVar.f2176e;
        return o(cVar);
    }
}
