package B5;

import I5.AbstractC0630d;
import I5.C0628b;
import I5.C0638l;
import J6.AbstractC0650j;
import J6.H;
import io.ktor.utils.io.f;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import v5.C6841a;
import w5.C6892a;
import x6.C6916E;
import x6.C6933o;
import y6.AbstractC6971J;
import y6.AbstractC6987o;
import z6.AbstractC7088a;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final b f578d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final N5.a f579e = new N5.a("HttpPlainText");

    /* renamed from: a, reason: collision with root package name */
    private final Charset f580a;

    /* renamed from: b, reason: collision with root package name */
    private final Charset f581b;

    /* renamed from: c, reason: collision with root package name */
    private final String f582c;

    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        private Charset f585c;

        /* renamed from: a, reason: collision with root package name */
        private final Set f583a = new LinkedHashSet();

        /* renamed from: b, reason: collision with root package name */
        private final Map f584b = new LinkedHashMap();

        /* renamed from: d, reason: collision with root package name */
        private Charset f586d = S6.d.f5130b;

        public final Map a() {
            return this.f584b;
        }

        public final Set b() {
            return this.f583a;
        }

        public final Charset c() {
            return this.f586d;
        }

        public final Charset d() {
            return this.f585c;
        }
    }

    public static final class b implements h {

        static final class a extends kotlin.coroutines.jvm.internal.l implements I6.q {

            /* renamed from: o, reason: collision with root package name */
            int f587o;

            /* renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f588s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f589t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ j f590u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, A6.d dVar) {
                super(3, dVar);
                this.f590u = jVar;
            }

            @Override // I6.q
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object d(T5.e eVar, Object obj, A6.d dVar) {
                a aVar = new a(this.f590u, dVar);
                aVar.f588s = eVar;
                aVar.f589t = obj;
                return aVar.invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f587o;
                if (i8 == 0) {
                    x6.q.b(obj);
                    T5.e eVar = (T5.e) this.f588s;
                    Object obj2 = this.f589t;
                    this.f590u.c((E5.c) eVar.b());
                    if (!(obj2 instanceof String)) {
                        return C6916E.f44463a;
                    }
                    C0628b d8 = I5.s.d((I5.r) eVar.b());
                    if (d8 != null && !J6.r.a(d8.e(), C0628b.c.f3248a.a().e())) {
                        return C6916E.f44463a;
                    }
                    Object e9 = this.f590u.e((E5.c) eVar.b(), (String) obj2, d8);
                    this.f588s = null;
                    this.f587o = 1;
                    if (eVar.e(e9, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x6.q.b(obj);
                }
                return C6916E.f44463a;
            }
        }

        /* renamed from: B5.j$b$b, reason: collision with other inner class name */
        static final class C0015b extends kotlin.coroutines.jvm.internal.l implements I6.q {

            /* renamed from: o, reason: collision with root package name */
            int f591o;

            /* renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f592s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f593t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ j f594u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0015b(j jVar, A6.d dVar) {
                super(3, dVar);
                this.f594u = jVar;
            }

            @Override // I6.q
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object d(T5.e eVar, F5.d dVar, A6.d dVar2) {
                C0015b c0015b = new C0015b(this.f594u, dVar2);
                c0015b.f592s = eVar;
                c0015b.f593t = dVar;
                return c0015b.invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.e eVar;
                U5.a aVar;
                Object e8 = B6.b.e();
                int i8 = this.f591o;
                if (i8 == 0) {
                    x6.q.b(obj);
                    T5.e eVar2 = (T5.e) this.f592s;
                    F5.d dVar = (F5.d) this.f593t;
                    U5.a a8 = dVar.a();
                    Object b8 = dVar.b();
                    if (!J6.r.a(a8.b(), H.b(String.class)) || !(b8 instanceof io.ktor.utils.io.f)) {
                        return C6916E.f44463a;
                    }
                    this.f592s = eVar2;
                    this.f593t = a8;
                    this.f591o = 1;
                    Object a9 = f.b.a((io.ktor.utils.io.f) b8, 0L, this, 1, null);
                    if (a9 == e8) {
                        return e8;
                    }
                    eVar = eVar2;
                    obj = a9;
                    aVar = a8;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        x6.q.b(obj);
                        return C6916E.f44463a;
                    }
                    aVar = (U5.a) this.f593t;
                    eVar = (T5.e) this.f592s;
                    x6.q.b(obj);
                }
                F5.d dVar2 = new F5.d(aVar, this.f594u.d((C6892a) eVar.b(), (X5.k) obj));
                this.f592s = null;
                this.f593t = null;
                this.f591o = 2;
                if (eVar.e(dVar2, this) == e8) {
                    return e8;
                }
                return C6916E.f44463a;
            }
        }

        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        @Override // B5.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, C6841a c6841a) {
            J6.r.e(jVar, "plugin");
            J6.r.e(c6841a, "scope");
            c6841a.j().l(E5.f.f2186g.b(), new a(jVar, null));
            c6841a.l().l(F5.f.f2401g.c(), new C0015b(jVar, null));
        }

        @Override // B5.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public j b(I6.l lVar) {
            J6.r.e(lVar, "block");
            a aVar = new a();
            lVar.invoke(aVar);
            return new j(aVar.b(), aVar.a(), aVar.d(), aVar.c());
        }

        @Override // B5.h
        public N5.a getKey() {
            return j.f579e;
        }

        private b() {
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC7088a.a(W5.a.i((Charset) obj), W5.a.i((Charset) obj2));
        }
    }

    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC7088a.a((Float) ((C6933o) obj2).d(), (Float) ((C6933o) obj).d());
        }
    }

    public j(Set set, Map map, Charset charset, Charset charset2) {
        J6.r.e(set, "charsets");
        J6.r.e(map, "charsetQuality");
        J6.r.e(charset2, "responseCharsetFallback");
        this.f580a = charset2;
        List<C6933o> U7 = AbstractC6987o.U(AbstractC6971J.p(map), new d());
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!map.containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> U8 = AbstractC6987o.U(arrayList, new c());
        StringBuilder sb = new StringBuilder();
        for (Charset charset3 : U8) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(W5.a.i(charset3));
        }
        for (C6933o c6933o : U7) {
            Charset charset4 = (Charset) c6933o.a();
            float floatValue = ((Number) c6933o.b()).floatValue();
            if (sb.length() > 0) {
                sb.append(",");
            }
            double d8 = floatValue;
            if (0.0d > d8 || d8 > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
            sb.append(W5.a.i(charset4) + ";q=" + (L6.a.a(100 * floatValue) / 100.0d));
        }
        if (sb.length() == 0) {
            sb.append(W5.a.i(this.f580a));
        }
        String sb2 = sb.toString();
        J6.r.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f582c = sb2;
        if (charset == null && (charset = (Charset) AbstractC6987o.D(U8)) == null) {
            C6933o c6933o2 = (C6933o) AbstractC6987o.D(U7);
            charset = c6933o2 != null ? (Charset) c6933o2.c() : null;
            if (charset == null) {
                charset = S6.d.f5130b;
            }
        }
        this.f581b = charset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(E5.c cVar, String str, C0628b c0628b) {
        Charset charset;
        C0628b a8 = c0628b == null ? C0628b.c.f3248a.a() : c0628b;
        if (c0628b == null || (charset = AbstractC0630d.a(c0628b)) == null) {
            charset = this.f581b;
        }
        k.f595a.b("Sending request body to " + cVar.i() + " as text/plain with charset " + charset);
        return new J5.c(str, AbstractC0630d.b(a8, charset), null, 4, null);
    }

    public final void c(E5.c cVar) {
        J6.r.e(cVar, "context");
        C0638l a8 = cVar.a();
        I5.o oVar = I5.o.f3324a;
        if (a8.i(oVar.d()) != null) {
            return;
        }
        k.f595a.b("Adding Accept-Charset=" + this.f582c + " to " + cVar.i());
        cVar.a().l(oVar.d(), this.f582c);
    }

    public final String d(C6892a c6892a, X5.n nVar) {
        J6.r.e(c6892a, "call");
        J6.r.e(nVar, "body");
        Charset a8 = I5.s.a(c6892a.e());
        if (a8 == null) {
            a8 = this.f580a;
        }
        k.f595a.b("Reading response body for " + c6892a.d().k() + " as String with charset " + a8);
        return X5.r.e(nVar, a8, 0, 2, null);
    }
}
