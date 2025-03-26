package B5;

import J6.AbstractC0650j;
import J6.G;
import J6.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v5.C6841a;
import w5.C6892a;
import x6.C6916E;
import y6.AbstractC6968G;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final d f688c = new d(null);

    /* renamed from: d, reason: collision with root package name */
    private static final N5.a f689d = new N5.a("HttpSend");

    /* renamed from: a, reason: collision with root package name */
    private final int f690a;

    /* renamed from: b, reason: collision with root package name */
    private final List f691b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f692a = 20;

        public final int a() {
            return this.f692a;
        }
    }

    private static final class b implements u {

        /* renamed from: a, reason: collision with root package name */
        private final int f693a;

        /* renamed from: b, reason: collision with root package name */
        private final C6841a f694b;

        /* renamed from: c, reason: collision with root package name */
        private int f695c;

        /* renamed from: d, reason: collision with root package name */
        private C6892a f696d;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: o, reason: collision with root package name */
            Object f697o;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f698s;

            /* renamed from: u, reason: collision with root package name */
            int f700u;

            a(A6.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f698s = obj;
                this.f700u |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(int i8, C6841a c6841a) {
            J6.r.e(c6841a, "client");
            this.f693a = i8;
            this.f694b = c6841a;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // B5.u
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(E5.c r6, A6.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof B5.r.b.a
                if (r0 == 0) goto L13
                r0 = r7
                B5.r$b$a r0 = (B5.r.b.a) r0
                int r1 = r0.f700u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f700u = r1
                goto L18
            L13:
                B5.r$b$a r0 = new B5.r$b$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f698s
                java.lang.Object r1 = B6.b.e()
                int r2 = r0.f700u
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L36
                if (r2 != r4) goto L2e
                java.lang.Object r6 = r0.f697o
                B5.r$b r6 = (B5.r.b) r6
                x6.q.b(r7)
                goto L5f
            L2e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L36:
                x6.q.b(r7)
                w5.a r7 = r5.f696d
                if (r7 == 0) goto L40
                U6.N.d(r7, r3, r4, r3)
            L40:
                int r7 = r5.f695c
                int r2 = r5.f693a
                if (r7 >= r2) goto L86
                int r7 = r7 + r4
                r5.f695c = r7
                v5.a r7 = r5.f694b
                E5.h r7 = r7.m()
                java.lang.Object r2 = r6.d()
                r0.f697o = r5
                r0.f700u = r4
                java.lang.Object r7 = r7.d(r6, r2, r0)
                if (r7 != r1) goto L5e
                return r1
            L5e:
                r6 = r5
            L5f:
                boolean r0 = r7 instanceof w5.C6892a
                if (r0 == 0) goto L66
                r3 = r7
                w5.a r3 = (w5.C6892a) r3
            L66:
                if (r3 == 0) goto L6b
                r6.f696d = r3
                return r3
            L6b:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Failed to execute send pipeline. Expected [HttpClientCall], but received "
                r6.append(r0)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r6 = r6.toString()
                r7.<init>(r6)
                throw r7
            L86:
                io.ktor.client.plugins.SendCountExceedException r6 = new io.ktor.client.plugins.SendCountExceedException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "Max send count "
                r7.append(r0)
                int r0 = r5.f693a
                r7.append(r0)
                java.lang.String r0 = " exceeded. Consider increasing the property maxSendCount if more is required."
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: B5.r.b.a(E5.c, A6.d):java.lang.Object");
        }
    }

    private static final class c implements u {

        /* renamed from: a, reason: collision with root package name */
        private final I6.q f701a;

        /* renamed from: b, reason: collision with root package name */
        private final u f702b;

        public c(I6.q qVar, u uVar) {
            J6.r.e(qVar, "interceptor");
            J6.r.e(uVar, "nextSender");
            this.f701a = qVar;
            this.f702b = uVar;
        }

        @Override // B5.u
        public Object a(E5.c cVar, A6.d dVar) {
            return this.f701a.d(this.f702b, cVar, dVar);
        }
    }

    public static final class d implements h {

        static final class a extends kotlin.coroutines.jvm.internal.l implements I6.q {

            /* renamed from: o, reason: collision with root package name */
            int f703o;

            /* renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f704s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f705t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ r f706u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ C6841a f707v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, C6841a c6841a, A6.d dVar) {
                super(3, dVar);
                this.f706u = rVar;
                this.f707v = c6841a;
            }

            @Override // I6.q
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object d(T5.e eVar, Object obj, A6.d dVar) {
                a aVar = new a(this.f706u, this.f707v, dVar);
                aVar.f704s = eVar;
                aVar.f705t = obj;
                return aVar.invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.e eVar;
                Object e8 = B6.b.e();
                int i8 = this.f703o;
                if (i8 == 0) {
                    x6.q.b(obj);
                    eVar = (T5.e) this.f704s;
                    Object obj2 = this.f705t;
                    if (!(obj2 instanceof J5.b)) {
                        throw new IllegalStateException(S6.h.h("\n|Fail to prepare request body for sending. \n|The body type is: " + H.b(obj2.getClass()) + ", with Content-Type: " + I5.s.d((I5.r) eVar.b()) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.", null, 1, null).toString());
                    }
                    E5.c cVar = (E5.c) eVar.b();
                    if (obj2 == null) {
                        cVar.j(J5.a.f3538a);
                        Q6.k i9 = H.i(J5.b.class);
                        cVar.k(U5.b.b(Q6.n.e(i9), H.b(J5.b.class), i9));
                    } else if (obj2 instanceof J5.b) {
                        cVar.j(obj2);
                        cVar.k(null);
                    } else {
                        cVar.j(obj2);
                        Q6.k i10 = H.i(J5.b.class);
                        cVar.k(U5.b.b(Q6.n.e(i10), H.b(J5.b.class), i10));
                    }
                    b bVar = new b(this.f706u.f690a, this.f707v);
                    G g8 = new G();
                    g8.f3547o = bVar;
                    P6.g k8 = P6.m.k(AbstractC6987o.f(this.f706u.f691b), 0);
                    r rVar = this.f706u;
                    Iterator it = k8.iterator();
                    while (it.hasNext()) {
                        g8.f3547o = new c((I6.q) rVar.f691b.get(((AbstractC6968G) it).a()), (u) g8.f3547o);
                    }
                    u uVar = (u) g8.f3547o;
                    E5.c cVar2 = (E5.c) eVar.b();
                    this.f704s = eVar;
                    this.f703o = 1;
                    obj = uVar.a(cVar2, this);
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
                    eVar = (T5.e) this.f704s;
                    x6.q.b(obj);
                }
                this.f704s = null;
                this.f703o = 2;
                if (eVar.e((C6892a) obj, this) == e8) {
                    return e8;
                }
                return C6916E.f44463a;
            }
        }

        public /* synthetic */ d(AbstractC0650j abstractC0650j) {
            this();
        }

        @Override // B5.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(r rVar, C6841a c6841a) {
            J6.r.e(rVar, "plugin");
            J6.r.e(c6841a, "scope");
            c6841a.j().l(E5.f.f2186g.c(), new a(rVar, c6841a, null));
        }

        @Override // B5.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public r b(I6.l lVar) {
            J6.r.e(lVar, "block");
            a aVar = new a();
            lVar.invoke(aVar);
            return new r(aVar.a(), null);
        }

        @Override // B5.h
        public N5.a getKey() {
            return r.f689d;
        }

        private d() {
        }
    }

    public /* synthetic */ r(int i8, AbstractC0650j abstractC0650j) {
        this(i8);
    }

    public final void d(I6.q qVar) {
        J6.r.e(qVar, "block");
        this.f691b.add(qVar);
    }

    private r(int i8) {
        this.f690a = i8;
        this.f691b = new ArrayList();
    }
}
