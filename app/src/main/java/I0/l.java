package I0;

import J6.AbstractC0650j;
import J6.D;
import J6.G;
import J6.s;
import U6.AbstractC0752z;
import U6.InterfaceC0748x;
import U6.M;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import x6.AbstractC6929k;
import x6.C6916E;
import x6.InterfaceC6928j;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class l implements I0.e {

    /* renamed from: k, reason: collision with root package name */
    public static final a f2996k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    private static final Set f2997l = new LinkedHashSet();

    /* renamed from: m, reason: collision with root package name */
    private static final Object f2998m = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final I6.a f2999a;

    /* renamed from: b, reason: collision with root package name */
    private final I0.j f3000b;

    /* renamed from: c, reason: collision with root package name */
    private final I0.a f3001c;

    /* renamed from: d, reason: collision with root package name */
    private final M f3002d;

    /* renamed from: e, reason: collision with root package name */
    private final X6.b f3003e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3004f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6928j f3005g;

    /* renamed from: h, reason: collision with root package name */
    private final X6.k f3006h;

    /* renamed from: i, reason: collision with root package name */
    private List f3007i;

    /* renamed from: j, reason: collision with root package name */
    private final I0.k f3008j;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final Set a() {
            return l.f2997l;
        }

        public final Object b() {
            return l.f2998m;
        }

        private a() {
        }
    }

    private static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final I0.m f3009a;

            public a(I0.m mVar) {
                super(null);
                this.f3009a = mVar;
            }

            public I0.m a() {
                return this.f3009a;
            }
        }

        /* renamed from: I0.l$b$b, reason: collision with other inner class name */
        public static final class C0051b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final I6.p f3010a;

            /* renamed from: b, reason: collision with root package name */
            private final InterfaceC0748x f3011b;

            /* renamed from: c, reason: collision with root package name */
            private final I0.m f3012c;

            /* renamed from: d, reason: collision with root package name */
            private final A6.g f3013d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0051b(I6.p pVar, InterfaceC0748x interfaceC0748x, I0.m mVar, A6.g gVar) {
                super(null);
                J6.r.e(pVar, "transform");
                J6.r.e(interfaceC0748x, "ack");
                J6.r.e(gVar, "callerContext");
                this.f3010a = pVar;
                this.f3011b = interfaceC0748x;
                this.f3012c = mVar;
                this.f3013d = gVar;
            }

            public final InterfaceC0748x a() {
                return this.f3011b;
            }

            public final A6.g b() {
                return this.f3013d;
            }

            public I0.m c() {
                return this.f3012c;
            }

            public final I6.p d() {
                return this.f3010a;
            }
        }

        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        private b() {
        }
    }

    private static final class c extends OutputStream {

        /* renamed from: o, reason: collision with root package name */
        private final FileOutputStream f3014o;

        public c(FileOutputStream fileOutputStream) {
            J6.r.e(fileOutputStream, "fileOutputStream");
            this.f3014o = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.f3014o.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
            this.f3014o.write(i8);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            J6.r.e(bArr, "b");
            this.f3014o.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i8, int i9) {
            J6.r.e(bArr, "bytes");
            this.f3014o.write(bArr, i8, i9);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    static final class d extends s implements I6.l {
        d() {
            super(1);
        }

        public final void b(Throwable th) {
            if (th != null) {
                l.this.f3006h.setValue(new I0.g(th));
            }
            a aVar = l.f2996k;
            Object b8 = aVar.b();
            l lVar = l.this;
            synchronized (b8) {
                aVar.a().remove(lVar.q().getAbsolutePath());
                C6916E c6916e = C6916E.f44463a;
            }
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    static final class e extends s implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        public static final e f3016o = new e();

        e() {
            super(2);
        }

        public final void b(b bVar, Throwable th) {
            J6.r.e(bVar, "msg");
            if (bVar instanceof b.C0051b) {
                InterfaceC0748x a8 = ((b.C0051b) bVar).a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                a8.i(th);
            }
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((b) obj, (Throwable) obj2);
            return C6916E.f44463a;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        int f3017o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3018s;

        f(A6.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            f fVar = l.this.new f(dVar);
            fVar.f3018s = obj;
            return fVar;
        }

        @Override // I6.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b bVar, A6.d dVar) {
            return ((f) create(bVar, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f3017o;
            if (i8 == 0) {
                x6.q.b(obj);
                b bVar = (b) this.f3018s;
                if (bVar instanceof b.a) {
                    this.f3017o = 1;
                    if (l.this.r((b.a) bVar, this) == e8) {
                        return e8;
                    }
                } else if (bVar instanceof b.C0051b) {
                    this.f3017o = 2;
                    if (l.this.s((b.C0051b) bVar, this) == e8) {
                        return e8;
                    }
                }
            } else {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x6.q.b(obj);
            }
            return C6916E.f44463a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        int f3020o;

        /* renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f3021s;

        static final class a extends kotlin.coroutines.jvm.internal.l implements I6.p {

            /* renamed from: o, reason: collision with root package name */
            int f3023o;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f3024s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ I0.m f3025t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(I0.m mVar, A6.d dVar) {
                super(2, dVar);
                this.f3025t = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                a aVar = new a(this.f3025t, dVar);
                aVar.f3024s = obj;
                return aVar;
            }

            @Override // I6.p
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(I0.m mVar, A6.d dVar) {
                return ((a) create(mVar, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                B6.b.e();
                if (this.f3023o != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x6.q.b(obj);
                I0.m mVar = (I0.m) this.f3024s;
                I0.m mVar2 = this.f3025t;
                boolean z7 = false;
                if (!(mVar2 instanceof I0.b) && !(mVar2 instanceof I0.g) && mVar == mVar2) {
                    z7 = true;
                }
                return kotlin.coroutines.jvm.internal.b.a(z7);
            }
        }

        public static final class b implements X6.b {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ X6.b f3026o;

            public static final class a implements X6.c {

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ X6.c f3027o;

                /* renamed from: I0.l$g$b$a$a, reason: collision with other inner class name */
                public static final class C0052a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: o, reason: collision with root package name */
                    /* synthetic */ Object f3028o;

                    /* renamed from: s, reason: collision with root package name */
                    int f3029s;

                    public C0052a(A6.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f3028o = obj;
                        this.f3029s |= Integer.MIN_VALUE;
                        return a.this.c(null, this);
                    }
                }

                public a(X6.c cVar) {
                    this.f3027o = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // X6.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object c(java.lang.Object r5, A6.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof I0.l.g.b.a.C0052a
                        if (r0 == 0) goto L13
                        r0 = r6
                        I0.l$g$b$a$a r0 = (I0.l.g.b.a.C0052a) r0
                        int r1 = r0.f3029s
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f3029s = r1
                        goto L18
                    L13:
                        I0.l$g$b$a$a r0 = new I0.l$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f3028o
                        java.lang.Object r1 = B6.b.e()
                        int r2 = r0.f3029s
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        x6.q.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        x6.q.b(r6)
                        X6.c r6 = r4.f3027o
                        I0.m r5 = (I0.m) r5
                        boolean r2 = r5 instanceof I0.i
                        if (r2 != 0) goto L6f
                        boolean r2 = r5 instanceof I0.g
                        if (r2 != 0) goto L68
                        boolean r2 = r5 instanceof I0.b
                        if (r2 == 0) goto L56
                        I0.b r5 = (I0.b) r5
                        java.lang.Object r5 = r5.b()
                        r0.f3029s = r3
                        java.lang.Object r5 = r6.c(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        x6.E r5 = x6.C6916E.f44463a
                        return r5
                    L56:
                        boolean r5 = r5 instanceof I0.n
                        if (r5 == 0) goto L62
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        r5.<init>(r6)
                        throw r5
                    L62:
                        kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                        r5.<init>()
                        throw r5
                    L68:
                        I0.g r5 = (I0.g) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    L6f:
                        I0.i r5 = (I0.i) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: I0.l.g.b.a.c(java.lang.Object, A6.d):java.lang.Object");
                }
            }

            public b(X6.b bVar) {
                this.f3026o = bVar;
            }

            @Override // X6.b
            public Object a(X6.c cVar, A6.d dVar) {
                Object a8 = this.f3026o.a(new a(cVar), dVar);
                return a8 == B6.b.e() ? a8 : C6916E.f44463a;
            }
        }

        g(A6.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            g gVar = l.this.new g(dVar);
            gVar.f3021s = obj;
            return gVar;
        }

        @Override // I6.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(X6.c cVar, A6.d dVar) {
            return ((g) create(cVar, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f3020o;
            if (i8 == 0) {
                x6.q.b(obj);
                X6.c cVar = (X6.c) this.f3021s;
                I0.m mVar = (I0.m) l.this.f3006h.getValue();
                if (!(mVar instanceof I0.b)) {
                    l.this.f3008j.e(new b.a(mVar));
                }
                b bVar = new b(X6.d.d(l.this.f3006h, new a(mVar, null)));
                this.f3020o = 1;
                if (X6.d.e(cVar, bVar, this) == e8) {
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

    static final class h extends s implements I6.a {
        h() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) l.this.f2999a.invoke();
            String absolutePath = file.getAbsolutePath();
            a aVar = l.f2996k;
            synchronized (aVar.b()) {
                if (aVar.a().contains(absolutePath)) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Set a8 = aVar.a();
                J6.r.d(absolutePath, "it");
                a8.add(absolutePath);
            }
            return file;
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f3032o;

        /* renamed from: s, reason: collision with root package name */
        Object f3033s;

        /* renamed from: t, reason: collision with root package name */
        Object f3034t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f3035u;

        /* renamed from: w, reason: collision with root package name */
        int f3037w;

        i(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3035u = obj;
            this.f3037w |= Integer.MIN_VALUE;
            return l.this.s(null, this);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f3038o;

        /* renamed from: s, reason: collision with root package name */
        Object f3039s;

        /* renamed from: t, reason: collision with root package name */
        Object f3040t;

        /* renamed from: u, reason: collision with root package name */
        Object f3041u;

        /* renamed from: v, reason: collision with root package name */
        Object f3042v;

        /* renamed from: w, reason: collision with root package name */
        Object f3043w;

        /* renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f3044x;

        /* renamed from: z, reason: collision with root package name */
        int f3046z;

        j(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3044x = obj;
            this.f3046z |= Integer.MIN_VALUE;
            return l.this.t(this);
        }
    }

    public static final class k implements I0.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e7.a f3047a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f3048b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G f3049c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l f3050d;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: o, reason: collision with root package name */
            Object f3051o;

            /* renamed from: s, reason: collision with root package name */
            Object f3052s;

            /* renamed from: t, reason: collision with root package name */
            Object f3053t;

            /* renamed from: u, reason: collision with root package name */
            Object f3054u;

            /* renamed from: v, reason: collision with root package name */
            Object f3055v;

            /* renamed from: w, reason: collision with root package name */
            /* synthetic */ Object f3056w;

            /* renamed from: y, reason: collision with root package name */
            int f3058y;

            a(A6.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f3056w = obj;
                this.f3058y |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        k(e7.a aVar, D d8, G g8, l lVar) {
            this.f3047a = aVar;
            this.f3048b = d8;
            this.f3049c = g8;
            this.f3050d = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // I0.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(I6.p r11, A6.d r12) {
            /*
                Method dump skipped, instructions count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.l.k.a(I6.p, A6.d):java.lang.Object");
        }
    }

    /* renamed from: I0.l$l, reason: collision with other inner class name */
    static final class C0053l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f3059o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3060s;

        /* renamed from: u, reason: collision with root package name */
        int f3062u;

        C0053l(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3060s = obj;
            this.f3062u |= Integer.MIN_VALUE;
            return l.this.u(this);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f3063o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3064s;

        /* renamed from: u, reason: collision with root package name */
        int f3066u;

        m(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3064s = obj;
            this.f3066u |= Integer.MIN_VALUE;
            return l.this.v(this);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f3067o;

        /* renamed from: s, reason: collision with root package name */
        Object f3068s;

        /* renamed from: t, reason: collision with root package name */
        Object f3069t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f3070u;

        /* renamed from: w, reason: collision with root package name */
        int f3072w;

        n(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3070u = obj;
            this.f3072w |= Integer.MIN_VALUE;
            return l.this.w(this);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f3073o;

        /* renamed from: s, reason: collision with root package name */
        Object f3074s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f3075t;

        /* renamed from: v, reason: collision with root package name */
        int f3077v;

        o(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3075t = obj;
            this.f3077v |= Integer.MIN_VALUE;
            return l.this.x(this);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f3078o;

        /* renamed from: s, reason: collision with root package name */
        Object f3079s;

        /* renamed from: t, reason: collision with root package name */
        Object f3080t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f3081u;

        /* renamed from: w, reason: collision with root package name */
        int f3083w;

        p(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3081u = obj;
            this.f3083w |= Integer.MIN_VALUE;
            return l.this.y(null, null, this);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.l implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        int f3084o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ I6.p f3085s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f3086t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(I6.p pVar, Object obj, A6.d dVar) {
            super(2, dVar);
            this.f3085s = pVar;
            this.f3086t = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            return new q(this.f3085s, this.f3086t, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, A6.d dVar) {
            return ((q) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f3084o;
            if (i8 == 0) {
                x6.q.b(obj);
                I6.p pVar = this.f3085s;
                Object obj2 = this.f3086t;
                this.f3084o = 1;
                obj = pVar.invoke(obj2, this);
                if (obj == e8) {
                    return e8;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x6.q.b(obj);
            }
            return obj;
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f3087o;

        /* renamed from: s, reason: collision with root package name */
        Object f3088s;

        /* renamed from: t, reason: collision with root package name */
        Object f3089t;

        /* renamed from: u, reason: collision with root package name */
        Object f3090u;

        /* renamed from: v, reason: collision with root package name */
        Object f3091v;

        /* renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f3092w;

        /* renamed from: y, reason: collision with root package name */
        int f3094y;

        r(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3092w = obj;
            this.f3094y |= Integer.MIN_VALUE;
            return l.this.z(null, this);
        }
    }

    public l(I6.a aVar, I0.j jVar, List list, I0.a aVar2, M m8) {
        J6.r.e(aVar, "produceFile");
        J6.r.e(jVar, "serializer");
        J6.r.e(list, "initTasksList");
        J6.r.e(aVar2, "corruptionHandler");
        J6.r.e(m8, "scope");
        this.f2999a = aVar;
        this.f3000b = jVar;
        this.f3001c = aVar2;
        this.f3002d = m8;
        this.f3003e = X6.d.i(new g(null));
        this.f3004f = ".tmp";
        this.f3005g = AbstractC6929k.a(new h());
        this.f3006h = X6.o.a(I0.n.f3095a);
        this.f3007i = AbstractC6987o.a0(list);
        this.f3008j = new I0.k(m8, new d(), e.f3016o, new f(null));
    }

    private final void p(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(J6.r.k("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File q() {
        return (File) this.f3005g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(b.a aVar, A6.d dVar) {
        I0.m mVar = (I0.m) this.f3006h.getValue();
        if (!(mVar instanceof I0.b)) {
            if (mVar instanceof I0.i) {
                if (mVar == aVar.a()) {
                    Object v7 = v(dVar);
                    return v7 == B6.b.e() ? v7 : C6916E.f44463a;
                }
            } else {
                if (J6.r.a(mVar, I0.n.f3095a)) {
                    Object v8 = v(dVar);
                    return v8 == B6.b.e() ? v8 : C6916E.f44463a;
                }
                if (mVar instanceof I0.g) {
                    throw new IllegalStateException("Can't read in final state.");
                }
            }
        }
        return C6916E.f44463a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v20, types: [U6.x] */
    /* JADX WARN: Type inference failed for: r9v27, types: [U6.x] */
    /* JADX WARN: Type inference failed for: r9v3, types: [U6.x] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(I0.l.b.C0051b r9, A6.d r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.l.s(I0.l$b$b, A6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(A6.d r14) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.l.t(A6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(A6.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof I0.l.C0053l
            if (r0 == 0) goto L13
            r0 = r5
            I0.l$l r0 = (I0.l.C0053l) r0
            int r1 = r0.f3062u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3062u = r1
            goto L18
        L13:
            I0.l$l r0 = new I0.l$l
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f3060s
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f3062u
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f3059o
            I0.l r0 = (I0.l) r0
            x6.q.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            x6.q.b(r5)
            r0.f3059o = r4     // Catch: java.lang.Throwable -> L48
            r0.f3062u = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.t(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            x6.E r5 = x6.C6916E.f44463a
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            X6.k r0 = r0.f3006h
            I0.i r1 = new I0.i
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.l.u(A6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(A6.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof I0.l.m
            if (r0 == 0) goto L13
            r0 = r5
            I0.l$m r0 = (I0.l.m) r0
            int r1 = r0.f3066u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3066u = r1
            goto L18
        L13:
            I0.l$m r0 = new I0.l$m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f3064s
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f3066u
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f3063o
            I0.l r0 = (I0.l) r0
            x6.q.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            x6.q.b(r5)
            r0.f3063o = r4     // Catch: java.lang.Throwable -> L45
            r0.f3066u = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.t(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            X6.k r0 = r0.f3006h
            I0.i r1 = new I0.i
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            x6.E r5 = x6.C6916E.f44463a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.l.v(A6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [I0.l] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [A6.d, I0.l$n] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [I0.l] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [I0.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(A6.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof I0.l.n
            if (r0 == 0) goto L13
            r0 = r6
            I0.l$n r0 = (I0.l.n) r0
            int r1 = r0.f3072w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3072w = r1
            goto L18
        L13:
            I0.l$n r0 = new I0.l$n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f3070u
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f3072w
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f3069t
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f3068s
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f3067o
            I0.l r0 = (I0.l) r0
            x6.q.b(r6)     // Catch: java.lang.Throwable -> L35
            goto L5f
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            x6.q.b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6d
            java.io.File r6 = r5.q()     // Catch: java.io.FileNotFoundException -> L6d
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6d
            I0.j r6 = r5.f3000b     // Catch: java.lang.Throwable -> L65
            r0.f3067o = r5     // Catch: java.lang.Throwable -> L65
            r0.f3068s = r2     // Catch: java.lang.Throwable -> L65
            r4 = 0
            r0.f3069t = r4     // Catch: java.lang.Throwable -> L65
            r0.f3072w = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.c(r2, r0)     // Catch: java.lang.Throwable -> L65
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
            r1 = r4
        L5f:
            G6.a.a(r2, r1)     // Catch: java.io.FileNotFoundException -> L63
            return r6
        L63:
            r6 = move-exception
            goto L6f
        L65:
            r6 = move-exception
            r0 = r5
        L67:
            throw r6     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            G6.a.a(r2, r6)     // Catch: java.io.FileNotFoundException -> L63
            throw r1     // Catch: java.io.FileNotFoundException -> L63
        L6d:
            r6 = move-exception
            r0 = r5
        L6f:
            java.io.File r1 = r0.q()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L80
            I0.j r6 = r0.f3000b
            java.lang.Object r6 = r6.a()
            return r6
        L80:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.l.w(A6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(A6.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof I0.l.o
            if (r0 == 0) goto L13
            r0 = r8
            I0.l$o r0 = (I0.l.o) r0
            int r1 = r0.f3077v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3077v = r1
            goto L18
        L13:
            I0.l$o r0 = new I0.l$o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f3075t
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f3077v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f3074s
            java.lang.Object r0 = r0.f3073o
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            x6.q.b(r8)     // Catch: java.io.IOException -> L35
            goto L87
        L35:
            r8 = move-exception
            goto L8a
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.f3074s
            androidx.datastore.core.CorruptionException r2 = (androidx.datastore.core.CorruptionException) r2
            java.lang.Object r4 = r0.f3073o
            I0.l r4 = (I0.l) r4
            x6.q.b(r8)
            goto L79
        L4b:
            java.lang.Object r2 = r0.f3073o
            I0.l r2 = (I0.l) r2
            x6.q.b(r8)     // Catch: androidx.datastore.core.CorruptionException -> L53
            goto L63
        L53:
            r8 = move-exception
            goto L66
        L55:
            x6.q.b(r8)
            r0.f3073o = r7     // Catch: androidx.datastore.core.CorruptionException -> L64
            r0.f3077v = r5     // Catch: androidx.datastore.core.CorruptionException -> L64
            java.lang.Object r8 = r7.w(r0)     // Catch: androidx.datastore.core.CorruptionException -> L64
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        L64:
            r8 = move-exception
            r2 = r7
        L66:
            I0.a r5 = r2.f3001c
            r0.f3073o = r2
            r0.f3074s = r8
            r0.f3077v = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.f3073o = r2     // Catch: java.io.IOException -> L88
            r0.f3074s = r8     // Catch: java.io.IOException -> L88
            r0.f3077v = r3     // Catch: java.io.IOException -> L88
            java.lang.Object r0 = r4.z(r8, r0)     // Catch: java.io.IOException -> L88
            if (r0 != r1) goto L86
            return r1
        L86:
            r1 = r8
        L87:
            return r1
        L88:
            r8 = move-exception
            r0 = r2
        L8a:
            x6.AbstractC6923e.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.l.x(A6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(I6.p r8, A6.g r9, A6.d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof I0.l.p
            if (r0 == 0) goto L13
            r0 = r10
            I0.l$p r0 = (I0.l.p) r0
            int r1 = r0.f3083w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3083w = r1
            goto L18
        L13:
            I0.l$p r0 = new I0.l$p
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f3081u
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f3083w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f3079s
            java.lang.Object r9 = r0.f3078o
            I0.l r9 = (I0.l) r9
            x6.q.b(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f3080t
            java.lang.Object r9 = r0.f3079s
            I0.b r9 = (I0.b) r9
            java.lang.Object r2 = r0.f3078o
            I0.l r2 = (I0.l) r2
            x6.q.b(r10)
            goto L73
        L49:
            x6.q.b(r10)
            X6.k r10 = r7.f3006h
            java.lang.Object r10 = r10.getValue()
            I0.b r10 = (I0.b) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            I0.l$q r6 = new I0.l$q
            r6.<init>(r8, r2, r3)
            r0.f3078o = r7
            r0.f3079s = r10
            r0.f3080t = r2
            r0.f3083w = r5
            java.lang.Object r8 = U6.AbstractC0719i.g(r9, r6, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.a()
            boolean r9 = J6.r.a(r8, r10)
            if (r9 == 0) goto L7d
            goto La0
        L7d:
            r0.f3078o = r2
            r0.f3079s = r10
            r0.f3080t = r3
            r0.f3083w = r4
            java.lang.Object r8 = r2.z(r10, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            X6.k r9 = r9.f3006h
            I0.b r10 = new I0.b
            if (r8 == 0) goto L99
            int r0 = r8.hashCode()
            goto L9a
        L99:
            r0 = 0
        L9a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.l.y(I6.p, A6.g, A6.d):java.lang.Object");
    }

    @Override // I0.e
    public Object a(I6.p pVar, A6.d dVar) {
        InterfaceC0748x b8 = AbstractC0752z.b(null, 1, null);
        this.f3008j.e(new b.C0051b(pVar, b8, (I0.m) this.f3006h.getValue(), dVar.getContext()));
        return b8.e0(dVar);
    }

    @Override // I0.e
    public X6.b getData() {
        return this.f3003e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(java.lang.Object r8, A6.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof I0.l.r
            if (r0 == 0) goto L13
            r0 = r9
            I0.l$r r0 = (I0.l.r) r0
            int r1 = r0.f3094y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3094y = r1
            goto L18
        L13:
            I0.l$r r0 = new I0.l$r
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f3092w
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f3094y
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r8 = r0.f3091v
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.f3090u
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f3089t
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f3088s
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.f3087o
            I0.l r0 = (I0.l) r0
            x6.q.b(r9)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r8 = move-exception
            goto Lc3
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L48:
            x6.q.b(r9)
            java.io.File r9 = r7.q()
            r7.p(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.q()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f3004f
            java.lang.String r2 = J6.r.k(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc9
            r2.<init>(r9)     // Catch: java.io.IOException -> Lc9
            I0.j r4 = r7.f3000b     // Catch: java.lang.Throwable -> Lc1
            I0.l$c r5 = new I0.l$c     // Catch: java.lang.Throwable -> Lc1
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lc1
            r0.f3087o = r7     // Catch: java.lang.Throwable -> Lc1
            r0.f3088s = r9     // Catch: java.lang.Throwable -> Lc1
            r0.f3089t = r2     // Catch: java.lang.Throwable -> Lc1
            r6 = 0
            r0.f3090u = r6     // Catch: java.lang.Throwable -> Lc1
            r0.f3091v = r2     // Catch: java.lang.Throwable -> Lc1
            r0.f3094y = r3     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r8 = r4.b(r8, r5, r0)     // Catch: java.lang.Throwable -> Lc1
            if (r8 != r1) goto L85
            return r1
        L85:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r6
        L89:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L3d
            r8.sync()     // Catch: java.lang.Throwable -> L3d
            x6.E r8 = x6.C6916E.f44463a     // Catch: java.lang.Throwable -> L3d
            G6.a.a(r2, r1)     // Catch: java.io.IOException -> Lbe
            java.io.File r8 = r0.q()     // Catch: java.io.IOException -> Lbe
            boolean r8 = r3.renameTo(r8)     // Catch: java.io.IOException -> Lbe
            if (r8 == 0) goto La2
            x6.E r8 = x6.C6916E.f44463a
            return r8
        La2:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lbe
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbe
            r9.<init>()     // Catch: java.io.IOException -> Lbe
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch: java.io.IOException -> Lbe
            r9.append(r3)     // Catch: java.io.IOException -> Lbe
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lbe
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lbe
            r8.<init>(r9)     // Catch: java.io.IOException -> Lbe
            throw r8     // Catch: java.io.IOException -> Lbe
        Lbe:
            r8 = move-exception
            r9 = r3
            goto Lca
        Lc1:
            r8 = move-exception
            r3 = r9
        Lc3:
            throw r8     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            r9 = move-exception
            G6.a.a(r2, r8)     // Catch: java.io.IOException -> Lbe
            throw r9     // Catch: java.io.IOException -> Lbe
        Lc9:
            r8 = move-exception
        Lca:
            boolean r0 = r9.exists()
            if (r0 == 0) goto Ld3
            r9.delete()
        Ld3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.l.z(java.lang.Object, A6.d):java.lang.Object");
    }
}
