package R4;

import J6.AbstractC0650j;
import L0.d;
import U6.AbstractC0723k;
import U6.M;
import U6.N;
import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import x6.C6916E;

/* loaded from: classes2.dex */
public final class x implements com.google.firebase.sessions.a {

    /* renamed from: f, reason: collision with root package name */
    private static final c f4907f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    private static final M6.a f4908g = K0.a.b(w.f4903a.a(), new J0.b(b.f4916o), null, null, 12, null);

    /* renamed from: b, reason: collision with root package name */
    private final Context f4909b;

    /* renamed from: c, reason: collision with root package name */
    private final A6.g f4910c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f4911d;

    /* renamed from: e, reason: collision with root package name */
    private final X6.b f4912e;

    static final class a extends kotlin.coroutines.jvm.internal.l implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        int f4913o;

        /* renamed from: R4.x$a$a, reason: collision with other inner class name */
        static final class C0097a implements X6.c {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ x f4915o;

            C0097a(x xVar) {
                this.f4915o = xVar;
            }

            @Override // X6.c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object c(l lVar, A6.d dVar) {
                this.f4915o.f4911d.set(lVar);
                return C6916E.f44463a;
            }
        }

        a(A6.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            return x.this.new a(dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, A6.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f4913o;
            if (i8 == 0) {
                x6.q.b(obj);
                X6.b bVar = x.this.f4912e;
                C0097a c0097a = new C0097a(x.this);
                this.f4913o = 1;
                if (bVar.a(c0097a, this) == e8) {
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

    static final class b extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final b f4916o = new b();

        b() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final L0.d invoke(CorruptionException corruptionException) {
            J6.r.e(corruptionException, "ex");
            Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + v.f4902a.e() + '.', corruptionException);
            return L0.e.a();
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Q6.j[] f4917a = {J6.H.f(new J6.B(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ c(AbstractC0650j abstractC0650j) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final I0.e b(Context context) {
            return (I0.e) x.f4908g.a(context, f4917a[0]);
        }

        private c() {
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f4918a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final d.a f4919b = L0.f.f("session_id");

        private d() {
        }

        public final d.a a() {
            return f4919b;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements I6.q {

        /* renamed from: o, reason: collision with root package name */
        int f4920o;

        /* renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f4921s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f4922t;

        e(A6.d dVar) {
            super(3, dVar);
        }

        @Override // I6.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object d(X6.c cVar, Throwable th, A6.d dVar) {
            e eVar = new e(dVar);
            eVar.f4921s = cVar;
            eVar.f4922t = th;
            return eVar.invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f4920o;
            if (i8 == 0) {
                x6.q.b(obj);
                X6.c cVar = (X6.c) this.f4921s;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f4922t);
                L0.d a8 = L0.e.a();
                this.f4921s = null;
                this.f4920o = 1;
                if (cVar.c(a8, this) == e8) {
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

    public static final class f implements X6.b {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ X6.b f4923o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ x f4924s;

        public static final class a implements X6.c {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ X6.c f4925o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ x f4926s;

            /* renamed from: R4.x$f$a$a, reason: collision with other inner class name */
            public static final class C0098a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: o, reason: collision with root package name */
                /* synthetic */ Object f4927o;

                /* renamed from: s, reason: collision with root package name */
                int f4928s;

                public C0098a(A6.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f4927o = obj;
                    this.f4928s |= Integer.MIN_VALUE;
                    return a.this.c(null, this);
                }
            }

            public a(X6.c cVar, x xVar) {
                this.f4925o = cVar;
                this.f4926s = xVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // X6.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object c(java.lang.Object r5, A6.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof R4.x.f.a.C0098a
                    if (r0 == 0) goto L13
                    r0 = r6
                    R4.x$f$a$a r0 = (R4.x.f.a.C0098a) r0
                    int r1 = r0.f4928s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f4928s = r1
                    goto L18
                L13:
                    R4.x$f$a$a r0 = new R4.x$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f4927o
                    java.lang.Object r1 = B6.b.e()
                    int r2 = r0.f4928s
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    x6.q.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    x6.q.b(r6)
                    X6.c r6 = r4.f4925o
                    L0.d r5 = (L0.d) r5
                    R4.x r2 = r4.f4926s
                    R4.l r5 = R4.x.h(r2, r5)
                    r0.f4928s = r3
                    java.lang.Object r5 = r6.c(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    x6.E r5 = x6.C6916E.f44463a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: R4.x.f.a.c(java.lang.Object, A6.d):java.lang.Object");
            }
        }

        public f(X6.b bVar, x xVar) {
            this.f4923o = bVar;
            this.f4924s = xVar;
        }

        @Override // X6.b
        public Object a(X6.c cVar, A6.d dVar) {
            Object a8 = this.f4923o.a(new a(cVar, this.f4924s), dVar);
            return a8 == B6.b.e() ? a8 : C6916E.f44463a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        int f4930o;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f4932t;

        static final class a extends kotlin.coroutines.jvm.internal.l implements I6.p {

            /* renamed from: o, reason: collision with root package name */
            int f4933o;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f4934s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f4935t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, A6.d dVar) {
                super(2, dVar);
                this.f4935t = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                a aVar = new a(this.f4935t, dVar);
                aVar.f4934s = obj;
                return aVar;
            }

            @Override // I6.p
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(L0.a aVar, A6.d dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                B6.b.e();
                if (this.f4933o != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x6.q.b(obj);
                ((L0.a) this.f4934s).i(d.f4918a.a(), this.f4935t);
                return C6916E.f44463a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, A6.d dVar) {
            super(2, dVar);
            this.f4932t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            return x.this.new g(this.f4932t, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, A6.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f4930o;
            try {
                if (i8 == 0) {
                    x6.q.b(obj);
                    I0.e b8 = x.f4907f.b(x.this.f4909b);
                    a aVar = new a(this.f4932t, null);
                    this.f4930o = 1;
                    if (L0.g.a(b8, aVar, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x6.q.b(obj);
                }
            } catch (IOException e9) {
                Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e9);
            }
            return C6916E.f44463a;
        }
    }

    public x(Context context, A6.g gVar) {
        J6.r.e(context, "context");
        J6.r.e(gVar, "backgroundDispatcher");
        this.f4909b = context;
        this.f4910c = gVar;
        this.f4911d = new AtomicReference();
        this.f4912e = new f(X6.d.b(f4907f.b(context).getData(), new e(null)), this);
        AbstractC0723k.d(N.a(gVar), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l i(L0.d dVar) {
        return new l((String) dVar.b(d.f4918a.a()));
    }

    @Override // com.google.firebase.sessions.a
    public String a() {
        l lVar = (l) this.f4911d.get();
        if (lVar != null) {
            return lVar.a();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.a
    public void b(String str) {
        J6.r.e(str, "sessionId");
        AbstractC0723k.d(N.a(this.f4910c), null, null, new g(str, null), 3, null);
    }
}
