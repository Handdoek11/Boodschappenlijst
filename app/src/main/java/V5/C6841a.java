package v5;

import A6.g;
import B5.i;
import B5.j;
import B5.n;
import E5.h;
import I6.l;
import I6.q;
import J6.H;
import J6.r;
import J6.s;
import U6.A;
import U6.AbstractC0751y0;
import U6.InterfaceC0745v0;
import U6.M;
import U6.N;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import w5.C6892a;
import x6.C6916E;
import y5.InterfaceC6958a;
import y5.f;

/* renamed from: v5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6841a implements M, Closeable {

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f44094E = AtomicIntegerFieldUpdater.newUpdater(C6841a.class, "closed");

    /* renamed from: A, reason: collision with root package name */
    private final N5.b f44095A;

    /* renamed from: B, reason: collision with root package name */
    private final f f44096B;

    /* renamed from: C, reason: collision with root package name */
    private final H5.b f44097C;

    /* renamed from: D, reason: collision with root package name */
    private final C6842b f44098D;
    private volatile /* synthetic */ int closed;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC6958a f44099o;

    /* renamed from: s, reason: collision with root package name */
    private final C6842b f44100s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f44101t;

    /* renamed from: u, reason: collision with root package name */
    private final A f44102u;

    /* renamed from: v, reason: collision with root package name */
    private final g f44103v;

    /* renamed from: w, reason: collision with root package name */
    private final E5.f f44104w;

    /* renamed from: x, reason: collision with root package name */
    private final F5.f f44105x;

    /* renamed from: y, reason: collision with root package name */
    private final h f44106y;

    /* renamed from: z, reason: collision with root package name */
    private final F5.b f44107z;

    /* renamed from: v5.a$a, reason: collision with other inner class name */
    static final class C0340a extends s implements l {
        C0340a() {
            super(1);
        }

        public final void b(Throwable th) {
            if (th != null) {
                N.d(C6841a.this.f(), null, 1, null);
            }
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    /* renamed from: v5.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements q {

        /* renamed from: o, reason: collision with root package name */
        int f44109o;

        /* renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f44110s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f44111t;

        b(A6.d dVar) {
            super(3, dVar);
        }

        @Override // I6.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object d(T5.e eVar, Object obj, A6.d dVar) {
            b bVar = C6841a.this.new b(dVar);
            bVar.f44110s = eVar;
            bVar.f44111t = obj;
            return bVar.invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            T5.e eVar;
            Object e8 = B6.b.e();
            int i8 = this.f44109o;
            if (i8 == 0) {
                x6.q.b(obj);
                T5.e eVar2 = (T5.e) this.f44110s;
                obj2 = this.f44111t;
                if (!(obj2 instanceof C6892a)) {
                    throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + H.b(obj2.getClass()) + ").").toString());
                }
                F5.b i9 = C6841a.this.i();
                C6916E c6916e = C6916E.f44463a;
                F5.c e9 = ((C6892a) obj2).e();
                this.f44110s = eVar2;
                this.f44111t = obj2;
                this.f44109o = 1;
                Object d8 = i9.d(c6916e, e9, this);
                if (d8 == e8) {
                    return e8;
                }
                eVar = eVar2;
                obj = d8;
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x6.q.b(obj);
                    return C6916E.f44463a;
                }
                obj2 = this.f44111t;
                eVar = (T5.e) this.f44110s;
                x6.q.b(obj);
            }
            ((C6892a) obj2).l((F5.c) obj);
            this.f44110s = null;
            this.f44111t = null;
            this.f44109o = 2;
            if (eVar.e(obj2, this) == e8) {
                return e8;
            }
            return C6916E.f44463a;
        }
    }

    /* renamed from: v5.a$c */
    static final class c extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        public static final c f44113o = new c();

        c() {
            super(1);
        }

        public final void b(C6841a c6841a) {
            r.e(c6841a, "$this$install");
            B5.d.b(c6841a);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C6841a) obj);
            return C6916E.f44463a;
        }
    }

    /* renamed from: v5.a$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements q {

        /* renamed from: o, reason: collision with root package name */
        int f44114o;

        /* renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f44115s;

        d(A6.d dVar) {
            super(3, dVar);
        }

        @Override // I6.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object d(T5.e eVar, F5.d dVar, A6.d dVar2) {
            d dVar3 = C6841a.this.new d(dVar2);
            dVar3.f44115s = eVar;
            return dVar3.invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.e eVar;
            Throwable th;
            Object e8 = B6.b.e();
            int i8 = this.f44114o;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = (T5.e) this.f44115s;
                try {
                    x6.q.b(obj);
                    return C6916E.f44463a;
                } catch (Throwable th2) {
                    th = th2;
                    C6841a.this.h().a(G5.b.d(), new G5.g(((C6892a) eVar.b()).e(), th));
                    throw th;
                }
            }
            x6.q.b(obj);
            T5.e eVar2 = (T5.e) this.f44115s;
            try {
                this.f44115s = eVar2;
                this.f44114o = 1;
                if (eVar2.d(this) == e8) {
                    return e8;
                }
                return C6916E.f44463a;
            } catch (Throwable th3) {
                eVar = eVar2;
                th = th3;
                C6841a.this.h().a(G5.b.d(), new G5.g(((C6892a) eVar.b()).e(), th));
                throw th;
            }
        }
    }

    /* renamed from: v5.a$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f44117o;

        /* renamed from: t, reason: collision with root package name */
        int f44119t;

        e(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f44117o = obj;
            this.f44119t |= Integer.MIN_VALUE;
            return C6841a.this.d(null, this);
        }
    }

    public C6841a(InterfaceC6958a interfaceC6958a, C6842b c6842b) {
        r.e(interfaceC6958a, "engine");
        r.e(c6842b, "userConfig");
        this.f44099o = interfaceC6958a;
        this.f44100s = c6842b;
        this.closed = 0;
        A a8 = AbstractC0751y0.a((InterfaceC0745v0) interfaceC6958a.getCoroutineContext().d(InterfaceC0745v0.f5485d));
        this.f44102u = a8;
        this.f44103v = interfaceC6958a.getCoroutineContext().u(a8);
        this.f44104w = new E5.f(c6842b.b());
        F5.f fVar = new F5.f(c6842b.b());
        this.f44105x = fVar;
        h hVar = new h(c6842b.b());
        this.f44106y = hVar;
        this.f44107z = new F5.b(c6842b.b());
        this.f44095A = N5.d.a(true);
        this.f44096B = interfaceC6958a.H();
        this.f44097C = new H5.b();
        C6842b c6842b2 = new C6842b();
        this.f44098D = c6842b2;
        if (this.f44101t) {
            a8.D(new C0340a());
        }
        interfaceC6958a.g0(this);
        hVar.l(h.f2200g.b(), new b(null));
        C6842b.j(c6842b2, n.f623a, null, 2, null);
        C6842b.j(c6842b2, B5.a.f493a, null, 2, null);
        if (c6842b.f()) {
            c6842b2.h("DefaultTransformers", c.f44113o);
        }
        C6842b.j(c6842b2, B5.r.f688c, null, 2, null);
        C6842b.j(c6842b2, B5.f.f538d, null, 2, null);
        if (c6842b.e()) {
            C6842b.j(c6842b2, B5.l.f596c, null, 2, null);
        }
        c6842b2.k(c6842b);
        if (c6842b.f()) {
            C6842b.j(c6842b2, j.f578d, null, 2, null);
        }
        B5.c.c(c6842b2);
        c6842b2.i(this);
        fVar.l(F5.f.f2401g.b(), new d(null));
    }

    public final N5.b G() {
        return this.f44095A;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f44094E.compareAndSet(this, 0, 1)) {
            N5.b bVar = (N5.b) this.f44095A.d(i.a());
            for (N5.a aVar : bVar.e()) {
                r.c(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object d8 = bVar.d(aVar);
                if (d8 instanceof Closeable) {
                    ((Closeable) d8).close();
                }
            }
            this.f44102u.T();
            if (this.f44101t) {
                this.f44099o.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(E5.c r5, A6.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof v5.C6841a.e
            if (r0 == 0) goto L13
            r0 = r6
            v5.a$e r0 = (v5.C6841a.e) r0
            int r1 = r0.f44119t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44119t = r1
            goto L18
        L13:
            v5.a$e r0 = new v5.a$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f44117o
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f44119t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            x6.q.b(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            x6.q.b(r6)
            H5.b r6 = r4.f44097C
            H5.a r2 = G5.b.a()
            r6.a(r2, r5)
            E5.f r6 = r4.f44104w
            java.lang.Object r2 = r5.d()
            r0.f44119t = r3
            java.lang.Object r6 = r6.d(r5, r2, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            java.lang.String r5 = "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall"
            J6.r.c(r6, r5)
            w5.a r6 = (w5.C6892a) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.C6841a.d(E5.c, A6.d):java.lang.Object");
    }

    public final C6842b e() {
        return this.f44098D;
    }

    public final InterfaceC6958a f() {
        return this.f44099o;
    }

    @Override // U6.M
    public g getCoroutineContext() {
        return this.f44103v;
    }

    public final H5.b h() {
        return this.f44097C;
    }

    public final F5.b i() {
        return this.f44107z;
    }

    public final E5.f j() {
        return this.f44104w;
    }

    public final F5.f l() {
        return this.f44105x;
    }

    public final h m() {
        return this.f44106y;
    }

    public String toString() {
        return "HttpClient[" + this.f44099o + ']';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6841a(InterfaceC6958a interfaceC6958a, C6842b c6842b, boolean z7) {
        this(interfaceC6958a, c6842b);
        r.e(interfaceC6958a, "engine");
        r.e(c6842b, "userConfig");
        this.f44101t = z7;
    }
}
