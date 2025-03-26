package X6;

import J6.D;
import x6.C6916E;

/* loaded from: classes2.dex */
abstract /* synthetic */ class i {

    public static final class a implements X6.b {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ X6.b f6000o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ I6.p f6001s;

        public a(X6.b bVar, I6.p pVar) {
            this.f6000o = bVar;
            this.f6001s = pVar;
        }

        @Override // X6.b
        public Object a(c cVar, A6.d dVar) {
            Object a8 = this.f6000o.a(new b(new D(), cVar, this.f6001s), dVar);
            return a8 == B6.b.e() ? a8 : C6916E.f44463a;
        }
    }

    static final class b implements c {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ D f6002o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ c f6003s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ I6.p f6004t;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: o, reason: collision with root package name */
            Object f6005o;

            /* renamed from: s, reason: collision with root package name */
            Object f6006s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f6007t;

            /* renamed from: v, reason: collision with root package name */
            int f6009v;

            a(A6.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f6007t = obj;
                this.f6009v |= Integer.MIN_VALUE;
                return b.this.c(null, this);
            }
        }

        b(D d8, c cVar, I6.p pVar) {
            this.f6002o = d8;
            this.f6003s = cVar;
            this.f6004t = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // X6.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(java.lang.Object r7, A6.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof X6.i.b.a
                if (r0 == 0) goto L13
                r0 = r8
                X6.i$b$a r0 = (X6.i.b.a) r0
                int r1 = r0.f6009v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f6009v = r1
                goto L18
            L13:
                X6.i$b$a r0 = new X6.i$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f6007t
                java.lang.Object r1 = B6.b.e()
                int r2 = r0.f6009v
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                x6.q.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f6006s
                java.lang.Object r2 = r0.f6005o
                X6.i$b r2 = (X6.i.b) r2
                x6.q.b(r8)
                goto L6c
            L41:
                x6.q.b(r8)
                goto L59
            L45:
                x6.q.b(r8)
                J6.D r8 = r6.f6002o
                boolean r8 = r8.f3544o
                if (r8 == 0) goto L5c
                X6.c r8 = r6.f6003s
                r0.f6009v = r5
                java.lang.Object r7 = r8.c(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                x6.E r7 = x6.C6916E.f44463a
                return r7
            L5c:
                I6.p r8 = r6.f6004t
                r0.f6005o = r6
                r0.f6006s = r7
                r0.f6009v = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                J6.D r8 = r2.f6002o
                r8.f3544o = r5
                X6.c r8 = r2.f6003s
                r2 = 0
                r0.f6005o = r2
                r0.f6006s = r2
                r0.f6009v = r3
                java.lang.Object r7 = r8.c(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                x6.E r7 = x6.C6916E.f44463a
                return r7
            L8b:
                x6.E r7 = x6.C6916E.f44463a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: X6.i.b.c(java.lang.Object, A6.d):java.lang.Object");
        }
    }

    public static final X6.b a(X6.b bVar, I6.p pVar) {
        return new a(bVar, pVar);
    }
}
