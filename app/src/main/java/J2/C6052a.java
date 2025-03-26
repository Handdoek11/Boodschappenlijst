package j2;

import androidx.appcompat.app.E;
import m2.C6187a;
import m2.C6188b;
import m2.C6189c;
import m2.C6190d;
import m2.C6191e;
import m2.C6192f;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6052a implements B4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final B4.a f38133a = new C6052a();

    /* renamed from: j2.a$a, reason: collision with other inner class name */
    private static final class C0279a implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final C0279a f38134a = new C0279a();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f38135b = A4.b.a("window").b(D4.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f38136c = A4.b.a("logSourceMetrics").b(D4.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f38137d = A4.b.a("globalMetrics").b(D4.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f38138e = A4.b.a("appNamespace").b(D4.a.b().c(4).a()).a();

        private C0279a() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C6187a c6187a, A4.d dVar) {
            dVar.a(f38135b, c6187a.d());
            dVar.a(f38136c, c6187a.c());
            dVar.a(f38137d, c6187a.b());
            dVar.a(f38138e, c6187a.a());
        }
    }

    /* renamed from: j2.a$b */
    private static final class b implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final b f38139a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f38140b = A4.b.a("storageMetrics").b(D4.a.b().c(1).a()).a();

        private b() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C6188b c6188b, A4.d dVar) {
            dVar.a(f38140b, c6188b.a());
        }
    }

    /* renamed from: j2.a$c */
    private static final class c implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final c f38141a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f38142b = A4.b.a("eventsDroppedCount").b(D4.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f38143c = A4.b.a("reason").b(D4.a.b().c(3).a()).a();

        private c() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C6189c c6189c, A4.d dVar) {
            dVar.f(f38142b, c6189c.a());
            dVar.a(f38143c, c6189c.b());
        }
    }

    /* renamed from: j2.a$d */
    private static final class d implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final d f38144a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f38145b = A4.b.a("logSource").b(D4.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f38146c = A4.b.a("logEventDropped").b(D4.a.b().c(2).a()).a();

        private d() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C6190d c6190d, A4.d dVar) {
            dVar.a(f38145b, c6190d.b());
            dVar.a(f38146c, c6190d.a());
        }
    }

    /* renamed from: j2.a$e */
    private static final class e implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final e f38147a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f38148b = A4.b.d("clientMetrics");

        private e() {
        }

        @Override // A4.c
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            E.a(obj);
            b(null, (A4.d) obj2);
        }

        public void b(AbstractC6064m abstractC6064m, A4.d dVar) {
            throw null;
        }
    }

    /* renamed from: j2.a$f */
    private static final class f implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final f f38149a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f38150b = A4.b.a("currentCacheSizeBytes").b(D4.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f38151c = A4.b.a("maxCacheSizeBytes").b(D4.a.b().c(2).a()).a();

        private f() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C6191e c6191e, A4.d dVar) {
            dVar.f(f38150b, c6191e.a());
            dVar.f(f38151c, c6191e.b());
        }
    }

    /* renamed from: j2.a$g */
    private static final class g implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final g f38152a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f38153b = A4.b.a("startMs").b(D4.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f38154c = A4.b.a("endMs").b(D4.a.b().c(2).a()).a();

        private g() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C6192f c6192f, A4.d dVar) {
            dVar.f(f38153b, c6192f.b());
            dVar.f(f38154c, c6192f.a());
        }
    }

    private C6052a() {
    }

    @Override // B4.a
    public void a(B4.b bVar) {
        bVar.a(AbstractC6064m.class, e.f38147a);
        bVar.a(C6187a.class, C0279a.f38134a);
        bVar.a(C6192f.class, g.f38152a);
        bVar.a(C6190d.class, d.f38144a);
        bVar.a(C6189c.class, c.f38141a);
        bVar.a(C6188b.class, b.f38139a);
        bVar.a(C6191e.class, f.f38149a);
    }
}
