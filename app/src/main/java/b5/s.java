package B5;

import I5.I;
import J6.AbstractC0650j;
import J6.H;
import U6.AbstractC0723k;
import U6.AbstractC0751y0;
import U6.InterfaceC0745v0;
import U6.M;
import U6.X;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import v5.C6841a;
import x6.C6916E;
import y5.InterfaceC6961d;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final b f708d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final N5.a f709e = new N5.a("TimeoutPlugin");

    /* renamed from: a, reason: collision with root package name */
    private final Long f710a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f711b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f712c;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final C0019a f713d = new C0019a(null);

        /* renamed from: e, reason: collision with root package name */
        private static final N5.a f714e = new N5.a("TimeoutConfiguration");

        /* renamed from: a, reason: collision with root package name */
        private Long f715a;

        /* renamed from: b, reason: collision with root package name */
        private Long f716b;

        /* renamed from: c, reason: collision with root package name */
        private Long f717c;

        /* renamed from: B5.s$a$a, reason: collision with other inner class name */
        public static final class C0019a {
            public /* synthetic */ C0019a(AbstractC0650j abstractC0650j) {
                this();
            }

            private C0019a() {
            }
        }

        public /* synthetic */ a(Long l8, Long l9, Long l10, int i8, AbstractC0650j abstractC0650j) {
            this((i8 & 1) != 0 ? null : l8, (i8 & 2) != 0 ? null : l9, (i8 & 4) != 0 ? null : l10);
        }

        private final Long b(Long l8) {
            if (l8 == null || l8.longValue() > 0) {
                return l8;
            }
            throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
        }

        public final s a() {
            return new s(d(), c(), e(), null);
        }

        public final Long c() {
            return this.f716b;
        }

        public final Long d() {
            return this.f715a;
        }

        public final Long e() {
            return this.f717c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !J6.r.a(H.b(a.class), H.b(obj.getClass()))) {
                return false;
            }
            a aVar = (a) obj;
            return J6.r.a(this.f715a, aVar.f715a) && J6.r.a(this.f716b, aVar.f716b) && J6.r.a(this.f717c, aVar.f717c);
        }

        public final void f(Long l8) {
            this.f716b = b(l8);
        }

        public final void g(Long l8) {
            this.f715a = b(l8);
        }

        public final void h(Long l8) {
            this.f717c = b(l8);
        }

        public int hashCode() {
            Long l8 = this.f715a;
            int hashCode = (l8 != null ? l8.hashCode() : 0) * 31;
            Long l9 = this.f716b;
            int hashCode2 = (hashCode + (l9 != null ? l9.hashCode() : 0)) * 31;
            Long l10 = this.f717c;
            return hashCode2 + (l10 != null ? l10.hashCode() : 0);
        }

        public a(Long l8, Long l9, Long l10) {
            this.f715a = 0L;
            this.f716b = 0L;
            this.f717c = 0L;
            g(l8);
            f(l9);
            h(l10);
        }
    }

    public static final class b implements h, InterfaceC6961d {

        static final class a extends kotlin.coroutines.jvm.internal.l implements I6.q {

            /* renamed from: o, reason: collision with root package name */
            int f718o;

            /* renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f719s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f720t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ s f721u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ C6841a f722v;

            /* renamed from: B5.s$b$a$a, reason: collision with other inner class name */
            static final class C0020a extends J6.s implements I6.l {

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ InterfaceC0745v0 f723o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0020a(InterfaceC0745v0 interfaceC0745v0) {
                    super(1);
                    this.f723o = interfaceC0745v0;
                }

                public final void b(Throwable th) {
                    InterfaceC0745v0.a.a(this.f723o, null, 1, null);
                }

                @Override // I6.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((Throwable) obj);
                    return C6916E.f44463a;
                }
            }

            /* renamed from: B5.s$b$a$b, reason: collision with other inner class name */
            static final class C0021b extends kotlin.coroutines.jvm.internal.l implements I6.p {

                /* renamed from: o, reason: collision with root package name */
                int f724o;

                /* renamed from: s, reason: collision with root package name */
                final /* synthetic */ Long f725s;

                /* renamed from: t, reason: collision with root package name */
                final /* synthetic */ E5.c f726t;

                /* renamed from: u, reason: collision with root package name */
                final /* synthetic */ InterfaceC0745v0 f727u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0021b(Long l8, E5.c cVar, InterfaceC0745v0 interfaceC0745v0, A6.d dVar) {
                    super(2, dVar);
                    this.f725s = l8;
                    this.f726t = cVar;
                    this.f727u = interfaceC0745v0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final A6.d create(Object obj, A6.d dVar) {
                    return new C0021b(this.f725s, this.f726t, this.f727u, dVar);
                }

                @Override // I6.p
                public final Object invoke(M m8, A6.d dVar) {
                    return ((C0021b) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = B6.b.e();
                    int i8 = this.f724o;
                    if (i8 == 0) {
                        x6.q.b(obj);
                        long longValue = this.f725s.longValue();
                        this.f724o = 1;
                        if (X.a(longValue, this) == e8) {
                            return e8;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        x6.q.b(obj);
                    }
                    HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(this.f726t);
                    t.f728a.b("Request timeout: " + this.f726t.i());
                    InterfaceC0745v0 interfaceC0745v0 = this.f727u;
                    String message = httpRequestTimeoutException.getMessage();
                    J6.r.b(message);
                    AbstractC0751y0.d(interfaceC0745v0, message, httpRequestTimeoutException);
                    return C6916E.f44463a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, C6841a c6841a, A6.d dVar) {
                super(3, dVar);
                this.f721u = sVar;
                this.f722v = c6841a;
            }

            @Override // I6.q
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object d(u uVar, E5.c cVar, A6.d dVar) {
                a aVar = new a(this.f721u, this.f722v, dVar);
                aVar.f719s = uVar;
                aVar.f720t = cVar;
                return aVar.invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f718o;
                if (i8 != 0) {
                    if (i8 == 1) {
                        x6.q.b(obj);
                    }
                    if (i8 == 2) {
                        x6.q.b(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x6.q.b(obj);
                u uVar = (u) this.f719s;
                E5.c cVar = (E5.c) this.f720t;
                if (I.b(cVar.i().o())) {
                    this.f719s = null;
                    this.f718o = 1;
                    obj = uVar.a(cVar, this);
                    return obj == e8 ? e8 : obj;
                }
                cVar.d();
                b bVar = s.f708d;
                a aVar = (a) cVar.f(bVar);
                if (aVar == null && this.f721u.f()) {
                    aVar = new a(null, null, null, 7, null);
                    cVar.l(bVar, aVar);
                }
                if (aVar != null) {
                    s sVar = this.f721u;
                    C6841a c6841a = this.f722v;
                    Long c8 = aVar.c();
                    if (c8 == null) {
                        c8 = sVar.f711b;
                    }
                    aVar.f(c8);
                    Long e9 = aVar.e();
                    if (e9 == null) {
                        e9 = sVar.f712c;
                    }
                    aVar.h(e9);
                    Long d8 = aVar.d();
                    if (d8 == null) {
                        d8 = sVar.f710a;
                    }
                    aVar.g(d8);
                    Long d9 = aVar.d();
                    if (d9 == null) {
                        d9 = sVar.f710a;
                    }
                    if (d9 != null && d9.longValue() != Long.MAX_VALUE) {
                        cVar.g().D(new C0020a(AbstractC0723k.d(c6841a, null, null, new C0021b(d9, cVar, cVar.g(), null), 3, null)));
                    }
                }
                this.f719s = null;
                this.f718o = 2;
                obj = uVar.a(cVar, this);
                return obj == e8 ? e8 : obj;
            }
        }

        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        @Override // B5.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(s sVar, C6841a c6841a) {
            J6.r.e(sVar, "plugin");
            J6.r.e(c6841a, "scope");
            ((r) i.b(c6841a, r.f688c)).d(new a(sVar, c6841a, null));
        }

        @Override // B5.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public s b(I6.l lVar) {
            J6.r.e(lVar, "block");
            a aVar = new a(null, null, null, 7, null);
            lVar.invoke(aVar);
            return aVar.a();
        }

        @Override // B5.h
        public N5.a getKey() {
            return s.f709e;
        }

        private b() {
        }
    }

    public /* synthetic */ s(Long l8, Long l9, Long l10, AbstractC0650j abstractC0650j) {
        this(l8, l9, l10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f() {
        return (this.f710a == null && this.f711b == null && this.f712c == null) ? false : true;
    }

    private s(Long l8, Long l9, Long l10) {
        this.f710a = l8;
        this.f711b = l9;
        this.f712c = l10;
    }
}
