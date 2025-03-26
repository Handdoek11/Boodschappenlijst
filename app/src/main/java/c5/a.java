package C5;

import B5.h;
import E5.f;
import I5.C0628b;
import I5.InterfaceC0629c;
import I5.K;
import I5.s;
import I6.l;
import I6.q;
import J6.AbstractC0650j;
import J6.r;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import v5.C6841a;
import w5.C6892a;
import x6.C6916E;
import y6.AbstractC6987o;
import y6.P;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final b f1084c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final N5.a f1085d = new N5.a("ContentNegotiation");

    /* renamed from: a, reason: collision with root package name */
    private final List f1086a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f1087b;

    /* renamed from: C5.a$a, reason: collision with other inner class name */
    public static final class C0023a implements K5.a {

        /* renamed from: a, reason: collision with root package name */
        private final Set f1088a = AbstractC6987o.d0(P.f(C5.c.a(), C5.b.b()));

        /* renamed from: b, reason: collision with root package name */
        private final List f1089b = new ArrayList();

        /* renamed from: C5.a$a$a, reason: collision with other inner class name */
        public static final class C0024a {

            /* renamed from: a, reason: collision with root package name */
            private final K5.b f1090a;

            /* renamed from: b, reason: collision with root package name */
            private final C0628b f1091b;

            /* renamed from: c, reason: collision with root package name */
            private final InterfaceC0629c f1092c;

            public C0024a(K5.b bVar, C0628b c0628b, InterfaceC0629c interfaceC0629c) {
                r.e(bVar, "converter");
                r.e(c0628b, "contentTypeToSend");
                r.e(interfaceC0629c, "contentTypeMatcher");
                this.f1090a = bVar;
                this.f1091b = c0628b;
                this.f1092c = interfaceC0629c;
            }

            public final InterfaceC0629c a() {
                return this.f1092c;
            }

            public final C0628b b() {
                return this.f1091b;
            }

            public final K5.b c() {
                return this.f1090a;
            }
        }

        /* renamed from: C5.a$a$b */
        public static final class b implements InterfaceC0629c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0628b f1093a;

            b(C0628b c0628b) {
                this.f1093a = c0628b;
            }

            @Override // I5.InterfaceC0629c
            public boolean a(C0628b c0628b) {
                r.e(c0628b, "contentType");
                return c0628b.g(this.f1093a);
            }
        }

        private final InterfaceC0629c b(C0628b c0628b) {
            return new b(c0628b);
        }

        @Override // K5.a
        public void a(C0628b c0628b, K5.b bVar, l lVar) {
            r.e(c0628b, "contentType");
            r.e(bVar, "converter");
            r.e(lVar, "configuration");
            e(c0628b, bVar, r.a(c0628b, C0628b.a.f3225a.a()) ? C5.d.f1118a : b(c0628b), lVar);
        }

        public final Set c() {
            return this.f1088a;
        }

        public final List d() {
            return this.f1089b;
        }

        public final void e(C0628b c0628b, K5.b bVar, InterfaceC0629c interfaceC0629c, l lVar) {
            r.e(c0628b, "contentTypeToSend");
            r.e(bVar, "converter");
            r.e(interfaceC0629c, "contentTypeMatcher");
            r.e(lVar, "configuration");
            lVar.invoke(bVar);
            this.f1089b.add(new C0024a(bVar, c0628b, interfaceC0629c));
        }
    }

    public static final class b implements h {

        /* renamed from: C5.a$b$a, reason: collision with other inner class name */
        static final class C0025a extends kotlin.coroutines.jvm.internal.l implements q {

            /* renamed from: o, reason: collision with root package name */
            int f1094o;

            /* renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f1095s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ a f1096t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0025a(a aVar, A6.d dVar) {
                super(3, dVar);
                this.f1096t = aVar;
            }

            @Override // I6.q
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object d(T5.e eVar, Object obj, A6.d dVar) {
                C0025a c0025a = new C0025a(this.f1096t, dVar);
                c0025a.f1095s = eVar;
                return c0025a.invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.e eVar;
                Object e8 = B6.b.e();
                int i8 = this.f1094o;
                if (i8 == 0) {
                    x6.q.b(obj);
                    eVar = (T5.e) this.f1095s;
                    a aVar = this.f1096t;
                    E5.c cVar = (E5.c) eVar.b();
                    Object c8 = eVar.c();
                    this.f1095s = eVar;
                    this.f1094o = 1;
                    obj = aVar.b(cVar, c8, this);
                    if (obj == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        x6.q.b(obj);
                        return C6916E.f44463a;
                    }
                    eVar = (T5.e) this.f1095s;
                    x6.q.b(obj);
                }
                if (obj == null) {
                    return C6916E.f44463a;
                }
                this.f1095s = null;
                this.f1094o = 2;
                if (eVar.e(obj, this) == e8) {
                    return e8;
                }
                return C6916E.f44463a;
            }
        }

        /* renamed from: C5.a$b$b, reason: collision with other inner class name */
        static final class C0026b extends kotlin.coroutines.jvm.internal.l implements q {

            /* renamed from: o, reason: collision with root package name */
            int f1097o;

            /* renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f1098s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f1099t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ a f1100u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0026b(a aVar, A6.d dVar) {
                super(3, dVar);
                this.f1100u = aVar;
            }

            @Override // I6.q
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object d(T5.e eVar, F5.d dVar, A6.d dVar2) {
                C0026b c0026b = new C0026b(this.f1100u, dVar2);
                c0026b.f1098s = eVar;
                c0026b.f1099t = dVar;
                return c0026b.invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.e eVar;
                U5.a aVar;
                Object e8 = B6.b.e();
                int i8 = this.f1097o;
                if (i8 == 0) {
                    x6.q.b(obj);
                    T5.e eVar2 = (T5.e) this.f1098s;
                    F5.d dVar = (F5.d) this.f1099t;
                    U5.a a8 = dVar.a();
                    Object b8 = dVar.b();
                    C0628b c8 = s.c(((C6892a) eVar2.b()).e());
                    if (c8 == null) {
                        C5.b.f1115a.b("Response doesn't have \"Content-Type\" header, skipping ContentNegotiation plugin");
                        return C6916E.f44463a;
                    }
                    Charset c9 = K5.c.c(((C6892a) eVar2.b()).d().a(), null, 1, null);
                    a aVar2 = this.f1100u;
                    K k8 = ((C6892a) eVar2.b()).d().k();
                    this.f1098s = eVar2;
                    this.f1099t = a8;
                    this.f1097o = 1;
                    Object c10 = aVar2.c(k8, a8, b8, c8, c9, this);
                    if (c10 == e8) {
                        return e8;
                    }
                    eVar = eVar2;
                    obj = c10;
                    aVar = a8;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        x6.q.b(obj);
                        return C6916E.f44463a;
                    }
                    aVar = (U5.a) this.f1099t;
                    eVar = (T5.e) this.f1098s;
                    x6.q.b(obj);
                }
                if (obj == null) {
                    return C6916E.f44463a;
                }
                F5.d dVar2 = new F5.d(aVar, obj);
                this.f1098s = null;
                this.f1099t = null;
                this.f1097o = 2;
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
        public void a(a aVar, C6841a c6841a) {
            r.e(aVar, "plugin");
            r.e(c6841a, "scope");
            c6841a.j().l(f.f2186g.d(), new C0025a(aVar, null));
            c6841a.l().l(F5.f.f2401g.c(), new C0026b(aVar, null));
        }

        @Override // B5.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(l lVar) {
            r.e(lVar, "block");
            C0023a c0023a = new C0023a();
            lVar.invoke(c0023a);
            return new a(c0023a.d(), c0023a.c());
        }

        @Override // B5.h
        public N5.a getKey() {
            return a.f1085d;
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f1101o;

        /* renamed from: s, reason: collision with root package name */
        Object f1102s;

        /* renamed from: t, reason: collision with root package name */
        Object f1103t;

        /* renamed from: u, reason: collision with root package name */
        Object f1104u;

        /* renamed from: v, reason: collision with root package name */
        Object f1105v;

        /* renamed from: w, reason: collision with root package name */
        Object f1106w;

        /* renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f1107x;

        /* renamed from: z, reason: collision with root package name */
        int f1109z;

        c(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1107x = obj;
            this.f1109z |= Integer.MIN_VALUE;
            return a.this.b(null, null, this);
        }
    }

    static final class d extends J6.s implements l {

        /* renamed from: o, reason: collision with root package name */
        public static final d f1110o = new d();

        d() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(C0023a.C0024a c0024a) {
            r.e(c0024a, "it");
            return c0024a.c().toString();
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f1111o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f1112s;

        /* renamed from: u, reason: collision with root package name */
        int f1114u;

        e(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1112s = obj;
            this.f1114u |= Integer.MIN_VALUE;
            return a.this.c(null, null, null, null, null, this);
        }
    }

    public a(List list, Set set) {
        r.e(list, "registrations");
        r.e(set, "ignoredTypes");
        this.f1086a = list;
        this.f1087b = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0237 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01f8 -> B:70:0x01fe). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(E5.c r18, java.lang.Object r19, A6.d r20) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C5.a.b(E5.c, java.lang.Object, A6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(I5.K r9, U5.a r10, java.lang.Object r11, I5.C0628b r12, java.nio.charset.Charset r13, A6.d r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C5.a.c(I5.K, U5.a, java.lang.Object, I5.b, java.nio.charset.Charset, A6.d):java.lang.Object");
    }
}
