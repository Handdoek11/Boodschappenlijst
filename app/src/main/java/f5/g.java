package F5;

import B5.h;
import B5.i;
import I6.p;
import J6.r;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import v5.C6841a;
import w5.AbstractC6893b;
import w5.C6892a;
import x6.C6916E;
import x6.q;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final E5.c f2408a;

    /* renamed from: b, reason: collision with root package name */
    private final C6841a f2409b;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f2410o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f2411s;

        /* renamed from: u, reason: collision with root package name */
        int f2413u;

        a(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2411s = obj;
            this.f2413u |= Integer.MIN_VALUE;
            return g.this.b(null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f2414o;

        /* renamed from: s, reason: collision with root package name */
        Object f2415s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f2416t;

        /* renamed from: v, reason: collision with root package name */
        int f2418v;

        b(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2416t = obj;
            this.f2418v |= Integer.MIN_VALUE;
            return g.this.d(null, this);
        }
    }

    static final class c extends l implements p {

        /* renamed from: o, reason: collision with root package name */
        int f2419o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f2420s;

        c(A6.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            c cVar = new c(dVar);
            cVar.f2420s = obj;
            return cVar;
        }

        @Override // I6.p
        public final Object invoke(F5.c cVar, A6.d dVar) {
            return ((c) create(cVar, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f2419o;
            if (i8 == 0) {
                q.b(obj);
                C6892a M7 = ((F5.c) this.f2420s).M();
                this.f2419o = 1;
                obj = AbstractC6893b.a(M7, this);
                if (obj == e8) {
                    return e8;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            return ((C6892a) obj).e();
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f2421o;

        /* renamed from: t, reason: collision with root package name */
        int f2423t;

        d(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2421o = obj;
            this.f2423t |= Integer.MIN_VALUE;
            return g.this.e(this);
        }
    }

    public g(E5.c cVar, C6841a c6841a) {
        r.e(cVar, "builder");
        r.e(c6841a, "client");
        this.f2408a = cVar;
        this.f2409b = c6841a;
        a();
    }

    private final void a() {
        Set keySet;
        Map map = (Map) this.f2408a.c().c(y5.e.a());
        if (map == null || (keySet = map.keySet()) == null) {
            return;
        }
        ArrayList<h> arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (obj instanceof h) {
                arrayList.add(obj);
            }
        }
        for (h hVar : arrayList) {
            if (i.c(this.f2409b, hVar) == null) {
                throw new IllegalArgumentException(("Consider installing " + hVar + " plugin because the request requires it to be installed").toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(F5.c r5, A6.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof F5.g.a
            if (r0 == 0) goto L13
            r0 = r6
            F5.g$a r0 = (F5.g.a) r0
            int r1 = r0.f2413u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2413u = r1
            goto L18
        L13:
            F5.g$a r0 = new F5.g$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f2411s
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f2413u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f2410o
            U6.A r5 = (U6.A) r5
            x6.q.b(r6)
            goto L5c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            x6.q.b(r6)
            A6.g r6 = r5.getCoroutineContext()
            U6.v0$b r2 = U6.InterfaceC0745v0.f5485d
            A6.g$b r6 = r6.d(r2)
            J6.r.b(r6)
            U6.A r6 = (U6.A) r6
            r6.T()
            io.ktor.utils.io.f r5 = r5.b()     // Catch: java.lang.Throwable -> L51
            io.ktor.utils.io.h.a(r5)     // Catch: java.lang.Throwable -> L51
        L51:
            r0.f2410o = r6
            r0.f2413u = r3
            java.lang.Object r5 = r6.I(r0)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            x6.E r5 = x6.C6916E.f44463a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.g.b(F5.c, A6.d):java.lang.Object");
    }

    public final Object c(A6.d dVar) {
        return d(new c(null), dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:54|(1:(1:(1:(1:(2:14|15)(3:16|17|51))(3:21|22|59))(5:24|55|25|42|(1:44)(2:45|46)))(2:29|30))(3:32|33|(1:35)(1:36))|37|57|38|(1:40)(3:41|42|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(I6.p r10, A6.d r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof F5.g.b
            if (r0 == 0) goto L13
            r0 = r11
            F5.g$b r0 = (F5.g.b) r0
            int r1 = r0.f2418v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2418v = r1
            goto L18
        L13:
            F5.g$b r0 = new F5.g$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f2416t
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f2418v
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L66
            if (r2 == r7) goto L5a
            if (r2 == r6) goto L49
            if (r2 == r5) goto L43
            if (r2 == r4) goto L37
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            java.lang.Object r10 = r0.f2414o
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            x6.q.b(r11)     // Catch: java.util.concurrent.CancellationException -> L40
            goto La6
        L40:
            r10 = move-exception
            goto La7
        L43:
            java.lang.Object r10 = r0.f2414o
            x6.q.b(r11)     // Catch: java.util.concurrent.CancellationException -> L40
            goto L97
        L49:
            java.lang.Object r10 = r0.f2415s
            F5.c r10 = (F5.c) r10
            java.lang.Object r2 = r0.f2414o
            F5.g r2 = (F5.g) r2
            x6.q.b(r11)     // Catch: java.lang.Throwable -> L55
            goto L89
        L55:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto L99
        L5a:
            java.lang.Object r10 = r0.f2415s
            I6.p r10 = (I6.p) r10
            java.lang.Object r2 = r0.f2414o
            F5.g r2 = (F5.g) r2
            x6.q.b(r11)     // Catch: java.util.concurrent.CancellationException -> L40
            goto L77
        L66:
            x6.q.b(r11)
            r0.f2414o = r9     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f2415s = r10     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f2418v = r7     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r11 = r9.e(r0)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r11 != r1) goto L76
            return r1
        L76:
            r2 = r9
        L77:
            F5.c r11 = (F5.c) r11     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f2414o = r2     // Catch: java.lang.Throwable -> L98
            r0.f2415s = r11     // Catch: java.lang.Throwable -> L98
            r0.f2418v = r6     // Catch: java.lang.Throwable -> L98
            java.lang.Object r10 = r10.invoke(r11, r0)     // Catch: java.lang.Throwable -> L98
            if (r10 != r1) goto L86
            return r1
        L86:
            r8 = r11
            r11 = r10
            r10 = r8
        L89:
            r0.f2414o = r11     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f2415s = r3     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f2418v = r5     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r10 = r2.b(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r10 != r1) goto L96
            return r1
        L96:
            r10 = r11
        L97:
            return r10
        L98:
            r10 = move-exception
        L99:
            r0.f2414o = r10     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f2415s = r3     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f2418v = r4     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r11 = r2.b(r11, r0)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r11 != r1) goto La6
            return r1
        La6:
            throw r10     // Catch: java.util.concurrent.CancellationException -> L40
        La7:
            java.lang.Throwable r10 = G5.e.a(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.g.d(I6.p, A6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(A6.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof F5.g.d
            if (r0 == 0) goto L13
            r0 = r5
            F5.g$d r0 = (F5.g.d) r0
            int r1 = r0.f2423t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2423t = r1
            goto L18
        L13:
            F5.g$d r0 = new F5.g$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f2421o
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f2423t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            x6.q.b(r5)     // Catch: java.util.concurrent.CancellationException -> L29
            goto L4c
        L29:
            r5 = move-exception
            goto L53
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            x6.q.b(r5)
            E5.c r5 = new E5.c     // Catch: java.util.concurrent.CancellationException -> L29
            r5.<init>()     // Catch: java.util.concurrent.CancellationException -> L29
            E5.c r2 = r4.f2408a     // Catch: java.util.concurrent.CancellationException -> L29
            E5.c r5 = r5.p(r2)     // Catch: java.util.concurrent.CancellationException -> L29
            v5.a r2 = r4.f2409b     // Catch: java.util.concurrent.CancellationException -> L29
            r0.f2423t = r3     // Catch: java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r2.d(r5, r0)     // Catch: java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L4c
            return r1
        L4c:
            w5.a r5 = (w5.C6892a) r5     // Catch: java.util.concurrent.CancellationException -> L29
            F5.c r5 = r5.e()     // Catch: java.util.concurrent.CancellationException -> L29
            return r5
        L53:
            java.lang.Throwable r5 = G5.e.a(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.g.e(A6.d):java.lang.Object");
    }

    public String toString() {
        return "HttpStatement[" + this.f2408a.i() + ']';
    }
}
