package X6;

/* loaded from: classes2.dex */
abstract /* synthetic */ class e {

    public static final class a implements b {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Iterable f5978o;

        /* renamed from: X6.e$a$a, reason: collision with other inner class name */
        public static final class C0120a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f5979o;

            /* renamed from: s, reason: collision with root package name */
            int f5980s;

            /* renamed from: u, reason: collision with root package name */
            Object f5982u;

            /* renamed from: v, reason: collision with root package name */
            Object f5983v;

            public C0120a(A6.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f5979o = obj;
                this.f5980s |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(Iterable iterable) {
            this.f5978o = iterable;
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
                boolean r0 = r7 instanceof X6.e.a.C0120a
                if (r0 == 0) goto L13
                r0 = r7
                X6.e$a$a r0 = (X6.e.a.C0120a) r0
                int r1 = r0.f5980s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f5980s = r1
                goto L18
            L13:
                X6.e$a$a r0 = new X6.e$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f5979o
                java.lang.Object r1 = B6.b.e()
                int r2 = r0.f5980s
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f5983v
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f5982u
                X6.c r2 = (X6.c) r2
                x6.q.b(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                x6.q.b(r7)
                java.lang.Iterable r7 = r5.f5978o
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5d
                java.lang.Object r2 = r6.next()
                r0.f5982u = r7
                r0.f5983v = r6
                r0.f5980s = r3
                java.lang.Object r2 = r7.c(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L5d:
                x6.E r6 = x6.C6916E.f44463a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: X6.e.a.a(X6.c, A6.d):java.lang.Object");
        }
    }

    public static final b a(Iterable iterable) {
        return new a(iterable);
    }

    public static final b b(I6.p pVar) {
        return new l(pVar);
    }
}
