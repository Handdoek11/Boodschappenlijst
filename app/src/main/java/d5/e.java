package D5;

import A6.g;
import B5.h;
import I6.l;
import I6.p;
import J6.AbstractC0650j;
import J6.r;
import U6.AbstractC0723k;
import U6.M;
import v5.C6841a;
import x6.C6916E;
import x6.C6933o;
import x6.q;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final b f2104c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final N5.a f2105d = new N5.a("BodyInterceptor");

    /* renamed from: a, reason: collision with root package name */
    private final p f2106a;

    /* renamed from: b, reason: collision with root package name */
    private final l f2107b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private p f2108a = new C0029a(null);

        /* renamed from: b, reason: collision with root package name */
        private l f2109b;

        /* renamed from: D5.e$a$a, reason: collision with other inner class name */
        static final class C0029a extends kotlin.coroutines.jvm.internal.l implements p {

            /* renamed from: o, reason: collision with root package name */
            int f2110o;

            C0029a(A6.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                return new C0029a(dVar);
            }

            @Override // I6.p
            public final Object invoke(F5.c cVar, A6.d dVar) {
                return ((C0029a) create(cVar, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                B6.b.e();
                if (this.f2110o != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
                return C6916E.f44463a;
            }
        }

        public final l a() {
            return this.f2109b;
        }

        public final p b() {
            return this.f2108a;
        }

        public final void c(p pVar) {
            r.e(pVar, "block");
            this.f2108a = pVar;
        }
    }

    public static final class b implements h {

        static final class a extends kotlin.coroutines.jvm.internal.l implements I6.q {

            /* renamed from: o, reason: collision with root package name */
            Object f2111o;

            /* renamed from: s, reason: collision with root package name */
            Object f2112s;

            /* renamed from: t, reason: collision with root package name */
            int f2113t;

            /* renamed from: u, reason: collision with root package name */
            private /* synthetic */ Object f2114u;

            /* renamed from: v, reason: collision with root package name */
            /* synthetic */ Object f2115v;

            /* renamed from: w, reason: collision with root package name */
            final /* synthetic */ e f2116w;

            /* renamed from: x, reason: collision with root package name */
            final /* synthetic */ C6841a f2117x;

            /* renamed from: D5.e$b$a$a, reason: collision with other inner class name */
            static final class C0030a extends kotlin.coroutines.jvm.internal.l implements p {

                /* renamed from: o, reason: collision with root package name */
                int f2118o;

                /* renamed from: s, reason: collision with root package name */
                final /* synthetic */ e f2119s;

                /* renamed from: t, reason: collision with root package name */
                final /* synthetic */ F5.c f2120t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0030a(e eVar, F5.c cVar, A6.d dVar) {
                    super(2, dVar);
                    this.f2119s = eVar;
                    this.f2120t = cVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final A6.d create(Object obj, A6.d dVar) {
                    return new C0030a(this.f2119s, this.f2120t, dVar);
                }

                @Override // I6.p
                public final Object invoke(M m8, A6.d dVar) {
                    return ((C0030a) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = B6.b.e();
                    int i8 = this.f2118o;
                    if (i8 == 0) {
                        q.b(obj);
                        p pVar = this.f2119s.f2106a;
                        F5.c cVar = this.f2120t;
                        this.f2118o = 1;
                        if (pVar.invoke(cVar, this) == e8) {
                            return e8;
                        }
                    } else {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            q.b(obj);
                            return C6916E.f44463a;
                        }
                        q.b(obj);
                    }
                    io.ktor.utils.io.f b8 = this.f2120t.b();
                    if (!b8.m()) {
                        this.f2118o = 2;
                        if (io.ktor.utils.io.h.d(b8, this) == e8) {
                            return e8;
                        }
                    }
                    return C6916E.f44463a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, C6841a c6841a, A6.d dVar) {
                super(3, dVar);
                this.f2116w = eVar;
                this.f2117x = c6841a;
            }

            @Override // I6.q
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object d(T5.e eVar, F5.c cVar, A6.d dVar) {
                a aVar = new a(this.f2116w, this.f2117x, dVar);
                aVar.f2114u = eVar;
                aVar.f2115v = cVar;
                return aVar.invokeSuspend(C6916E.f44463a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v15, types: [U6.M] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                F5.c cVar;
                T5.e eVar;
                F5.c cVar2;
                C6841a c6841a;
                Object e8 = B6.b.e();
                int i8 = this.f2113t;
                if (i8 == 0) {
                    q.b(obj);
                    T5.e eVar2 = (T5.e) this.f2114u;
                    F5.c cVar3 = (F5.c) this.f2115v;
                    l lVar = this.f2116w.f2107b;
                    if (lVar != null && !((Boolean) lVar.invoke(cVar3.M())).booleanValue()) {
                        return C6916E.f44463a;
                    }
                    C6933o a8 = N5.f.a(cVar3.b(), cVar3);
                    io.ktor.utils.io.f fVar = (io.ktor.utils.io.f) a8.a();
                    F5.c e9 = D5.b.b(cVar3.M(), (io.ktor.utils.io.f) a8.b()).e();
                    F5.c e10 = D5.b.b(cVar3.M(), fVar).e();
                    C6841a c6841a2 = this.f2117x;
                    this.f2114u = eVar2;
                    this.f2115v = e9;
                    this.f2111o = e10;
                    this.f2112s = c6841a2;
                    this.f2113t = 1;
                    Object a9 = f.a(this);
                    if (a9 == e8) {
                        return e8;
                    }
                    cVar = e9;
                    eVar = eVar2;
                    cVar2 = e10;
                    obj = a9;
                    c6841a = c6841a2;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        q.b(obj);
                        return C6916E.f44463a;
                    }
                    ?? r12 = (M) this.f2112s;
                    F5.c cVar4 = (F5.c) this.f2111o;
                    F5.c cVar5 = (F5.c) this.f2115v;
                    T5.e eVar3 = (T5.e) this.f2114u;
                    q.b(obj);
                    cVar = cVar5;
                    eVar = eVar3;
                    c6841a = r12;
                    cVar2 = cVar4;
                }
                AbstractC0723k.d(c6841a, (g) obj, null, new C0030a(this.f2116w, cVar2, null), 2, null);
                this.f2114u = null;
                this.f2115v = null;
                this.f2111o = null;
                this.f2112s = null;
                this.f2113t = 2;
                if (eVar.e(cVar, this) == e8) {
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
        public void a(e eVar, C6841a c6841a) {
            r.e(eVar, "plugin");
            r.e(c6841a, "scope");
            c6841a.i().l(F5.b.f2391g.a(), new a(eVar, c6841a, null));
        }

        @Override // B5.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public e b(l lVar) {
            r.e(lVar, "block");
            a aVar = new a();
            lVar.invoke(aVar);
            return new e(aVar.b(), aVar.a());
        }

        @Override // B5.h
        public N5.a getKey() {
            return e.f2105d;
        }

        private b() {
        }
    }

    public e(p pVar, l lVar) {
        r.e(pVar, "responseHandler");
        this.f2106a = pVar;
        this.f2107b = lVar;
    }
}
