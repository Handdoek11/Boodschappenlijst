package X6;

import I6.q;
import J6.G;
import J6.r;
import U6.InterfaceC0745v0;

/* loaded from: classes2.dex */
abstract /* synthetic */ class h {

    public static final class a implements X6.b {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ X6.b f5984o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ q f5985s;

        /* renamed from: X6.h$a$a, reason: collision with other inner class name */
        public static final class C0121a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f5986o;

            /* renamed from: s, reason: collision with root package name */
            int f5987s;

            /* renamed from: u, reason: collision with root package name */
            Object f5989u;

            /* renamed from: v, reason: collision with root package name */
            Object f5990v;

            public C0121a(A6.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f5986o = obj;
                this.f5987s |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(X6.b bVar, q qVar) {
            this.f5984o = bVar;
            this.f5985s = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // X6.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(X6.c r6, A6.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof X6.h.a.C0121a
                if (r0 == 0) goto L13
                r0 = r7
                X6.h$a$a r0 = (X6.h.a.C0121a) r0
                int r1 = r0.f5987s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f5987s = r1
                goto L18
            L13:
                X6.h$a$a r0 = new X6.h$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f5986o
                java.lang.Object r1 = B6.b.e()
                int r2 = r0.f5987s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                x6.q.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f5990v
                X6.c r6 = (X6.c) r6
                java.lang.Object r2 = r0.f5989u
                X6.h$a r2 = (X6.h.a) r2
                x6.q.b(r7)
                goto L53
            L40:
                x6.q.b(r7)
                X6.b r7 = r5.f5984o
                r0.f5989u = r5
                r0.f5990v = r6
                r0.f5987s = r4
                java.lang.Object r7 = X6.d.c(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                I6.q r2 = r2.f5985s
                r4 = 0
                r0.f5989u = r4
                r0.f5990v = r4
                r0.f5987s = r3
                r3 = 6
                J6.p.a(r3)
                java.lang.Object r6 = r2.d(r6, r7, r0)
                r7 = 7
                J6.p.a(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                x6.E r6 = x6.C6916E.f44463a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: X6.h.a.a(X6.c, A6.d):java.lang.Object");
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f5991o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f5992s;

        /* renamed from: t, reason: collision with root package name */
        int f5993t;

        b(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5992s = obj;
            this.f5993t |= Integer.MIN_VALUE;
            return d.c(null, null, this);
        }
    }

    static final class c implements X6.c {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ X6.c f5994o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ G f5995s;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: o, reason: collision with root package name */
            Object f5996o;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f5997s;

            /* renamed from: u, reason: collision with root package name */
            int f5999u;

            a(A6.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f5997s = obj;
                this.f5999u |= Integer.MIN_VALUE;
                return c.this.c(null, this);
            }
        }

        c(X6.c cVar, G g8) {
            this.f5994o = cVar;
            this.f5995s = g8;
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
                boolean r0 = r6 instanceof X6.h.c.a
                if (r0 == 0) goto L13
                r0 = r6
                X6.h$c$a r0 = (X6.h.c.a) r0
                int r1 = r0.f5999u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f5999u = r1
                goto L18
            L13:
                X6.h$c$a r0 = new X6.h$c$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f5997s
                java.lang.Object r1 = B6.b.e()
                int r2 = r0.f5999u
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f5996o
                X6.h$c r5 = (X6.h.c) r5
                x6.q.b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                x6.q.b(r6)
                X6.c r6 = r4.f5994o     // Catch: java.lang.Throwable -> L4a
                r0.f5996o = r4     // Catch: java.lang.Throwable -> L4a
                r0.f5999u = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.c(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                x6.E r5 = x6.C6916E.f44463a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                J6.G r5 = r5.f5995s
                r5.f3547o = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: X6.h.c.c(java.lang.Object, A6.d):java.lang.Object");
        }
    }

    public static final X6.b a(X6.b bVar, q qVar) {
        return new a(bVar, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(X6.b r4, X6.c r5, A6.d r6) {
        /*
            boolean r0 = r6 instanceof X6.h.b
            if (r0 == 0) goto L13
            r0 = r6
            X6.h$b r0 = (X6.h.b) r0
            int r1 = r0.f5993t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5993t = r1
            goto L18
        L13:
            X6.h$b r0 = new X6.h$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5992s
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f5993t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f5991o
            J6.G r4 = (J6.G) r4
            x6.q.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            x6.q.b(r6)
            J6.G r6 = new J6.G
            r6.<init>()
            X6.h$c r2 = new X6.h$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f5991o = r6     // Catch: java.lang.Throwable -> L51
            r0.f5993t = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            java.lang.Object r4 = r4.f3547o
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            A6.g r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            x6.AbstractC6923e.a(r4, r5)
            throw r4
        L72:
            x6.AbstractC6923e.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.h.b(X6.b, X6.c, A6.d):java.lang.Object");
    }

    private static final boolean c(Throwable th, A6.g gVar) {
        InterfaceC0745v0 interfaceC0745v0 = (InterfaceC0745v0) gVar.d(InterfaceC0745v0.f5485d);
        if (interfaceC0745v0 == null || !interfaceC0745v0.isCancelled()) {
            return false;
        }
        return d(th, interfaceC0745v0.A());
    }

    private static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && r.a(th2, th);
    }
}
