package B5;

import I5.InterfaceC0637k;
import J6.AbstractC0650j;
import U6.A;
import U6.InterfaceC0745v0;
import U6.X;
import java.util.concurrent.CancellationException;
import v5.C6841a;
import w5.C6892a;
import x6.C6916E;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: g, reason: collision with root package name */
    public static final d f631g = new d(null);

    /* renamed from: h, reason: collision with root package name */
    private static final N5.a f632h = new N5.a("RetryFeature");

    /* renamed from: i, reason: collision with root package name */
    private static final H5.a f633i = new H5.a();

    /* renamed from: a, reason: collision with root package name */
    private final I6.q f634a;

    /* renamed from: b, reason: collision with root package name */
    private final I6.q f635b;

    /* renamed from: c, reason: collision with root package name */
    private final I6.p f636c;

    /* renamed from: d, reason: collision with root package name */
    private final I6.p f637d;

    /* renamed from: e, reason: collision with root package name */
    private final int f638e;

    /* renamed from: f, reason: collision with root package name */
    private final I6.p f639f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public I6.q f640a;

        /* renamed from: b, reason: collision with root package name */
        public I6.q f641b;

        /* renamed from: c, reason: collision with root package name */
        public I6.p f642c;

        /* renamed from: d, reason: collision with root package name */
        private I6.p f643d = d.f654o;

        /* renamed from: e, reason: collision with root package name */
        private I6.p f644e = new C0018a(null);

        /* renamed from: f, reason: collision with root package name */
        private int f645f;

        /* renamed from: B5.p$a$a, reason: collision with other inner class name */
        static final class C0018a extends kotlin.coroutines.jvm.internal.l implements I6.p {

            /* renamed from: o, reason: collision with root package name */
            int f646o;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ long f647s;

            C0018a(A6.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                C0018a c0018a = new C0018a(dVar);
                c0018a.f647s = ((Number) obj).longValue();
                return c0018a;
            }

            public final Object f(long j8, A6.d dVar) {
                return ((C0018a) create(Long.valueOf(j8), dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // I6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return f(((Number) obj).longValue(), (A6.d) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f646o;
                if (i8 == 0) {
                    x6.q.b(obj);
                    long j8 = this.f647s;
                    this.f646o = 1;
                    if (X.a(j8, this) == e8) {
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

        static final class b extends J6.s implements I6.p {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f648o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ I6.p f649s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z7, I6.p pVar) {
                super(2);
                this.f648o = z7;
                this.f649s = pVar;
            }

            public final Long b(b bVar, int i8) {
                long longValue;
                InterfaceC0637k a8;
                String e8;
                Long m8;
                J6.r.e(bVar, "$this$null");
                if (this.f648o) {
                    F5.c a9 = bVar.a();
                    Long valueOf = (a9 == null || (a8 = a9.a()) == null || (e8 = a8.e(I5.o.f3324a.o())) == null || (m8 = S6.h.m(e8)) == null) ? null : Long.valueOf(m8.longValue() * 1000);
                    longValue = Math.max(((Number) this.f649s.invoke(bVar, Integer.valueOf(i8))).longValue(), valueOf != null ? valueOf.longValue() : 0L);
                } else {
                    longValue = ((Number) this.f649s.invoke(bVar, Integer.valueOf(i8))).longValue();
                }
                return Long.valueOf(longValue);
            }

            @Override // I6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((b) obj, ((Number) obj2).intValue());
            }
        }

        static final class c extends J6.s implements I6.p {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ double f650o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ long f651s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ a f652t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ long f653u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(double d8, long j8, a aVar, long j9) {
                super(2);
                this.f650o = d8;
                this.f651s = j8;
                this.f652t = aVar;
                this.f653u = j9;
            }

            public final Long b(b bVar, int i8) {
                J6.r.e(bVar, "$this$delayMillis");
                return Long.valueOf(Math.min(((long) Math.pow(this.f650o, i8)) * 1000, this.f651s) + this.f652t.k(this.f653u));
            }

            @Override // I6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((b) obj, ((Number) obj2).intValue());
            }
        }

        static final class d extends J6.s implements I6.p {

            /* renamed from: o, reason: collision with root package name */
            public static final d f654o = new d();

            d() {
                super(2);
            }

            public final void b(c cVar, E5.c cVar2) {
                J6.r.e(cVar, "$this$null");
                J6.r.e(cVar2, "it");
            }

            @Override // I6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((c) obj, (E5.c) obj2);
                return C6916E.f44463a;
            }
        }

        static final class e extends J6.s implements I6.q {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f655o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(boolean z7) {
                super(3);
                this.f655o = z7;
            }

            @Override // I6.q
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean d(f fVar, E5.c cVar, Throwable th) {
                J6.r.e(fVar, "$this$retryOnExceptionIf");
                J6.r.e(cVar, "<anonymous parameter 0>");
                J6.r.e(th, "cause");
                return Boolean.valueOf(q.h(th) ? this.f655o : !(th instanceof CancellationException));
            }
        }

        static final class f extends J6.s implements I6.q {

            /* renamed from: o, reason: collision with root package name */
            public static final f f656o = new f();

            f() {
                super(3);
            }

            @Override // I6.q
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean d(f fVar, E5.b bVar, F5.c cVar) {
                J6.r.e(fVar, "$this$retryIf");
                J6.r.e(bVar, "<anonymous parameter 0>");
                J6.r.e(cVar, "response");
                int b02 = cVar.e().b0();
                boolean z7 = false;
                if (500 <= b02 && b02 < 600) {
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            }
        }

        public a() {
            p(3);
            d(this, 0.0d, 0L, 0L, false, 15, null);
        }

        public static /* synthetic */ void d(a aVar, double d8, long j8, long j9, boolean z7, int i8, Object obj) {
            aVar.c((i8 & 1) != 0 ? 2.0d : d8, (i8 & 2) != 0 ? 60000L : j8, (i8 & 4) != 0 ? 1000L : j9, (i8 & 8) != 0 ? true : z7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long k(long j8) {
            if (j8 == 0) {
                return 0L;
            }
            return N6.c.f4202o.f(j8);
        }

        public static /* synthetic */ void n(a aVar, int i8, boolean z7, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                i8 = -1;
            }
            if ((i9 & 2) != 0) {
                z7 = false;
            }
            aVar.m(i8, z7);
        }

        public final void b(boolean z7, I6.p pVar) {
            J6.r.e(pVar, "block");
            r(new b(z7, pVar));
        }

        public final void c(double d8, long j8, long j9, boolean z7) {
            if (d8 <= 0.0d) {
                throw new IllegalStateException("Check failed.");
            }
            if (j8 <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (j9 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            b(z7, new c(d8, j8, this, j9));
        }

        public final I6.p e() {
            return this.f644e;
        }

        public final I6.p f() {
            I6.p pVar = this.f642c;
            if (pVar != null) {
                return pVar;
            }
            J6.r.p("delayMillis");
            return null;
        }

        public final int g() {
            return this.f645f;
        }

        public final I6.p h() {
            return this.f643d;
        }

        public final I6.q i() {
            I6.q qVar = this.f640a;
            if (qVar != null) {
                return qVar;
            }
            J6.r.p("shouldRetry");
            return null;
        }

        public final I6.q j() {
            I6.q qVar = this.f641b;
            if (qVar != null) {
                return qVar;
            }
            J6.r.p("shouldRetryOnException");
            return null;
        }

        public final void l(int i8, I6.q qVar) {
            J6.r.e(qVar, "block");
            if (i8 != -1) {
                this.f645f = i8;
            }
            s(qVar);
        }

        public final void m(int i8, boolean z7) {
            o(i8, new e(z7));
        }

        public final void o(int i8, I6.q qVar) {
            J6.r.e(qVar, "block");
            if (i8 != -1) {
                this.f645f = i8;
            }
            t(qVar);
        }

        public final void p(int i8) {
            q(i8);
            n(this, i8, false, 2, null);
        }

        public final void q(int i8) {
            l(i8, f.f656o);
        }

        public final void r(I6.p pVar) {
            J6.r.e(pVar, "<set-?>");
            this.f642c = pVar;
        }

        public final void s(I6.q qVar) {
            J6.r.e(qVar, "<set-?>");
            this.f640a = qVar;
        }

        public final void t(I6.q qVar) {
            J6.r.e(qVar, "<set-?>");
            this.f641b = qVar;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final E5.c f657a;

        /* renamed from: b, reason: collision with root package name */
        private final F5.c f658b;

        /* renamed from: c, reason: collision with root package name */
        private final Throwable f659c;

        public b(E5.c cVar, F5.c cVar2, Throwable th) {
            J6.r.e(cVar, "request");
            this.f657a = cVar;
            this.f658b = cVar2;
            this.f659c = th;
        }

        public final F5.c a() {
            return this.f658b;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final E5.c f660a;

        /* renamed from: b, reason: collision with root package name */
        private final F5.c f661b;

        /* renamed from: c, reason: collision with root package name */
        private final Throwable f662c;

        /* renamed from: d, reason: collision with root package name */
        private final int f663d;

        public c(E5.c cVar, F5.c cVar2, Throwable th, int i8) {
            J6.r.e(cVar, "request");
            this.f660a = cVar;
            this.f661b = cVar2;
            this.f662c = th;
            this.f663d = i8;
        }
    }

    public static final class d implements B5.h {
        public /* synthetic */ d(AbstractC0650j abstractC0650j) {
            this();
        }

        public final H5.a c() {
            return p.f633i;
        }

        @Override // B5.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(p pVar, C6841a c6841a) {
            J6.r.e(pVar, "plugin");
            J6.r.e(c6841a, "scope");
            pVar.l(c6841a);
        }

        @Override // B5.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public p b(I6.l lVar) {
            J6.r.e(lVar, "block");
            a aVar = new a();
            lVar.invoke(aVar);
            return new p(aVar);
        }

        @Override // B5.h
        public N5.a getKey() {
            return p.f632h;
        }

        private d() {
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final E5.c f664a;

        /* renamed from: b, reason: collision with root package name */
        private final int f665b;

        /* renamed from: c, reason: collision with root package name */
        private final F5.c f666c;

        /* renamed from: d, reason: collision with root package name */
        private final Throwable f667d;

        public e(E5.c cVar, int i8, F5.c cVar2, Throwable th) {
            J6.r.e(cVar, "request");
            this.f664a = cVar;
            this.f665b = i8;
            this.f666c = cVar2;
            this.f667d = th;
        }

        public final Throwable a() {
            return this.f667d;
        }

        public final E5.c b() {
            return this.f664a;
        }

        public final F5.c c() {
            return this.f666c;
        }

        public final int d() {
            return this.f665b;
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f668a;

        public f(int i8) {
            this.f668a = i8;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements I6.q {

        /* renamed from: A, reason: collision with root package name */
        /* synthetic */ Object f669A;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C6841a f671C;

        /* renamed from: o, reason: collision with root package name */
        Object f672o;

        /* renamed from: s, reason: collision with root package name */
        Object f673s;

        /* renamed from: t, reason: collision with root package name */
        Object f674t;

        /* renamed from: u, reason: collision with root package name */
        Object f675u;

        /* renamed from: v, reason: collision with root package name */
        Object f676v;

        /* renamed from: w, reason: collision with root package name */
        int f677w;

        /* renamed from: x, reason: collision with root package name */
        int f678x;

        /* renamed from: y, reason: collision with root package name */
        int f679y;

        /* renamed from: z, reason: collision with root package name */
        private /* synthetic */ Object f680z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C6841a c6841a, A6.d dVar) {
            super(3, dVar);
            this.f671C = c6841a;
        }

        @Override // I6.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object d(u uVar, E5.c cVar, A6.d dVar) {
            g gVar = p.this.new g(this.f671C, dVar);
            gVar.f680z = uVar;
            gVar.f669A = cVar;
            return gVar.invokeSuspend(C6916E.f44463a);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x010d A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #0 {all -> 0x0078, blocks: (B:34:0x010d, B:35:0x0121, B:38:0x013c, B:41:0x0147, B:11:0x0071), top: B:52:0x0071 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x013b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0146 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0147 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:34:0x010d, B:35:0x0121, B:38:0x013c, B:41:0x0147, B:11:0x0071), top: B:52:0x0071 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01cc A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01ca -> B:7:0x0034). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 505
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: B5.p.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class h extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ E5.c f681o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(E5.c cVar) {
            super(1);
            this.f681o = cVar;
        }

        public final void b(Throwable th) {
            InterfaceC0745v0 g8 = this.f681o.g();
            J6.r.c(g8, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
            A a8 = (A) g8;
            if (th == null) {
                a8.T();
            } else {
                a8.i(th);
            }
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    public p(a aVar) {
        J6.r.e(aVar, "configuration");
        this.f634a = aVar.i();
        this.f635b = aVar.j();
        this.f636c = aVar.f();
        this.f637d = aVar.e();
        this.f638e = aVar.g();
        this.f639f = aVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E5.c m(E5.c cVar) {
        E5.c o8 = new E5.c().o(cVar);
        cVar.g().D(new h(o8));
        return o8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(int i8, int i9, I6.q qVar, C6892a c6892a) {
        return i8 < i9 && ((Boolean) qVar.d(new f(i8 + 1), c6892a.d(), c6892a.e())).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(int i8, int i9, I6.q qVar, E5.c cVar, Throwable th) {
        return i8 < i9 && ((Boolean) qVar.d(new f(i8 + 1), cVar, th)).booleanValue();
    }

    public final void l(C6841a c6841a) {
        J6.r.e(c6841a, "client");
        ((r) i.b(c6841a, r.f688c)).d(new g(c6841a, null));
    }
}
