package B5;

import A6.g;
import J6.AbstractC0650j;
import U6.A;
import U6.InterfaceC0745v0;
import U6.Q0;
import v5.C6841a;
import x6.C6916E;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f623a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final N5.a f624b = new N5.a("RequestLifecycle");

    public static final class a implements h {

        /* renamed from: B5.n$a$a, reason: collision with other inner class name */
        static final class C0017a extends kotlin.coroutines.jvm.internal.l implements I6.q {

            /* renamed from: o, reason: collision with root package name */
            int f625o;

            /* renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f626s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ C6841a f627t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0017a(C6841a c6841a, A6.d dVar) {
                super(3, dVar);
                this.f627t = c6841a;
            }

            @Override // I6.q
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object d(T5.e eVar, Object obj, A6.d dVar) {
                C0017a c0017a = new C0017a(this.f627t, dVar);
                c0017a.f626s = eVar;
                return c0017a.invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                A a8;
                Object e8 = B6.b.e();
                int i8 = this.f625o;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a8 = (A) this.f626s;
                    try {
                        x6.q.b(obj);
                        a8.T();
                        return C6916E.f44463a;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            a8.i(th);
                            throw th;
                        } catch (Throwable th2) {
                            a8.T();
                            throw th2;
                        }
                    }
                }
                x6.q.b(obj);
                T5.e eVar = (T5.e) this.f626s;
                A a9 = Q0.a(((E5.c) eVar.b()).g());
                g.b d8 = this.f627t.getCoroutineContext().d(InterfaceC0745v0.f5485d);
                J6.r.b(d8);
                o.c(a9, (InterfaceC0745v0) d8);
                try {
                    ((E5.c) eVar.b()).m(a9);
                    this.f626s = a9;
                    this.f625o = 1;
                    if (eVar.d(this) == e8) {
                        return e8;
                    }
                    a8 = a9;
                    a8.T();
                    return C6916E.f44463a;
                } catch (Throwable th3) {
                    th = th3;
                    a8 = a9;
                    a8.i(th);
                    throw th;
                }
            }
        }

        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        @Override // B5.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(n nVar, C6841a c6841a) {
            J6.r.e(nVar, "plugin");
            J6.r.e(c6841a, "scope");
            c6841a.j().l(E5.f.f2186g.a(), new C0017a(c6841a, null));
        }

        @Override // B5.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public n b(I6.l lVar) {
            J6.r.e(lVar, "block");
            return new n(null);
        }

        @Override // B5.h
        public N5.a getKey() {
            return n.f624b;
        }

        private a() {
        }
    }

    public /* synthetic */ n(AbstractC0650j abstractC0650j) {
        this();
    }

    private n() {
    }
}
