package y5;

import I6.p;
import J6.H;
import J6.r;
import J6.s;
import Q6.n;
import U6.AbstractC0751y0;
import U6.I;
import U6.InterfaceC0745v0;
import U6.M;
import io.ktor.client.engine.ClientEngineClosedException;
import java.io.Closeable;
import java.util.Set;
import v5.C6841a;
import w5.C6892a;
import x6.C6916E;
import x6.q;
import y6.P;

/* renamed from: y5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC6958a extends M, Closeable {

    /* renamed from: y5.a$a, reason: collision with other inner class name */
    public static final class C0351a {

        /* renamed from: y5.a$a$a, reason: collision with other inner class name */
        static final class C0352a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: o, reason: collision with root package name */
            Object f44598o;

            /* renamed from: s, reason: collision with root package name */
            Object f44599s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f44600t;

            /* renamed from: u, reason: collision with root package name */
            int f44601u;

            C0352a(A6.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f44600t = obj;
                this.f44601u |= Integer.MIN_VALUE;
                return C0351a.e(null, null, this);
            }
        }

        /* renamed from: y5.a$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements p {

            /* renamed from: o, reason: collision with root package name */
            int f44602o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ InterfaceC6958a f44603s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ E5.d f44604t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC6958a interfaceC6958a, E5.d dVar, A6.d dVar2) {
                super(2, dVar2);
                this.f44603s = interfaceC6958a;
                this.f44604t = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                return new b(this.f44603s, this.f44604t, dVar);
            }

            @Override // I6.p
            public final Object invoke(M m8, A6.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f44602o;
                if (i8 == 0) {
                    q.b(obj);
                    if (C0351a.f(this.f44603s)) {
                        throw new ClientEngineClosedException(null, 1, null);
                    }
                    InterfaceC6958a interfaceC6958a = this.f44603s;
                    E5.d dVar = this.f44604t;
                    this.f44602o = 1;
                    obj = interfaceC6958a.y0(dVar, this);
                    if (obj == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.b(obj);
                }
                return obj;
            }
        }

        /* renamed from: y5.a$a$c */
        static final class c extends kotlin.coroutines.jvm.internal.l implements I6.q {

            /* renamed from: o, reason: collision with root package name */
            int f44605o;

            /* renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f44606s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f44607t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ C6841a f44608u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ InterfaceC6958a f44609v;

            /* renamed from: y5.a$a$c$a, reason: collision with other inner class name */
            static final class C0353a extends s implements I6.l {

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ C6841a f44610o;

                /* renamed from: s, reason: collision with root package name */
                final /* synthetic */ F5.c f44611s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0353a(C6841a c6841a, F5.c cVar) {
                    super(1);
                    this.f44610o = c6841a;
                    this.f44611s = cVar;
                }

                public final void b(Throwable th) {
                    if (th != null) {
                        this.f44610o.h().a(G5.b.c(), this.f44611s);
                    }
                }

                @Override // I6.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((Throwable) obj);
                    return C6916E.f44463a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C6841a c6841a, InterfaceC6958a interfaceC6958a, A6.d dVar) {
                super(3, dVar);
                this.f44608u = c6841a;
                this.f44609v = interfaceC6958a;
            }

            @Override // I6.q
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object d(T5.e eVar, Object obj, A6.d dVar) {
                c cVar = new c(this.f44608u, this.f44609v, dVar);
                cVar.f44606s = eVar;
                cVar.f44607t = obj;
                return cVar.invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                E5.d b8;
                T5.e eVar;
                Object e8 = B6.b.e();
                int i8 = this.f44605o;
                if (i8 == 0) {
                    q.b(obj);
                    T5.e eVar2 = (T5.e) this.f44606s;
                    Object obj2 = this.f44607t;
                    E5.c cVar = new E5.c();
                    cVar.p((E5.c) eVar2.b());
                    if (obj2 == null) {
                        cVar.j(J5.a.f3538a);
                        Q6.k i9 = H.i(Object.class);
                        cVar.k(U5.b.b(n.e(i9), H.b(Object.class), i9));
                    } else if (obj2 instanceof J5.b) {
                        cVar.j(obj2);
                        cVar.k(null);
                    } else {
                        cVar.j(obj2);
                        Q6.k i10 = H.i(Object.class);
                        cVar.k(U5.b.b(n.e(i10), H.b(Object.class), i10));
                    }
                    this.f44608u.h().a(G5.b.b(), cVar);
                    b8 = cVar.b();
                    b8.a().f(h.c(), this.f44608u.e());
                    h.d(b8);
                    C0351a.d(this.f44609v, b8);
                    InterfaceC6958a interfaceC6958a = this.f44609v;
                    this.f44606s = eVar2;
                    this.f44607t = b8;
                    this.f44605o = 1;
                    Object e9 = C0351a.e(interfaceC6958a, b8, this);
                    if (e9 == e8) {
                        return e8;
                    }
                    eVar = eVar2;
                    obj = e9;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        q.b(obj);
                        return C6916E.f44463a;
                    }
                    b8 = (E5.d) this.f44607t;
                    eVar = (T5.e) this.f44606s;
                    q.b(obj);
                }
                C6892a c6892a = new C6892a(this.f44608u, b8, (E5.g) obj);
                F5.c e10 = c6892a.e();
                this.f44608u.h().a(G5.b.e(), e10);
                AbstractC0751y0.i(e10.getCoroutineContext()).D(new C0353a(this.f44608u, e10));
                this.f44606s = null;
                this.f44607t = null;
                this.f44605o = 2;
                if (eVar.e(c6892a, this) == e8) {
                    return e8;
                }
                return C6916E.f44463a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(InterfaceC6958a interfaceC6958a, E5.d dVar) {
            for (InterfaceC6961d interfaceC6961d : dVar.g()) {
                if (!interfaceC6958a.J().contains(interfaceC6961d)) {
                    throw new IllegalArgumentException(("Engine doesn't support " + interfaceC6961d).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object e(y5.InterfaceC6958a r10, E5.d r11, A6.d r12) {
            /*
                boolean r0 = r12 instanceof y5.InterfaceC6958a.C0351a.C0352a
                if (r0 == 0) goto L13
                r0 = r12
                y5.a$a$a r0 = (y5.InterfaceC6958a.C0351a.C0352a) r0
                int r1 = r0.f44601u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f44601u = r1
                goto L18
            L13:
                y5.a$a$a r0 = new y5.a$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f44600t
                java.lang.Object r1 = B6.b.e()
                int r2 = r0.f44601u
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L42
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                x6.q.b(r12)
                goto L7b
            L2c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L34:
                java.lang.Object r10 = r0.f44599s
                r11 = r10
                E5.d r11 = (E5.d) r11
                java.lang.Object r10 = r0.f44598o
                y5.a r10 = (y5.InterfaceC6958a) r10
                x6.q.b(r12)
            L40:
                r4 = r10
                goto L56
            L42:
                x6.q.b(r12)
                U6.v0 r12 = r11.d()
                r0.f44598o = r10
                r0.f44599s = r11
                r0.f44601u = r4
                java.lang.Object r12 = y5.h.b(r10, r12, r0)
                if (r12 != r1) goto L40
                return r1
            L56:
                A6.g r12 = (A6.g) r12
                y5.i r10 = new y5.i
                r10.<init>(r12)
                A6.g r5 = r12.u(r10)
                y5.a$a$b r7 = new y5.a$a$b
                r10 = 0
                r7.<init>(r4, r11, r10)
                r8 = 2
                r9 = 0
                r6 = 0
                U6.U r11 = U6.AbstractC0719i.b(r4, r5, r6, r7, r8, r9)
                r0.f44598o = r10
                r0.f44599s = r10
                r0.f44601u = r3
                java.lang.Object r12 = r11.e0(r0)
                if (r12 != r1) goto L7b
                return r1
            L7b:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: y5.InterfaceC6958a.C0351a.e(y5.a, E5.d, A6.d):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean f(InterfaceC6958a interfaceC6958a) {
            return !(((InterfaceC0745v0) interfaceC6958a.getCoroutineContext().d(InterfaceC0745v0.f5485d)) != null ? r1.h() : false);
        }

        public static Set g(InterfaceC6958a interfaceC6958a) {
            return P.b();
        }

        public static void h(InterfaceC6958a interfaceC6958a, C6841a c6841a) {
            r.e(c6841a, "client");
            c6841a.m().l(E5.h.f2200g.a(), new c(c6841a, interfaceC6958a, null));
        }
    }

    f H();

    Set J();

    void g0(C6841a c6841a);

    I r0();

    Object y0(E5.d dVar, A6.d dVar2);
}
