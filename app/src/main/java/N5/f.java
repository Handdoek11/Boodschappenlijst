package N5;

import U6.AbstractC0723k;
import U6.M;
import x6.C6916E;
import x6.C6933o;

/* loaded from: classes2.dex */
public abstract class f {

    static final class a extends kotlin.coroutines.jvm.internal.l implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        Object f4156o;

        /* renamed from: s, reason: collision with root package name */
        int f4157s;

        /* renamed from: t, reason: collision with root package name */
        int f4158t;

        /* renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f4159u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.f f4160v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.c f4161w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.c f4162x;

        /* renamed from: N5.f$a$a, reason: collision with other inner class name */
        static final class C0075a extends kotlin.coroutines.jvm.internal.l implements I6.p {

            /* renamed from: o, reason: collision with root package name */
            int f4163o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ io.ktor.utils.io.c f4164s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ X5.k f4165t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0075a(io.ktor.utils.io.c cVar, X5.k kVar, A6.d dVar) {
                super(2, dVar);
                this.f4164s = cVar;
                this.f4165t = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                return new C0075a(this.f4164s, this.f4165t, dVar);
            }

            @Override // I6.p
            public final Object invoke(M m8, A6.d dVar) {
                return ((C0075a) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f4163o;
                if (i8 == 0) {
                    x6.q.b(obj);
                    io.ktor.utils.io.c cVar = this.f4164s;
                    X5.k H02 = this.f4165t.H0();
                    this.f4163o = 1;
                    if (cVar.k(H02, this) == e8) {
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

        static final class b extends kotlin.coroutines.jvm.internal.l implements I6.p {

            /* renamed from: o, reason: collision with root package name */
            int f4166o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ io.ktor.utils.io.c f4167s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ X5.k f4168t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(io.ktor.utils.io.c cVar, X5.k kVar, A6.d dVar) {
                super(2, dVar);
                this.f4167s = cVar;
                this.f4168t = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                return new b(this.f4167s, this.f4168t, dVar);
            }

            @Override // I6.p
            public final Object invoke(M m8, A6.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f4166o;
                if (i8 == 0) {
                    x6.q.b(obj);
                    io.ktor.utils.io.c cVar = this.f4167s;
                    X5.k H02 = this.f4168t.H0();
                    this.f4166o = 1;
                    if (cVar.k(H02, this) == e8) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(io.ktor.utils.io.f fVar, io.ktor.utils.io.c cVar, io.ktor.utils.io.c cVar2, A6.d dVar) {
            super(2, dVar);
            this.f4160v = fVar;
            this.f4161w = cVar;
            this.f4162x = cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            a aVar = new a(this.f4160v, this.f4161w, this.f4162x, dVar);
            aVar.f4159u = obj;
            return aVar;
        }

        @Override // I6.p
        public final Object invoke(M m8, A6.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[Catch: all -> 0x0037, TryCatch #3 {all -> 0x0037, blocks: (B:30:0x00a1, B:19:0x0041, B:21:0x0049, B:24:0x005a, B:41:0x00b4, B:42:0x00b5, B:45:0x00c8, B:14:0x0031, B:39:0x00b2, B:38:0x00af, B:34:0x00a9), top: B:59:0x0031 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b5 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #3 {all -> 0x0037, blocks: (B:30:0x00a1, B:19:0x0041, B:21:0x0049, B:24:0x005a, B:41:0x00b4, B:42:0x00b5, B:45:0x00c8, B:14:0x0031, B:39:0x00b2, B:38:0x00af, B:34:0x00a9), top: B:59:0x0031 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x009a -> B:29:0x009f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 232
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N5.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class b extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.c f4169o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.c f4170s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(io.ktor.utils.io.c cVar, io.ktor.utils.io.c cVar2) {
            super(1);
            this.f4169o = cVar;
            this.f4170s = cVar2;
        }

        public final void b(Throwable th) {
            if (th == null) {
                return;
            }
            this.f4169o.b(th);
            this.f4170s.b(th);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f4171o;

        /* renamed from: s, reason: collision with root package name */
        int f4172s;

        c(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4171o = obj;
            this.f4172s |= Integer.MIN_VALUE;
            return f.b(null, this);
        }
    }

    public static final C6933o a(io.ktor.utils.io.f fVar, M m8) {
        J6.r.e(fVar, "<this>");
        J6.r.e(m8, "coroutineScope");
        io.ktor.utils.io.c a8 = io.ktor.utils.io.e.a(true);
        io.ktor.utils.io.c a9 = io.ktor.utils.io.e.a(true);
        AbstractC0723k.d(m8, null, null, new a(fVar, a8, a9, null), 3, null).D(new b(a8, a9));
        return x6.u.a(a8, a9);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(io.ktor.utils.io.f r8, A6.d r9) {
        /*
            boolean r0 = r9 instanceof N5.f.c
            if (r0 == 0) goto L14
            r0 = r9
            N5.f$c r0 = (N5.f.c) r0
            int r1 = r0.f4172s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f4172s = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            N5.f$c r0 = new N5.f$c
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f4171o
            java.lang.Object r0 = B6.b.e()
            int r1 = r4.f4172s
            r7 = 1
            if (r1 == 0) goto L33
            if (r1 != r7) goto L2b
            x6.q.b(r9)
            goto L44
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            x6.q.b(r9)
            r4.f4172s = r7
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r8
            java.lang.Object r9 = io.ktor.utils.io.f.b.a(r1, r2, r4, r5, r6)
            if (r9 != r0) goto L44
            return r0
        L44:
            X5.k r9 = (X5.k) r9
            r8 = 0
            r0 = 0
            byte[] r8 = X5.r.c(r9, r8, r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.f.b(io.ktor.utils.io.f, A6.d):java.lang.Object");
    }
}
