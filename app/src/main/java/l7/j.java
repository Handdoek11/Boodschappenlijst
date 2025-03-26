package l7;

import i7.d;
import x6.C6916E;

/* loaded from: classes2.dex */
public final class j implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final j f38856a = new j();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38857b = i7.i.c("kotlinx.serialization.json.JsonElement", d.b.f36703a, new i7.f[0], a.f38858o);

    static final class a extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final a f38858o = new a();

        /* renamed from: l7.j$a$a, reason: collision with other inner class name */
        static final class C0287a extends J6.s implements I6.a {

            /* renamed from: o, reason: collision with root package name */
            public static final C0287a f38859o = new C0287a();

            C0287a() {
                super(0);
            }

            @Override // I6.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i7.f invoke() {
                return w.f38884a.getDescriptor();
            }
        }

        static final class b extends J6.s implements I6.a {

            /* renamed from: o, reason: collision with root package name */
            public static final b f38860o = new b();

            b() {
                super(0);
            }

            @Override // I6.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i7.f invoke() {
                return s.f38873a.getDescriptor();
            }
        }

        static final class c extends J6.s implements I6.a {

            /* renamed from: o, reason: collision with root package name */
            public static final c f38861o = new c();

            c() {
                super(0);
            }

            @Override // I6.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i7.f invoke() {
                return p.f38867a.getDescriptor();
            }
        }

        static final class d extends J6.s implements I6.a {

            /* renamed from: o, reason: collision with root package name */
            public static final d f38862o = new d();

            d() {
                super(0);
            }

            @Override // I6.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i7.f invoke() {
                return u.f38878a.getDescriptor();
            }
        }

        static final class e extends J6.s implements I6.a {

            /* renamed from: o, reason: collision with root package name */
            public static final e f38863o = new e();

            e() {
                super(0);
            }

            @Override // I6.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i7.f invoke() {
                return l7.c.f38825a.getDescriptor();
            }
        }

        a() {
            super(1);
        }

        public final void b(i7.a aVar) {
            J6.r.e(aVar, "$this$buildSerialDescriptor");
            i7.a.b(aVar, "JsonPrimitive", k.f(C0287a.f38859o), null, false, 12, null);
            i7.a.b(aVar, "JsonNull", k.f(b.f38860o), null, false, 12, null);
            i7.a.b(aVar, "JsonLiteral", k.f(c.f38861o), null, false, 12, null);
            i7.a.b(aVar, "JsonObject", k.f(d.f38862o), null, false, 12, null);
            i7.a.b(aVar, "JsonArray", k.f(e.f38863o), null, false, 12, null);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((i7.a) obj);
            return C6916E.f44463a;
        }
    }

    private j() {
    }

    @Override // g7.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public h deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return k.d(eVar).m();
    }

    @Override // g7.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(j7.f fVar, h hVar) {
        J6.r.e(fVar, "encoder");
        J6.r.e(hVar, "value");
        k.h(fVar);
        if (hVar instanceof v) {
            fVar.n(w.f38884a, hVar);
        } else if (hVar instanceof t) {
            fVar.n(u.f38878a, hVar);
        } else if (hVar instanceof b) {
            fVar.n(c.f38825a, hVar);
        }
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38857b;
    }
}
