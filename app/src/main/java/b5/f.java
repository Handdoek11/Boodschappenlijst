package B5;

import B5.g;
import J6.AbstractC0650j;
import java.util.ArrayList;
import java.util.List;
import v5.C6841a;
import w5.C6892a;
import x6.C6916E;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final a f538d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final N5.a f539e = new N5.a("HttpResponseValidator");

    /* renamed from: a, reason: collision with root package name */
    private final List f540a;

    /* renamed from: b, reason: collision with root package name */
    private final List f541b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f542c;

    public static final class a implements h {

        /* renamed from: B5.f$a$a, reason: collision with other inner class name */
        static final class C0013a extends kotlin.coroutines.jvm.internal.l implements I6.q {

            /* renamed from: o, reason: collision with root package name */
            int f543o;

            /* renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f544s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f545t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ f f546u;

            /* renamed from: B5.f$a$a$a, reason: collision with other inner class name */
            static final class C0014a extends J6.s implements I6.a {

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ f f547o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0014a(f fVar) {
                    super(0);
                    this.f547o = fVar;
                }

                @Override // I6.a
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f547o.f542c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0013a(f fVar, A6.d dVar) {
                super(3, dVar);
                this.f546u = fVar;
            }

            @Override // I6.q
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object d(T5.e eVar, Object obj, A6.d dVar) {
                C0013a c0013a = new C0013a(this.f546u, dVar);
                c0013a.f544s = eVar;
                c0013a.f545t = obj;
                return c0013a.invokeSuspend(C6916E.f44463a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [T5.e] */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v8 */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                ?? r12 = this.f543o;
                try {
                    if (r12 == 0) {
                        x6.q.b(obj);
                        T5.e eVar = (T5.e) this.f544s;
                        Object obj2 = this.f545t;
                        ((E5.c) eVar.b()).c().g(g.e(), new C0014a(this.f546u));
                        this.f544s = eVar;
                        this.f543o = 1;
                        Object e9 = eVar.e(obj2, this);
                        r12 = eVar;
                        if (e9 == e8) {
                            return e8;
                        }
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) this.f544s;
                            x6.q.b(obj);
                            throw th;
                        }
                        T5.e eVar2 = (T5.e) this.f544s;
                        x6.q.b(obj);
                        r12 = eVar2;
                    }
                    return C6916E.f44463a;
                } catch (Throwable th2) {
                    Throwable a8 = G5.e.a(th2);
                    f fVar = this.f546u;
                    g.a a9 = g.a((E5.c) r12.b());
                    this.f544s = a8;
                    this.f543o = 2;
                    if (fVar.e(a8, a9, this) == e8) {
                        return e8;
                    }
                    throw a8;
                }
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements I6.q {

            /* renamed from: o, reason: collision with root package name */
            int f548o;

            /* renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f549s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f550t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ f f551u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(f fVar, A6.d dVar) {
                super(3, dVar);
                this.f551u = fVar;
            }

            @Override // I6.q
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object d(T5.e eVar, F5.d dVar, A6.d dVar2) {
                b bVar = new b(this.f551u, dVar2);
                bVar.f549s = eVar;
                bVar.f550t = dVar;
                return bVar.invokeSuspend(C6916E.f44463a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [T5.e] */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v8 */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                ?? r12 = this.f548o;
                try {
                    if (r12 == 0) {
                        x6.q.b(obj);
                        T5.e eVar = (T5.e) this.f549s;
                        F5.d dVar = (F5.d) this.f550t;
                        this.f549s = eVar;
                        this.f548o = 1;
                        Object e9 = eVar.e(dVar, this);
                        r12 = eVar;
                        if (e9 == e8) {
                            return e8;
                        }
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) this.f549s;
                            x6.q.b(obj);
                            throw th;
                        }
                        T5.e eVar2 = (T5.e) this.f549s;
                        x6.q.b(obj);
                        r12 = eVar2;
                    }
                    return C6916E.f44463a;
                } catch (Throwable th2) {
                    Throwable a8 = G5.e.a(th2);
                    f fVar = this.f551u;
                    E5.b d8 = ((C6892a) r12.b()).d();
                    this.f549s = a8;
                    this.f548o = 2;
                    if (fVar.e(a8, d8, this) == e8) {
                        return e8;
                    }
                    throw a8;
                }
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.l implements I6.q {

            /* renamed from: o, reason: collision with root package name */
            int f552o;

            /* renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f553s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f554t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ f f555u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(f fVar, A6.d dVar) {
                super(3, dVar);
                this.f555u = fVar;
            }

            @Override // I6.q
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object d(u uVar, E5.c cVar, A6.d dVar) {
                c cVar2 = new c(this.f555u, dVar);
                cVar2.f553s = uVar;
                cVar2.f554t = cVar;
                return cVar2.invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f552o;
                if (i8 == 0) {
                    x6.q.b(obj);
                    u uVar = (u) this.f553s;
                    E5.c cVar = (E5.c) this.f554t;
                    this.f553s = null;
                    this.f552o = 1;
                    obj = uVar.a(cVar, this);
                    if (obj == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6892a c6892a = (C6892a) this.f553s;
                        x6.q.b(obj);
                        return c6892a;
                    }
                    x6.q.b(obj);
                }
                C6892a c6892a2 = (C6892a) obj;
                f fVar = this.f555u;
                F5.c e9 = c6892a2.e();
                this.f553s = c6892a2;
                this.f552o = 2;
                return fVar.f(e9, this) == e8 ? e8 : c6892a2;
            }
        }

        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        @Override // B5.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(f fVar, C6841a c6841a) {
            J6.r.e(fVar, "plugin");
            J6.r.e(c6841a, "scope");
            c6841a.j().l(E5.f.f2186g.a(), new C0013a(fVar, null));
            T5.h hVar = new T5.h("BeforeReceive");
            c6841a.l().k(F5.f.f2401g.b(), hVar);
            c6841a.l().l(hVar, new b(fVar, null));
            ((r) i.b(c6841a, r.f688c)).d(new c(fVar, null));
        }

        @Override // B5.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public f b(I6.l lVar) {
            J6.r.e(lVar, "block");
            b bVar = new b();
            lVar.invoke(bVar);
            return new f(AbstractC6987o.Q(bVar.c()), AbstractC6987o.Q(bVar.b()), bVar.a());
        }

        @Override // B5.h
        public N5.a getKey() {
            return f.f539e;
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List f556a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List f557b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private boolean f558c = true;

        public final boolean a() {
            return this.f558c;
        }

        public final List b() {
            return this.f557b;
        }

        public final List c() {
            return this.f556a;
        }

        public final void d(boolean z7) {
            this.f558c = z7;
        }

        public final void e(I6.p pVar) {
            J6.r.e(pVar, "block");
            this.f556a.add(pVar);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f559o;

        /* renamed from: s, reason: collision with root package name */
        Object f560s;

        /* renamed from: t, reason: collision with root package name */
        Object f561t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f562u;

        /* renamed from: w, reason: collision with root package name */
        int f564w;

        c(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f562u = obj;
            this.f564w |= Integer.MIN_VALUE;
            return f.this.e(null, null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f565o;

        /* renamed from: s, reason: collision with root package name */
        Object f566s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f567t;

        /* renamed from: v, reason: collision with root package name */
        int f569v;

        d(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f567t = obj;
            this.f569v |= Integer.MIN_VALUE;
            return f.this.f(null, this);
        }
    }

    public f(List list, List list2, boolean z7) {
        J6.r.e(list, "responseValidators");
        J6.r.e(list2, "callExceptionHandlers");
        this.f540a = list;
        this.f541b = list2;
        this.f542c = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.Throwable r5, E5.b r6, A6.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof B5.f.c
            if (r0 == 0) goto L13
            r0 = r7
            B5.f$c r0 = (B5.f.c) r0
            int r1 = r0.f564w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f564w = r1
            goto L18
        L13:
            B5.f$c r0 = new B5.f$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f562u
            B6.b.e()
            int r1 = r0.f564w
            if (r1 == 0) goto L3f
            r5 = 1
            if (r1 == r5) goto L27
            r5 = 2
            if (r1 != r5) goto L37
        L27:
            java.lang.Object r5 = r0.f561t
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.f560s
            E5.b r6 = (E5.b) r6
            java.lang.Object r6 = r0.f559o
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            x6.q.b(r7)
            goto L6e
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            x6.q.b(r7)
            q7.a r7 = B5.g.d()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Processing exception "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " for request "
            r0.append(r5)
            I5.K r5 = r6.k()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r7.b(r5)
            java.util.List r5 = r4.f541b
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L6e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L7c
            java.lang.Object r6 = r5.next()
            androidx.appcompat.app.E.a(r6)
            goto L6e
        L7c:
            x6.E r5 = x6.C6916E.f44463a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.f.e(java.lang.Throwable, E5.b, A6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(F5.c r7, A6.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof B5.f.d
            if (r0 == 0) goto L13
            r0 = r8
            B5.f$d r0 = (B5.f.d) r0
            int r1 = r0.f569v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f569v = r1
            goto L18
        L13:
            B5.f$d r0 = new B5.f$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f567t
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f569v
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.f566s
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.f565o
            F5.c r2 = (F5.c) r2
            x6.q.b(r8)
            r8 = r2
            goto L6c
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            x6.q.b(r8)
            q7.a r8 = B5.g.d()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Validating response for request "
            r2.append(r4)
            w5.a r4 = r7.M()
            E5.b r4 = r4.d()
            I5.K r4 = r4.k()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r8.b(r2)
            java.util.List r8 = r6.f540a
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r5 = r8
            r8 = r7
            r7 = r5
        L6c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L85
            java.lang.Object r2 = r7.next()
            I6.p r2 = (I6.p) r2
            r0.f565o = r8
            r0.f566s = r7
            r0.f569v = r3
            java.lang.Object r2 = r2.invoke(r8, r0)
            if (r2 != r1) goto L6c
            return r1
        L85:
            x6.E r7 = x6.C6916E.f44463a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.f.f(F5.c, A6.d):java.lang.Object");
    }
}
