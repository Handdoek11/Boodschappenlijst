package X6;

import J6.G;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes2.dex */
abstract /* synthetic */ class j {

    public static final class a implements X6.c {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ G f6010o;

        public a(G g8) {
            this.f6010o = g8;
        }

        @Override // X6.c
        public Object c(Object obj, A6.d dVar) {
            this.f6010o.f3547o = obj;
            throw new AbortFlowException(this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f6011o;

        /* renamed from: s, reason: collision with root package name */
        Object f6012s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f6013t;

        /* renamed from: u, reason: collision with root package name */
        int f6014u;

        b(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6013t = obj;
            this.f6014u |= Integer.MIN_VALUE;
            return X6.d.g(null, this);
        }
    }

    public static final class c implements X6.c {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ I6.p f6015o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ G f6016s;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: o, reason: collision with root package name */
            Object f6017o;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f6018s;

            /* renamed from: t, reason: collision with root package name */
            int f6019t;

            /* renamed from: v, reason: collision with root package name */
            Object f6021v;

            public a(A6.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f6018s = obj;
                this.f6019t |= Integer.MIN_VALUE;
                return c.this.c(null, this);
            }
        }

        public c(I6.p pVar, G g8) {
            this.f6015o = pVar;
            this.f6016s = g8;
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
                boolean r0 = r6 instanceof X6.j.c.a
                if (r0 == 0) goto L13
                r0 = r6
                X6.j$c$a r0 = (X6.j.c.a) r0
                int r1 = r0.f6019t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f6019t = r1
                goto L18
            L13:
                X6.j$c$a r0 = new X6.j$c$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f6018s
                java.lang.Object r1 = B6.b.e()
                int r2 = r0.f6019t
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f6021v
                java.lang.Object r0 = r0.f6017o
                X6.j$c r0 = (X6.j.c) r0
                x6.q.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                x6.q.b(r6)
                I6.p r6 = r4.f6015o
                r0.f6017o = r4
                r0.f6021v = r5
                r0.f6019t = r3
                r2 = 6
                J6.p.a(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                J6.p.a(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                x6.E r5 = x6.C6916E.f44463a
                return r5
            L5d:
                J6.G r6 = r0.f6016s
                r6.f3547o = r5
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: X6.j.c.c(java.lang.Object, A6.d):java.lang.Object");
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f6022o;

        /* renamed from: s, reason: collision with root package name */
        Object f6023s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f6024t;

        /* renamed from: u, reason: collision with root package name */
        int f6025u;

        d(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6024t = obj;
            this.f6025u |= Integer.MIN_VALUE;
            return X6.d.h(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(X6.b r4, A6.d r5) {
        /*
            boolean r0 = r5 instanceof X6.j.b
            if (r0 == 0) goto L13
            r0 = r5
            X6.j$b r0 = (X6.j.b) r0
            int r1 = r0.f6014u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6014u = r1
            goto L18
        L13:
            X6.j$b r0 = new X6.j$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f6013t
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f6014u
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f6012s
            X6.j$a r4 = (X6.j.a) r4
            java.lang.Object r0 = r0.f6011o
            J6.G r0 = (J6.G) r0
            x6.q.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            x6.q.b(r5)
            J6.G r5 = new J6.G
            r5.<init>()
            Z6.E r2 = Y6.g.f6145a
            r5.f3547o = r2
            X6.j$a r2 = new X6.j$a
            r2.<init>(r5)
            r0.f6011o = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f6012s = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f6014u = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            Y6.e.a(r5, r4)
        L62:
            java.lang.Object r4 = r0.f3547o
            Z6.E r5 = Y6.g.f6145a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.j.a(X6.b, A6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(X6.b r4, I6.p r5, A6.d r6) {
        /*
            boolean r0 = r6 instanceof X6.j.d
            if (r0 == 0) goto L13
            r0 = r6
            X6.j$d r0 = (X6.j.d) r0
            int r1 = r0.f6025u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6025u = r1
            goto L18
        L13:
            X6.j$d r0 = new X6.j$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6024t
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f6025u
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f6023s
            X6.j$c r4 = (X6.j.c) r4
            java.lang.Object r5 = r0.f6022o
            J6.G r5 = (J6.G) r5
            x6.q.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L5e
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            x6.q.b(r6)
            J6.G r6 = new J6.G
            r6.<init>()
            X6.j$c r2 = new X6.j$c
            r2.<init>(r5, r6)
            r0.f6022o = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f6023s = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f6025u = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L5e
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            Y6.e.a(r6, r4)
        L5e:
            java.lang.Object r4 = r5.f3547o
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.j.b(X6.b, I6.p, A6.d):java.lang.Object");
    }
}
