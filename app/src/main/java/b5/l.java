package B5;

import J6.AbstractC0650j;
import v5.C6841a;
import w5.C6892a;
import x6.C6916E;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final b f596c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final N5.a f597d = new N5.a("HttpRedirect");

    /* renamed from: e, reason: collision with root package name */
    private static final H5.a f598e = new H5.a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f599a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f600b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f601a = true;

        /* renamed from: b, reason: collision with root package name */
        private boolean f602b;

        public final boolean a() {
            return this.f602b;
        }

        public final boolean b() {
            return this.f601a;
        }
    }

    public static final class b implements h {

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: A, reason: collision with root package name */
            boolean f603A;

            /* renamed from: B, reason: collision with root package name */
            /* synthetic */ Object f604B;

            /* renamed from: D, reason: collision with root package name */
            int f606D;

            /* renamed from: o, reason: collision with root package name */
            Object f607o;

            /* renamed from: s, reason: collision with root package name */
            Object f608s;

            /* renamed from: t, reason: collision with root package name */
            Object f609t;

            /* renamed from: u, reason: collision with root package name */
            Object f610u;

            /* renamed from: v, reason: collision with root package name */
            Object f611v;

            /* renamed from: w, reason: collision with root package name */
            Object f612w;

            /* renamed from: x, reason: collision with root package name */
            Object f613x;

            /* renamed from: y, reason: collision with root package name */
            Object f614y;

            /* renamed from: z, reason: collision with root package name */
            Object f615z;

            a(A6.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f604B = obj;
                this.f606D |= Integer.MIN_VALUE;
                return b.this.e(null, null, null, false, null, this);
            }
        }

        /* renamed from: B5.l$b$b, reason: collision with other inner class name */
        static final class C0016b extends kotlin.coroutines.jvm.internal.l implements I6.q {

            /* renamed from: o, reason: collision with root package name */
            int f616o;

            /* renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f617s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f618t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ l f619u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ C6841a f620v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0016b(l lVar, C6841a c6841a, A6.d dVar) {
                super(3, dVar);
                this.f619u = lVar;
                this.f620v = c6841a;
            }

            @Override // I6.q
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object d(u uVar, E5.c cVar, A6.d dVar) {
                C0016b c0016b = new C0016b(this.f619u, this.f620v, dVar);
                c0016b.f617s = uVar;
                c0016b.f618t = cVar;
                return c0016b.invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                u uVar;
                E5.c cVar;
                Object e8 = B6.b.e();
                int i8 = this.f616o;
                if (i8 == 0) {
                    x6.q.b(obj);
                    u uVar2 = (u) this.f617s;
                    E5.c cVar2 = (E5.c) this.f618t;
                    this.f617s = uVar2;
                    this.f618t = cVar2;
                    this.f616o = 1;
                    Object a8 = uVar2.a(cVar2, this);
                    if (a8 == e8) {
                        return e8;
                    }
                    uVar = uVar2;
                    cVar = cVar2;
                    obj = a8;
                } else {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            x6.q.b(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    E5.c cVar3 = (E5.c) this.f618t;
                    u uVar3 = (u) this.f617s;
                    x6.q.b(obj);
                    cVar = cVar3;
                    uVar = uVar3;
                }
                C6892a c6892a = (C6892a) obj;
                if (this.f619u.f599a && !m.f621a.contains(c6892a.d().E())) {
                    return c6892a;
                }
                b bVar = l.f596c;
                boolean z7 = this.f619u.f600b;
                C6841a c6841a = this.f620v;
                this.f617s = null;
                this.f618t = null;
                this.f616o = 2;
                obj = bVar.e(uVar, cVar, c6892a, z7, c6841a, this);
                return obj == e8 ? e8 : obj;
            }
        }

        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:20:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x01af A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x01b0  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01cd  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01b0 -> B:35:0x01b6). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object e(B5.u r19, E5.c r20, w5.C6892a r21, boolean r22, v5.C6841a r23, A6.d r24) {
            /*
                Method dump skipped, instructions count: 469
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: B5.l.b.e(B5.u, E5.c, w5.a, boolean, v5.a, A6.d):java.lang.Object");
        }

        public final H5.a d() {
            return l.f598e;
        }

        @Override // B5.h
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(l lVar, C6841a c6841a) {
            J6.r.e(lVar, "plugin");
            J6.r.e(c6841a, "scope");
            ((r) i.b(c6841a, r.f688c)).d(new C0016b(lVar, c6841a, null));
        }

        @Override // B5.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public l b(I6.l lVar) {
            J6.r.e(lVar, "block");
            a aVar = new a();
            lVar.invoke(aVar);
            return new l(aVar.b(), aVar.a(), null);
        }

        @Override // B5.h
        public N5.a getKey() {
            return l.f597d;
        }

        private b() {
        }
    }

    public /* synthetic */ l(boolean z7, boolean z8, AbstractC0650j abstractC0650j) {
        this(z7, z8);
    }

    private l(boolean z7, boolean z8) {
        this.f599a = z7;
        this.f600b = z8;
    }
}
