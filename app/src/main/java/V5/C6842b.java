package v5;

import B5.h;
import B5.i;
import I6.l;
import J6.r;
import J6.s;
import N5.q;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import x6.C6916E;
import y5.f;

/* renamed from: v5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6842b {

    /* renamed from: g, reason: collision with root package name */
    private boolean f44126g;

    /* renamed from: a, reason: collision with root package name */
    private final Map f44120a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f44121b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f44122c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    private l f44123d = a.f44128o;

    /* renamed from: e, reason: collision with root package name */
    private boolean f44124e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f44125f = true;

    /* renamed from: h, reason: collision with root package name */
    private boolean f44127h = q.f4190a.b();

    /* renamed from: v5.b$a */
    static final class a extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        public static final a f44128o = new a();

        a() {
            super(1);
        }

        public final void b(f fVar) {
            r.e(fVar, "$this$null");
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((f) obj);
            return C6916E.f44463a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v5.b$b, reason: collision with other inner class name */
    public static final class C0341b extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        public static final C0341b f44129o = new C0341b();

        C0341b() {
            super(1);
        }

        public final void b(Object obj) {
            r.e(obj, "$this$null");
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return C6916E.f44463a;
        }
    }

    /* renamed from: v5.b$c */
    static final class c extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ l f44130o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ l f44131s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l lVar, l lVar2) {
            super(1);
            this.f44130o = lVar;
            this.f44131s = lVar2;
        }

        public final void b(Object obj) {
            r.e(obj, "$this$null");
            l lVar = this.f44130o;
            if (lVar != null) {
                lVar.invoke(obj);
            }
            this.f44131s.invoke(obj);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return C6916E.f44463a;
        }
    }

    /* renamed from: v5.b$d */
    static final class d extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ h f44132o;

        /* renamed from: v5.b$d$a */
        static final class a extends s implements I6.a {

            /* renamed from: o, reason: collision with root package name */
            public static final a f44133o = new a();

            a() {
                super(0);
            }

            @Override // I6.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final N5.b invoke() {
                return N5.d.a(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h hVar) {
            super(1);
            this.f44132o = hVar;
        }

        public final void b(C6841a c6841a) {
            r.e(c6841a, "scope");
            N5.b bVar = (N5.b) c6841a.G().g(i.a(), a.f44133o);
            Object obj = c6841a.e().f44121b.get(this.f44132o.getKey());
            r.b(obj);
            Object b8 = this.f44132o.b((l) obj);
            this.f44132o.a(b8, c6841a);
            bVar.f(this.f44132o.getKey(), b8);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C6841a) obj);
            return C6916E.f44463a;
        }
    }

    public static /* synthetic */ void j(C6842b c6842b, h hVar, l lVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            lVar = C0341b.f44129o;
        }
        c6842b.g(hVar, lVar);
    }

    public final boolean b() {
        return this.f44127h;
    }

    public final l c() {
        return this.f44123d;
    }

    public final boolean d() {
        return this.f44126g;
    }

    public final boolean e() {
        return this.f44124e;
    }

    public final boolean f() {
        return this.f44125f;
    }

    public final void g(h hVar, l lVar) {
        r.e(hVar, "plugin");
        r.e(lVar, "configure");
        this.f44121b.put(hVar.getKey(), new c((l) this.f44121b.get(hVar.getKey()), lVar));
        if (this.f44120a.containsKey(hVar.getKey())) {
            return;
        }
        this.f44120a.put(hVar.getKey(), new d(hVar));
    }

    public final void h(String str, l lVar) {
        r.e(str, "key");
        r.e(lVar, "block");
        this.f44122c.put(str, lVar);
    }

    public final void i(C6841a c6841a) {
        r.e(c6841a, "client");
        Iterator it = this.f44120a.values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(c6841a);
        }
        Iterator it2 = this.f44122c.values().iterator();
        while (it2.hasNext()) {
            ((l) it2.next()).invoke(c6841a);
        }
    }

    public final void k(C6842b c6842b) {
        r.e(c6842b, "other");
        this.f44124e = c6842b.f44124e;
        this.f44125f = c6842b.f44125f;
        this.f44126g = c6842b.f44126g;
        this.f44120a.putAll(c6842b.f44120a);
        this.f44121b.putAll(c6842b.f44121b);
        this.f44122c.putAll(c6842b.f44122c);
    }
}
